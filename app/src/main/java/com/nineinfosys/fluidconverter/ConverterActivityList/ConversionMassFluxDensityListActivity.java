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


import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.nineinfosys.fluidconverter.Adapter.RecyclerViewConversionListAdapter;
import com.nineinfosys.fluidconverter.Engin.MassFluxDensity;
import com.nineinfosys.fluidconverter.R;
import com.nineinfosys.fluidconverter.Supporter.ItemList;
import com.nineinfosys.fluidconverter.Supporter.Settings;

import java.io.File;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class ConversionMassFluxDensityListActivity extends AppCompatActivity implements TextWatcher {

    List<ItemList> list = new ArrayList<ItemList>();
    private  String stringSpinnerFrom;
    private double doubleEdittextvalue;
    private EditText edittextConversionListvalue;
    private TextView textconversionFrom,textViewConversionShortform;
    View ChildView ;
    DecimalFormat formatter = null;

    private static final int REQUEST_CODE = 100;
    private File imageFile;
    private Bitmap bitmap;
    private PrintHelper printhelper;

    private RecyclerView rView;
    RecyclerViewConversionListAdapter rcAdapter;
    List<ItemList> rowListItem,rowListItem1;

   private String strgramsecondpersquaremeter=null,strkilogramperhourpersquaremeter=null,strkilogramperhourpersquarefoot=null,strkilogramsecondsquaremeter=null,strgramsecondsqcentimeter=null,
            strpoundhourpersquarefoot=null,strpoundsecondsquarefoot=null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conversion_list);

        //keyboard hidden first time
        this.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);

        //customize toolbar
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#f4511e")));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setTitle("Conversion Report");

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            Window window = getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.setStatusBarColor(Color.parseColor("#b91400"));
        }

        //format of decimal pint
        formatsetting();

        MobileAds.initialize(ConversionMassFluxDensityListActivity.this, getString(R.string.ads_app_id));
        AdView mAdView = (AdView) findViewById(R.id.adViewUnitConverterList);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
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
            case "Gram/second/square meter -gs/m^2":
                textconversionFrom.setText("Gram/second/square meter ");                 textViewConversionShortform.setText("gs/m^2");
                break;
            case "Kilogram/hour/square meter -kgh/m^2":
                textconversionFrom.setText("Kilogram/hour/square meter ");                 textViewConversionShortform.setText("kgh/m^2");
                break;
            case "Kilogram/hour/square foot -kgh/ft^2":
                textconversionFrom.setText("Kilogram/hour/square foot ");                 textViewConversionShortform.setText("kgh/ft^2");
                break;
            case "Kilogram/second/square meter -kgs/m^2":
                textconversionFrom.setText("Kilogram/second/square meter ");                 textViewConversionShortform.setText("kgs/m^2");
                break;
            case "Gram/second/sq. centimeter -gs/cm^2":
                textconversionFrom.setText("Gram/second/sq. centimeter ");                 textViewConversionShortform.setText("gs/cm^2");
                break;
            case "Pound/hour/square foot -lbh/ft^2":
                textconversionFrom.setText("Pound/hour/square foot ");                 textViewConversionShortform.setText("lbh/ft^2");
                break;
            case "Pound/second/square foot -lbs/ft^2":
                textconversionFrom.setText("Pound/second/square foot ");                 textViewConversionShortform.setText("lbs/ft^2");
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

        MassFluxDensity c = new  MassFluxDensity(strSpinnerFrom,doubleEdittextvalue1);
        ArrayList<MassFluxDensity.ConversionResults> results = c.calculateMassFluxDensityConversion();
        int length = results.size();
        for (int i = 0; i < length; i++) {
            MassFluxDensity.ConversionResults item = results.get(i);


            strgramsecondpersquaremeter=String.valueOf(formatter.format(item.getGramsecondpersquaremeter()));
            strkilogramperhourpersquaremeter=String.valueOf(formatter.format(item.getKilogramperhourpersquaremeter()));
            strkilogramperhourpersquarefoot=String.valueOf(formatter.format(item.getKilogramperhourpersquarefoot()));
            strkilogramsecondsquaremeter=String.valueOf(formatter.format(item.getKilogramsecondsquaremeter()));
            strgramsecondsqcentimeter=String.valueOf(formatter.format(item.getGramsecondsqcentimeter()));
            strpoundhourpersquarefoot=String.valueOf(formatter.format(item.getPoundhourpersquarefoot()));
            strpoundsecondsquarefoot=String.valueOf(formatter.format(item.getPoundsecondsquarefoot()));

            list.add(new ItemList("gs/m^2","Gram/second/square meter ",strgramsecondpersquaremeter,"gs/m^2"));
            list.add(new ItemList("kgh/m^2","Kilogram/hour/square meter ",strkilogramperhourpersquaremeter,"kgh/m^2"));
            list.add(new ItemList("kgh/ft^2","Kilogram/hour/square foot ",strkilogramperhourpersquarefoot,"kgh/ft^2"));
            list.add(new ItemList("kgs/m^2","Kilogram/second/square meter ",strkilogramsecondsquaremeter,"kgs/m^2"));
            list.add(new ItemList("gs/cm^2","Gram/second/sq. centimeter ",strgramsecondsqcentimeter,"gs/cm^2"));
            list.add(new ItemList("lbh/ft^2","Pound/hour/square foot ",strpoundhourpersquarefoot,"lbh/ft^2"));
            list.add(new ItemList("lbs/ft^2","Pound/second/square foot ",strpoundsecondsquarefoot,"lbs/ft^2"));
            



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

