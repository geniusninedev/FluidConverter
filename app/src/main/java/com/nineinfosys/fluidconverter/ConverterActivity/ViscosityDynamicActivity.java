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


import com.nineinfosys.fluidconverter.ConverterActivityList.ConversionViscosityDynamicListActivity;
import com.nineinfosys.fluidconverter.Engin.ViscosityDynamicConverter;
import com.nineinfosys.fluidconverter.R;
import com.nineinfosys.fluidconverter.Supporter.Settings;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class ViscosityDynamicActivity extends AppCompatActivity implements View.OnClickListener,TextWatcher {


    //declaration of designing tools
    private Spinner spinnerConvertFrom, spinnerConvertTo;
    private EditText editTextValue, editTextValueTo;
    private FloatingActionButton buttonList, buttonShare, buttonMail, buttonCopy;
    private SwitchCompat switchChangeType;
    List<String> listtempFirstfrom, listFirsttempTo, listtempfrom, listtempTo;
    private String stringSpinnerFrom, stringSpinnerTo;
    private TextView textViewBasicUnit, textViewAllUnit,textViewConvert;
    double doubleEdittextvalue = 1.0;
    private int basicunit = 10;
    private int allunit = 29;
    DecimalFormat formatter = null;
    private static final int REQUEST_CODE = 100;


    ViscosityDynamicConverter.ConversionResults item;
    private String strpascalsecond=null,strkilogramforcesecondpersquaremeter=null,strnewtonsecondpersquaremeter=null,strmillinewtonsecondppersqmeter=null,strdynesecondpersqcentimeter=null,strpoise=null,
            strexapoise=null,strpetapoise =null,strterapoise=null,strgigapoise=null,strmegapoise=null,strkilopoise=null,strhectopoise=null,strdekapoise=null,strdecipoise=null,strcentipoise=null,
            strmillipoise=null,strmicropoise=null,strnanopoise=null,strpicopoise=null,strfemtopoise=null,strattopoise=null,strpoundforcesecondpersqinch =null,strpoundforcesecondpersqfoot=null,
            strpoundalsecondpersquarefoot=null,strgrampercentimeterpersecond=null,strslugperfootpersecond=null,strpoundperfootpersecond=null,strpoundperfootperhour=null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_converter);


        //customize toolbar
      /*  android.support.v7.widget.Toolbar toolbar = (android.support.v7.widget.Toolbar) findViewById(R.id.app_bar);
        setSupportActionBar(toolbar);*/
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#59db59")));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setTitle("Viscosity Dynamic ");

        formatsetting();




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
        buttonCopy.setBackgroundTintList(ColorStateList.valueOf(ContextCompat.getColor(this, R.color.colorLightgreen)));
        buttonList.setBackgroundTintList(ColorStateList.valueOf(ContextCompat.getColor(this, R.color.colorLightgreen)));
        buttonShare.setBackgroundTintList(ColorStateList.valueOf(ContextCompat.getColor(this, R.color.colorLightgreen)));
        buttonMail.setBackgroundTintList(ColorStateList.valueOf(ContextCompat.getColor(this, R.color.colorLightgreen)));

        DrawableCompat.setTintList(DrawableCompat.wrap(switchChangeType.getThumbDrawable()),ColorStateList.valueOf(ContextCompat.getColor(this, R.color.colorLightgreen)));
       // DrawableCompat.setTintList(DrawableCompat.wrap(switchChangeType.getTrackDrawable()), ColorStateList.valueOf(ContextCompat.getColor(this, R.color.colorRed)));
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            textViewConvert.setBackgroundTintList(ColorStateList.valueOf(ContextCompat.getColor(this, R.color.colorLightgreen)));
        }

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            Window window = getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.setStatusBarColor(Color.parseColor("#0aa828"));
        }

        textViewBasicUnit.setText(String.valueOf("Basic Units(" + basicunit + ")"));
        textViewAllUnit.setText(String.valueOf("All Units(" + allunit + ")"));


        //adding value to spinner
        listtempFirstfrom = new ArrayList<String>();
        listFirsttempTo = new ArrayList<String>();


        //for first time running spinner
        listtempFirstfrom.add("Centipoise -cP");
        listtempFirstfrom.add("Poise -P");
        listtempFirstfrom.add("Exapoise -EP");
        listtempFirstfrom.add("Newton second/square meter -N*s/m^2");
        listtempFirstfrom.add("Pascal second -Pa*s");
        listtempFirstfrom.add("Kilogram-force second/square meter -kg-Ns/m^2");
        listtempFirstfrom.add("Pound-force second/sq. foot -lb-Ns/ft^2");
        listtempFirstfrom.add("Pound-force second/sq. inch -lb-Ns/in^2");
        listtempFirstfrom.add("Pound/foot/second -lb/(ft*s)");
        listtempFirstfrom.add("Pound/foot/hour -lb/(ft*h)");

        //for first time running spinner
        listFirsttempTo.add("Centipoise -cP");
        listFirsttempTo.add("Poise -P");
        listFirsttempTo.add("Exapoise -EP");
        listFirsttempTo.add("Newton second/square meter -N*s/m^2");
        listFirsttempTo.add("Pascal second -Pa*s");
        listFirsttempTo.add("Kilogram-force second/square meter -kg-Ns/m^2");
        listFirsttempTo.add("Pound-force second/sq. foot -lb-Ns/ft^2");
        listFirsttempTo.add("Pound-force second/sq. inch -lb-Ns/in^2");
        listFirsttempTo.add("Pound/foot/second -lb/(ft*s)");
        listFirsttempTo.add("Pound/foot/hour -lb/(ft*h)");

        // Creating adapter for spinner
        ArrayAdapter<String> Adapter = new ArrayAdapter<String>(ViscosityDynamicActivity.this, android.R.layout.simple_spinner_item, listtempFirstfrom);
        ArrayAdapter<String> AdapterTempTo = new ArrayAdapter<String>(ViscosityDynamicActivity.this, android.R.layout.simple_spinner_item, listFirsttempTo);


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
                        listtempfrom.add("Centipoise -cP");
                        listtempfrom.add("Poise -P");
                        listtempfrom.add("Exapoise -EP");
                        listtempfrom.add("Newton second/square meter -N*s/m^2");
                        listtempfrom.add("Pascal second -Pa*s");
                        listtempfrom.add("Kilogram-force second/square meter -kg-Ns/m^2");
                        listtempfrom.add("Pound-force second/sq. foot -lb-Ns/ft^2");
                        listtempfrom.add("Pound-force second/sq. inch -lb-Ns/in^2");
                        listtempfrom.add("Pound/foot/second -lb/(ft*s)");
                        listtempfrom.add("Pound/foot/hour -lb/(ft*h)");


                        //2 spinner
                        listtempTo.add("Centipoise -cP");
                        listtempTo.add("Poise -P");
                        listtempTo.add("Exapoise -EP");
                        listtempTo.add("Newton second/square meter -N*s/m^2");
                        listtempTo.add("Pascal second -Pa*s");
                        listtempTo.add("Kilogram-force second/square meter -kg-Ns/m^2");
                        listtempTo.add("Pound-force second/sq. foot -lb-Ns/ft^2");
                        listtempTo.add("Pound-force second/sq. inch -lb-Ns/in^2");
                        listtempTo.add("Pound/foot/second -lb/(ft*s)");
                        listtempTo.add("Pound/foot/hour -lb/(ft*h)");
                        break;

                    case "true":
                        Snackbar.make(buttonView, "You switched to " + strAdvance + " Units", Snackbar.LENGTH_LONG).setAction("ACTION", null).show();
                        listtempfrom.clear();
                        listtempTo.clear();
                        listtempfrom.add("Pascal second -Pa*s");
                        listtempfrom.add("Kilogram-force second/square meter -kg-Ns/m^2");
                        listtempfrom.add("Newton second/square meter -N*s/m^2");
                        listtempfrom.add("Millinewton second/sq. meter -mNs/m^2");
                        listtempfrom.add("Dyne second/sq. centimeter -dyns/cm^2");
                        listtempfrom.add("Poise -P");
                        listtempfrom.add("Exapoise -EP");
                        listtempfrom.add("Petapoise -PP");
                        listtempfrom.add("Terapoise -TP");
                        listtempfrom.add("Gigapoise -GP");
                        listtempfrom.add("Megapoise -MP");
                        listtempfrom.add("Kilopoise -kP");
                        listtempfrom.add("Hectopoise -hP");
                        listtempfrom.add("Dekapoise -daP");
                        listtempfrom.add("Decipoise -dP");
                        listtempfrom.add("Centipoise -cP");
                        listtempfrom.add("Millipoise -mP");
                        listtempfrom.add("Micropoise -μP");
                        listtempfrom.add("Nanopoise -nP");
                        listtempfrom.add("Picopoise -pP");
                        listtempfrom.add("Femtopoise -fP");
                        listtempfrom.add("Attopoise -aP");
                        listtempfrom.add("Pound-force second/sq. inch -lb-Ns/in^2");
                        listtempfrom.add("Pound-force second/sq. foot -lb-Ns/ft^2");
                        listtempfrom.add("Poundal second/square foot -lbs/ft^2");
                        listtempfrom.add("Gram/centimeter/second -g/(cm*s)");
                        listtempfrom.add("Slug/foot/second -slug/(ft*s)");
                        listtempfrom.add("Pound/foot/second -lb/(ft*s)");
                        listtempfrom.add("Pound/foot/hour -lb/(ft*h)");


                        //second spinner
                        listtempTo.add("Pascal second -Pa*s");
                        listtempTo.add("Kilogram-force second/square meter -kg-Ns/m^2");
                        listtempTo.add("Newton second/square meter -N*s/m^2");
                        listtempTo.add("Millinewton second/sq. meter -mNs/m^2");
                        listtempTo.add("Dyne second/sq. centimeter -dyns/cm^2");
                        listtempTo.add("Poise -P");
                        listtempTo.add("Exapoise -EP");
                        listtempTo.add("Petapoise -PP");
                        listtempTo.add("Terapoise -TP");
                        listtempTo.add("Gigapoise -GP");
                        listtempTo.add("Megapoise -MP");
                        listtempTo.add("Kilopoise -kP");
                        listtempTo.add("Hectopoise -hP");
                        listtempTo.add("Dekapoise -daP");
                        listtempTo.add("Decipoise -dP");
                        listtempTo.add("Centipoise -cP");
                        listtempTo.add("Millipoise -mP");
                        listtempTo.add("Micropoise -μP");
                        listtempTo.add("Nanopoise -nP");
                        listtempTo.add("Picopoise -pP");
                        listtempTo.add("Femtopoise -fP");
                        listtempTo.add("Attopoise -aP");
                        listtempTo.add("Pound-force second/sq. inch -lb-Ns/in^2");
                        listtempTo.add("Pound-force second/sq. foot -lb-Ns/ft^2");
                        listtempTo.add("Poundal second/square foot -lbs/ft^2");
                        listtempTo.add("Gram/centimeter/second -g/(cm*s)");
                        listtempTo.add("Slug/foot/second -slug/(ft*s)");
                        listtempTo.add("Pound/foot/second -lb/(ft*s)");
                        listtempTo.add("Pound/foot/hour -lb/(ft*h)");

                        break;
                }
                // Creating adapter for spinner
                ArrayAdapter<String> Adapter2 = new ArrayAdapter<String>(ViscosityDynamicActivity.this, android.R.layout.simple_spinner_item, listtempfrom);
                ArrayAdapter<String> AdapterTempTo2 = new ArrayAdapter<String>(ViscosityDynamicActivity.this, android.R.layout.simple_spinner_item, listtempTo);


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
                Intent i = new Intent(this, ConversionViscosityDynamicListActivity.class);
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

            ViscosityDynamicConverter c = new ViscosityDynamicConverter(strSpinnerFromvalue1, doubleEdittextvalue1);
            ArrayList<ViscosityDynamicConverter.ConversionResults> results = c.calculateViscosityConversion();
            int length = results.size();
            for (int i = 0; i < length; i++) {
                item = results.get(i);

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


                switch (strSpinnerFromvalue1) {
                    case "Pascal second -Pa*s":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Kilogram-force second/square meter -kg-Ns/m^2":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Newton second/square meter -N*s/m^2":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Millinewton second/sq. meter -mNs/m^2":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Dyne second/sq. centimeter -dyns/cm^2":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Poise -P":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Exapoise -EP":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Petapoise -PP":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Terapoise -TP":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Gigapoise -GP":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Megapoise -MP":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Kilopoise -kP":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Hectopoise -hP":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Dekapoise -daP":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Decipoise -dP":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Centipoise -cP":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Millipoise -mP":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Micropoise -μP":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Nanopoise -nP":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Picopoise -pP":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Femtopoise -fP":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Attopoise -aP":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Pound-force second/sq. inch -lb-Ns/in^2":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Pound-force second/sq. foot -lb-Ns/ft^2":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Poundal second/square foot -lbs/ft^2":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Gram/centimeter/second -g/(cm*s)":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Slug/foot/second -slug/(ft*s)":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Pound/foot/second -lb/(ft*s)":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Pound/foot/hour -lb/(ft*h)":
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
            case "Pascal second -Pa*s":
                editTextValueTo.setText(strpascalsecond);
                break;
            case "Kilogram-force second/square meter -kg-Ns/m^2":
                editTextValueTo.setText(strkilogramforcesecondpersquaremeter);
                break;
            case "Newton second/square meter -N*s/m^2":
                editTextValueTo.setText(strnewtonsecondpersquaremeter);
                break;
            case "Millinewton second/sq. meter -mNs/m^2":
                editTextValueTo.setText(strmillinewtonsecondppersqmeter);
                break;
            case "Dyne second/sq. centimeter -dyns/cm^2":
                editTextValueTo.setText(strdynesecondpersqcentimeter);
                break;
            case "Poise -P":
                editTextValueTo.setText(strpoise);
                break;
            case "Exapoise -EP":
                editTextValueTo.setText(strexapoise);
                break;
            case "Petapoise -PP":
                editTextValueTo.setText(strpetapoise);
                break;
            case "Terapoise -TP":
                editTextValueTo.setText(strterapoise);
                break;
            case "Gigapoise -GP":
                editTextValueTo.setText(strgigapoise);
                break;
            case "Megapoise -MP":
                editTextValueTo.setText(strmegapoise);
                break;
            case "Kilopoise -kP":
                editTextValueTo.setText(strkilopoise);
                break;
            case "Hectopoise -hP":
                editTextValueTo.setText(strhectopoise);
                break;
            case "Dekapoise -daP":
                editTextValueTo.setText(strdekapoise);
                break;
            case "Decipoise -dP":
                editTextValueTo.setText(strdecipoise);
                break;
            case "Centipoise -cP":
                editTextValueTo.setText(strcentipoise);
                break;
            case "Millipoise -mP":
                editTextValueTo.setText(strmillipoise);
                break;
            case "Micropoise -μP":
                editTextValueTo.setText(strmicropoise);
                break;
            case "Nanopoise -nP":
                editTextValueTo.setText(strnanopoise);
                break;
            case "Picopoise -pP":
                editTextValueTo.setText(strpicopoise);
                break;
            case "Femtopoise -fP":
                editTextValueTo.setText(strfemtopoise);
                break;
            case "Attopoise -aP":
                editTextValueTo.setText(strattopoise);
                break;
            case "Pound-force second/sq. inch -lb-Ns/in^2":
                editTextValueTo.setText(strpoundforcesecondpersqinch);
                break;
            case "Pound-force second/sq. foot -lb-Ns/ft^2":
                editTextValueTo.setText(strpoundforcesecondpersqfoot);
                break;
            case "Poundal second/square foot -lbs/ft^2":
                editTextValueTo.setText(strpoundalsecondpersquarefoot);
                break;
            case "Gram/centimeter/second -g/(cm*s)":
                editTextValueTo.setText(strgrampercentimeterpersecond);
                break;
            case "Slug/foot/second -slug/(ft*s)":
                editTextValueTo.setText(strslugperfootpersecond);
                break;
            case "Pound/foot/second -lb/(ft*s)":
                editTextValueTo.setText(strpoundperfootpersecond);
                break;
            case "Pound/foot/hour -lb/(ft*h)":
                editTextValueTo.setText(strpoundperfootperhour);
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