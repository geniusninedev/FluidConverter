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
import com.nineinfosys.fluidconverter.ConverterActivityList.ConversionViscosityKinematicListActivity;
import com.nineinfosys.fluidconverter.Engin.ViscosityKinematic;
import com.nineinfosys.fluidconverter.R;
import com.nineinfosys.fluidconverter.Supporter.Settings;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class ViscosityKinematicActivity extends AppCompatActivity implements View.OnClickListener,TextWatcher {


    //declaration of designing tools
    private Spinner spinnerConvertFrom, spinnerConvertTo;
    private EditText editTextValue, editTextValueTo;

    private FloatingActionButton buttonList, buttonShare, buttonMail, buttonCopy;
    private SwitchCompat switchChangeType;
    List<String> listtempFirstfrom, listFirsttempTo, listtempfrom, listtempTo;
    private String stringSpinnerFrom, stringSpinnerTo;
    private TextView textViewBasicUnit, textViewAllUnit,textViewConvert;
    double doubleEdittextvalue = 1.0;
    private int basicunit = 8;
    private int allunit = 24;
    DecimalFormat formatter = null;
    private static final int REQUEST_CODE = 100;


    ViscosityKinematic.ConversionResults item;
    private String strsquaremeterpersecond=null,strsquaremeterperhour=null,strsquarecentimeterpersecond=null,strsquaremillimetersecond=null,strsquarefootsecond=null,strsquarefoothour=null,
            strsquareinchsecond=null,strstokes=null,strexastokes=null,strpetastokes=null,strterastokes=null,strgigastokes=null,strmegastokes=null,strkilostokes=null,strhectostokes=null,
            strdekastokes=null,strdecistokes=null,strcentistokes=null,strmillistokes=null,strmicrostokes=null,strnanostokes=null,strpicostokes=null,strfemtostokes=null,strattostokes=null;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_converter);


        //customize toolbar
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#03a9f4")));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setTitle("Viscosity Kinematic ");

        formatsetting();

        MobileAds.initialize(ViscosityKinematicActivity.this, getString(R.string.ads_app_id));
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
        buttonCopy.setBackgroundTintList(ColorStateList.valueOf(ContextCompat.getColor(this, R.color.colorskyblue)));
        buttonList.setBackgroundTintList(ColorStateList.valueOf(ContextCompat.getColor(this, R.color.colorskyblue)));
        buttonShare.setBackgroundTintList(ColorStateList.valueOf(ContextCompat.getColor(this, R.color.colorskyblue)));
        buttonMail.setBackgroundTintList(ColorStateList.valueOf(ContextCompat.getColor(this, R.color.colorskyblue)));

        DrawableCompat.setTintList(DrawableCompat.wrap(switchChangeType.getThumbDrawable()),ColorStateList.valueOf(ContextCompat.getColor(this, R.color.colorskyblue)));
       // DrawableCompat.setTintList(DrawableCompat.wrap(switchChangeType.getTrackDrawable()), ColorStateList.valueOf(ContextCompat.getColor(this, R.color.colorRed)));
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            textViewConvert.setBackgroundTintList(ColorStateList.valueOf(ContextCompat.getColor(this, R.color.colorskyblue)));
        }

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            Window window = getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.setStatusBarColor(Color.parseColor("#007ac1"));
        }

        textViewBasicUnit.setText(String.valueOf("Basic Units(" + basicunit + ")"));
        textViewAllUnit.setText(String.valueOf("All Units(" + allunit + ")"));


        //adding value to spinner
        listtempFirstfrom = new ArrayList<String>();
        listFirsttempTo = new ArrayList<String>();


        //for first time running spinner
        listtempFirstfrom.add("Square meter/second -m^2/s");
        listtempFirstfrom.add("Square meter/hour -m^2/h");
        listtempFirstfrom.add("Square centimeter/second -cm^2/s");
        listtempFirstfrom.add("Square millimeter/second -mm^2/s");
        listtempFirstfrom.add("Square foot/second -ft^2/s");
        listtempFirstfrom.add("Square foot/hour -ft^2/h");
        listtempFirstfrom.add("Square inch/second -in^2/s");
        listtempFirstfrom.add("Stokes -St");

        //for first time running spinner
        listFirsttempTo.add("Square meter/second -m^2/s");
        listFirsttempTo.add("Square meter/hour -m^2/h");
        listFirsttempTo.add("Square centimeter/second -cm^2/s");
        listFirsttempTo.add("Square millimeter/second -mm^2/s");
        listFirsttempTo.add("Square foot/second -ft^2/s");
        listFirsttempTo.add("Square foot/hour -ft^2/h");
        listFirsttempTo.add("Square inch/second -in^2/s");
        listFirsttempTo.add("Stokes -St");

        // Creating adapter for spinner
        ArrayAdapter<String> Adapter = new ArrayAdapter<String>(ViscosityKinematicActivity.this, android.R.layout.simple_spinner_item, listtempFirstfrom);
        ArrayAdapter<String> AdapterTempTo = new ArrayAdapter<String>(ViscosityKinematicActivity.this, android.R.layout.simple_spinner_item, listFirsttempTo);


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
                        listtempfrom.add("Square meter/second -m^2/s");
                        listtempfrom.add("Square meter/hour -m^2/h");
                        listtempfrom.add("Square centimeter/second -cm^2/s");
                        listtempfrom.add("Square millimeter/second -mm^2/s");
                        listtempfrom.add("Square foot/second -ft^2/s");
                        listtempfrom.add("Square foot/hour -ft^2/h");
                        listtempfrom.add("Square inch/second -in^2/s");
                        listtempfrom.add("Stokes -St");


                        //2 spinner
                        listtempTo.add("Square meter/second -m^2/s");
                        listtempTo.add("Square meter/hour -m^2/h");
                        listtempTo.add("Square centimeter/second -cm^2/s");
                        listtempTo.add("Square millimeter/second -mm^2/s");
                        listtempTo.add("Square foot/second -ft^2/s");
                        listtempTo.add("Square foot/hour -ft^2/h");
                        listtempTo.add("Square inch/second -in^2/s");
                        listtempTo.add("Stokes -St");
                        break;

                    case "true":
                        Snackbar.make(buttonView, "You switched to " + strAdvance + " Units", Snackbar.LENGTH_LONG).setAction("ACTION", null).show();
                        listtempfrom.clear();
                        listtempTo.clear();
                        listtempfrom.add("Square meter/second -m^2/s");
                        listtempfrom.add("Square meter/hour -m^2/h");
                        listtempfrom.add("Square centimeter/second -cm^2/s");
                        listtempfrom.add("Square millimeter/second -mm^2/s");
                        listtempfrom.add("Square foot/second -ft^2/s");
                        listtempfrom.add("Square foot/hour -ft^2/h");
                        listtempfrom.add("Square inch/second -in^2/s");
                        listtempfrom.add("Stokes -St");
                        listtempfrom.add("Exastokes -ESt");
                        listtempfrom.add("Petastokes -PSt");
                        listtempfrom.add("Terastokes -TSt");
                        listtempfrom.add("Gigastokes -GSt");
                        listtempfrom.add("Megastokes -MSt");
                        listtempfrom.add("Kilostokes -kSt");
                        listtempfrom.add("Hectostokes -hSt");
                        listtempfrom.add("Dekastokes -daSt");
                        listtempfrom.add("Decistokes -dSt");
                        listtempfrom.add("Centistokes -cSt");
                        listtempfrom.add("Millistokes -mSt");
                        listtempfrom.add("Microstokes -μSt");
                        listtempfrom.add("Nanostokes -nSt");
                        listtempfrom.add("Picostokes -pSt");
                        listtempfrom.add("Femtostokes -fSt");
                        listtempfrom.add("Attostokes -aSt");


                        //second spinner
                        listtempTo.add("Square meter/second -m^2/s");
                        listtempTo.add("Square meter/hour -m^2/h");
                        listtempTo.add("Square centimeter/second -cm^2/s");
                        listtempTo.add("Square millimeter/second -mm^2/s");
                        listtempTo.add("Square foot/second -ft^2/s");
                        listtempTo.add("Square foot/hour -ft^2/h");
                        listtempTo.add("Square inch/second -in^2/s");
                        listtempTo.add("Stokes -St");
                        listtempTo.add("Exastokes -ESt");
                        listtempTo.add("Petastokes -PSt");
                        listtempTo.add("Terastokes -TSt");
                        listtempTo.add("Gigastokes -GSt");
                        listtempTo.add("Megastokes -MSt");
                        listtempTo.add("Kilostokes -kSt");
                        listtempTo.add("Hectostokes -hSt");
                        listtempTo.add("Dekastokes -daSt");
                        listtempTo.add("Decistokes -dSt");
                        listtempTo.add("Centistokes -cSt");
                        listtempTo.add("Millistokes -mSt");
                        listtempTo.add("Microstokes -μSt");
                        listtempTo.add("Nanostokes -nSt");
                        listtempTo.add("Picostokes -pSt");
                        listtempTo.add("Femtostokes -fSt");
                        listtempTo.add("Attostokes -aSt");

                        break;
                }
                // Creating adapter for spinner
                ArrayAdapter<String> Adapter2 = new ArrayAdapter<String>(ViscosityKinematicActivity.this, android.R.layout.simple_spinner_item, listtempfrom);
                ArrayAdapter<String> AdapterTempTo2 = new ArrayAdapter<String>(ViscosityKinematicActivity.this, android.R.layout.simple_spinner_item, listtempTo);


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
                Intent i = new Intent(this, ConversionViscosityKinematicListActivity.class);
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

            ViscosityKinematic c = new ViscosityKinematic(strSpinnerFromvalue1, doubleEdittextvalue1);
            ArrayList<ViscosityKinematic.ConversionResults> results = c.calculateViscosityKinematicConversion();
            int length = results.size();
            for (int i = 0; i < length; i++) {
                item = results.get(i);

                strsquaremeterpersecond=String.valueOf(formatter.format(item.getSquaremeterpersecond()));
                strsquaremeterperhour=String.valueOf(formatter.format(item.getSquaremeterperhour()));
                strsquarecentimeterpersecond=String.valueOf(formatter.format(item.getSquarecentimeterpersecond()));
                strsquaremillimetersecond=String.valueOf(formatter.format(item.getSquaremillimetersecond()));
                strsquarefootsecond=String.valueOf(formatter.format(item.getSquarefootsecond()));
                strsquarefoothour=String.valueOf(formatter.format(item.getSquarefoothour()));
                strsquareinchsecond=String.valueOf(formatter.format(item.getSquareinchsecond()));
                strstokes=String.valueOf(formatter.format(item.getStokes()));
                strexastokes=String.valueOf(formatter.format(item.getExastokes()));
                strpetastokes=String.valueOf(formatter.format(item.getPetastokes()));
                strterastokes=String.valueOf(formatter.format(item.getTerastokes()));
                strgigastokes=String.valueOf(formatter.format(item.getGigastokes()));
                strmegastokes=String.valueOf(formatter.format(item.getMegastokes()));
                strkilostokes=String.valueOf(formatter.format(item.getKilostokes()));
                strhectostokes=String.valueOf(formatter.format(item.getHectostokes()));
                strdekastokes=String.valueOf(formatter.format(item.getDekastokes()));
                strdecistokes=String.valueOf(formatter.format(item.getDecistokes()));
                strcentistokes=String.valueOf(formatter.format(item.getCentistokes()));
                strmillistokes=String.valueOf(formatter.format(item.getMillistokes()));
                strmicrostokes=String.valueOf(formatter.format(item.getMicrostokes()));
                strnanostokes=String.valueOf(formatter.format(item.getNanostokes()));
                strpicostokes=String.valueOf(formatter.format(item.getPicostokes()));
                strfemtostokes=String.valueOf(formatter.format(item.getFemtostokes()));
                strattostokes=String.valueOf(formatter.format(item.getAttostokes()));


                switch (strSpinnerFromvalue1) {
                    case "Square meter/second -m^2/s":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Square meter/hour -m^2/h":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Square centimeter/second -cm^2/s":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Square millimeter/second -mm^2/s":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Square foot/second -ft^2/s":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Square foot/hour -ft^2/h":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Square inch/second -in^2/s":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Stokes -St":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Exastokes -ESt":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Petastokes -PSt":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Terastokes -TSt":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Gigastokes -GSt":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Megastokes -MSt":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Kilostokes -kSt":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Hectostokes -hSt":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Dekastokes -daSt":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Decistokes -dSt":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Centistokes -cSt":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Millistokes -mSt":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Microstokes -μSt":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Nanostokes -nSt":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Picostokes -pSt":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Femtostokes -fSt":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Attostokes -aSt":
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
            case "Square meter/second -m^2/s":
                editTextValueTo.setText(strsquaremeterpersecond);
                break;
            case "Square meter/hour -m^2/h":
                editTextValueTo.setText(strsquaremeterperhour);
                break;
            case "Square centimeter/second -cm^2/s":
                editTextValueTo.setText(strsquarecentimeterpersecond);
                break;
            case "Square millimeter/second -mm^2/s":
                editTextValueTo.setText(strsquaremillimetersecond);
                break;
            case "Square foot/second -ft^2/s":
                editTextValueTo.setText(strsquarefootsecond);
                break;
            case "Square foot/hour -ft^2/h":
                editTextValueTo.setText(strsquarefoothour);
                break;
            case "Square inch/second -in^2/s":
                editTextValueTo.setText(strsquareinchsecond);
                break;
            case "Stokes -St":
                editTextValueTo.setText(strstokes);
                break;
            case "Exastokes -ESt":
                editTextValueTo.setText(strexastokes);
                break;
            case "Petastokes -PSt":
                editTextValueTo.setText(strpetastokes);
                break;
            case "Terastokes -TSt":
                editTextValueTo.setText(strterastokes);
                break;
            case "Gigastokes -GSt":
                editTextValueTo.setText(strgigastokes);
                break;
            case "Megastokes -MSt":
                editTextValueTo.setText(strmegastokes);
                break;
            case "Kilostokes -kSt":
                editTextValueTo.setText(strkilostokes);
                break;
            case "Hectostokes -hSt":
                editTextValueTo.setText(strhectostokes);
                break;
            case "Dekastokes -daSt":
                editTextValueTo.setText(strdekastokes);
                break;
            case "Decistokes -dSt":
                editTextValueTo.setText(strdecistokes);
                break;
            case "Centistokes -cSt":
                editTextValueTo.setText(strcentistokes);
                break;
            case "Millistokes -mSt":
                editTextValueTo.setText(strmillistokes);
                break;
            case "Microstokes -μSt":
                editTextValueTo.setText(strmicrostokes);
                break;
            case "Nanostokes -nSt":
                editTextValueTo.setText(strnanostokes);
                break;
            case "Picostokes -pSt":
                editTextValueTo.setText(strpicostokes);
                break;
            case "Femtostokes -fSt":
                editTextValueTo.setText(strfemtostokes);
                break;
            case "Attostokes -aSt":
                editTextValueTo.setText(strattostokes);
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