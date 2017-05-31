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


import com.nineinfosys.fluidconverter.ConverterActivityList.ConversionFlowMolarListActivity;
import com.nineinfosys.fluidconverter.Engin.FlowMolarConverter;
import com.nineinfosys.fluidconverter.R;
import com.nineinfosys.fluidconverter.Supporter.Settings;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class FlowMolarActivity extends AppCompatActivity implements View.OnClickListener,TextWatcher {


    //declaration of designing tools
    private Spinner spinnerConvertFrom, spinnerConvertTo;
    private EditText editTextValue, editTextValueTo;

    private FloatingActionButton buttonList, buttonShare, buttonMail, buttonCopy;
    private SwitchCompat switchChangeType;
    List<String> listtempFirstfrom, listFirsttempTo, listtempfrom, listtempTo;
    private String stringSpinnerFrom, stringSpinnerTo;
    private TextView textViewBasicUnit, textViewAllUnit,textViewConvert;
    double doubleEdittextvalue = 1.0;
    private int basicunit = 6;
    private int allunit = 26;
    DecimalFormat formatter = null;
    private static final int REQUEST_CODE = 100;

    FlowMolarConverter.ConversionResults item;
     private String strmolsecond=null,strexamolsecond=null,strpetamolsecond=null,strteramolsecond=null,strgigamolsecond=null,strmegamolsecond=null,strkilomolsecond=null,strhectomolsecond=null,
            strdekamolsecond=null,strdecimolsecond=null,strcentimolsecond=null,strmillimolsecond=null,strmicromolsecond=null,strnanomolsecond=null,strpicomolsecond=null,strfemtomolsecond=null,
            strattomolsecond=null,strmolminute=null,strmolhour=null,strmolday=null,strmillimolminute=null,strmillimolhour=null,strmillimolday=null,strkilomolminute=null,strkilomolhour=null,
            strkilomolday=null;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_converter);


        //customize toolbar
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#03a9f4")));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setTitle("Flow Molar");

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
        listtempFirstfrom.add("Mol/second -mol/s");
        listtempFirstfrom.add("Examol/second -Emol/s");
        listtempFirstfrom.add("Petamol/second -Pmol/s");
        listtempFirstfrom.add("Teramol/second -Tmol/s");
        listtempFirstfrom.add("Gigamol/second -Gmol/s");
        listtempFirstfrom.add("Megamol/second -Mmol/s");

        //for first time running spinner
        listFirsttempTo.add("Mol/second -mol/s");
        listFirsttempTo.add("Examol/second -Emol/s");
        listFirsttempTo.add("Petamol/second -Pmol/s");
        listFirsttempTo.add("Teramol/second -Tmol/s");
        listFirsttempTo.add("Gigamol/second -Gmol/s");
        listFirsttempTo.add("Megamol/second -Mmol/s");

        // Creating adapter for spinner
        ArrayAdapter<String> Adapter = new ArrayAdapter<String>(FlowMolarActivity.this, android.R.layout.simple_spinner_item, listtempFirstfrom);
        ArrayAdapter<String> AdapterTempTo = new ArrayAdapter<String>(FlowMolarActivity.this, android.R.layout.simple_spinner_item, listFirsttempTo);


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
                        listtempfrom.add("Mol/second -mol/s");
                        listtempfrom.add("Examol/second -Emol/s");
                        listtempfrom.add("Petamol/second -Pmol/s");
                        listtempfrom.add("Teramol/second -Tmol/s");
                        listtempfrom.add("Gigamol/second -Gmol/s");
                        listtempfrom.add("Megamol/second -Mmol/s");


                        //2 spinner
                        listtempTo.add("Mol/second -mol/s");
                        listtempTo.add("Examol/second -Emol/s");
                        listtempTo.add("Petamol/second -Pmol/s");
                        listtempTo.add("Teramol/second -Tmol/s");
                        listtempTo.add("Gigamol/second -Gmol/s");
                        listtempTo.add("Megamol/second -Mmol/s");
                        break;

                    case "true":
                        Snackbar.make(buttonView, "You switched to " + strAdvance + " Units", Snackbar.LENGTH_LONG).setAction("ACTION", null).show();
                        listtempfrom.clear();
                        listtempTo.clear();
                        listtempfrom.add("Mol/second -mol/s");
                        listtempfrom.add("Examol/second -Emol/s");
                        listtempfrom.add("Petamol/second -Pmol/s");
                        listtempfrom.add("Teramol/second -Tmol/s");
                        listtempfrom.add("Gigamol/second -Gmol/s");
                        listtempfrom.add("Megamol/second -Mmol/s");
                        listtempfrom.add("Kilomol/second -kmol/s");
                        listtempfrom.add("Hectomol/second -hmol/s");
                        listtempfrom.add("Dekamol/second -damol/s");
                        listtempfrom.add("Decimol/second -dmol/s");
                        listtempfrom.add("Centimol/second -cmol/s");
                        listtempfrom.add("Millimol/second -mmol/s");
                        listtempfrom.add("Micromol/second -μmol/s");
                        listtempfrom.add("Nanomol/second -nmol/s");
                        listtempfrom.add("Picomol/second -pmol/s");
                        listtempfrom.add("Femtomol/second -fmol/s");
                        listtempfrom.add("Attomol/second -amol/s");
                        listtempfrom.add("Mol/minute -mol/min");
                        listtempfrom.add("Mol/hour -mol/h");
                        listtempfrom.add("Mol/day -mol/d");
                        listtempfrom.add("Millimol/minute -mmol/min");
                        listtempfrom.add("Millimol/hour -mmol/h");
                        listtempfrom.add("Millimol/day -mmol/d");
                        listtempfrom.add("Kilomol/minute -kmol/min");
                        listtempfrom.add("Kilomol/hour -kmol/h");
                        listtempfrom.add("Kilomol/day -kmol/d");


                        //second spinner
                        listtempTo.add("Mol/second -mol/s");
                        listtempTo.add("Examol/second -Emol/s");
                        listtempTo.add("Petamol/second -Pmol/s");
                        listtempTo.add("Teramol/second -Tmol/s");
                        listtempTo.add("Gigamol/second -Gmol/s");
                        listtempTo.add("Megamol/second -Mmol/s");
                        listtempTo.add("Kilomol/second -kmol/s");
                        listtempTo.add("Hectomol/second -hmol/s");
                        listtempTo.add("Dekamol/second -damol/s");
                        listtempTo.add("Decimol/second -dmol/s");
                        listtempTo.add("Centimol/second -cmol/s");
                        listtempTo.add("Millimol/second -mmol/s");
                        listtempTo.add("Micromol/second -μmol/s");
                        listtempTo.add("Nanomol/second -nmol/s");
                        listtempTo.add("Picomol/second -pmol/s");
                        listtempTo.add("Femtomol/second -fmol/s");
                        listtempTo.add("Attomol/second -amol/s");
                        listtempTo.add("Mol/minute -mol/min");
                        listtempTo.add("Mol/hour -mol/h");
                        listtempTo.add("Mol/day -mol/d");
                        listtempTo.add("Millimol/minute -mmol/min");
                        listtempTo.add("Millimol/hour -mmol/h");
                        listtempTo.add("Millimol/day -mmol/d");
                        listtempTo.add("Kilomol/minute -kmol/min");
                        listtempTo.add("Kilomol/hour -kmol/h");
                        listtempTo.add("Kilomol/day -kmol/d");

                        break;
                }
                // Creating adapter for spinner
                ArrayAdapter<String> Adapter2 = new ArrayAdapter<String>(FlowMolarActivity.this, android.R.layout.simple_spinner_item, listtempfrom);
                ArrayAdapter<String> AdapterTempTo2 = new ArrayAdapter<String>(FlowMolarActivity.this, android.R.layout.simple_spinner_item, listtempTo);


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
                Intent i = new Intent(this, ConversionFlowMolarListActivity.class);
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
    protected void onRestart() {

        // TODO Auto-generated method stub
        super.onRestart();
        Intent i = new Intent(FlowMolarActivity.this, FlowMolarActivity.class);//your class
        finish();
        startActivity(i);

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

            FlowMolarConverter c = new FlowMolarConverter(strSpinnerFromvalue1, doubleEdittextvalue1);
            ArrayList<FlowMolarConverter.ConversionResults> results = c.calculateFlowMolarConverterConversion();
            int length = results.size();
            for (int i = 0; i < length; i++) {
                item = results.get(i);

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


                switch (strSpinnerFromvalue1) {
                    case "Mol/second -mol/s":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Examol/second -Emol/s":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Petamol/second -Pmol/s":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Teramol/second -Tmol/s":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Gigamol/second -Gmol/s":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Megamol/second -Mmol/s":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Kilomol/second -kmol/s":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Hectomol/second -hmol/s":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Dekamol/second -damol/s":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Decimol/second -dmol/s":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Centimol/second -cmol/s":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Millimol/second -mmol/s":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Micromol/second -μmol/s":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Nanomol/second -nmol/s":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Picomol/second -pmol/s":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Femtomol/second -fmol/s":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Attomol/second -amol/s":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Mol/minute -mol/min":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Mol/hour -mol/h":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Mol/day -mol/d":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Millimol/minute -mmol/min":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Millimol/hour -mmol/h":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Millimol/day -mmol/d":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Kilomol/minute -kmol/min":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Kilomol/hour -kmol/h":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Kilomol/day -kmol/d":
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
            case "Mol/second -mol/s":
                editTextValueTo.setText(strmolsecond);
                break;
            case "Examol/second -Emol/s":
                editTextValueTo.setText(strexamolsecond);
                break;
            case "Petamol/second -Pmol/s":
                editTextValueTo.setText(strpetamolsecond);
                break;
            case "Teramol/second -Tmol/s":
                editTextValueTo.setText(strteramolsecond);
                break;
            case "Gigamol/second -Gmol/s":
                editTextValueTo.setText(strgigamolsecond);
                break;
            case "Megamol/second -Mmol/s":
                editTextValueTo.setText(strmegamolsecond);
                break;
            case "Kilomol/second -kmol/s":
                editTextValueTo.setText(strkilomolsecond);
                break;
            case "Hectomol/second -hmol/s":
                editTextValueTo.setText(strhectomolsecond);
                break;
            case "Dekamol/second -damol/s":
                editTextValueTo.setText(strdekamolsecond);
                break;
            case "Decimol/second -dmol/s":
                editTextValueTo.setText(strdecimolsecond);
                break;
            case "Centimol/second -cmol/s":
                editTextValueTo.setText(strcentimolsecond);
                break;
            case "Millimol/second -mmol/s":
                editTextValueTo.setText(strmillimolsecond);
                break;
            case "Micromol/second -μmol/s":
                editTextValueTo.setText(strmicromolsecond);
                break;
            case "Nanomol/second -nmol/s":
                editTextValueTo.setText(strnanomolsecond);
                break;
            case "Picomol/second -pmol/s":
                editTextValueTo.setText(strpicomolsecond);
                break;
            case "Femtomol/second -fmol/s":
                editTextValueTo.setText(strfemtomolsecond);
                break;
            case "Attomol/second -amol/s":
                editTextValueTo.setText(strattomolsecond);
                break;
            case "Mol/minute -mol/min":
                editTextValueTo.setText(strmolminute);
                break;
            case "Mol/hour -mol/h":
                editTextValueTo.setText(strmolhour);
                break;
            case "Mol/day -mol/d":
                editTextValueTo.setText(strmolday);
                break;
            case "Millimol/minute -mmol/min":
                editTextValueTo.setText(strmillimolminute);
                break;
            case "Millimol/hour -mmol/h":
                editTextValueTo.setText(strmillimolhour);
                break;
            case "Millimol/day -mmol/d":
                editTextValueTo.setText(strmillimolday);
                break;
            case "Kilomol/minute -kmol/min":
                editTextValueTo.setText(strkilomolminute);
                break;
            case "Kilomol/hour -kmol/h":
                editTextValueTo.setText(strkilomolhour);
                break;
            case "Kilomol/day -kmol/d":
                editTextValueTo.setText(strkilomolday);
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