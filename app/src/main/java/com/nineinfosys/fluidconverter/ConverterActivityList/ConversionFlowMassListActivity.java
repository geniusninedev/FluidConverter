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
import com.nineinfosys.fluidconverter.Engin.FlowMassConverter;
import com.nineinfosys.fluidconverter.R;
import com.nineinfosys.fluidconverter.Supporter.ItemList;
import com.nineinfosys.fluidconverter.Supporter.Settings;

import java.io.File;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class ConversionFlowMassListActivity extends AppCompatActivity implements TextWatcher {

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

   private String strkilogramsecond=null,strgramsecond=null,strgramminute=null,strgramhour=null,strgramday=null,strmilligramminute=null,strmilligramhour=null,strmilligramday=null,strkilogramminute=null,
            strkilogramhour=null,strkilogramday=null,strexagramsecond=null,strpetagramsecond=null,strteragramsecond=null,strgigagramsecond=null,strmegagramsecond=null,strhectogramsecond=null,
            strdekagramsecond=null,strdecigramsecond=null,strcentigramsecond=null,strmilligramsecond=null,strmicrogramsecond=null,strtonmetricsecond=null,strtonmetricminute=null,strtonmetrichour=null,
            strtonmetricday=null,strtonshorthour=null,strpoundsecond=null,strpoundminute=null,strpoundhour=null,strpoundday=null;



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
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#1e88e5")));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setTitle("Conversion Report");

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            Window window = getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.setStatusBarColor(Color.parseColor("#005cb2"));
        }

        //format of decimal pint
        formatsetting();
        MobileAds.initialize(ConversionFlowMassListActivity.this, getString(R.string.ads_app_id));
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
            case "Kilogram/second -kg/s":
                textconversionFrom.setText("Kilogram/second ");                 textViewConversionShortform.setText("kg/s");
                break;
            case "Gram/second -g/s":
                textconversionFrom.setText("Gram/second ");                 textViewConversionShortform.setText("g/s");
                break;
            case "Gram/minute -g/min":
                textconversionFrom.setText("Gram/minute ");                 textViewConversionShortform.setText("g/min");
                break;
            case "Gram/hour -g/h":
                textconversionFrom.setText("Gram/hour ");                 textViewConversionShortform.setText("g/h");
                break;
            case "Gram/day -g/d":
                textconversionFrom.setText("Gram/day ");                 textViewConversionShortform.setText("g/d");
                break;
            case "Milligram/minute -mg/min":
                textconversionFrom.setText("Milligram/minute ");                 textViewConversionShortform.setText("mg/min");
                break;
            case "Milligram/hour -mg/h":
                textconversionFrom.setText("Milligram/hour ");                 textViewConversionShortform.setText("mg/h");
                break;
            case "Milligram/day -mg/d":
                textconversionFrom.setText("Milligram/day ");                 textViewConversionShortform.setText("mg/d");
                break;
            case "Kilogram/minute -kg/m":
                textconversionFrom.setText("Kilogram/minute ");                 textViewConversionShortform.setText("kg/m");
                break;
            case "Kilogram/hour -kg/h":
                textconversionFrom.setText("Kilogram/hour ");                 textViewConversionShortform.setText("kg/h");
                break;
            case "Kilogram/day -kg/d":
                textconversionFrom.setText("Kilogram/day ");                 textViewConversionShortform.setText("kg/d");
                break;
            case "Exagram/second -Eg/s":
                textconversionFrom.setText("Exagram/second ");                 textViewConversionShortform.setText("Eg/s");
                break;
            case "Petagram/second -Pg/s":
                textconversionFrom.setText("Petagram/second ");                 textViewConversionShortform.setText("Pg/s");
                break;
            case "Teragram/second -Tg/s":
                textconversionFrom.setText("Teragram/second ");                 textViewConversionShortform.setText("Tg/s");
                break;
            case "Gigagram/second -Gg/s":
                textconversionFrom.setText("Gigagram/second ");                 textViewConversionShortform.setText("Gg/s");
                break;
            case "Megagram/second -Mg/s":
                textconversionFrom.setText("Megagram/second ");                 textViewConversionShortform.setText("Mg/s");
                break;
            case "Hectogram/second -hg/s":
                textconversionFrom.setText("Hectogram/second ");                 textViewConversionShortform.setText("hg/s");
                break;
            case "Dekagram/second -dag/s":
                textconversionFrom.setText("Dekagram/second ");                 textViewConversionShortform.setText("dag/s");
                break;
            case "Decigram/second -dg/s":
                textconversionFrom.setText("Decigram/second ");                 textViewConversionShortform.setText("dg/s");
                break;
            case "Centigram/second -cg/s":
                textconversionFrom.setText("Centigram/second ");                 textViewConversionShortform.setText("cg/s");
                break;
            case "Milligram/second -mg/s":
                textconversionFrom.setText("Milligram/second ");                 textViewConversionShortform.setText("mg/s");
                break;
            case "Microgram/second -μg/s":
                textconversionFrom.setText("Microgram/second ");                 textViewConversionShortform.setText("μg/s");
                break;
            case "Ton (metric)/second -t/s":
                textconversionFrom.setText("Ton (metric)/second ");                 textViewConversionShortform.setText("t/s");
                break;
            case "Ton (metric)/minute -t/min":
                textconversionFrom.setText("Ton (metric)/minute ");                 textViewConversionShortform.setText("t/min");
                break;
            case "Ton (metric)/hour -t/h":
                textconversionFrom.setText("Ton (metric)/hour ");                 textViewConversionShortform.setText("t/h");
                break;
            case "Ton (metric)/day -t/d":
                textconversionFrom.setText("Ton (metric)/day ");                 textViewConversionShortform.setText("t/d");
                break;
            case "Ton (short)/hour -ton(US)/h":
                textconversionFrom.setText("Ton (short)/hour ");                 textViewConversionShortform.setText("ton(US)/h");
                break;
            case "Pound/second -lb/s":
                textconversionFrom.setText("Pound/second ");                 textViewConversionShortform.setText("lb/s");
                break;
            case "Pound/minute -lb/min":
                textconversionFrom.setText("Pound/minute ");                 textViewConversionShortform.setText("lb/min");
                break;
            case "Pound/hour -lb/h":
                textconversionFrom.setText("Pound/hour ");                 textViewConversionShortform.setText("lb/h");
                break;
            case "Pound/day -lb/d":
                textconversionFrom.setText("Pound/day ");                 textViewConversionShortform.setText("lb/d");
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

        FlowMassConverter c = new  FlowMassConverter(strSpinnerFrom,doubleEdittextvalue1);
        ArrayList<FlowMassConverter.ConversionResults> results = c.calculateFlowMassConverterConversion();
        int length = results.size();
        for (int i = 0; i < length; i++) {
            FlowMassConverter.ConversionResults item = results.get(i);


            strkilogramsecond=String.valueOf(formatter.format(item.getKilogramsecond()));
            strgramsecond=String.valueOf(formatter.format(item.getGramsecond()));
            strgramminute=String.valueOf(formatter.format(item.getGramminute()));
            strgramhour=String.valueOf(formatter.format(item.getGramhour()));
            strgramday=String.valueOf(formatter.format(item.getGramday()));
            strmilligramminute=String.valueOf(formatter.format(item.getMilligramminute()));
            strmilligramhour=String.valueOf(formatter.format(item.getMilligramhour()));
            strmilligramday=String.valueOf(formatter.format(item.getMilligramday()));
            strkilogramminute=String.valueOf(formatter.format(item.getKilogramminute()));
            strkilogramhour=String.valueOf(formatter.format(item.getKilogramhour()));
            strkilogramday=String.valueOf(formatter.format(item.getKilogramday()));
            strexagramsecond=String.valueOf(formatter.format(item.getExagramsecond()));
            strpetagramsecond=String.valueOf(formatter.format(item.getPetagramsecond()));
            strteragramsecond=String.valueOf(formatter.format(item.getTeragramsecond()));
            strgigagramsecond=String.valueOf(formatter.format(item.getGigagramsecond()));
            strmegagramsecond=String.valueOf(formatter.format(item.getMegagramsecond()));
            strhectogramsecond=String.valueOf(formatter.format(item.getHectogramsecond()));
            strdekagramsecond=String.valueOf(formatter.format(item.getDekagramsecond()));
            strdecigramsecond=String.valueOf(formatter.format(item.getDecigramsecond()));
            strcentigramsecond=String.valueOf(formatter.format(item.getCentigramsecond()));
            strmilligramsecond=String.valueOf(formatter.format(item.getMilligramsecond()));
            strmicrogramsecond=String.valueOf(formatter.format(item.getMicrogramsecond()));
            strtonmetricsecond=String.valueOf(formatter.format(item.getTonmetricsecond()));
            strtonmetricminute=String.valueOf(formatter.format(item.getTonmetricminute()));
            strtonmetrichour=String.valueOf(formatter.format(item.getTonmetrichour()));
            strtonmetricday=String.valueOf(formatter.format(item.getTonmetricday()));
            strtonshorthour=String.valueOf(formatter.format(item.getTonshorthour()));
            strpoundsecond=String.valueOf(formatter.format(item.getPoundsecond()));
            strpoundminute=String.valueOf(formatter.format(item.getPoundminute()));
            strpoundhour=String.valueOf(formatter.format(item.getPoundhour()));
            strpoundday=String.valueOf(formatter.format(item.getPoundday()));



            list.add(new ItemList("kg/s","Kilogram/second ",strkilogramsecond,"kg/s"));
            list.add(new ItemList("g/s","Gram/second ",strgramsecond,"g/s"));
            list.add(new ItemList("g/min","Gram/minute ",strgramminute,"g/min"));
            list.add(new ItemList("g/h","Gram/hour ",strgramhour,"g/h"));
            list.add(new ItemList("g/d","Gram/day ",strgramday,"g/d"));
            list.add(new ItemList("mg/min","Milligram/minute ",strmilligramminute,"mg/min"));
            list.add(new ItemList("mg/h","Milligram/hour ",strmilligramhour,"mg/h"));
            list.add(new ItemList("mg/d","Milligram/day ",strmilligramday,"mg/d"));
            list.add(new ItemList("kg/m","Kilogram/minute ",strkilogramminute,"kg/m"));
            list.add(new ItemList("kg/h","Kilogram/hour ",strkilogramhour,"kg/h"));
            list.add(new ItemList("kg/d","Kilogram/day ",strkilogramday,"kg/d"));
            list.add(new ItemList("Eg/s","Exagram/second ",strexagramsecond,"Eg/s"));
            list.add(new ItemList("Pg/s","Petagram/second ",strpetagramsecond,"Pg/s"));
            list.add(new ItemList("Tg/s","Teragram/second ",strteragramsecond,"Tg/s"));
            list.add(new ItemList("Gg/s","Gigagram/second ",strgigagramsecond,"Gg/s"));
            list.add(new ItemList("Mg/s","Megagram/second ",strmegagramsecond,"Mg/s"));
            list.add(new ItemList("hg/s","Hectogram/second ",strhectogramsecond,"hg/s"));
            list.add(new ItemList("dag/s","Dekagram/second ",strdekagramsecond,"dag/s"));
            list.add(new ItemList("dg/s","Decigram/second ",strdecigramsecond,"dg/s"));
            list.add(new ItemList("cg/s","Centigram/second ",strcentigramsecond,"cg/s"));
            list.add(new ItemList("mg/s","Milligram/second ",strmilligramsecond,"mg/s"));
            list.add(new ItemList("μg/s","Microgram/second ",strmicrogramsecond,"μg/s"));
            list.add(new ItemList("t/s","Ton (metric)/second ",strtonmetricsecond,"t/s"));
            list.add(new ItemList("t/min","Ton (metric)/minute ",strtonmetricminute,"t/min"));
            list.add(new ItemList("t/h","Ton (metric)/hour ",strtonmetrichour,"t/h"));
            list.add(new ItemList("t/d","Ton (metric)/day ",strtonmetricday,"t/d"));
            list.add(new ItemList("ton(US)/h","Ton (short)/hour ",strtonshorthour,"ton(US)/h"));
            list.add(new ItemList("lb/s","Pound/second ",strpoundsecond,"lb/s"));
            list.add(new ItemList("lb/min","Pound/minute ",strpoundminute,"lb/min"));
            list.add(new ItemList("lb/h","Pound/hour ",strpoundhour,"lb/h"));
            list.add(new ItemList("lb/d","Pound/day ",strpoundday,"lb/d"));




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
