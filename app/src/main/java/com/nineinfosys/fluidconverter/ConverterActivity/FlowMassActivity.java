package com.nineinfosys.fluidconverter.ConverterActivity;

import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.content.ContextCompat;
import android.support.v4.graphics.drawable.DrawableCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.SwitchCompat;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.nineinfosys.fluidconverter.ConverterActivityList.ConversionFlowMassListActivity;
import com.nineinfosys.fluidconverter.Engin.FlowMassConverter;
import com.nineinfosys.fluidconverter.R;
import com.nineinfosys.fluidconverter.Supporter.Settings;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class FlowMassActivity extends AppCompatActivity implements View.OnClickListener,TextWatcher {


    //declaration of designing tools
    private Spinner spinnerConvertFrom, spinnerConvertTo;
    private EditText editTextValue, editTextValueTo;

    private FloatingActionButton buttonList, buttonShare, buttonMail, buttonCopy;
    private SwitchCompat switchChangeType;
    List<String> listtempFirstfrom, listFirsttempTo, listtempfrom, listtempTo;
    private String stringSpinnerFrom, stringSpinnerTo;
    private TextView textViewBasicUnit, textViewAllUnit,textViewConvert;
    double doubleEdittextvalue = 1.0;
    private int basicunit = 5;
    private int allunit = 31;
    DecimalFormat formatter = null;
    private static final int REQUEST_CODE = 100;


    FlowMassConverter.ConversionResults item;
   private  String strkilogramsecond=null,strgramsecond=null,strgramminute=null,strgramhour=null,strgramday=null,strmilligramminute=null,strmilligramhour=null,strmilligramday=null,strkilogramminute=null,
            strkilogramhour=null,strkilogramday=null,strexagramsecond=null,strpetagramsecond=null,strteragramsecond=null,strgigagramsecond=null,strmegagramsecond=null,strhectogramsecond=null,
            strdekagramsecond=null,strdecigramsecond=null,strcentigramsecond=null,strmilligramsecond=null,strmicrogramsecond=null,strtonmetricsecond=null,strtonmetricminute=null,strtonmetrichour=null,
            strtonmetricday=null,strtonshorthour=null,strpoundsecond=null,strpoundminute=null,strpoundhour=null,strpoundday=null;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_converter);


        //customize toolbar
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#1e88e5")));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setTitle("Flow Mass");

        formatsetting();

        MobileAds.initialize(FlowMassActivity.this, getString(R.string.ads_app_id));
        AdView mAdView = (AdView) findViewById(R.id.adViewUnitConverter);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);



        //keyboard hidden first time
        this.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);

        //initalization of tools and variables
        spinnerConvertFrom = (Spinner) findViewById(R.id.spinnerConvertFrom);
        spinnerConvertTo = (Spinner) findViewById(R.id.spinnerConvertTo);
        textViewBasicUnit = (TextView) findViewById(R.id.textViewBasicUnit);
        textViewAllUnit = (TextView) findViewById(R.id.textViewAllUnit);
        textViewConvert=(TextView) findViewById(R.id.buttonUnitConverter);
        editTextValue = (EditText) findViewById(R.id.edittextFrom);
        editTextValueTo = (EditText) findViewById(R.id.edittextTo);
        buttonCopy = (FloatingActionButton) findViewById(R.id.button_copy);
        buttonList = (FloatingActionButton) findViewById(R.id.button_list_fullreport);
        buttonShare = (FloatingActionButton) findViewById(R.id.button_list_share);
        buttonMail = (FloatingActionButton) findViewById(R.id.button_list_mail);
        switchChangeType = (SwitchCompat) findViewById(R.id.switchButton);

        //changing color dynamically
        buttonCopy.setBackgroundTintList(ColorStateList.valueOf(ContextCompat.getColor(this, R.color.colorLightBlue)));
        buttonList.setBackgroundTintList(ColorStateList.valueOf(ContextCompat.getColor(this, R.color.colorLightBlue)));
        buttonShare.setBackgroundTintList(ColorStateList.valueOf(ContextCompat.getColor(this, R.color.colorLightBlue)));
        buttonMail.setBackgroundTintList(ColorStateList.valueOf(ContextCompat.getColor(this, R.color.colorLightBlue)));

        DrawableCompat.setTintList(DrawableCompat.wrap(switchChangeType.getThumbDrawable()),ColorStateList.valueOf(ContextCompat.getColor(this, R.color.colorLightBlue)));
       // DrawableCompat.setTintList(DrawableCompat.wrap(switchChangeType.getTrackDrawable()), ColorStateList.valueOf(ContextCompat.getColor(this, R.color.colorRed)));
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            textViewConvert.setBackgroundTintList(ColorStateList.valueOf(ContextCompat.getColor(this, R.color.colorLightBlue)));
        }

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            Window window = getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.setStatusBarColor(Color.parseColor("#005cb2"));
        }

        textViewBasicUnit.setText(String.valueOf("Basic Units(" + basicunit + ")"));
        textViewAllUnit.setText(String.valueOf("All Units(" + allunit + ")"));


        //adding value to spinner
        listtempFirstfrom = new ArrayList<String>();
        listFirsttempTo = new ArrayList<String>();


        //for first time running spinner
        listtempFirstfrom.add("Kilogram/second -kg/s");
        listtempFirstfrom.add("Gram/second -g/s");
        listtempFirstfrom.add("Gram/minute -g/min");
        listtempFirstfrom.add("Gram/hour -g/h");
        listtempFirstfrom.add("Gram/day -g/d");

        //for first time running spinner
        listFirsttempTo.add("Kilogram/second -kg/s");
        listFirsttempTo.add("Gram/second -g/s");
        listFirsttempTo.add("Gram/minute -g/min");
        listFirsttempTo.add("Gram/hour -g/h");
        listFirsttempTo.add("Gram/day -g/d");

        // Creating adapter for spinner
        ArrayAdapter<String> Adapter = new ArrayAdapter<String>(FlowMassActivity.this, android.R.layout.simple_spinner_item, listtempFirstfrom);
        ArrayAdapter<String> AdapterTempTo = new ArrayAdapter<String>(FlowMassActivity.this, android.R.layout.simple_spinner_item, listFirsttempTo);


        // Drop down layout style - list view with radio button
        Adapter.setDropDownViewResource(android.R.layout.simple_list_item_checked);
        AdapterTempTo.setDropDownViewResource(android.R.layout.simple_list_item_checked);

        // attaching data adapter to spinner
        spinnerConvertFrom.setAdapter(Adapter);
        spinnerConvertTo.setAdapter(AdapterTempTo);

        //switch converttype
        switchChangeType.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                listtempfrom = new ArrayList<String>();
                listtempTo = new ArrayList<String>();
                String stringSwitchSate = String.valueOf(isChecked);
                String strBasic = "Basic";
                String strAdvance = "All";
                switch (stringSwitchSate) {

                    case "false":
                        Snackbar.make(buttonView, "You switched to " + strBasic + " Units", Snackbar.LENGTH_LONG).setAction("ACTION", null).show();
                        listtempfrom.clear();
                        listtempTo.clear();
                        listtempfrom.add("Kilogram/second -kg/s");
                        listtempfrom.add("Gram/second -g/s");
                        listtempfrom.add("Gram/minute -g/min");
                        listtempfrom.add("Gram/hour -g/h");
                        listtempfrom.add("Gram/day -g/d");


                        //2 spinner
                        listtempTo.add("Kilogram/second -kg/s");
                        listtempTo.add("Gram/second -g/s");
                        listtempTo.add("Gram/minute -g/min");
                        listtempTo.add("Gram/hour -g/h");
                        listtempTo.add("Gram/day -g/d");
                        break;

                    case "true":
                        Snackbar.make(buttonView, "You switched to " + strAdvance + " Units", Snackbar.LENGTH_LONG).setAction("ACTION", null).show();
                        listtempfrom.clear();
                        listtempTo.clear();
                        listtempfrom.add("Kilogram/second -kg/s");
                        listtempfrom.add("Gram/second -g/s");
                        listtempfrom.add("Gram/minute -g/min");
                        listtempfrom.add("Gram/hour -g/h");
                        listtempfrom.add("Gram/day -g/d");
                        listtempfrom.add("Milligram/minute -mg/min");
                        listtempfrom.add("Milligram/hour -mg/h");
                        listtempfrom.add("Milligram/day -mg/d");
                        listtempfrom.add("Kilogram/minute -kg/m");
                        listtempfrom.add("Kilogram/hour -kg/h");
                        listtempfrom.add("Kilogram/day -kg/d");
                        listtempfrom.add("Exagram/second -Eg/s");
                        listtempfrom.add("Petagram/second -Pg/s");
                        listtempfrom.add("Teragram/second -Tg/s");
                        listtempfrom.add("Gigagram/second -Gg/s");
                        listtempfrom.add("Megagram/second -Mg/s");
                        listtempfrom.add("Hectogram/second -hg/s");
                        listtempfrom.add("Dekagram/second -dag/s");
                        listtempfrom.add("Decigram/second -dg/s");
                        listtempfrom.add("Centigram/second -cg/s");
                        listtempfrom.add("Milligram/second -mg/s");
                        listtempfrom.add("Microgram/second -μg/s");
                        listtempfrom.add("Ton (metric)/second -t/s");
                        listtempfrom.add("Ton (metric)/minute -t/min");
                        listtempfrom.add("Ton (metric)/hour -t/h");
                        listtempfrom.add("Ton (metric)/day -t/d");
                        listtempfrom.add("Ton (short)/hour -ton(US)/h");
                        listtempfrom.add("Pound/second -lb/s");
                        listtempfrom.add("Pound/minute -lb/min");
                        listtempfrom.add("Pound/hour -lb/h");
                        listtempfrom.add("Pound/day -lb/d");


                        //second spinner
                        listtempTo.add("Kilogram/second -kg/s");
                        listtempTo.add("Gram/second -g/s");
                        listtempTo.add("Gram/minute -g/min");
                        listtempTo.add("Gram/hour -g/h");
                        listtempTo.add("Gram/day -g/d");
                        listtempTo.add("Milligram/minute -mg/min");
                        listtempTo.add("Milligram/hour -mg/h");
                        listtempTo.add("Milligram/day -mg/d");
                        listtempTo.add("Kilogram/minute -kg/m");
                        listtempTo.add("Kilogram/hour -kg/h");
                        listtempTo.add("Kilogram/day -kg/d");
                        listtempTo.add("Exagram/second -Eg/s");
                        listtempTo.add("Petagram/second -Pg/s");
                        listtempTo.add("Teragram/second -Tg/s");
                        listtempTo.add("Gigagram/second -Gg/s");
                        listtempTo.add("Megagram/second -Mg/s");
                        listtempTo.add("Hectogram/second -hg/s");
                        listtempTo.add("Dekagram/second -dag/s");
                        listtempTo.add("Decigram/second -dg/s");
                        listtempTo.add("Centigram/second -cg/s");
                        listtempTo.add("Milligram/second -mg/s");
                        listtempTo.add("Microgram/second -μg/s");
                        listtempTo.add("Ton (metric)/second -t/s");
                        listtempTo.add("Ton (metric)/minute -t/min");
                        listtempTo.add("Ton (metric)/hour -t/h");
                        listtempTo.add("Ton (metric)/day -t/d");
                        listtempTo.add("Ton (short)/hour -ton(US)/h");
                        listtempTo.add("Pound/second -lb/s");
                        listtempTo.add("Pound/minute -lb/min");
                        listtempTo.add("Pound/hour -lb/h");
                        listtempTo.add("Pound/day -lb/d");

                        break;
                }
                // Creating adapter for spinner
                ArrayAdapter<String> Adapter2 = new ArrayAdapter<String>(FlowMassActivity.this, android.R.layout.simple_spinner_item, listtempfrom);
                ArrayAdapter<String> AdapterTempTo2 = new ArrayAdapter<String>(FlowMassActivity.this, android.R.layout.simple_spinner_item, listtempTo);


                // Drop down layout style - list view with radio button
                Adapter2.setDropDownViewResource(android.R.layout.simple_list_item_checked);
                AdapterTempTo2.setDropDownViewResource(android.R.layout.simple_list_item_checked);

                // attaching data adapter to spinner
                spinnerConvertFrom.setAdapter(Adapter2);
                spinnerConvertTo.setAdapter(AdapterTempTo2);

            }
        });

        editTextValue.addTextChangedListener(this);
        buttonList.setOnClickListener(this);
        buttonShare.setOnClickListener(this);
        buttonMail.setOnClickListener(this);
        buttonCopy.setOnClickListener(this);
        textViewConvert.setOnClickListener(this);


        spinnerConvertFrom.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                if (editTextValue.getText().toString().trim().equals("")) {
                    Snackbar.make(adapterView, "Provide Unit Value for Conversion", Snackbar.LENGTH_LONG).setAction("ACTION", null).show();
                } else {
                    doubleEdittextvalue = Double.parseDouble(editTextValue.getText().toString().trim());
                    stringSpinnerFrom = spinnerConvertFrom.getSelectedItem().toString().trim();
                    stringSpinnerTo = spinnerConvertTo.getSelectedItem().toString().trim();

                    calcualteValue(stringSpinnerFrom, stringSpinnerTo, doubleEdittextvalue);
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        spinnerConvertTo.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                if (editTextValue.getText().toString().trim().equals("")) {
                    Snackbar.make(adapterView, "Provide Unit Value for Conversion", Snackbar.LENGTH_LONG).setAction("ACTION", null).show();
                } else {
                    doubleEdittextvalue = Double.parseDouble(editTextValue.getText().toString().trim());
                    stringSpinnerFrom = spinnerConvertFrom.getSelectedItem().toString().trim();
                    stringSpinnerTo = spinnerConvertTo.getSelectedItem().toString().trim();

                    calcualteValue(stringSpinnerFrom, stringSpinnerTo, doubleEdittextvalue);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });


    }

    private void formatsetting() {
        //fetching value from sharedpreference
        SharedPreferences sharedPreferences = this.getSharedPreferences(Settings.SHARED_PREF_NAME, Context.MODE_PRIVATE);
        //Fetching thepatient_mobile_Number value form sharedpreferences
        String FormattedString = sharedPreferences.getString(Settings.Format_Selected_SHARED_PREF, "Thousands separator");
        String DecimalplaceString = sharedPreferences.getString(Settings.Decimal_Place_Selected_SHARED_PREF, "2");
        Settings settings = new Settings(FormattedString, DecimalplaceString);
        formatter = settings.setting();
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.buttonUnitConverter:
                //switch spinner value
                int spinner1Index = spinnerConvertFrom.getSelectedItemPosition();
                spinnerConvertFrom.setSelection(spinnerConvertTo.getSelectedItemPosition());
                spinnerConvertTo.setSelection(spinner1Index );
                break;

            case R.id.button_list_fullreport:
                doubleEdittextvalue = Double.parseDouble(editTextValue.getText().toString().trim());
                Intent i = new Intent(this, ConversionFlowMassListActivity.class);
                i.putExtra("stringSpinnerFrom", stringSpinnerFrom);
                i.putExtra("doubleEdittextvalue", doubleEdittextvalue);
                startActivity(i);
                break;

            case R.id.button_copy:
                String text = editTextValueTo.getText().toString().trim();
                android.content.ClipboardManager clipboardMgr = (android.content.ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("Copied text", text);
                clipboardMgr.setPrimaryClip(clip);
                Snackbar.make(v, "Conversion Value Copied", Snackbar.LENGTH_LONG).setAction("ACTION", null).show();
                break;

            case R.id.button_list_share:
                String textTo = editTextValueTo.getText().toString().trim();
                String textFrom = editTextValueTo.getText().toString().trim();

                String shareMessage = textFrom + " " + stringSpinnerFrom + ": " + textTo + " " + stringSpinnerTo;

                try {
                    Intent share = new Intent();
                    share.setAction("android.intent.action.SEND");
                    share.setType("text/plain");
                    share.putExtra("android.intent.extra.TEXT", shareMessage);
                    startActivity(Intent.createChooser(share, ""));

                } catch (Exception e) {
                    e.printStackTrace();
                }
             break;

            case R.id.button_list_mail:
                String textmailTo = editTextValueTo.getText().toString().trim();
                String textmailFrom = editTextValueTo.getText().toString().trim();
                String message = textmailTo + " " + stringSpinnerFrom + " :  " + textmailFrom + "  " + stringSpinnerTo;
                Intent email = new Intent(Intent.ACTION_SEND);
                email.putExtra(Intent.EXTRA_EMAIL, new String[]{});
                email.putExtra(Intent.EXTRA_SUBJECT, "Conversion Details");
                email.putExtra(Intent.EXTRA_TEXT, message);
                email.setType("message/rfc822");
                startActivity(Intent.createChooser(email, "Select Email Client"));
                break;

        }

    }

  /* @Override
   protected void onResume() {
       Intent intent = new Intent(TempertureActivity.this, TempertureActivity.class);
       TempertureActivity.this.startActivity(intent);
       finish();
       super.onResume();
   }*/
    @Override
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {

    }

    @Override
    public void onTextChanged(CharSequence s, int start, int before, int count) {

        try {

            doubleEdittextvalue = Double.parseDouble(editTextValue.getText().toString().trim());
            stringSpinnerFrom = spinnerConvertFrom.getSelectedItem().toString().trim();
            stringSpinnerTo = spinnerConvertTo.getSelectedItem().toString().trim();
            calcualteValue(stringSpinnerFrom, stringSpinnerTo, doubleEdittextvalue);

        } catch (NumberFormatException e) {
            doubleEdittextvalue = 0;

        }


    }

    public void calcualteValue(String strSpinnerFromvalue1, String strSpinnerTovalue2, double doubleEdittextvalue1) {



        try {

            FlowMassConverter c = new FlowMassConverter(strSpinnerFromvalue1, doubleEdittextvalue1);
            ArrayList<FlowMassConverter.ConversionResults> results = c.calculateFlowMassConverterConversion();
            int length = results.size();
            for (int i = 0; i < length; i++) {
                item = results.get(i);

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


                switch (strSpinnerFromvalue1) {
                    case "Kilogram/second -kg/s":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Gram/second -g/s":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Gram/minute -g/min":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Gram/hour -g/h":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Gram/day -g/d":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Milligram/minute -mg/min":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Milligram/hour -mg/h":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Milligram/day -mg/d":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Kilogram/minute -kg/m":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Kilogram/hour -kg/h":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Kilogram/day -kg/d":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Exagram/second -Eg/s":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Petagram/second -Pg/s":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Teragram/second -Tg/s":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Gigagram/second -Gg/s":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Megagram/second -Mg/s":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Hectogram/second -hg/s":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Dekagram/second -dag/s":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Decigram/second -dg/s":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Centigram/second -cg/s":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Milligram/second -mg/s":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Microgram/second -μg/s":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Ton (metric)/second -t/s":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Ton (metric)/minute -t/min":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Ton (metric)/hour -t/h":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Ton (metric)/day -t/d":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Ton (short)/hour -ton(US)/h":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Pound/second -lb/s":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Pound/minute -lb/min":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Pound/hour -lb/h":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Pound/day -lb/d":
                        conversion(strSpinnerTovalue2);
                        break;
                }
            }


        } catch (NumberFormatException e) {
            doubleEdittextvalue = 0;

        }
    }

    private void conversion(String strSpinnerTovalue2) {

        switch (strSpinnerTovalue2) {
            case "Kilogram/second -kg/s":
                editTextValueTo.setText(strkilogramsecond);
                break;
            case "Gram/second -g/s":
                editTextValueTo.setText(strgramsecond);
                break;
            case "Gram/minute -g/min":
                editTextValueTo.setText(strgramminute);
                break;
            case "Gram/hour -g/h":
                editTextValueTo.setText(strgramhour);
                break;
            case "Gram/day -g/d":
                editTextValueTo.setText(strgramday);
                break;
            case "Milligram/minute -mg/min":
                editTextValueTo.setText(strmilligramminute);
                break;
            case "Milligram/hour -mg/h":
                editTextValueTo.setText(strmilligramhour);
                break;
            case "Milligram/day -mg/d":
                editTextValueTo.setText(strmilligramday);
                break;
            case "Kilogram/minute -kg/m":
                editTextValueTo.setText(strkilogramminute);
                break;
            case "Kilogram/hour -kg/h":
                editTextValueTo.setText(strkilogramhour);
                break;
            case "Kilogram/day -kg/d":
                editTextValueTo.setText(strkilogramday);
                break;
            case "Exagram/second -Eg/s":
                editTextValueTo.setText(strexagramsecond);
                break;
            case "Petagram/second -Pg/s":
                editTextValueTo.setText(strpetagramsecond);
                break;
            case "Teragram/second -Tg/s":
                editTextValueTo.setText(strteragramsecond);
                break;
            case "Gigagram/second -Gg/s":
                editTextValueTo.setText(strgigagramsecond);
                break;
            case "Megagram/second -Mg/s":
                editTextValueTo.setText(strmegagramsecond);
                break;
            case "Hectogram/second -hg/s":
                editTextValueTo.setText(strhectogramsecond);
                break;
            case "Dekagram/second -dag/s":
                editTextValueTo.setText(strdekagramsecond);
                break;
            case "Decigram/second -dg/s":
                editTextValueTo.setText(strdecigramsecond);
                break;
            case "Centigram/second -cg/s":
                editTextValueTo.setText(strcentigramsecond);
                break;
            case "Milligram/second -mg/s":
                editTextValueTo.setText(strmilligramsecond);
                break;
            case "Microgram/second -μg/s":
                editTextValueTo.setText(strmicrogramsecond);
                break;
            case "Ton (metric)/second -t/s":
                editTextValueTo.setText(strtonmetricsecond);
                break;
            case "Ton (metric)/minute -t/min":
                editTextValueTo.setText(strtonmetricminute);
                break;
            case "Ton (metric)/hour -t/h":
                editTextValueTo.setText(strtonmetrichour);
                break;
            case "Ton (metric)/day -t/d":
                editTextValueTo.setText(strtonmetricday);
                break;
            case "Ton (short)/hour -ton(US)/h":
                editTextValueTo.setText(strtonshorthour);
                break;
            case "Pound/second -lb/s":
                editTextValueTo.setText(strpoundsecond);
                break;
            case "Pound/minute -lb/min":
                editTextValueTo.setText(strpoundminute);
                break;
            case "Pound/hour -lb/h":
                editTextValueTo.setText(strpoundhour);
                break;
            case "Pound/day -lb/d":
                editTextValueTo.setText(strpoundday);
                break;
        }


    }


    @Override
    public void afterTextChanged(Editable s) {

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        if (id == android.R.id.home) {

            this.finish();
        }

        return super.onOptionsItemSelected(item);
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