package com.nineinfosys.fluidconverter.ConverterActivityList;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.print.PrintHelper;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.TextView;


import com.nineinfosys.fluidconverter.Adapter.RecyclerViewConversionListAdapter;
import com.nineinfosys.fluidconverter.Engin.SurfaceTension;
import com.nineinfosys.fluidconverter.R;
import com.nineinfosys.fluidconverter.Supporter.ItemList;
import com.nineinfosys.fluidconverter.Supporter.Settings;

import java.io.File;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class ConversionSurfaceTensionListActivity extends AppCompatActivity implements TextWatcher {

    List<ItemList> list = new ArrayList<ItemList>();
    private  String stringSpinnerFrom;
    private double doubleEdittextvalue;
    private EditText edittextConversionListvalue;
    private TextView textconversionFrom,textViewConversionShortform;
    View ChildView ;
    DecimalFormat formatter = null;
   private String strnewton=null,strmillinewton=null,strgram=null,strdyne=null,strergcenti=null,strergmilli=null,strpoundinch=null,strpoundforce=null;


    private static final int REQUEST_CODE = 100;
    private File imageFile;
    private Bitmap bitmap;
    private PrintHelper printhelper;


    private RecyclerView rView;
    RecyclerViewConversionListAdapter rcAdapter;
    List<ItemList> rowListItem,rowListItem1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conversion_list);

        //keyboard hidden first time
        this.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);

        //customize toolbar
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#4e9cd6")));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setTitle("Conversion Report");

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            Window window = getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.setStatusBarColor(Color.parseColor("#006ea4"));
        }

        //format of decimal pint
        formatsetting();


        edittextConversionListvalue=(EditText)findViewById(R.id.edittextConversionListvalue) ;
        textconversionFrom=(TextView) findViewById(R.id.textViewConversionFrom) ;
        textViewConversionShortform=(TextView) findViewById(R.id.textViewConversionShortform) ;

        //get the value from temperture activity
        stringSpinnerFrom = getIntent().getExtras().getString("stringSpinnerFrom");
        doubleEdittextvalue= getIntent().getExtras().getDouble("doubleEdittextvalue");
        edittextConversionListvalue.setText(String.valueOf(doubleEdittextvalue));

        NamesAndShortform(stringSpinnerFrom);

        //   Toast.makeText(this,"string1 "+stringSpinnerFrom,Toast.LENGTH_LONG).show();
        rowListItem = getAllunitValue(stringSpinnerFrom,doubleEdittextvalue);

        //Initializing Views
        rView = (RecyclerView) findViewById(R.id.recyclerViewConverterList);
        rView.setHasFixedSize(true);
        rView.setLayoutManager(new GridLayoutManager(this, 1));


        //Initializing our superheroes list
        rcAdapter = new RecyclerViewConversionListAdapter(this,rowListItem);
        rView.setAdapter(rcAdapter);

        edittextConversionListvalue.addTextChangedListener(this);



    }

    private void NamesAndShortform(String stringSpinnerFrom) {
        switch (stringSpinnerFrom) {
            case "Newton/meter -N/m":
                textconversionFrom.setText("Newton/meter ");                 textViewConversionShortform.setText("N/m");
                break;
            case "Millinewton/meter -mN/m":
                textconversionFrom.setText("Millinewton/meter ");                 textViewConversionShortform.setText("mN/m");
                break;
            case "Gram-force/centimeter -gf/cm":
                textconversionFrom.setText("Gram-force/centimeter ");                 textViewConversionShortform.setText("gf/cm");
                break;
            case "Dyne/centimeter -dyn/cm":
                textconversionFrom.setText("Dyne/centimeter ");                 textViewConversionShortform.setText("dyn/cm");
                break;
            case "Erg/square centimeter -erg/cm^2":
                textconversionFrom.setText("Erg/square centimeter ");                 textViewConversionShortform.setText("erg/cm^2");
                break;
            case "Erg/square millimeter -erg/mm^2":
                textconversionFrom.setText("Erg/square millimeter ");                 textViewConversionShortform.setText("erg/mm^2");
                break;
            case "Poundal/inch -lb/in":
                textconversionFrom.setText("Poundal/inch ");                 textViewConversionShortform.setText("lb/in");
                break;
            case "Pound-force/inch -lbf/in":
                textconversionFrom.setText("Pound-force/inch ");                 textViewConversionShortform.setText("lbf/in");
                break;
        }
    }

    private void formatsetting() {
        //fetching value from sharedpreference
        SharedPreferences sharedPreferences =this.getSharedPreferences(Settings.SHARED_PREF_NAME, Context.MODE_PRIVATE);
        //Fetching thepatient_mobile_Number value form sharedpreferences
        String  FormattedString = sharedPreferences.getString(Settings.Format_Selected_SHARED_PREF,"Thousands separator");
        String DecimalplaceString= sharedPreferences.getString(Settings.Decimal_Place_Selected_SHARED_PREF,"2");
        Settings settings=new Settings(FormattedString,DecimalplaceString);
        formatter= settings.setting();
    }

    private List<ItemList> getAllunitValue(String strSpinnerFrom,double doubleEdittextvalue1) {

        SurfaceTension c = new  SurfaceTension(strSpinnerFrom,doubleEdittextvalue1);
        ArrayList<SurfaceTension.ConversionResults> results = c.calculateSurfaceTensionConversion();
        int length = results.size();
        for (int i = 0; i < length; i++) {
            SurfaceTension.ConversionResults item = results.get(i);


            strnewton=String.valueOf(formatter.format(item.getNewton()));
            strmillinewton=String.valueOf(formatter.format(item.getMillinewton()));
            strgram=String.valueOf(formatter.format(item.getGram()));
            strdyne=String.valueOf(formatter.format(item.getDyne()));
            strergcenti=String.valueOf(formatter.format(item.getErgcenti()));
            strergmilli=String.valueOf(formatter.format(item.getErgmilli()));
            strpoundinch=String.valueOf(formatter.format(item.getPoundinch()));
            strpoundforce=String.valueOf(formatter.format(item.getPoundforce()));

            list.add(new ItemList("N/m","Newton/meter ",strnewton,"N/m"));
            list.add(new ItemList("mN/m","Millinewton/meter ",strmillinewton,"mN/m"));
            list.add(new ItemList("gf/cm","Gram-force/centimeter ",strgram,"gf/cm"));
            list.add(new ItemList("dyn/cm","Dyne/centimeter ",strdyne,"dyn/cm"));
            list.add(new ItemList("erg/cm^2","Erg/square centimeter ",strergcenti,"erg/cm^2"));
            list.add(new ItemList("erg/mm^2","Erg/square millimeter ",strergmilli,"erg/mm^2"));
            list.add(new ItemList("lb/in","Poundal/inch ",strpoundinch,"lb/in"));
            list.add(new ItemList("lbf/in","Pound-force/inch ",strpoundforce,"lbf/in"));




        }
        return list;

    }

    @Override
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {

    }

    @Override
    public void onTextChanged(CharSequence s, int start, int before, int count) {


        rowListItem.clear();
        try {

           double value = Double.parseDouble(edittextConversionListvalue.getText().toString().trim());

            rowListItem1 = getAllunitValue(stringSpinnerFrom,value);


            rcAdapter = new RecyclerViewConversionListAdapter(this,rowListItem1);
            rView.setAdapter(rcAdapter);

        }
        catch (NumberFormatException e) {
            doubleEdittextvalue = 0;

        }
    }

    @Override
    public void afterTextChanged(Editable s) {

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {


        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        // Take appropriate action for each action item click
        switch (item.getItemId()) {
            case android.R.id.home:
                this.finish();
                break;
            default:
                return super.onOptionsItemSelected(item);
        }
        return true;
    }
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        switch (keyCode) {
            case KeyEvent.KEYCODE_BACK:
                this.finish();
                return true;
        }
        return super.onKeyDown(keyCode, event);
    }

}


