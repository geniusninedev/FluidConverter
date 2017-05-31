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

import com.nineinfosys.fluidconverter.ConverterActivityList.ConversionConcentrationMolarListActivity;
import com.nineinfosys.fluidconverter.Engin.ConcentrationMolarConverter;
import com.nineinfosys.fluidconverter.R;
import com.nineinfosys.fluidconverter.Supporter.Settings;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class ConcentrationMolarActivity extends AppCompatActivity implements View.OnClickListener,TextWatcher {


    //declaration of designing tools
    private Spinner spinnerConvertFrom, spinnerConvertTo;
    private EditText editTextValue, editTextValueTo;
    private static final int REQUEST_CODE = 100;

    private FloatingActionButton buttonList, buttonShare, buttonMail, buttonCopy;
    private SwitchCompat switchChangeType;
    List<String> listtempFirstfrom, listFirsttempTo, listtempfrom, listtempTo;
    private String stringSpinnerFrom, stringSpinnerTo;
    private TextView textViewBasicUnit, textViewAllUnit,textViewConvert;
    double doubleEdittextvalue = 1.0;
    private int basicunit = 4;
    private int allunit = 12;
    DecimalFormat formatter = null;


    ConcentrationMolarConverter.ConversionResults item;
   private String strmolpercubicmeter=null,strmolperliter=null,strmolpercubiccm=null,strmolcubicmm=null,strkilomolcubicmeter=null,strkilomolliter=null,strkilomolcubiccm=null,strkilomolcubicmm=null,
            strmilimolcubicmeter=null,strmilimolliter=null,strmilimolcubiccm=null,strmilimolcubicmm=null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_converter);


        //customize toolbar
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#0bdbea")));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setTitle("Concentration Molar");

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
        buttonCopy.setBackgroundTintList(ColorStateList.valueOf(ContextCompat.getColor(this, R.color.colorLightSkyblue)));
        buttonList.setBackgroundTintList(ColorStateList.valueOf(ContextCompat.getColor(this, R.color.colorLightSkyblue)));
        buttonShare.setBackgroundTintList(ColorStateList.valueOf(ContextCompat.getColor(this, R.color.colorLightSkyblue)));
        buttonMail.setBackgroundTintList(ColorStateList.valueOf(ContextCompat.getColor(this, R.color.colorLightSkyblue)));

        DrawableCompat.setTintList(DrawableCompat.wrap(switchChangeType.getThumbDrawable()),ColorStateList.valueOf(ContextCompat.getColor(this, R.color.colorLightSkyblue)));
       // DrawableCompat.setTintList(DrawableCompat.wrap(switchChangeType.getTrackDrawable()), ColorStateList.valueOf(ContextCompat.getColor(this, R.color.colorRed)));
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            textViewConvert.setBackgroundTintList(ColorStateList.valueOf(ContextCompat.getColor(this, R.color.colorLightSkyblue)));
        }

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            Window window = getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.setStatusBarColor(Color.parseColor("#00a9b8"));
        }

        textViewBasicUnit.setText(String.valueOf("Basic Units(" + basicunit + ")"));
        textViewAllUnit.setText(String.valueOf("All Units(" + allunit + ")"));


        //adding value to spinner
        listtempFirstfrom = new ArrayList<String>();
        listFirsttempTo = new ArrayList<String>();


        //for first time running spinner
        listtempFirstfrom.add("Mol/cubic meter -mol/m^3");
        listtempFirstfrom.add("Mol/liter -mol/L");
        listtempFirstfrom.add("Mol/cubic centimeter -mol/cm^3");
        listtempFirstfrom.add("Mol/cubic millimeter -mol/mm^3");

        //for first time running spinner
        listFirsttempTo.add("Mol/cubic meter -mol/m^3");
        listFirsttempTo.add("Mol/liter -mol/L");
        listFirsttempTo.add("Mol/cubic centimeter -mol/cm^3");
        listFirsttempTo.add("Mol/cubic millimeter -mol/mm^3");

        // Creating adapter for spinner
        ArrayAdapter<String> Adapter = new ArrayAdapter<String>(ConcentrationMolarActivity.this, android.R.layout.simple_spinner_item, listtempFirstfrom);
        ArrayAdapter<String> AdapterTempTo = new ArrayAdapter<String>(ConcentrationMolarActivity.this, android.R.layout.simple_spinner_item, listFirsttempTo);


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
                        listtempfrom.add("Mol/cubic meter -mol/m^3");
                        listtempfrom.add("Mol/liter -mol/L");
                        listtempfrom.add("Mol/cubic centimeter -mol/cm^3");
                        listtempfrom.add("Mol/cubic millimeter -mol/mm^3");


                        //2 spinner
                        listtempTo.add("Mol/cubic meter -mol/m^3");
                        listtempTo.add("Mol/liter -mol/L");
                        listtempTo.add("Mol/cubic centimeter -mol/cm^3");
                        listtempTo.add("Mol/cubic millimeter -mol/mm^3");
                        break;

                    case "true":
                        Snackbar.make(buttonView, "You switched to " + strAdvance + " Units", Snackbar.LENGTH_LONG).setAction("ACTION", null).show();
                        listtempfrom.clear();
                        listtempTo.clear();
                        listtempfrom.add("Mol/cubic meter -mol/m^3");
                        listtempfrom.add("Mol/liter -mol/L");
                        listtempfrom.add("Mol/cubic centimeter -mol/cm^3");
                        listtempfrom.add("Mol/cubic millimeter -mol/mm^3");
                        listtempfrom.add("Kilomol/cubic meter -kmol/m^3");
                        listtempfrom.add("Kilomol/liter -kmol/L");
                        listtempfrom.add("Kilomol/cubic centimeter -kmol/cm^3");
                        listtempfrom.add("Kilomol/cubic millimeter -kmol/mm^3");
                        listtempfrom.add("Millimol/cubic meter -mmol/m^3");
                        listtempfrom.add("Millimol/liter -mmol/L");
                        listtempfrom.add("Millimol/cubic centimeter -mmol/cm^3");
                        listtempfrom.add("Millimol/cubic millimeter -mmol/mm^3");


                        //second spinner
                        listtempTo.add("Mol/cubic meter -mol/m^3");
                        listtempTo.add("Mol/liter -mol/L");
                        listtempTo.add("Mol/cubic centimeter -mol/cm^3");
                        listtempTo.add("Mol/cubic millimeter -mol/mm^3");
                        listtempTo.add("Kilomol/cubic meter -kmol/m^3");
                        listtempTo.add("Kilomol/liter -kmol/L");
                        listtempTo.add("Kilomol/cubic centimeter -kmol/cm^3");
                        listtempTo.add("Kilomol/cubic millimeter -kmol/mm^3");
                        listtempTo.add("Millimol/cubic meter -mmol/m^3");
                        listtempTo.add("Millimol/liter -mmol/L");
                        listtempTo.add("Millimol/cubic centimeter -mmol/cm^3");
                        listtempTo.add("Millimol/cubic millimeter -mmol/mm^3");

                        break;
                }
                // Creating adapter for spinner
                ArrayAdapter<String> Adapter2 = new ArrayAdapter<String>(ConcentrationMolarActivity.this, android.R.layout.simple_spinner_item, listtempfrom);
                ArrayAdapter<String> AdapterTempTo2 = new ArrayAdapter<String>(ConcentrationMolarActivity.this, android.R.layout.simple_spinner_item, listtempTo);


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
                Intent i = new Intent(this, ConversionConcentrationMolarListActivity.class);
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

            ConcentrationMolarConverter c = new ConcentrationMolarConverter(strSpinnerFromvalue1, doubleEdittextvalue1);
            ArrayList<ConcentrationMolarConverter.ConversionResults> results = c.calculateConcentrationConversion();
            int length = results.size();
            for (int i = 0; i < length; i++) {
                item = results.get(i);

                strmolpercubicmeter=String.valueOf(formatter.format(item.getMolpercubicmeter()));
                strmolperliter=String.valueOf(formatter.format(item.getMolperliter()));
                strmolpercubiccm=String.valueOf(formatter.format(item.getMolpercubiccm()));
                strmolcubicmm=String.valueOf(formatter.format(item.getMolcubicmm()));
                strkilomolcubicmeter=String.valueOf(formatter.format(item.getKilomolcubicmeter()));
                strkilomolliter=String.valueOf(formatter.format(item.getKilomolliter()));
                strkilomolcubiccm=String.valueOf(formatter.format(item.getKilomolcubiccm()));
                strkilomolcubicmm=String.valueOf(formatter.format(item.getKilomolcubicmm()));
                strmilimolcubicmeter=String.valueOf(formatter.format(item.getMilimolcubicmeter()));
                strmilimolliter=String.valueOf(formatter.format(item.getMilimolliter()));
                strmilimolcubiccm=String.valueOf(formatter.format(item.getMilimolcubiccm()));
                strmilimolcubicmm=String.valueOf(formatter.format(item.getMilimolcubicmm()));


                switch (strSpinnerFromvalue1) {
                    case "Mol/cubic meter -mol/m^3":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Mol/liter -mol/L":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Mol/cubic centimeter -mol/cm^3":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Mol/cubic millimeter -mol/mm^3":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Kilomol/cubic meter -kmol/m^3":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Kilomol/liter -kmol/L":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Kilomol/cubic centimeter -kmol/cm^3":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Kilomol/cubic millimeter -kmol/mm^3":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Millimol/cubic meter -mmol/m^3":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Millimol/liter -mmol/L":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Millimol/cubic centimeter -mmol/cm^3":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Millimol/cubic millimeter -mmol/mm^3":
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
            case "Mol/cubic meter -mol/m^3":
                editTextValueTo.setText(strmolpercubicmeter);
                break;
            case "Mol/liter -mol/L":
                editTextValueTo.setText(strmolperliter);
                break;
            case "Mol/cubic centimeter -mol/cm^3":
                editTextValueTo.setText(strmolpercubiccm);
                break;
            case "Mol/cubic millimeter -mol/mm^3":
                editTextValueTo.setText(strmolcubicmm);
                break;
            case "Kilomol/cubic meter -kmol/m^3":
                editTextValueTo.setText(strkilomolcubicmeter);
                break;
            case "Kilomol/liter -kmol/L":
                editTextValueTo.setText(strkilomolliter);
                break;
            case "Kilomol/cubic centimeter -kmol/cm^3":
                editTextValueTo.setText(strkilomolcubiccm);
                break;
            case "Kilomol/cubic millimeter -kmol/mm^3":
                editTextValueTo.setText(strkilomolcubicmm);
                break;
            case "Millimol/cubic meter -mmol/m^3":
                editTextValueTo.setText(strmilimolcubicmeter);
                break;
            case "Millimol/liter -mmol/L":
                editTextValueTo.setText(strmilimolliter);
                break;
            case "Millimol/cubic centimeter -mmol/cm^3":
                editTextValueTo.setText(strmilimolcubiccm);
                break;
            case "Millimol/cubic millimeter -mmol/mm^3":
                editTextValueTo.setText(strmilimolcubicmm);
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