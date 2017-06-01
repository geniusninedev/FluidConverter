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
import com.nineinfosys.fluidconverter.Engin.ViscosityDynamicConverter;
import com.nineinfosys.fluidconverter.R;
import com.nineinfosys.fluidconverter.Supporter.ItemList;
import com.nineinfosys.fluidconverter.Supporter.Settings;

import java.io.File;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class ConversionViscosityDynamicListActivity extends AppCompatActivity implements TextWatcher {

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

  private  String strpascalsecond=null,strkilogramforcesecondpersquaremeter=null,strnewtonsecondpersquaremeter=null,strmillinewtonsecondppersqmeter=null,strdynesecondpersqcentimeter=null,strpoise=null,
            strexapoise=null,strpetapoise =null,strterapoise=null,strgigapoise=null,strmegapoise=null,strkilopoise=null,strhectopoise=null,strdekapoise=null,strdecipoise=null,strcentipoise=null,
            strmillipoise=null,strmicropoise=null,strnanopoise=null,strpicopoise=null,strfemtopoise=null,strattopoise=null,strpoundforcesecondpersqinch =null,strpoundforcesecondpersqfoot=null,
            strpoundalsecondpersquarefoot=null,strgrampercentimeterpersecond=null,strslugperfootpersecond=null,strpoundperfootpersecond=null,strpoundperfootperhour=null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conversion_list);
        //keyboard hidden first time
        this.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);

        //customize toolbar
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#59db59")));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setTitle("Conversion Report");

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            Window window = getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.setStatusBarColor(Color.parseColor("#0aa828"));
        }

        //format of decimal pint
        formatsetting();

        MobileAds.initialize(ConversionViscosityDynamicListActivity.this, getString(R.string.ads_app_id));
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
            case "Pascal second -Pa*s":
                textconversionFrom.setText("Pascal second ");                 textViewConversionShortform.setText("Pa*s");
                break;
            case "Kilogram-force second/square meter -kg-Ns/m^2":
                textconversionFrom.setText("Kilogram-force second/square meter ");                 textViewConversionShortform.setText("kg-Ns/m^2");
                break;
            case "Newton second/square meter -N*s/m^2":
                textconversionFrom.setText("Newton second/square meter ");                 textViewConversionShortform.setText("N*s/m^2");
                break;
            case "Millinewton second/sq. meter -mNs/m^2":
                textconversionFrom.setText("Millinewton second/sq. meter ");                 textViewConversionShortform.setText("mNs/m^2");
                break;
            case "Dyne second/sq. centimeter -dyns/cm^2":
                textconversionFrom.setText("Dyne second/sq. centimeter ");                 textViewConversionShortform.setText("dyns/cm^2");
                break;
            case "Poise -P":
                textconversionFrom.setText("Poise ");                 textViewConversionShortform.setText("P");
                break;
            case "Exapoise -EP":
                textconversionFrom.setText("Exapoise ");                 textViewConversionShortform.setText("EP");
                break;
            case "Petapoise -PP":
                textconversionFrom.setText("Petapoise ");                 textViewConversionShortform.setText("PP");
                break;
            case "Terapoise -TP":
                textconversionFrom.setText("Terapoise ");                 textViewConversionShortform.setText("TP");
                break;
            case "Gigapoise -GP":
                textconversionFrom.setText("Gigapoise ");                 textViewConversionShortform.setText("GP");
                break;
            case "Megapoise -MP":
                textconversionFrom.setText("Megapoise ");                 textViewConversionShortform.setText("MP");
                break;
            case "Kilopoise -kP":
                textconversionFrom.setText("Kilopoise ");                 textViewConversionShortform.setText("kP");
                break;
            case "Hectopoise -hP":
                textconversionFrom.setText("Hectopoise ");                 textViewConversionShortform.setText("hP");
                break;
            case "Dekapoise -daP":
                textconversionFrom.setText("Dekapoise ");                 textViewConversionShortform.setText("daP");
                break;
            case "Decipoise -dP":
                textconversionFrom.setText("Decipoise ");                 textViewConversionShortform.setText("dP");
                break;
            case "Centipoise -cP":
                textconversionFrom.setText("Centipoise ");                 textViewConversionShortform.setText("cP");
                break;
            case "Millipoise -mP":
                textconversionFrom.setText("Millipoise ");                 textViewConversionShortform.setText("mP");
                break;
            case "Micropoise -μP":
                textconversionFrom.setText("Micropoise ");                 textViewConversionShortform.setText("μP");
                break;
            case "Nanopoise -nP":
                textconversionFrom.setText("Nanopoise ");                 textViewConversionShortform.setText("nP");
                break;
            case "Picopoise -pP":
                textconversionFrom.setText("Picopoise ");                 textViewConversionShortform.setText("pP");
                break;
            case "Femtopoise -fP":
                textconversionFrom.setText("Femtopoise ");                 textViewConversionShortform.setText("fP");
                break;
            case "Attopoise -aP":
                textconversionFrom.setText("Attopoise ");                 textViewConversionShortform.setText("aP");
                break;
            case "Pound-force second/sq. inch -lb-Ns/in^2":
                textconversionFrom.setText("Pound-force second/sq. inch ");                 textViewConversionShortform.setText("lb-Ns/in^2");
                break;
            case "Pound-force second/sq. foot -lb-Ns/ft^2":
                textconversionFrom.setText("Pound-force second/sq. foot ");                 textViewConversionShortform.setText("lb-Ns/ft^2");
                break;
            case "Poundal second/square foot -lbs/ft^2":
                textconversionFrom.setText("Poundal second/square foot ");                 textViewConversionShortform.setText("lbs/ft^2");
                break;
            case "Gram/centimeter/second -g/(cm*s)":
                textconversionFrom.setText("Gram/centimeter/second ");                 textViewConversionShortform.setText("g/(cm*s)");
                break;
            case "Slug/foot/second -slug/(ft*s)":
                textconversionFrom.setText("Slug/foot/second ");                 textViewConversionShortform.setText("slug/(ft*s)");
                break;
            case "Pound/foot/second -lb/(ft*s)":
                textconversionFrom.setText("Pound/foot/second ");                 textViewConversionShortform.setText("lb/(ft*s)");
                break;
            case "Pound/foot/hour -lb/(ft*h)":
                textconversionFrom.setText("Pound/foot/hour ");                 textViewConversionShortform.setText("lb/(ft*h)");
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

        ViscosityDynamicConverter c = new  ViscosityDynamicConverter(strSpinnerFrom,doubleEdittextvalue1);
        ArrayList<ViscosityDynamicConverter.ConversionResults> results = c.calculateViscosityConversion();
        int length = results.size();
        for (int i = 0; i < length; i++) {
            ViscosityDynamicConverter.ConversionResults item = results.get(i);

            strpascalsecond=String.valueOf(formatter.format(item.getPascalsecond()));
            strkilogramforcesecondpersquaremeter=String.valueOf(formatter.format(item.getKilogramforcesecondpersquaremeter()));
            strnewtonsecondpersquaremeter=String.valueOf(formatter.format(item.getNewtonsecondpersquaremeter()));
            strmillinewtonsecondppersqmeter=String.valueOf(formatter.format(item.getMillinewtonsecondppersqmeter()));
            strdynesecondpersqcentimeter=String.valueOf(formatter.format(item.getDynesecondpersqcentimeter()));
            strpoise=String.valueOf(formatter.format(item.getPoise()));
            strexapoise=String.valueOf(formatter.format(item.getExapoise()));
            strpetapoise=String.valueOf(formatter.format(item.getPetapoise()));
            strterapoise=String.valueOf(formatter.format(item.getTerapoise()));
            strgigapoise=String.valueOf(formatter.format(item.getGigapoise()));
            strmegapoise=String.valueOf(formatter.format(item.getMegapoise()));
            strkilopoise=String.valueOf(formatter.format(item.getKilopoise()));
            strhectopoise=String.valueOf(formatter.format(item.getHectopoise()));
            strdekapoise=String.valueOf(formatter.format(item.getDekapoise()));
            strdecipoise=String.valueOf(formatter.format(item.getDecipoise()));
            strcentipoise=String.valueOf(formatter.format(item.getCentipoise()));
            strmillipoise=String.valueOf(formatter.format(item.getMillipoise()));
            strmicropoise=String.valueOf(formatter.format(item.getMicropoise()));
            strnanopoise=String.valueOf(formatter.format(item.getNanopoise()));
            strpicopoise=String.valueOf(formatter.format(item.getPicopoise()));
            strfemtopoise=String.valueOf(formatter.format(item.getFemtopoise()));
            strattopoise=String.valueOf(formatter.format(item.getAttopoise()));
            strpoundforcesecondpersqinch=String.valueOf(formatter.format(item.getPoundforcesecondpersqinch()));
            strpoundforcesecondpersqfoot=String.valueOf(formatter.format(item.getPoundforcesecondpersqfoot()));
            strpoundalsecondpersquarefoot=String.valueOf(formatter.format(item.getPoundalsecondpersquarefoot()));
            strgrampercentimeterpersecond=String.valueOf(formatter.format(item.getGrampercentimeterpersecond()));
            strslugperfootpersecond=String.valueOf(formatter.format(item.getSlugperfootpersecond()));
            strpoundperfootpersecond=String.valueOf(formatter.format(item.getPoundperfootpersecond()));
            strpoundperfootperhour=String.valueOf(formatter.format(item.getPoundperfootperhour()));



            list.add(new ItemList("Pa*s","Pascal second ",strpascalsecond,"Pa*s"));
            list.add(new ItemList("kg-Ns/m^2","Kilogram-force second/square meter ",strkilogramforcesecondpersquaremeter,"kg-Ns/m^2"));
            list.add(new ItemList("N*s/m^2","Newton second/square meter ",strnewtonsecondpersquaremeter,"N*s/m^2"));
            list.add(new ItemList("mNs/m^2","Millinewton second/sq. meter ",strmillinewtonsecondppersqmeter,"mNs/m^2"));
            list.add(new ItemList("dyns/cm^2","Dyne second/sq. centimeter ",strdynesecondpersqcentimeter,"dyns/cm^2"));
            list.add(new ItemList("P","Poise ",strpoise,"P"));
            list.add(new ItemList("EP","Exapoise ",strexapoise,"EP"));
            list.add(new ItemList("PP","Petapoise ",strpetapoise,"PP"));
            list.add(new ItemList("TP","Terapoise ",strterapoise,"TP"));
            list.add(new ItemList("GP","Gigapoise ",strgigapoise,"GP"));
            list.add(new ItemList("MP","Megapoise ",strmegapoise,"MP"));
            list.add(new ItemList("kP","Kilopoise ",strkilopoise,"kP"));
            list.add(new ItemList("hP","Hectopoise ",strhectopoise,"hP"));
            list.add(new ItemList("daP","Dekapoise ",strdekapoise,"daP"));
            list.add(new ItemList("dP","Decipoise ",strdecipoise,"dP"));
            list.add(new ItemList("cP","Centipoise ",strcentipoise,"cP"));
            list.add(new ItemList("mP","Millipoise ",strmillipoise,"mP"));
            list.add(new ItemList("μP","Micropoise ",strmicropoise,"μP"));
            list.add(new ItemList("nP","Nanopoise ",strnanopoise,"nP"));
            list.add(new ItemList("pP","Picopoise ",strpicopoise,"pP"));
            list.add(new ItemList("fP","Femtopoise ",strfemtopoise,"fP"));
            list.add(new ItemList("aP","Attopoise ",strattopoise,"aP"));
            list.add(new ItemList("lb-Ns/in^2","Pound-force second/sq. inch ",strpoundforcesecondpersqinch,"lb-Ns/in^2"));
            list.add(new ItemList("lb-Ns/ft^2","Pound-force second/sq. foot ",strpoundforcesecondpersqfoot,"lb-Ns/ft^2"));
            list.add(new ItemList("lbs/ft^2","Poundal second/square foot ",strpoundalsecondpersquarefoot,"lbs/ft^2"));
            list.add(new ItemList("g/(cm*s)","Gram/centimeter/second ",strgrampercentimeterpersecond,"g/(cm*s)"));
            list.add(new ItemList("slug/(ft*s)","Slug/foot/second ",strslugperfootpersecond,"slug/(ft*s)"));
            list.add(new ItemList("lb/(ft*s)","Pound/foot/second ",strpoundperfootpersecond,"lb/(ft*s)"));
            list.add(new ItemList("lb/(ft*h)","Pound/foot/hour ",strpoundperfootperhour,"lb/(ft*h)"));




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
