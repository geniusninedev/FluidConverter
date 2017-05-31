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
import com.nineinfosys.fluidconverter.Engin.ConcentrationSolution;
import com.nineinfosys.fluidconverter.R;
import com.nineinfosys.fluidconverter.Supporter.ItemList;
import com.nineinfosys.fluidconverter.Supporter.Settings;

import java.io.File;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class ConversionConcentrationSolutionListActivity extends AppCompatActivity implements TextWatcher {

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
    private String strkilogramperlite=null,strgramperliter=null,strmilligramperliter=null,strpartmillion=null,strgraingallonUS=null,strgraingallonUK=null,strpoundgallonUS=null,strpoundgallonUK=null,
            strpoundmilliongallonUS=null,strpoundmilliongallonUK=null,strpoundpercubicfoot=null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conversion_list);

        //keyboard hidden first time
        this.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);

        //customize toolbar
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#d32f2f")));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setTitle("Conversion Report");

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            Window window = getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.setStatusBarColor(Color.parseColor("#9a0007"));
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
            case "Kilogram/liter -kg/L":
                textconversionFrom.setText("Kilogram/liter ");                 textViewConversionShortform.setText("kg/L");
                break;
            case "Gram/liter -g/L":
                textconversionFrom.setText("Gram/liter ");                 textViewConversionShortform.setText("g/L");
                break;
            case "Milligram/liter -mg/L":
                textconversionFrom.setText("Milligram/liter ");                 textViewConversionShortform.setText("mg/L");
                break;
            case "Part/million (ppm) -p/m":
                textconversionFrom.setText("Part/million (ppm) ");                 textViewConversionShortform.setText("p/m");
                break;
            case "Grain/gallon (US) -gr/gal(US)":
                textconversionFrom.setText("Grain/gallon (US) ");                 textViewConversionShortform.setText("gr/gal(US)");
                break;
            case "Grain/gallon (UK) -gr/gal(UK)":
                textconversionFrom.setText("Grain/gallon (UK) ");                 textViewConversionShortform.setText("gr/gal(UK)");
                break;
            case "Pound/gallon (US) -lb/gal(US)":
                textconversionFrom.setText("Pound/gallon (US) ");                 textViewConversionShortform.setText("lb/gal(US)");
                break;
            case "Pound/gallon (UK) -lb/gal(UK)":
                textconversionFrom.setText("Pound/gallon (UK) ");                 textViewConversionShortform.setText("lb/gal(UK)");
                break;
            case "Pound/million gallon (US) -lb/mgal(US)":
                textconversionFrom.setText("Pound/million gallon (US) ");                 textViewConversionShortform.setText("lb/mgal(US)");
                break;
            case "Pound/million gallon (UK) -lb/mgal(US)":
                textconversionFrom.setText("Pound/million gallon (UK) ");                 textViewConversionShortform.setText("lb/mgal(UK)");
                break;
            case "Pound/cubic foot -lb/ft^3":
                textconversionFrom.setText("Pound/cubic foot ");                 textViewConversionShortform.setText("lb/ft^3");
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

        ConcentrationSolution c = new  ConcentrationSolution(strSpinnerFrom,doubleEdittextvalue1);
        ArrayList<ConcentrationSolution.ConversionResults> results = c.calculateConcentrationSolutionConversion();
        int length = results.size();
        for (int i = 0; i < length; i++) {
            ConcentrationSolution.ConversionResults item = results.get(i);


            strkilogramperlite=String.valueOf(formatter.format(item.getKilogramperlite()));
            strgramperliter=String.valueOf(formatter.format(item.getGramperliter()));
            strmilligramperliter=String.valueOf(formatter.format(item.getMilligramperliter()));
            strpartmillion=String.valueOf(formatter.format(item.getPartmillion()));
            strgraingallonUS=String.valueOf(formatter.format(item.getGraingallonUS()));
            strgraingallonUK=String.valueOf(formatter.format(item.getGraingallonUK()));
            strpoundgallonUS=String.valueOf(formatter.format(item.getPoundgallonUS()));
            strpoundgallonUK=String.valueOf(formatter.format(item.getPoundgallonUK()));
            strpoundmilliongallonUS=String.valueOf(formatter.format(item.getPoundmilliongallonUS()));
            strpoundmilliongallonUK=String.valueOf(formatter.format(item.getPoundmilliongallonUK()));
            strpoundpercubicfoot=String.valueOf(formatter.format(item.getPoundpercubicfoot()));


            list.add(new ItemList("kg/L","Kilogram/liter ",strkilogramperlite,"kg/L"));
            list.add(new ItemList("g/L","Gram/liter ",strgramperliter,"g/L"));
            list.add(new ItemList("mg/L","Milligram/liter ",strmilligramperliter,"mg/L"));
            list.add(new ItemList("p/m","Part/million (ppm) ",strpartmillion,"p/m"));
            list.add(new ItemList("gr/gal(US)","Grain/gallon (US) ",strgraingallonUS,"gr/gal(US)"));
            list.add(new ItemList("gr/gal(UK)","Grain/gallon (UK) ",strgraingallonUK,"gr/gal(UK)"));
            list.add(new ItemList("lb/gal(US)","Pound/gallon (US) ",strpoundgallonUS,"lb/gal(US)"));
            list.add(new ItemList("lb/gal(UK)","Pound/gallon (UK) ",strpoundgallonUK,"lb/gal(UK)"));
            list.add(new ItemList("lb/mgal(US)","Pound/million gallon (US) ",strpoundmilliongallonUS,"lb/mgal(US)"));
            list.add(new ItemList("lb/mgal(UK)","Pound/million gallon (UK) ",strpoundmilliongallonUK,"lb/mgal(UK)"));
            list.add(new ItemList("lb/ft^3","Pound/cubic foot ",strpoundpercubicfoot,"lb/ft^3"));




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
