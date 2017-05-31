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
import com.nineinfosys.fluidconverter.Engin.FlowConverter;
import com.nineinfosys.fluidconverter.R;
import com.nineinfosys.fluidconverter.Supporter.ItemList;
import com.nineinfosys.fluidconverter.Supporter.Settings;

import java.io.File;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class ConversionFlowListActivity extends AppCompatActivity implements TextWatcher {

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
   private String strcubicmeterpersecond=null,strcubicmeterperday=null,strcubicmeterperhour=null,strcubicmeterperminute=null,strcubiccentimeterperday=null,strcubiccentimeterperhour=null,
            strcubiccentimeterperminute=null,strcubiccentimeterpersecond=null, strliterperday=null,strliterperhour=null,strliterperminute=null,strliterpersecond=null,strmilliliterperday=null,
            strmilliliterperhour=null,strmilliliterperminute=null,strmilliliterpersecond=null,strgallonUSperday=null,strgallonUSperhour=null, strgallonUSperminute=null,strgallonUSpersecond=null,
            strgallonUKperday=null,strgallonUKperhour=null,strgallonUKperminute=null,strgallonUKpersecond=null,strkilobarrelUSperday=null,strbarrelUSperday=null,strbarrelUSperhour=null,
            strbarrelUSperminute=null, strbarrelUSpersecond=null,stracrefootperyear=null,stracrefootperday=null,stracrefootperhour=null,strhundredcubicfootperday=null,strhundredcubicfootperhour=null,
            strhundredcubicfootperminute=null,strounceperhour=null,strounceperminute=null, strouncepersecond=null,strounceUKperhour=null,strounceUKperminute=null,strounceUKpersecond=null,
            strcubicyardperhour=null,strcubicyardperminute=null,strcubicyardpersecond=null,strcubicfootperhour=null,strcubicfootperminute=null,strcubicfootpersecond=null, strcubicinchperhour=null,
            strcubicinchperminute=null,strcubicinchpersecond=null,strpoundpersecond=null,strpoundperminute=null,strpoundperhour=null,strpoundperday=null,strkilogrampersecond=null,
            strkilogramperminute=null,strkilogramperhour=null, strkilogramperday=null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conversion_list);

        //keyboard hidden first time
        this.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);

        //customize toolbar
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#e58f0c")));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setTitle("Conversion Report");

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            Window window = getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.setStatusBarColor(Color.parseColor("#ad6100"));
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
            case "Cubic meter/second -m^3/s":
               textconversionFrom.setText("Cubic meter/second ");                 textViewConversionShortform.setText("m^3/s");
                break;
            case "Cubic meter/day -m^3/d":
               textconversionFrom.setText("Cubic meter/day ");                 textViewConversionShortform.setText("m^3/d");
                break;
            case "Cubic meter/hour -m^3/h":
               textconversionFrom.setText("Cubic meter/hour ");                 textViewConversionShortform.setText("m^3/h");
                break;
            case "Cubic meter/minute -m^3/min":
               textconversionFrom.setText("Cubic meter/minute ");                 textViewConversionShortform.setText("m^3/min");
                break;
            case "Cubic centimeter/day -cm^3/d":
               textconversionFrom.setText("Cubic centimeter/day ");                 textViewConversionShortform.setText("cm^3/d");
                break;
            case "Cubic centimeter/hour -cm^3/h":
               textconversionFrom.setText("Cubic centimeter/hour ");                 textViewConversionShortform.setText("cm^3/h");
                break;
            case "Cubic centimeter/minute -cm^3/min":
               textconversionFrom.setText("Cubic centimeter/minute ");                 textViewConversionShortform.setText("cm^3/min");
                break;
            case "Cubic centimeter/second -cm^3/s":
               textconversionFrom.setText("Cubic centimeter/second ");                 textViewConversionShortform.setText("cm^3/s");
                break;
            case "Liter/day -L/d":
               textconversionFrom.setText("Liter/day ");                 textViewConversionShortform.setText("L/d");
                break;
            case "Liter/hour -L/h":
               textconversionFrom.setText("Liter/hour ");                 textViewConversionShortform.setText("L/h");
                break;
            case "Liter/minute -L/min":
               textconversionFrom.setText("Liter/minute ");                 textViewConversionShortform.setText("L/min");
                break;
            case "Liter/second -L/s":
               textconversionFrom.setText("Liter/second ");                 textViewConversionShortform.setText("L/s");
                break;
            case "Milliliter/day -mL/d":
               textconversionFrom.setText("Milliliter/day ");                 textViewConversionShortform.setText("mL/d");
                break;
            case "Milliliter/hour -mL/h":
               textconversionFrom.setText("Milliliter/hour ");                 textViewConversionShortform.setText("mL/h");
                break;
            case "Milliliter/minute -mL/min":
               textconversionFrom.setText("Milliliter/minute ");                 textViewConversionShortform.setText("mL/min");
                break;
            case "Milliliter/second -mL/s":
               textconversionFrom.setText("Milliliter/second ");                 textViewConversionShortform.setText("mL/s");
                break;
            case "Gallon (US)/day -gal(US)/d":
               textconversionFrom.setText("Gallon (US)/day ");                 textViewConversionShortform.setText("gal(US)/d");
                break;
            case "Gallon (US)/hour -gal(US)/h":
               textconversionFrom.setText("Gallon (US)/hour ");                 textViewConversionShortform.setText("gal(US)/h");
                break;
            case "Gallon (US)/minute -gal(US)/min":
               textconversionFrom.setText("Gallon (US)/minute ");                 textViewConversionShortform.setText("gal(US)/min");
                break;
            case "Gallon (US)/second -gal(US)/s":
               textconversionFrom.setText("Gallon (US)/second ");                 textViewConversionShortform.setText("gal(US)/s");
                break;
            case "Gallon (UK)/day -gal(UK)/d":
               textconversionFrom.setText("Gallon (UK)/day ");                 textViewConversionShortform.setText("gal(UK)/d");
                break;
            case "Gallon (UK)/hour -gal(UK)/h":
               textconversionFrom.setText("Gallon (UK)/hour ");                 textViewConversionShortform.setText("gal(UK)/h");
                break;
            case "Gallon (UK)/minute -gal(UK)/min":
               textconversionFrom.setText("Gallon (UK)/minute ");                 textViewConversionShortform.setText("gal(UK)/min");
                break;
            case "Gallon (UK)/second -gal(UK)/s":
               textconversionFrom.setText("Gallon (UK)/second ");                 textViewConversionShortform.setText("gal(UK)/s");
                break;
            case "Kilobarrel (US)/day -kbbl(US)/d":
               textconversionFrom.setText("Kilobarrel (US)/day ");                 textViewConversionShortform.setText("kbbl(US)/d");
                break;
            case "Barrel (US)/day -bbl(US)/d":
               textconversionFrom.setText("Barrel (US)/day ");                 textViewConversionShortform.setText("bbl(US)/d");
                break;
            case "Barrel (US)/hour -bbl(US)/h":
               textconversionFrom.setText("Barrel (US)/hour ");                 textViewConversionShortform.setText("bbl(US)/h");
                break;
            case "Barrel (US)/minute -bbl(US)/min":
               textconversionFrom.setText("Barrel (US)/minute ");                 textViewConversionShortform.setText("bbl(US)/min");
                break;
            case "Barrel (US)/second -bbl(US)/s":
               textconversionFrom.setText("Barrel (US)/second ");                 textViewConversionShortform.setText("bbl(US)/s");
                break;
            case "Acre-foot/year -ac*ft/y":
               textconversionFrom.setText("Acre-foot/year ");                 textViewConversionShortform.setText("ac*ft/y");
                break;
            case "Acre-foot/day -ac*ft/d":
               textconversionFrom.setText("Acre-foot/day ");                 textViewConversionShortform.setText("ac*ft/d");
                break;
            case "Acre-foot/hour -ac*ft/h":
               textconversionFrom.setText("Acre-foot/hour ");                 textViewConversionShortform.setText("ac*ft/h");
                break;
            case "Hundred-cubic foot/day -ft^3/d":
               textconversionFrom.setText("Hundred-cubic foot/day ");                 textViewConversionShortform.setText("ft^3/d");
                break;
            case "Hundred-cubic foot/hour -ft^3/h":
               textconversionFrom.setText("Hundred-cubic foot/hour ");                 textViewConversionShortform.setText("ft^3/h");
                break;
            case "Hundred-cubic foot/minute -ft^3/min":
               textconversionFrom.setText("Hundred-cubic foot/minute ");                 textViewConversionShortform.setText("ft^3/min");
                break;
            case "Ounce/hour -oz/h":
               textconversionFrom.setText("Ounce/hour ");                 textViewConversionShortform.setText("oz/h");
                break;
            case "Ounce/minute -oz/min":
               textconversionFrom.setText("Ounce/minute ");                 textViewConversionShortform.setText("oz/min");
                break;
            case "Ounce/second -oz/s":
               textconversionFrom.setText("Ounce/second ");                 textViewConversionShortform.setText("oz/s");
                break;
            case "Ounce (UK)/hour -oz(UK)/h":
               textconversionFrom.setText("Ounce (UK)/hour ");                 textViewConversionShortform.setText("oz(UK)/h");
                break;
            case "Ounce (UK)/minute -oz(UK)/min":
               textconversionFrom.setText("Ounce (UK)/minute ");                 textViewConversionShortform.setText("oz(UK)/min");
                break;
            case "Ounce (UK)/second -oz(UK)/s":
               textconversionFrom.setText("Ounce (UK)/second ");                 textViewConversionShortform.setText("oz(UK)/s");
                break;
            case "Cubic yard/hour -yd^3/h":
               textconversionFrom.setText("Cubic yard/hour ");                 textViewConversionShortform.setText("yd^3/h");
                break;
            case "Cubic yard/minute -yd^3/min":
               textconversionFrom.setText("Cubic yard/minute ");                 textViewConversionShortform.setText("yd^3/min");
                break;
            case "Cubic yard/second -yd^3/s":
               textconversionFrom.setText("Cubic yard/second ");                 textViewConversionShortform.setText("yd^3/s");
                break;
            case "Cubic foot/hour -ft^3/h":
               textconversionFrom.setText("Cubic foot/hour ");                 textViewConversionShortform.setText("ft^3/h");
                break;
            case "Cubic foot/minute -ft^3/min":
               textconversionFrom.setText("Cubic foot/minute ");                 textViewConversionShortform.setText("ft^3/min");
                break;
            case "Cubic foot/second -ft^3/s":
               textconversionFrom.setText("Cubic foot/second ");                 textViewConversionShortform.setText("ft^3/s");
                break;
            case "Cubic inch/hour -in^3/h":
               textconversionFrom.setText("Cubic inch/hour ");                 textViewConversionShortform.setText("in^3/h");
                break;
            case "Cubic inch/minute -in^3/min":
               textconversionFrom.setText("Cubic inch/minute ");                 textViewConversionShortform.setText("in^3/min");
                break;
            case "Cubic inch/second -in^3/s":
               textconversionFrom.setText("Cubic inch/second ");                 textViewConversionShortform.setText("in^3/s");
                break;
            case "Pound/second (Gasoline at 15.5%b0C) -lb/s":
               textconversionFrom.setText("Pound/second (Gasoline at 15.5%b0C) ");                 textViewConversionShortform.setText("lb/s");
                break;
            case "Pound/minute (Gasoline at 15.5%b0C) -lb/min":
               textconversionFrom.setText("Pound/minute (Gasoline at 15.5%b0C) ");                 textViewConversionShortform.setText("lb/min");
                break;
            case "Pound/hour (Gasoline at 15.5%b0C) -lb/h":
               textconversionFrom.setText("Pound/hour (Gasoline at 15.5%b0C) ");                 textViewConversionShortform.setText("lb/h");
                break;
            case "Pound/day (Gasoline at 15.5%b0C) -lb/d":
               textconversionFrom.setText("Pound/day (Gasoline at 15.5%b0C) ");                 textViewConversionShortform.setText("lb/d");
                break;
            case "Kilogram/second (Gasoline at 15.5%b0C) -kg/s":
               textconversionFrom.setText("Kilogram/second (Gasoline at 15.5%b0C) ");                 textViewConversionShortform.setText("kg/s");
                break;
            case "Kilogram/minute (Gasoline at 15.5%b0C) -kg/min":
               textconversionFrom.setText("Kilogram/minute (Gasoline at 15.5%b0C) ");                 textViewConversionShortform.setText("kg/min");
                break;
            case "Kilogram/hour (Gasoline at 15.5%b0C) -kg/h":
               textconversionFrom.setText("Kilogram/hour (Gasoline at 15.5%b0C) ");                 textViewConversionShortform.setText("kg/h");
                break;
            case "Kilogram/day (Gasoline at 15.5%b0C) -kg/d":
               textconversionFrom.setText("Kilogram/day (Gasoline at 15.5%b0C) ");                 textViewConversionShortform.setText("kg/d");
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

        FlowConverter c = new  FlowConverter(strSpinnerFrom,doubleEdittextvalue1);
        ArrayList<FlowConverter.ConversionResults> results = c.calculateFlowConversion();
        int length = results.size();
        for (int i = 0; i < length; i++) {
            FlowConverter.ConversionResults item = results.get(i);


            strcubicmeterpersecond=String.valueOf(formatter.format(item.getCubicmeterpersecond()));
            strcubicmeterperday=String.valueOf(formatter.format(item.getCubicmeterperday()));
            strcubicmeterperhour=String.valueOf(formatter.format(item.getCubicmeterperhour()));
            strcubicmeterperminute=String.valueOf(formatter.format(item.getCubicmeterperminute()));
            strcubiccentimeterperday=String.valueOf(formatter.format(item.getCubiccentimeterperday()));
            strcubiccentimeterperhour=String.valueOf(formatter.format(item.getCubiccentimeterperhour()));
            strcubiccentimeterperminute=String.valueOf(formatter.format(item.getCubiccentimeterperminute()));
            strcubiccentimeterpersecond=String.valueOf(formatter.format(item.getCubiccentimeterpersecond()));
            strliterperday=String.valueOf(formatter.format(item.getLiterperday()));
            strliterperhour=String.valueOf(formatter.format(item.getLiterperhour()));
            strliterperminute=String.valueOf(formatter.format(item.getLiterperminute()));
            strliterpersecond=String.valueOf(formatter.format(item.getLiterpersecond()));
            strmilliliterperday=String.valueOf(formatter.format(item.getMilliliterperday()));
            strmilliliterperhour=String.valueOf(formatter.format(item.getMilliliterperhour()));
            strmilliliterperminute=String.valueOf(formatter.format(item.getMilliliterperminute()));
            strmilliliterpersecond=String.valueOf(formatter.format(item.getMilliliterpersecond()));
            strgallonUSperday=String.valueOf(formatter.format(item.getGallonUSperday()));
            strgallonUSperhour=String.valueOf(formatter.format(item.getGallonUSperhour()));
            strgallonUSperminute=String.valueOf(formatter.format(item.getGallonUSperminute()));
            strgallonUSpersecond=String.valueOf(formatter.format(item.getGallonUSpersecond()));
            strgallonUKperday=String.valueOf(formatter.format(item.getGallonUKperday()));
            strgallonUKperhour=String.valueOf(formatter.format(item.getGallonUKperhour()));
            strgallonUKperminute=String.valueOf(formatter.format(item.getGallonUKperminute()));
            strgallonUKpersecond=String.valueOf(formatter.format(item.getGallonUKpersecond()));
            strkilobarrelUSperday=String.valueOf(formatter.format(item.getKilobarrelUSperday()));
            strbarrelUSperday=String.valueOf(formatter.format(item.getBarrelUSperday()));
            strbarrelUSperhour=String.valueOf(formatter.format(item.getBarrelUSperhour()));
            strbarrelUSperminute=String.valueOf(formatter.format(item.getBarrelUSperminute()));
            strbarrelUSpersecond=String.valueOf(formatter.format(item.getBarrelUSpersecond()));
            stracrefootperyear=String.valueOf(formatter.format(item.getAcrefootperyear()));
            stracrefootperday=String.valueOf(formatter.format(item.getAcrefootperday()));
            stracrefootperhour=String.valueOf(formatter.format(item.getAcrefootperhour()));
            strhundredcubicfootperday=String.valueOf(formatter.format(item.getHundredcubicfootperday()));
            strhundredcubicfootperhour=String.valueOf(formatter.format(item.getHundredcubicfootperhour()));
            strhundredcubicfootperminute=String.valueOf(formatter.format(item.getHundredcubicfootperminute()));
            strounceperhour=String.valueOf(formatter.format(item.getOunceperhour()));
            strounceperminute=String.valueOf(formatter.format(item.getOunceperminute()));
            strouncepersecond=String.valueOf(formatter.format(item.getOuncepersecond()));
            strounceUKperhour=String.valueOf(formatter.format(item.getOunceUKperhour()));
            strounceUKperminute=String.valueOf(formatter.format(item.getOunceUKperminute()));
            strounceUKpersecond=String.valueOf(formatter.format(item.getOunceUKpersecond()));
            strcubicyardperhour=String.valueOf(formatter.format(item.getCubicyardperhour()));
            strcubicyardperminute=String.valueOf(formatter.format(item.getCubicyardperminute()));
            strcubicyardpersecond=String.valueOf(formatter.format(item.getCubicyardpersecond()));
            strcubicfootperhour=String.valueOf(formatter.format(item.getCubicfootperhour()));
            strcubicfootperminute=String.valueOf(formatter.format(item.getCubicfootperminute()));
            strcubicfootpersecond=String.valueOf(formatter.format(item.getCubicfootpersecond()));
            strcubicinchperhour=String.valueOf(formatter.format(item.getCubicinchperhour()));
            strcubicinchperminute=String.valueOf(formatter.format(item.getCubicinchperminute()));
            strcubicinchpersecond=String.valueOf(formatter.format(item.getCubicinchpersecond()));
            strpoundpersecond=String.valueOf(formatter.format(item.getPoundpersecond()));
            strpoundperminute=String.valueOf(formatter.format(item.getPoundperminute()));
            strpoundperhour=String.valueOf(formatter.format(item.getPoundperhour()));
            strpoundperday=String.valueOf(formatter.format(item.getPoundperday()));
            strkilogrampersecond=String.valueOf(formatter.format(item.getKilogrampersecond()));
            strkilogramperminute=String.valueOf(formatter.format(item.getKilogramperminute()));
            strkilogramperhour=String.valueOf(formatter.format(item.getKilogramperhour()));
            strkilogramperday=String.valueOf(formatter.format(item.getKilogramperday()));


            list.add(new ItemList("m^3/s","Cubic meter/second ",strcubicmeterpersecond,"m^3/s"));
            list.add(new ItemList("m^3/d","Cubic meter/day ",strcubicmeterperday,"m^3/d"));
            list.add(new ItemList("m^3/h","Cubic meter/hour ",strcubicmeterperhour,"m^3/h"));
            list.add(new ItemList("m^3/min","Cubic meter/minute ",strcubicmeterperminute,"m^3/min"));
            list.add(new ItemList("cm^3/d","Cubic centimeter/day ",strcubiccentimeterperday,"cm^3/d"));
            list.add(new ItemList("cm^3/h","Cubic centimeter/hour ",strcubiccentimeterperhour,"cm^3/h"));
            list.add(new ItemList("cm^3/min","Cubic centimeter/minute ",strcubiccentimeterperminute,"cm^3/min"));
            list.add(new ItemList("cm^3/s","Cubic centimeter/second ",strcubiccentimeterpersecond,"cm^3/s"));
            list.add(new ItemList("L/d","Liter/day ",strliterperday,"L/d"));
            list.add(new ItemList("L/h","Liter/hour ",strliterperhour,"L/h"));
            list.add(new ItemList("L/min","Liter/minute ",strliterperminute,"L/min"));
            list.add(new ItemList("L/s","Liter/second ",strliterpersecond,"L/s"));
            list.add(new ItemList("mL/d","Milliliter/day ",strmilliliterperday,"mL/d"));
            list.add(new ItemList("mL/h","Milliliter/hour ",strmilliliterperhour,"mL/h"));
            list.add(new ItemList("mL/min","Milliliter/minute ",strmilliliterperminute,"mL/min"));
            list.add(new ItemList("mL/s","Milliliter/second ",strmilliliterpersecond,"mL/s"));
            list.add(new ItemList("gal(US)/d","Gallon (US)/day ",strgallonUSperday,"gal(US)/d"));
            list.add(new ItemList("gal(US)/h","Gallon (US)/hour ",strgallonUSperhour,"gal(US)/h"));
            list.add(new ItemList("gal(US)/min","Gallon (US)/minute ",strgallonUSperminute,"gal(US)/min"));
            list.add(new ItemList("gal(US)/s","Gallon (US)/second ",strgallonUSpersecond,"gal(US)/s"));
            list.add(new ItemList("gal(UK)/d","Gallon (UK)/day ",strgallonUKperday,"gal(UK)/d"));
            list.add(new ItemList("gal(UK)/h","Gallon (UK)/hour ",strgallonUKperhour,"gal(UK)/h"));
            list.add(new ItemList("gal(UK)/min","Gallon (UK)/minute ",strgallonUKperminute,"gal(UK)/min"));
            list.add(new ItemList("gal(UK)/s","Gallon (UK)/second ",strgallonUKpersecond,"gal(UK)/s"));
            list.add(new ItemList("kbbl(US)/d","Kilobarrel (US)/day ",strkilobarrelUSperday,"kbbl(US)/d"));
            list.add(new ItemList("bbl(US)/d","Barrel (US)/day ",strbarrelUSperday,"bbl(US)/d"));
            list.add(new ItemList("bbl(US)/h","Barrel (US)/hour ",strbarrelUSperhour,"bbl(US)/h"));
            list.add(new ItemList("bbl(US)/min","Barrel (US)/minute ",strbarrelUSperminute,"bbl(US)/min"));
            list.add(new ItemList("bbl(US)/s","Barrel (US)/second ",strbarrelUSpersecond,"bbl(US)/s"));
            list.add(new ItemList("ac*ft/y","Acre-foot/year ",stracrefootperyear,"ac*ft/y"));
            list.add(new ItemList("ac*ft/d","Acre-foot/day ",stracrefootperday,"ac*ft/d"));
            list.add(new ItemList("ac*ft/h","Acre-foot/hour ",stracrefootperhour,"ac*ft/h"));
            list.add(new ItemList("ft^3/d","Hundred-cubic foot/day ",strhundredcubicfootperday,"ft^3/d"));
            list.add(new ItemList("ft^3/h","Hundred-cubic foot/hour ",strhundredcubicfootperhour,"ft^3/h"));
            list.add(new ItemList("ft^3/min","Hundred-cubic foot/minute ",strhundredcubicfootperminute,"ft^3/min"));
            list.add(new ItemList("oz/h","Ounce/hour ",strounceperhour,"oz/h"));
            list.add(new ItemList("oz/min","Ounce/minute ",strounceperminute,"oz/min"));
            list.add(new ItemList("oz/s","Ounce/second ",strouncepersecond,"oz/s"));
            list.add(new ItemList("oz(UK)/h","Ounce (UK)/hour ",strounceUKperhour,"oz(UK)/h"));
            list.add(new ItemList("oz(UK)/min","Ounce (UK)/minute ",strounceUKperminute,"oz(UK)/min"));
            list.add(new ItemList("oz(UK)/s","Ounce (UK)/second ",strounceUKpersecond,"oz(UK)/s"));
            list.add(new ItemList("yd^3/h","Cubic yard/hour ",strcubicyardperhour,"yd^3/h"));
            list.add(new ItemList("yd^3/min","Cubic yard/minute ",strcubicyardperminute,"yd^3/min"));
            list.add(new ItemList("yd^3/s","Cubic yard/second ",strcubicyardpersecond,"yd^3/s"));
            list.add(new ItemList("ft^3/h","Cubic foot/hour ",strcubicfootperhour,"ft^3/h"));
            list.add(new ItemList("ft^3/min","Cubic foot/minute ",strcubicfootperminute,"ft^3/min"));
            list.add(new ItemList("ft^3/s","Cubic foot/second ",strcubicfootpersecond,"ft^3/s"));
            list.add(new ItemList("in^3/h","Cubic inch/hour ",strcubicinchperhour,"in^3/h"));
            list.add(new ItemList("in^3/min","Cubic inch/minute ",strcubicinchperminute,"in^3/min"));
            list.add(new ItemList("in^3/s","Cubic inch/second ",strcubicinchpersecond,"in^3/s"));
            list.add(new ItemList("lb/s","Pound/second (Gasoline at 15.5%b0C) ",strpoundpersecond,"lb/s"));
            list.add(new ItemList("lb/min","Pound/minute (Gasoline at 15.5%b0C) ",strpoundperminute,"lb/min"));
            list.add(new ItemList("lb/h","Pound/hour (Gasoline at 15.5%b0C) ",strpoundperhour,"lb/h"));
            list.add(new ItemList("lb/d","Pound/day (Gasoline at 15.5%b0C) ",strpoundperday,"lb/d"));
            list.add(new ItemList("kg/s","Kilogram/second (Gasoline at 15.5%b0C) ",strkilogrampersecond,"kg/s"));
            list.add(new ItemList("kg/min","Kilogram/minute (Gasoline at 15.5%b0C) ",strkilogramperminute,"kg/min"));
            list.add(new ItemList("kg/h","Kilogram/hour (Gasoline at 15.5%b0C) ",strkilogramperhour,"kg/h"));
            list.add(new ItemList("kg/d","Kilogram/day (Gasoline at 15.5%b0C) ",strkilogramperday,"kg/d"));


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

