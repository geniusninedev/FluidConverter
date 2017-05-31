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
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;


import com.nineinfosys.fluidconverter.ConverterActivityList.ConversionFlowListActivity;
import com.nineinfosys.fluidconverter.Engin.FlowConverter;
import com.nineinfosys.fluidconverter.R;
import com.nineinfosys.fluidconverter.Supporter.Settings;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class FlowActivity extends AppCompatActivity implements View.OnClickListener,TextWatcher {


    //declaration of designing tools
    private Spinner spinnerConvertFrom, spinnerConvertTo;
    private EditText editTextValue, editTextValueTo;
    Button buttonConvert;
    private FloatingActionButton buttonList, buttonShare, buttonMail, buttonCopy;
    private SwitchCompat switchChangeType;
    List<String> listtempFirstfrom, listFirsttempTo, listtempfrom, listtempTo;
    private String stringSpinnerFrom, stringSpinnerTo;
    private TextView textViewBasicUnit, textViewAllUnit,textViewConvert;
    double doubleEdittextvalue = 1.0;
    private int basicunit = 15;
    private int allunit = 58;
    DecimalFormat formatter = null;
    private static final int REQUEST_CODE = 100;


    FlowConverter.ConversionResults item;
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
        setContentView(R.layout.layout_converter);


        //customize toolbar
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#e58f0c")));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setTitle("Flow");

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
        buttonCopy.setBackgroundTintList(ColorStateList.valueOf(ContextCompat.getColor(this, R.color.coloryellowish)));
        buttonList.setBackgroundTintList(ColorStateList.valueOf(ContextCompat.getColor(this, R.color.coloryellowish)));
        buttonShare.setBackgroundTintList(ColorStateList.valueOf(ContextCompat.getColor(this, R.color.coloryellowish)));
        buttonMail.setBackgroundTintList(ColorStateList.valueOf(ContextCompat.getColor(this, R.color.coloryellowish)));

        DrawableCompat.setTintList(DrawableCompat.wrap(switchChangeType.getThumbDrawable()),ColorStateList.valueOf(ContextCompat.getColor(this, R.color.coloryellowish)));
       // DrawableCompat.setTintList(DrawableCompat.wrap(switchChangeType.getTrackDrawable()), ColorStateList.valueOf(ContextCompat.getColor(this, R.color.colorRed)));
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            textViewConvert.setBackgroundTintList(ColorStateList.valueOf(ContextCompat.getColor(this, R.color.coloryellowish)));
        }

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            Window window = getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.setStatusBarColor(Color.parseColor("#ad6100"));
        }

        textViewBasicUnit.setText(String.valueOf("Basic Units(" + basicunit + ")"));
        textViewAllUnit.setText(String.valueOf("All Units(" + allunit + ")"));


        //adding value to spinner
        listtempFirstfrom = new ArrayList<String>();
        listFirsttempTo = new ArrayList<String>();


        //for first time running spinner
        listtempFirstfrom.add("Cubic meter/second -m^3/s");
        listtempFirstfrom.add("Cubic meter/minute -m^3/min");
        listtempFirstfrom.add("Cubic meter/hour -m^3/h");
        listtempFirstfrom.add("Liter/second -L/s");
        listtempFirstfrom.add("Liter/minute -L/min");
        listtempFirstfrom.add("Liter/hour -L/h");
        listtempFirstfrom.add("Cubic foot/second -ft^3/s");
        listtempFirstfrom.add("Cubic foot/minute -ft^3/min");
        listtempFirstfrom.add("Cubic foot/hour -ft^3/h");
        listtempFirstfrom.add("Gallon (UK)/second -gal(UK)/s");
        listtempFirstfrom.add("Gallon (UK)/minute -gal(UK)/min");
        listtempFirstfrom.add("Gallon (UK)/hour -gal(UK)/h");
        listtempFirstfrom.add("Gallon (US)/second -gal(US)/s");
        listtempFirstfrom.add("Gallon (US)/minute -gal(US)/min");
        listtempFirstfrom.add("Gallon (US)/hour -gal(US)/h");

        //for first time running spinner
        listFirsttempTo.add("Cubic meter/second -m^3/s");
        listFirsttempTo.add("Cubic meter/minute -m^3/min");
        listFirsttempTo.add("Cubic meter/hour -m^3/h");
        listFirsttempTo.add("Liter/second -L/s");
        listFirsttempTo.add("Liter/minute -L/min");
        listFirsttempTo.add("Liter/hour -L/h");
        listFirsttempTo.add("Cubic foot/second -ft^3/s");
        listFirsttempTo.add("Cubic foot/minute -ft^3/min");
        listFirsttempTo.add("Cubic foot/hour -ft^3/h");
        listFirsttempTo.add("Gallon (UK)/second -gal(UK)/s");
        listFirsttempTo.add("Gallon (UK)/minute -gal(UK)/min");
        listFirsttempTo.add("Gallon (UK)/hour -gal(UK)/h");
        listFirsttempTo.add("Gallon (US)/second -gal(US)/s");
        listFirsttempTo.add("Gallon (US)/minute -gal(US)/min");
        listFirsttempTo.add("Gallon (US)/hour -gal(US)/h");

        // Creating adapter for spinner
        ArrayAdapter<String> Adapter = new ArrayAdapter<String>(FlowActivity.this, android.R.layout.simple_spinner_item, listtempFirstfrom);
        ArrayAdapter<String> AdapterTempTo = new ArrayAdapter<String>(FlowActivity.this, android.R.layout.simple_spinner_item, listFirsttempTo);


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
                        listtempfrom.add("Cubic meter/second -m^3/s");
                        listtempfrom.add("Cubic meter/minute -m^3/min");
                        listtempfrom.add("Cubic meter/hour -m^3/h");
                        listtempfrom.add("Liter/second -L/s");
                        listtempfrom.add("Liter/minute -L/min");
                        listtempfrom.add("Liter/hour -L/h");
                        listtempfrom.add("Cubic foot/second -ft^3/s");
                        listtempfrom.add("Cubic foot/minute -ft^3/min");
                        listtempfrom.add("Cubic foot/hour -ft^3/h");
                        listtempfrom.add("Gallon (UK)/second -gal(UK)/s");
                        listtempfrom.add("Gallon (UK)/minute -gal(UK)/min");
                        listtempfrom.add("Gallon (UK)/hour -gal(UK)/h");
                        listtempfrom.add("Gallon (US)/second -gal(US)/s");
                        listtempfrom.add("Gallon (US)/minute -gal(US)/min");
                        listtempfrom.add("Gallon (US)/hour -gal(US)/h");

                        //2 spinner
                        listtempTo.add("Cubic meter/second -m^3/s");
                        listtempTo.add("Cubic meter/minute -m^3/min");
                        listtempTo.add("Cubic meter/hour -m^3/h");
                        listtempTo.add("Liter/second -L/s");
                        listtempTo.add("Liter/minute -L/min");
                        listtempTo.add("Liter/hour -L/h");
                        listtempTo.add("Cubic foot/second -ft^3/s");
                        listtempTo.add("Cubic foot/minute -ft^3/min");
                        listtempTo.add("Cubic foot/hour -ft^3/h");
                        listtempTo.add("Gallon (UK)/second -gal(UK)/s");
                        listtempTo.add("Gallon (UK)/minute -gal(UK)/min");
                        listtempTo.add("Gallon (UK)/hour -gal(UK)/h");
                        listtempTo.add("Gallon (US)/second -gal(US)/s");
                        listtempTo.add("Gallon (US)/minute -gal(US)/min");
                        listtempTo.add("Gallon (US)/hour -gal(US)/h");
                        break;

                    case "true":
                        Snackbar.make(buttonView, "You switched to " + strAdvance + " Units", Snackbar.LENGTH_LONG).setAction("ACTION", null).show();
                        listtempfrom.clear();
                        listtempTo.clear();
                        listtempfrom.add("Cubic meter/second -m^3/s");
                        listtempfrom.add("Cubic meter/day -m^3/d");
                        listtempfrom.add("Cubic meter/hour -m^3/h");
                        listtempfrom.add("Cubic meter/minute -m^3/min");
                        listtempfrom.add("Cubic centimeter/day -cm^3/d");
                        listtempfrom.add("Cubic centimeter/hour -cm^3/h");
                        listtempfrom.add("Cubic centimeter/minute -cm^3/min");
                        listtempfrom.add("Cubic centimeter/second -cm^3/s");
                        listtempfrom.add("Liter/day -L/d");
                        listtempfrom.add("Liter/hour -L/h");
                        listtempfrom.add("Liter/minute -L/min");
                        listtempfrom.add("Liter/second -L/s");
                        listtempfrom.add("Milliliter/day -mL/d");
                        listtempfrom.add("Milliliter/hour -mL/h");
                        listtempfrom.add("Milliliter/minute -mL/min");
                        listtempfrom.add("Milliliter/second -mL/s");
                        listtempfrom.add("Gallon (US)/day -gal(US)/d");
                        listtempfrom.add("Gallon (US)/hour -gal(US)/h");
                        listtempfrom.add("Gallon (US)/minute -gal(US)/min");
                        listtempfrom.add("Gallon (US)/second -gal(US)/s");
                        listtempfrom.add("Gallon (UK)/day -gal(UK)/d");
                        listtempfrom.add("Gallon (UK)/hour -gal(UK)/h");
                        listtempfrom.add("Gallon (UK)/minute -gal(UK)/min");
                        listtempfrom.add("Gallon (UK)/second -gal(UK)/s");
                        listtempfrom.add("Kilobarrel (US)/day -kbbl(US)/d");
                        listtempfrom.add("Barrel (US)/day -bbl(US)/d");
                        listtempfrom.add("Barrel (US)/hour -bbl(US)/h");
                        listtempfrom.add("Barrel (US)/minute -bbl(US)/min");
                        listtempfrom.add("Barrel (US)/second -bbl(US)/s");
                        listtempfrom.add("Acre-foot/year -ac*ft/y");
                        listtempfrom.add("Acre-foot/day -ac*ft/d");
                        listtempfrom.add("Acre-foot/hour -ac*ft/h");
                        listtempfrom.add("Hundred-cubic foot/day -ft^3/d");
                        listtempfrom.add("Hundred-cubic foot/hour -ft^3/h");
                        listtempfrom.add("Hundred-cubic foot/minute -ft^3/min");
                        listtempfrom.add("Ounce/hour -oz/h");
                        listtempfrom.add("Ounce/minute -oz/min");
                        listtempfrom.add("Ounce/second -oz/s");
                        listtempfrom.add("Ounce (UK)/hour -oz(UK)/h");
                        listtempfrom.add("Ounce (UK)/minute -oz(UK)/min");
                        listtempfrom.add("Ounce (UK)/second -oz(UK)/s");
                        listtempfrom.add("Cubic yard/hour -yd^3/h");
                        listtempfrom.add("Cubic yard/minute -yd^3/min");
                        listtempfrom.add("Cubic yard/second -yd^3/s");
                        listtempfrom.add("Cubic foot/hour -ft^3/h");
                        listtempfrom.add("Cubic foot/minute -ft^3/min");
                        listtempfrom.add("Cubic foot/second -ft^3/s");
                        listtempfrom.add("Cubic inch/hour -in^3/h");
                        listtempfrom.add("Cubic inch/minute -in^3/min");
                        listtempfrom.add("Cubic inch/second -in^3/s");
                        listtempfrom.add("Pound/second (Gasoline at 15.5%b0C) -lb/s");
                        listtempfrom.add("Pound/minute (Gasoline at 15.5%b0C) -lb/min");
                        listtempfrom.add("Pound/hour (Gasoline at 15.5%b0C) -lb/h");
                        listtempfrom.add("Pound/day (Gasoline at 15.5%b0C) -lb/d");
                        listtempfrom.add("Kilogram/second (Gasoline at 15.5%b0C) -kg/s");
                        listtempfrom.add("Kilogram/minute (Gasoline at 15.5%b0C) -kg/min");
                        listtempfrom.add("Kilogram/hour (Gasoline at 15.5%b0C) -kg/h");
                        listtempfrom.add("Kilogram/day (Gasoline at 15.5%b0C) -kg/d");


                        //second spinner
                        listtempTo.add("Cubic meter/second -m^3/s");
                        listtempTo.add("Cubic meter/day -m^3/d");
                        listtempTo.add("Cubic meter/hour -m^3/h");
                        listtempTo.add("Cubic meter/minute -m^3/min");
                        listtempTo.add("Cubic centimeter/day -cm^3/d");
                        listtempTo.add("Cubic centimeter/hour -cm^3/h");
                        listtempTo.add("Cubic centimeter/minute -cm^3/min");
                        listtempTo.add("Cubic centimeter/second -cm^3/s");
                        listtempTo.add("Liter/day -L/d");
                        listtempTo.add("Liter/hour -L/h");
                        listtempTo.add("Liter/minute -L/min");
                        listtempTo.add("Liter/second -L/s");
                        listtempTo.add("Milliliter/day -mL/d");
                        listtempTo.add("Milliliter/hour -mL/h");
                        listtempTo.add("Milliliter/minute -mL/min");
                        listtempTo.add("Milliliter/second -mL/s");
                        listtempTo.add("Gallon (US)/day -gal(US)/d");
                        listtempTo.add("Gallon (US)/hour -gal(US)/h");
                        listtempTo.add("Gallon (US)/minute -gal(US)/min");
                        listtempTo.add("Gallon (US)/second -gal(US)/s");
                        listtempTo.add("Gallon (UK)/day -gal(UK)/d");
                        listtempTo.add("Gallon (UK)/hour -gal(UK)/h");
                        listtempTo.add("Gallon (UK)/minute -gal(UK)/min");
                        listtempTo.add("Gallon (UK)/second -gal(UK)/s");
                        listtempTo.add("Kilobarrel (US)/day -kbbl(US)/d");
                        listtempTo.add("Barrel (US)/day -bbl(US)/d");
                        listtempTo.add("Barrel (US)/hour -bbl(US)/h");
                        listtempTo.add("Barrel (US)/minute -bbl(US)/min");
                        listtempTo.add("Barrel (US)/second -bbl(US)/s");
                        listtempTo.add("Acre-foot/year -ac*ft/y");
                        listtempTo.add("Acre-foot/day -ac*ft/d");
                        listtempTo.add("Acre-foot/hour -ac*ft/h");
                        listtempTo.add("Hundred-cubic foot/day -ft^3/d");
                        listtempTo.add("Hundred-cubic foot/hour -ft^3/h");
                        listtempTo.add("Hundred-cubic foot/minute -ft^3/min");
                        listtempTo.add("Ounce/hour -oz/h");
                        listtempTo.add("Ounce/minute -oz/min");
                        listtempTo.add("Ounce/second -oz/s");
                        listtempTo.add("Ounce (UK)/hour -oz(UK)/h");
                        listtempTo.add("Ounce (UK)/minute -oz(UK)/min");
                        listtempTo.add("Ounce (UK)/second -oz(UK)/s");
                        listtempTo.add("Cubic yard/hour -yd^3/h");
                        listtempTo.add("Cubic yard/minute -yd^3/min");
                        listtempTo.add("Cubic yard/second -yd^3/s");
                        listtempTo.add("Cubic foot/hour -ft^3/h");
                        listtempTo.add("Cubic foot/minute -ft^3/min");
                        listtempTo.add("Cubic foot/second -ft^3/s");
                        listtempTo.add("Cubic inch/hour -in^3/h");
                        listtempTo.add("Cubic inch/minute -in^3/min");
                        listtempTo.add("Cubic inch/second -in^3/s");
                        listtempTo.add("Pound/second (Gasoline at 15.5%b0C) -lb/s");
                        listtempTo.add("Pound/minute (Gasoline at 15.5%b0C) -lb/min");
                        listtempTo.add("Pound/hour (Gasoline at 15.5%b0C) -lb/h");
                        listtempTo.add("Pound/day (Gasoline at 15.5%b0C) -lb/d");
                        listtempTo.add("Kilogram/second (Gasoline at 15.5%b0C) -kg/s");
                        listtempTo.add("Kilogram/minute (Gasoline at 15.5%b0C) -kg/min");
                        listtempTo.add("Kilogram/hour (Gasoline at 15.5%b0C) -kg/h");
                        listtempTo.add("Kilogram/day (Gasoline at 15.5%b0C) -kg/d");

                        break;
                }
                // Creating adapter for spinner
                ArrayAdapter<String> Adapter2 = new ArrayAdapter<String>(FlowActivity.this, android.R.layout.simple_spinner_item, listtempfrom);
                ArrayAdapter<String> AdapterTempTo2 = new ArrayAdapter<String>(FlowActivity.this, android.R.layout.simple_spinner_item, listtempTo);


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
                Intent i = new Intent(this, ConversionFlowListActivity.class);
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

            FlowConverter c = new FlowConverter(strSpinnerFromvalue1, doubleEdittextvalue1);
            ArrayList<FlowConverter.ConversionResults> results = c.calculateFlowConversion();
            int length = results.size();
            for (int i = 0; i < length; i++) {
                item = results.get(i);

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


                switch (strSpinnerFromvalue1) {
                    case "Cubic meter/second -m^3/s":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Cubic meter/day -m^3/d":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Cubic meter/hour -m^3/h":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Cubic meter/minute -m^3/min":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Cubic centimeter/day -cm^3/d":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Cubic centimeter/hour -cm^3/h":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Cubic centimeter/minute -cm^3/min":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Cubic centimeter/second -cm^3/s":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Liter/day -L/d":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Liter/hour -L/h":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Liter/minute -L/min":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Liter/second -L/s":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Milliliter/day -mL/d":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Milliliter/hour -mL/h":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Milliliter/minute -mL/min":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Milliliter/second -mL/s":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Gallon (US)/day -gal(US)/d":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Gallon (US)/hour -gal(US)/h":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Gallon (US)/minute -gal(US)/min":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Gallon (US)/second -gal(US)/s":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Gallon (UK)/day -gal(UK)/d":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Gallon (UK)/hour -gal(UK)/h":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Gallon (UK)/minute -gal(UK)/min":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Gallon (UK)/second -gal(UK)/s":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Kilobarrel (US)/day -kbbl(US)/d":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Barrel (US)/day -bbl(US)/d":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Barrel (US)/hour -bbl(US)/h":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Barrel (US)/minute -bbl(US)/min":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Barrel (US)/second -bbl(US)/s":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Acre-foot/year -ac*ft/y":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Acre-foot/day -ac*ft/d":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Acre-foot/hour -ac*ft/h":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Hundred-cubic foot/day -ft^3/d":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Hundred-cubic foot/hour -ft^3/h":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Hundred-cubic foot/minute -ft^3/min":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Ounce/hour -oz/h":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Ounce/minute -oz/min":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Ounce/second -oz/s":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Ounce (UK)/hour -oz(UK)/h":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Ounce (UK)/minute -oz(UK)/min":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Ounce (UK)/second -oz(UK)/s":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Cubic yard/hour -yd^3/h":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Cubic yard/minute -yd^3/min":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Cubic yard/second -yd^3/s":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Cubic foot/hour -ft^3/h":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Cubic foot/minute -ft^3/min":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Cubic foot/second -ft^3/s":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Cubic inch/hour -in^3/h":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Cubic inch/minute -in^3/min":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Cubic inch/second -in^3/s":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Pound/second (Gasoline at 15.5%b0C) -lb/s":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Pound/minute (Gasoline at 15.5%b0C) -lb/min":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Pound/hour (Gasoline at 15.5%b0C) -lb/h":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Pound/day (Gasoline at 15.5%b0C) -lb/d":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Kilogram/second (Gasoline at 15.5%b0C) -kg/s":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Kilogram/minute (Gasoline at 15.5%b0C) -kg/min":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Kilogram/hour (Gasoline at 15.5%b0C) -kg/h":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Kilogram/day (Gasoline at 15.5%b0C) -kg/d":
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
            case "Cubic meter/second -m^3/s":
                editTextValueTo.setText(strcubicmeterpersecond);
                break;
            case "Cubic meter/day -m^3/d":
                editTextValueTo.setText(strcubicmeterperday);
                break;
            case "Cubic meter/hour -m^3/h":
                editTextValueTo.setText(strcubicmeterperhour);
                break;
            case "Cubic meter/minute -m^3/min":
                editTextValueTo.setText(strcubicmeterperminute);
                break;
            case "Cubic centimeter/day -cm^3/d":
                editTextValueTo.setText(strcubiccentimeterperday);
                break;
            case "Cubic centimeter/hour -cm^3/h":
                editTextValueTo.setText(strcubiccentimeterperhour);
                break;
            case "Cubic centimeter/minute -cm^3/min":
                editTextValueTo.setText(strcubiccentimeterperminute);
                break;
            case "Cubic centimeter/second -cm^3/s":
                editTextValueTo.setText(strcubiccentimeterpersecond);
                break;
            case "Liter/day -L/d":
                editTextValueTo.setText(strliterperday);
                break;
            case "Liter/hour -L/h":
                editTextValueTo.setText(strliterperhour);
                break;
            case "Liter/minute -L/min":
                editTextValueTo.setText(strliterperminute);
                break;
            case "Liter/second -L/s":
                editTextValueTo.setText(strliterpersecond);
                break;
            case "Milliliter/day -mL/d":
                editTextValueTo.setText(strmilliliterperday);
                break;
            case "Milliliter/hour -mL/h":
                editTextValueTo.setText(strmilliliterperhour);
                break;
            case "Milliliter/minute -mL/min":
                editTextValueTo.setText(strmilliliterperminute);
                break;
            case "Milliliter/second -mL/s":
                editTextValueTo.setText(strmilliliterpersecond);
                break;
            case "Gallon (US)/day -gal(US)/d":
                editTextValueTo.setText(strgallonUSperday);
                break;
            case "Gallon (US)/hour -gal(US)/h":
                editTextValueTo.setText(strgallonUSperhour);
                break;
            case "Gallon (US)/minute -gal(US)/min":
                editTextValueTo.setText(strgallonUSperminute);
                break;
            case "Gallon (US)/second -gal(US)/s":
                editTextValueTo.setText(strgallonUSpersecond);
                break;
            case "Gallon (UK)/day -gal(UK)/d":
                editTextValueTo.setText(strgallonUKperday);
                break;
            case "Gallon (UK)/hour -gal(UK)/h":
                editTextValueTo.setText(strgallonUKperhour);
                break;
            case "Gallon (UK)/minute -gal(UK)/min":
                editTextValueTo.setText(strgallonUKperminute);
                break;
            case "Gallon (UK)/second -gal(UK)/s":
                editTextValueTo.setText(strgallonUKpersecond);
                break;
            case "Kilobarrel (US)/day -kbbl(US)/d":
                editTextValueTo.setText(strkilobarrelUSperday);
                break;
            case "Barrel (US)/day -bbl(US)/d":
                editTextValueTo.setText(strbarrelUSperday);
                break;
            case "Barrel (US)/hour -bbl(US)/h":
                editTextValueTo.setText(strbarrelUSperhour);
                break;
            case "Barrel (US)/minute -bbl(US)/min":
                editTextValueTo.setText(strbarrelUSperminute);
                break;
            case "Barrel (US)/second -bbl(US)/s":
                editTextValueTo.setText(strbarrelUSpersecond);
                break;
            case "Acre-foot/year -ac*ft/y":
                editTextValueTo.setText(stracrefootperyear);
                break;
            case "Acre-foot/day -ac*ft/d":
                editTextValueTo.setText(stracrefootperday);
                break;
            case "Acre-foot/hour -ac*ft/h":
                editTextValueTo.setText(stracrefootperhour);
                break;
            case "Hundred-cubic foot/day -ft^3/d":
                editTextValueTo.setText(strhundredcubicfootperday);
                break;
            case "Hundred-cubic foot/hour -ft^3/h":
                editTextValueTo.setText(strhundredcubicfootperhour);
                break;
            case "Hundred-cubic foot/minute -ft^3/min":
                editTextValueTo.setText(strhundredcubicfootperminute);
                break;
            case "Ounce/hour -oz/h":
                editTextValueTo.setText(strounceperhour);
                break;
            case "Ounce/minute -oz/min":
                editTextValueTo.setText(strounceperminute);
                break;
            case "Ounce/second -oz/s":
                editTextValueTo.setText(strouncepersecond);
                break;
            case "Ounce (UK)/hour -oz(UK)/h":
                editTextValueTo.setText(strounceUKperhour);
                break;
            case "Ounce (UK)/minute -oz(UK)/min":
                editTextValueTo.setText(strounceUKperminute);
                break;
            case "Ounce (UK)/second -oz(UK)/s":
                editTextValueTo.setText(strounceUKpersecond);
                break;
            case "Cubic yard/hour -yd^3/h":
                editTextValueTo.setText(strcubicyardperhour);
                break;
            case "Cubic yard/minute -yd^3/min":
                editTextValueTo.setText(strcubicyardperminute);
                break;
            case "Cubic yard/second -yd^3/s":
                editTextValueTo.setText(strcubicyardpersecond);
                break;
            case "Cubic foot/hour -ft^3/h":
                editTextValueTo.setText(strcubicfootperhour);
                break;
            case "Cubic foot/minute -ft^3/min":
                editTextValueTo.setText(strcubicfootperminute);
                break;
            case "Cubic foot/second -ft^3/s":
                editTextValueTo.setText(strcubicfootpersecond);
                break;
            case "Cubic inch/hour -in^3/h":
                editTextValueTo.setText(strcubicinchperhour);
                break;
            case "Cubic inch/minute -in^3/min":
                editTextValueTo.setText(strcubicinchperminute);
                break;
            case "Cubic inch/second -in^3/s":
                editTextValueTo.setText(strcubicinchpersecond);
                break;
            case "Pound/second (Gasoline at 15.5%b0C) -lb/s":
                editTextValueTo.setText(strpoundpersecond);
                break;
            case "Pound/minute (Gasoline at 15.5%b0C) -lb/min":
                editTextValueTo.setText(strpoundperminute);
                break;
            case "Pound/hour (Gasoline at 15.5%b0C) -lb/h":
                editTextValueTo.setText(strpoundperhour);
                break;
            case "Pound/day (Gasoline at 15.5%b0C) -lb/d":
                editTextValueTo.setText(strpoundperday);
                break;
            case "Kilogram/second (Gasoline at 15.5%b0C) -kg/s":
                editTextValueTo.setText(strkilogrampersecond);
                break;
            case "Kilogram/minute (Gasoline at 15.5%b0C) -kg/min":
                editTextValueTo.setText(strkilogramperminute);
                break;
            case "Kilogram/hour (Gasoline at 15.5%b0C) -kg/h":
                editTextValueTo.setText(strkilogramperhour);
                break;
            case "Kilogram/day (Gasoline at 15.5%b0C) -kg/d":
                editTextValueTo.setText(strkilogramperday);
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