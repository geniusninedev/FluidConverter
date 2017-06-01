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
import com.nineinfosys.fluidconverter.Engin.FlowMolarConverter;
import com.nineinfosys.fluidconverter.R;
import com.nineinfosys.fluidconverter.Supporter.ItemList;
import com.nineinfosys.fluidconverter.Supporter.Settings;

import java.io.File;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class ConversionFlowMolarListActivity extends AppCompatActivity implements TextWatcher {

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

   private String strmolsecond=null,strexamolsecond=null,strpetamolsecond=null,strteramolsecond=null,strgigamolsecond=null,strmegamolsecond=null,strkilomolsecond=null,strhectomolsecond=null,
            strdekamolsecond=null,strdecimolsecond=null,strcentimolsecond=null,strmillimolsecond=null,strmicromolsecond=null,strnanomolsecond=null,strpicomolsecond=null,strfemtomolsecond=null,
            strattomolsecond=null,strmolminute=null,strmolhour=null,strmolday=null,strmillimolminute=null,strmillimolhour=null,strmillimolday=null,strkilomolminute=null,strkilomolhour=null,
            strkilomolday=null;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conversion_list);

        //keyboard hidden first time
        this.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);

        //customize toolbar
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#03a9f4")));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setTitle("Conversion Report");

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            Window window = getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.setStatusBarColor(Color.parseColor("#007ac1"));
        }

        //format of decimal pint
        formatsetting();
        MobileAds.initialize(ConversionFlowMolarListActivity.this, getString(R.string.ads_app_id));
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
            case "Mol/second -mol/s":
                textconversionFrom.setText("Mol/second ");                 textViewConversionShortform.setText("mol/s");
                break;
            case "Examol/second -Emol/s":
                textconversionFrom.setText("Examol/second ");                 textViewConversionShortform.setText("Emol/s");
                break;
            case "Petamol/second -Pmol/s":
                textconversionFrom.setText("Petamol/second ");                 textViewConversionShortform.setText("Pmol/s");
                break;
            case "Teramol/second -Tmol/s":
                textconversionFrom.setText("Teramol/second ");                 textViewConversionShortform.setText("Tmol/s");
                break;
            case "Gigamol/second -Gmol/s":
                textconversionFrom.setText("Gigamol/second ");                 textViewConversionShortform.setText("Gmol/s");
                break;
            case "Megamol/second -Mmol/s":
                textconversionFrom.setText("Megamol/second ");                 textViewConversionShortform.setText("Mmol/s");
                break;
            case "Kilomol/second -kmol/s":
                textconversionFrom.setText("Kilomol/second ");                 textViewConversionShortform.setText("kmol/s");
                break;
            case "Hectomol/second -hmol/s":
                textconversionFrom.setText("Hectomol/second ");                 textViewConversionShortform.setText("hmol/s");
                break;
            case "Dekamol/second -damol/s":
                textconversionFrom.setText("Dekamol/second ");                 textViewConversionShortform.setText("damol/s");
                break;
            case "Decimol/second -dmol/s":
                textconversionFrom.setText("Decimol/second ");                 textViewConversionShortform.setText("dmol/s");
                break;
            case "Centimol/second -cmol/s":
                textconversionFrom.setText("Centimol/second ");                 textViewConversionShortform.setText("cmol/s");
                break;
            case "Millimol/second -mmol/s":
                textconversionFrom.setText("Millimol/second ");                 textViewConversionShortform.setText("mmol/s");
                break;
            case "Micromol/second -μmol/s":
                textconversionFrom.setText("Micromol/second ");                 textViewConversionShortform.setText("μmol/s");
                break;
            case "Nanomol/second -nmol/s":
                textconversionFrom.setText("Nanomol/second ");                 textViewConversionShortform.setText("nmol/s");
                break;
            case "Picomol/second -pmol/s":
                textconversionFrom.setText("Picomol/second ");                 textViewConversionShortform.setText("pmol/s");
                break;
            case "Femtomol/second -fmol/s":
                textconversionFrom.setText("Femtomol/second ");                 textViewConversionShortform.setText("fmol/s");
                break;
            case "Attomol/second -amol/s":
                textconversionFrom.setText("Attomol/second ");                 textViewConversionShortform.setText("amol/s");
                break;
            case "Mol/minute -mol/min":
                textconversionFrom.setText("Mol/minute ");                 textViewConversionShortform.setText("mol/min");
                break;
            case "Mol/hour -mol/h":
                textconversionFrom.setText("Mol/hour ");                 textViewConversionShortform.setText("mol/h");
                break;
            case "Mol/day -mol/d":
                textconversionFrom.setText("Mol/day ");                 textViewConversionShortform.setText("mol/d");
                break;
            case "Millimol/minute -mmol/min":
                textconversionFrom.setText("Millimol/minute ");                 textViewConversionShortform.setText("mmol/min");
                break;
            case "Millimol/hour -mmol/h":
                textconversionFrom.setText("Millimol/hour ");                 textViewConversionShortform.setText("mmol/h");
                break;
            case "Millimol/day -mmol/d":
                textconversionFrom.setText("Millimol/day ");                 textViewConversionShortform.setText("mmol/d");
                break;
            case "Kilomol/minute -kmol/min":
                textconversionFrom.setText("Kilomol/minute ");                 textViewConversionShortform.setText("kmol/min");
                break;
            case "Kilomol/hour -kmol/h":
                textconversionFrom.setText("Kilomol/hour ");                 textViewConversionShortform.setText("kmol/h");
                break;
            case "Kilomol/day -kmol/d":
                textconversionFrom.setText("Kilomol/day ");                 textViewConversionShortform.setText("kmol/d");
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

        FlowMolarConverter c = new  FlowMolarConverter(strSpinnerFrom,doubleEdittextvalue1);
        ArrayList<FlowMolarConverter.ConversionResults> results = c.calculateFlowMolarConverterConversion();
        int length = results.size();
        for (int i = 0; i < length; i++) {
            FlowMolarConverter.ConversionResults item = results.get(i);

            strmolsecond=String.valueOf(formatter.format(item.getMolsecond()));
            strexamolsecond=String.valueOf(formatter.format(item.getExamolsecond()));
            strpetamolsecond=String.valueOf(formatter.format(item.getPetamolsecond()));
            strteramolsecond=String.valueOf(formatter.format(item.getTeramolsecond()));
            strgigamolsecond=String.valueOf(formatter.format(item.getGigamolsecond()));
            strmegamolsecond=String.valueOf(formatter.format(item.getMegamolsecond()));
            strkilomolsecond=String.valueOf(formatter.format(item.getKilomolsecond()));
            strhectomolsecond=String.valueOf(formatter.format(item.getHectomolsecond()));
            strdekamolsecond=String.valueOf(formatter.format(item.getDekamolsecond()));
            strdecimolsecond=String.valueOf(formatter.format(item.getDecimolsecond()));
            strcentimolsecond=String.valueOf(formatter.format(item.getCentimolsecond()));
            strmillimolsecond=String.valueOf(formatter.format(item.getMillimolsecond()));
            strmicromolsecond=String.valueOf(formatter.format(item.getMicromolsecond()));
            strnanomolsecond=String.valueOf(formatter.format(item.getNanomolsecond()));
            strpicomolsecond=String.valueOf(formatter.format(item.getPicomolsecond()));
            strfemtomolsecond=String.valueOf(formatter.format(item.getFemtomolsecond()));
            strattomolsecond=String.valueOf(formatter.format(item.getAttomolsecond()));
            strmolminute=String.valueOf(formatter.format(item.getMolminute()));
            strmolhour=String.valueOf(formatter.format(item.getMolhour()));
            strmolday=String.valueOf(formatter.format(item.getMolday()));
            strmillimolminute=String.valueOf(formatter.format(item.getMillimolminute()));
            strmillimolhour=String.valueOf(formatter.format(item.getMillimolhour()));
            strmillimolday=String.valueOf(formatter.format(item.getMillimolday()));
            strkilomolminute=String.valueOf(formatter.format(item.getKilomolminute()));
            strkilomolhour=String.valueOf(formatter.format(item.getKilomolhour()));
            strkilomolday=String.valueOf(formatter.format(item.getKilomolday()));

            list.add(new ItemList("mol/s","Mol/second ",strmolsecond,"mol/s"));
            list.add(new ItemList("Emol/s","Examol/second ",strexamolsecond,"Emol/s"));
            list.add(new ItemList("Pmol/s","Petamol/second ",strpetamolsecond,"Pmol/s"));
            list.add(new ItemList("Tmol/s","Teramol/second ",strteramolsecond,"Tmol/s"));
            list.add(new ItemList("Gmol/s","Gigamol/second ",strgigamolsecond,"Gmol/s"));
            list.add(new ItemList("Mmol/s","Megamol/second ",strmegamolsecond,"Mmol/s"));
            list.add(new ItemList("kmol/s","Kilomol/second ",strkilomolsecond,"kmol/s"));
            list.add(new ItemList("hmol/s","Hectomol/second ",strhectomolsecond,"hmol/s"));
            list.add(new ItemList("damol/s","Dekamol/second ",strdekamolsecond,"damol/s"));
            list.add(new ItemList("dmol/s","Decimol/second ",strdecimolsecond,"dmol/s"));
            list.add(new ItemList("cmol/s","Centimol/second ",strcentimolsecond,"cmol/s"));
            list.add(new ItemList("mmol/s","Millimol/second ",strmillimolsecond,"mmol/s"));
            list.add(new ItemList("μmol/s","Micromol/second ",strmicromolsecond,"μmol/s"));
            list.add(new ItemList("nmol/s","Nanomol/second ",strnanomolsecond,"nmol/s"));
            list.add(new ItemList("pmol/s","Picomol/second ",strpicomolsecond,"pmol/s"));
            list.add(new ItemList("fmol/s","Femtomol/second ",strfemtomolsecond,"fmol/s"));
            list.add(new ItemList("amol/s","Attomol/second ",strattomolsecond,"amol/s"));
            list.add(new ItemList("mol/min","Mol/minute ",strmolminute,"mol/min"));
            list.add(new ItemList("mol/h","Mol/hour ",strmolhour,"mol/h"));
            list.add(new ItemList("mol/d","Mol/day ",strmolday,"mol/d"));
            list.add(new ItemList("mmol/min","Millimol/minute ",strmillimolminute,"mmol/min"));
            list.add(new ItemList("mmol/h","Millimol/hour ",strmillimolhour,"mmol/h"));
            list.add(new ItemList("mmol/d","Millimol/day ",strmillimolday,"mmol/d"));
            list.add(new ItemList("kmol/min","Kilomol/minute ",strkilomolminute,"kmol/min"));
            list.add(new ItemList("kmol/h","Kilomol/hour ",strkilomolhour,"kmol/h"));
            list.add(new ItemList("kmol/d","Kilomol/day ",strkilomolday,"kmol/d"));




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
