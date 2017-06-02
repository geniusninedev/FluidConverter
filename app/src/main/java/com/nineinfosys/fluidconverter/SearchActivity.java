package com.nineinfosys.fluidconverter;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import com.nineinfosys.fluidconverter.ConverterActivity.ConcentrationMolarActivity;
import com.nineinfosys.fluidconverter.ConverterActivity.ConcentrationSolutionActivity;
import com.nineinfosys.fluidconverter.ConverterActivity.FlowActivity;
import com.nineinfosys.fluidconverter.ConverterActivity.FlowMassActivity;
import com.nineinfosys.fluidconverter.ConverterActivity.FlowMolarActivity;
import com.nineinfosys.fluidconverter.ConverterActivity.MassFluxDensityActivity;
import com.nineinfosys.fluidconverter.ConverterActivity.PermeabillityActivity;
import com.nineinfosys.fluidconverter.ConverterActivity.SurfaceTensionActivity;
import com.nineinfosys.fluidconverter.ConverterActivity.ViscosityDynamicActivity;
import com.nineinfosys.fluidconverter.ConverterActivity.ViscosityKinematicActivity;
import com.nineinfosys.fluidconverter.Engin.MassFluxDensity;


public class SearchActivity extends AppCompatActivity implements TextWatcher {


    // List view
    private ListView lv;

    private String selectedItem;
    // Listview Adapter
    ArrayAdapter<String> adapter;

    // Search EditText
    EditText inputSearch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        //customize toolbar
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setTitle("Search Unit");


        // Listview Data
        String listitem[] = {
                //concentration molar
                "Mol/cubic meter -mol/m^3",
                "Mol/liter -mol/L",
                "Mol/cubic centimeter -mol/cm^3",
                "Mol/cubic millimeter -mol/mm^3",
                "Kilomol/cubic meter -kmol/m^3",
                "Kilomol/liter -kmol/L",
                "Kilomol/cubic centimeter -kmol/cm^3",
                "Kilomol/cubic millimeter -kmol/mm^3",
                "Millimol/cubic meter -mmol/m^3",
                "Millimol/liter -mmol/L",
                "Millimol/cubic centimeter -mmol/cm^3",
                "Millimol/cubic millimeter -mmol/mm^3",

                //concentration solution
                "Kilogram/liter(sol) -kg/L",
                "Gram/liter(sol) -g/L",
                "Milligram/liter(sol) -mg/L",
                "Part/million (ppm) -p/m",
                "Grain/gallon (US)(sol) -gr/gal(US)",
                "Grain/gallon (UK)(sol) -gr/gal(UK)",
                "Pound/gallon (US)(sol) -lb/gal(US)",
                "Pound/gallon (UK)(sol) -lb/gal(UK)",
                "Pound/million gallon (US) -lb/mgal(US)",
                "Pound/million gallon (UK) -lb/mgal(UK)",
                "Pound/cubic foot(sol) -lb/ft^3",

                //flow
                "Cubic meter/second -m^3/s",
                "Cubic meter/day -m^3/d",
                "Cubic meter/hour -m^3/h",
                "Cubic meter/minute -m^3/min",
                "Cubic centimeter/day -cm^3/d",
                "Cubic centimeter/hour -cm^3/h",
                "Cubic centimeter/minute -cm^3/min",
                "Cubic centimeter/second -cm^3/s",
                "Liter/day -L/d",
                "Liter/hour -L/h",
                "Liter/minute -L/min",
                "Liter/second -L/s",
                "Milliliter/day -mL/d",
                "Milliliter/hour -mL/h",
                "Milliliter/minute -mL/min",
                "Milliliter/second -mL/s",
                "Gallon (US)/day -gal(US)/d",
                "Gallon (US)/hour -gal(US)/h",
                "Gallon (US)/minute -gal(US)/min",
                "Gallon (US)/second -gal(US)/s",
                "Gallon (UK)/day -gal(UK)/d",
                "Gallon (UK)/hour -gal(UK)/h",
                "Gallon (UK)/minute -gal(UK)/min",
                "Gallon (UK)/second -gal(UK)/s",
                "Kilobarrel (US)/day -kbbl(US)/d",
                "Barrel (US)/day -bbl(US)/d",
                "Barrel (US)/hour -bbl(US)/h",
                "Barrel (US)/minute -bbl(US)/min",
                "Barrel (US)/second -bbl(US)/s",
                "Acre-foot/year -ac*ft/y",
                "Acre-foot/day -ac*ft/d",
                "Acre-foot/hour -ac*ft/h",
                "Hundred-cubic foot/day -ft^3/d",
                "Hundred-cubic foot/hour -ft^3/h",
                "Hundred-cubic foot/minute -ft^3/min",
                "Ounce/hour -oz/h",
                "Ounce/minute -oz/min",
                "Ounce/second -oz/s",
                "Ounce (UK)/hour -oz(UK)/h",
                "Ounce (UK)/minute -oz(UK)/min",
                "Ounce (UK)/second -oz(UK)/s",
                "Cubic yard/hour -yd^3/h",
                "Cubic yard/minute -yd^3/min",
                "Cubic yard/second -yd^3/s",
                "Cubic foot/hour -ft^3/h",
                "Cubic foot/minute -ft^3/min",
                "Cubic foot/second -ft^3/s",
                "Cubic inch/hour -in^3/h",
                "Cubic inch/minute -in^3/min",
                "Cubic inch/second -in^3/s",
                "Pound/second (Gasoline at 15.5%b0C) -lb/s",
                "Pound/minute (Gasoline at 15.5%b0C) -lb/min",
                "Pound/hour (Gasoline at 15.5%b0C) -lb/h",
                "Pound/day (Gasoline at 15.5%b0C) -lb/d",
                "Kilogram/second (Gasoline at 15.5%b0C) -kg/s",
                "Kilogram/minute (Gasoline at 15.5%b0C) -kg/min",
                "Kilogram/hour (Gasoline at 15.5%b0C) -kg/h",
                "Kilogram/day (Gasoline at 15.5%b0C) -kg/d",

                //   flow mass
                "Kilogram/second -kg/s",
                "Gram/second -g/s",
                "Gram/minute -g/min",
                "Gram/hour -g/h",
                "Gram/day -g/d",
                "Milligram/minute -mg/min",
                "Milligram/hour -mg/h",
                "Milligram/day -mg/d",
                "Kilogram/minute -kg/m",
                "Kilogram/hour -kg/h",
                "Kilogram/day -kg/d",
                "Exagram/second -Eg/s",
                "Petagram/second -Pg/s",
                "Teragram/second -Tg/s",
                "Gigagram/second -Gg/s",
                "Megagram/second -Mg/s",
                "Hectogram/second -hg/s",
                "Dekagram/second -dag/s",
                "Decigram/second -dg/s",
                "Centigram/second -cg/s",
                "Milligram/second -mg/s",
                "Microgram/second -μg/s",
                "Ton (metric)/second -t/s",
                "Ton (metric)/minute -t/min",
                "Ton (metric)/hour -t/h",
                "Ton (metric)/day -t/d",
                "Ton (short)/hour -ton(US)/h",
                "Pound/second -lb/s",
                "Pound/minute -lb/min",
                "Pound/hour -lb/h",
                "Pound/day -lb/d",

                //flow molar
                "Mol/second -mol/s",
                "Examol/second -Emol/s",
                "Petamol/second -Pmol/s",
                "Teramol/second -Tmol/s",
                "Gigamol/second -Gmol/s",
                "Megamol/second -Mmol/s",
                "Kilomol/second -kmol/s",
                "Hectomol/second -hmol/s",
                "Dekamol/second -damol/s",
                "Decimol/second -dmol/s",
                "Centimol/second -cmol/s",
                "Millimol/second -mmol/s",
                "Micromol/second -μmol/s",
                "Nanomol/second -nmol/s",
                "Picomol/second -pmol/s",
                "Femtomol/second -fmol/s",
                "Attomol/second -amol/s",
                "Mol/minute -mol/min",
                "Mol/hour -mol/h",
                "Mol/day -mol/d",
                "Millimol/minute -mmol/min",
                "Millimol/hour -mmol/h",
                "Millimol/day -mmol/d",
                "Kilomol/minute -kmol/min",
                "Kilomol/hour -kmol/h",
                "Kilomol/day -kmol/d",

                //mass flux density
                "Gram/second/square meter -gs/m^2",
                "Kilogram/hour/square meter -kgh/m^2",
                "Kilogram/hour/square foot -kgh/ft^2",
                "Kilogram/second/square meter -kgs/m^2",
                "Gram/second/sq. centimeter -gs/cm^2",
                "Pound/hour/square foot -lbh/ft^2",
                "Pound/second/square foot -lbs/ft^2",

                //permeability
                "Kilogram/pascal/second/square meter -kg/Pa/s/m^2",
                "Permeability (0°C) -µ (0°C)",
                "Permeability (23°C) -µ (23°C)",
                "Permeability inches (0°C) -µ in(0°C)",
                "Permeability inches (23°C) -µ in(23°C)",

                //surface tension
                "Newton/meter -N/m",
                "Millinewton/meter -mN/m",
                "Gram-force/centimeter -gf/cm",
                "Dyne/centimeter -dyn/cm",
                "Erg/square centimeter -erg/cm^2",
                "Erg/square millimeter -erg/mm^2",
                "Poundal/inch -lb/in",
                "Pound-force/inch -lbf/in",

                //viscosity
                "Pascal second -Pa*s",
                "Kilogram-force second/square meter -kg-Ns/m^2",
                "Newton second/square meter -N*s/m^2",
                "Millinewton second/sq. meter -mNs/m^2",
                "Dyne second/sq. centimeter -dyns/cm^2",
                "Poise -P",
                "Exapoise -EP",
                "Petapoise -PP",
                "Terapoise -TP",
                "Gigapoise -GP",
                "Megapoise -MP",
                "Kilopoise -kP",
                "Hectopoise -hP",
                "Dekapoise -daP",
                "Decipoise -dP",
                "Centipoise -cP",
                "Millipoise -mP",
                "Micropoise -μP",
                "Nanopoise -nP",
                "Picopoise -pP",
                "Femtopoise -fP",
                "Attopoise -aP",
                "Pound-force second/sq. inch -lb-Ns/in^2",
                "Pound-force second/sq. foot -lb-Ns/ft^2",
                "Poundal second/square foot -lbs/ft^2",
                "Gram/centimeter/second -g/(cm*s)",
                "Slug/foot/second -slug/(ft*s)",
                "Pound/foot/second -lb/(ft*s)",
                "Pound/foot/hour -lb/(ft*h)",

                //viscosity kinetic
                "Square meter/second -m^2/s",
                "Square meter/hour -m^2/h",
                "Square centimeter/second -cm^2/s",
                "Square millimeter/second -mm^2/s",
                "Square foot/second -ft^2/s",
                "Square foot/hour -ft^2/h",
                "Square inch/second -in^2/s",
                "Stokes -St",
                "Exastokes -ESt",
                "Petastokes -PSt",
                "Terastokes -TSt",
                "Gigastokes -GSt",
                "Megastokes -MSt",
                "Kilostokes -kSt",
                "Hectostokes -hSt",
                "Dekastokes -daSt",
                "Decistokes -dSt",
                "Centistokes -cSt",
                "Millistokes -mSt",
                "Microstokes -μSt",
                "Nanostokes -nSt",
                "Picostokes -pSt",
                "Femtostokes -fSt",
                "Attostokes -aSt"
        };

        lv = (ListView) findViewById(R.id.list_view);
        inputSearch = (EditText) findViewById(R.id.inputSearch);

        // Adding items to listview
        adapter = new ArrayAdapter<String>(this, R.layout.list_item, R.id.product_name, listitem);
        lv.setAdapter(adapter);

        /*Collections.sort(lv, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s1.compareToIgnoreCase(s2);
            }
        });*/

        inputSearch.addTextChangedListener(this);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            public void onItemClick(AdapterView adapterView, View view, int position, long id) {

                //Do some more stuff here and launch new activity
                selectedItem = (String) adapterView.getItemAtPosition(position);
                //  Toast.makeText(SearchActivity.this,"Position"+selectedItem,Toast.LENGTH_LONG).show();
                switch (selectedItem) {


                    //fluid
                    //concentration molar
                    case "Mol/cubic meter -mol/m^3" : concentrationmolar(); break;
                    case "Mol/liter -mol/L" : concentrationmolar(); break;
                    case "Mol/cubic centimeter -mol/cm^3" : concentrationmolar(); break;
                    case "Mol/cubic millimeter -mol/mm^3" : concentrationmolar(); break;
                    case "Kilomol/cubic meter -kmol/m^3" : concentrationmolar(); break;
                    case "Kilomol/liter -kmol/L" : concentrationmolar(); break;
                    case "Kilomol/cubic centimeter -kmol/cm^3" : concentrationmolar(); break;
                    case "Kilomol/cubic millimeter -kmol/mm^3" : concentrationmolar(); break;
                    case "Millimol/cubic meter -mmol/m^3" : concentrationmolar(); break;
                    case "Millimol/liter -mmol/L" : concentrationmolar(); break;
                    case "Millimol/cubic centimeter -mmol/cm^3" : concentrationmolar(); break;
                    case "Millimol/cubic millimeter -mmol/mm^3" : concentrationmolar(); break;

                    //concentration solution
                    case "Kilogram/liter(sol) -kg/L" : concentrationsolution(); break;
                    case "Gram/liter(sol) -g/L" : concentrationsolution(); break;
                    case "Milligram/liter(sol) -mg/L" : concentrationsolution(); break;
                    case "Part/million (ppm) -p/m" : concentrationsolution(); break;
                    case "Grain/gallon (US)(sol) -gr/gal(US)" : concentrationsolution(); break;
                    case "Grain/gallon (UK)(sol) -gr/gal(UK)" : concentrationsolution(); break;
                    case "Pound/gallon (US)(sol) -lb/gal(US)" : concentrationsolution(); break;
                    case "Pound/gallon (UK)(sol) -lb/gal(UK)" : concentrationsolution(); break;
                    case "Pound/million gallon (US) -lb/mgal(US)" : concentrationsolution(); break;
                    case "Pound/million gallon (UK) -lb/mgal(UK)" : concentrationsolution(); break;
                    case "Pound/cubic foot(sol) -lb/ft^3" : concentrationsolution(); break;

                    //flow
                    case "Cubic meter/second -m^3/s" : flow(); break;
                    case "Cubic meter/day -m^3/d" : flow(); break;
                    case "Cubic meter/hour -m^3/h" : flow(); break;
                    case "Cubic meter/minute -m^3/min" : flow(); break;
                    case "Cubic centimeter/day -cm^3/d" : flow(); break;
                    case "Cubic centimeter/hour -cm^3/h" : flow(); break;
                    case "Cubic centimeter/minute -cm^3/min" : flow(); break;
                    case "Cubic centimeter/second -cm^3/s" : flow(); break;
                    case "Liter/day -L/d" : flow(); break;
                    case "Liter/hour -L/h" : flow(); break;
                    case "Liter/minute -L/min" : flow(); break;
                    case "Liter/second -L/s" : flow(); break;
                    case "Milliliter/day -mL/d" : flow(); break;
                    case "Milliliter/hour -mL/h" : flow(); break;
                    case "Milliliter/minute -mL/min" : flow(); break;
                    case "Milliliter/second -mL/s" : flow(); break;
                    case "Gallon (US)/day -gal(US)/d" : flow(); break;
                    case "Gallon (US)/hour -gal(US)/h" : flow(); break;
                    case "Gallon (US)/minute -gal(US)/min" : flow(); break;
                    case "Gallon (US)/second -gal(US)/s" : flow(); break;
                    case "Gallon (UK)/day -gal(UK)/d" : flow(); break;
                    case "Gallon (UK)/hour -gal(UK)/h" : flow(); break;
                    case "Gallon (UK)/minute -gal(UK)/min" : flow(); break;
                    case "Gallon (UK)/second -gal(UK)/s" : flow(); break;
                    case "Kilobarrel (US)/day -kbbl(US)/d" : flow(); break;
                    case "Barrel (US)/day -bbl(US)/d" : flow(); break;
                    case "Barrel (US)/hour -bbl(US)/h" : flow(); break;
                    case "Barrel (US)/minute -bbl(US)/min" : flow(); break;
                    case "Barrel (US)/second -bbl(US)/s" : flow(); break;
                    case "Acre-foot/year -ac*ft/y" : flow(); break;
                    case "Acre-foot/day -ac*ft/d" : flow(); break;
                    case "Acre-foot/hour -ac*ft/h" : flow(); break;
                    case "Hundred-cubic foot/day -ft^3/d" : flow(); break;
                    case "Hundred-cubic foot/hour -ft^3/h" : flow(); break;
                    case "Hundred-cubic foot/minute -ft^3/min" : flow(); break;
                    case "Ounce/hour -oz/h" : flow(); break;
                    case "Ounce/minute -oz/min" : flow(); break;
                    case "Ounce/second -oz/s" : flow(); break;
                    case "Ounce (UK)/hour -oz(UK)/h" : flow(); break;
                    case "Ounce (UK)/minute -oz(UK)/min" : flow(); break;
                    case "Ounce (UK)/second -oz(UK)/s" : flow(); break;
                    case "Cubic yard/hour -yd^3/h" : flow(); break;
                    case "Cubic yard/minute -yd^3/min" : flow(); break;
                    case "Cubic yard/second -yd^3/s" : flow(); break;
                    case "Cubic foot/hour -ft^3/h" : flow(); break;
                    case "Cubic foot/minute -ft^3/min" : flow(); break;
                    case "Cubic foot/second -ft^3/s" : flow(); break;
                    case "Cubic inch/hour -in^3/h" : flow(); break;
                    case "Cubic inch/minute -in^3/min" : flow(); break;
                    case "Cubic inch/second -in^3/s" : flow(); break;
                    case "Pound/second (Gasoline at 15.5%b0C) -lb/s" : flow(); break;
                    case "Pound/minute (Gasoline at 15.5%b0C) -lb/min" : flow(); break;
                    case "Pound/hour (Gasoline at 15.5%b0C) -lb/h" : flow(); break;
                    case "Pound/day (Gasoline at 15.5%b0C) -lb/d" : flow(); break;
                    case "Kilogram/second (Gasoline at 15.5%b0C) -kg/s" : flow(); break;
                    case "Kilogram/minute (Gasoline at 15.5%b0C) -kg/min" : flow(); break;
                    case "Kilogram/hour (Gasoline at 15.5%b0C) -kg/h" : flow(); break;
                    case "Kilogram/day (Gasoline at 15.5%b0C) -kg/d" : flow(); break;

                    //flow mass
                    case "Kilogram/second -kg/s" : flowmass(); break;
                    case "Gram/second -g/s" : flowmass(); break;
                    case "Gram/minute -g/min" : flowmass(); break;
                    case "Gram/hour -g/h" : flowmass(); break;
                    case "Gram/day -g/d" : flowmass(); break;
                    case "Milligram/minute -mg/min" : flowmass(); break;
                    case "Milligram/hour -mg/h" : flowmass(); break;
                    case "Milligram/day -mg/d" : flowmass(); break;
                    case "Kilogram/minute -kg/m" : flowmass(); break;
                    case "Kilogram/hour -kg/h" : flowmass(); break;
                    case "Kilogram/day -kg/d" : flowmass(); break;
                    case "Exagram/second -Eg/s" : flowmass(); break;
                    case "Petagram/second -Pg/s" : flowmass(); break;
                    case "Teragram/second -Tg/s" : flowmass(); break;
                    case "Gigagram/second -Gg/s" : flowmass(); break;
                    case "Megagram/second -Mg/s" : flowmass(); break;
                    case "Hectogram/second -hg/s" : flowmass(); break;
                    case "Dekagram/second -dag/s" : flowmass(); break;
                    case "Decigram/second -dg/s" : flowmass(); break;
                    case "Centigram/second -cg/s" : flowmass(); break;
                    case "Milligram/second -mg/s" : flowmass(); break;
                    case "Microgram/second -μg/s" : flowmass(); break;
                    case "Ton (metric)/second -t/s" : flowmass(); break;
                    case "Ton (metric)/minute -t/min" : flowmass(); break;
                    case "Ton (metric)/hour -t/h" : flowmass(); break;
                    case "Ton (metric)/day -t/d" : flowmass(); break;
                    case "Ton (short)/hour -ton(US)/h" : flowmass(); break;
                    case "Pound/second -lb/s" : flowmass(); break;
                    case "Pound/minute -lb/min" : flowmass(); break;
                    case "Pound/hour -lb/h" : flowmass(); break;
                    case "Pound/day -lb/d" : flowmass(); break;

                    //flow molar
                    case "Mol/second -mol/s" : flowmolar(); break;
                    case "Examol/second -Emol/s" : flowmolar(); break;
                    case "Petamol/second -Pmol/s" : flowmolar(); break;
                    case "Teramol/second -Tmol/s" : flowmolar(); break;
                    case "Gigamol/second -Gmol/s" : flowmolar(); break;
                    case "Megamol/second -Mmol/s" : flowmolar(); break;
                    case "Kilomol/second -kmol/s" : flowmolar(); break;
                    case "Hectomol/second -hmol/s" : flowmolar(); break;
                    case "Dekamol/second -damol/s" : flowmolar(); break;
                    case "Decimol/second -dmol/s" : flowmolar(); break;
                    case "Centimol/second -cmol/s" : flowmolar(); break;
                    case "Millimol/second -mmol/s" : flowmolar(); break;
                    case "Micromol/second -μmol/s" : flowmolar(); break;
                    case "Nanomol/second -nmol/s" : flowmolar(); break;
                    case "Picomol/second -pmol/s" : flowmolar(); break;
                    case "Femtomol/second -fmol/s" : flowmolar(); break;
                    case "Attomol/second -amol/s" : flowmolar(); break;
                    case "Mol/minute -mol/min" : flowmolar(); break;
                    case "Mol/hour -mol/h" : flowmolar(); break;
                    case "Mol/day -mol/d" : flowmolar(); break;
                    case "Millimol/minute -mmol/min" : flowmolar(); break;
                    case "Millimol/hour -mmol/h" : flowmolar(); break;
                    case "Millimol/day -mmol/d" : flowmolar(); break;
                    case "Kilomol/minute -kmol/min" : flowmolar(); break;
                    case "Kilomol/hour -kmol/h" : flowmolar(); break;
                    case "Kilomol/day -kmol/d" : flowmolar(); break;

                    //mass flux
                    case "Gram/second/square meter -gs/m^2" : massflux(); break;
                    case "Kilogram/hour/square meter -kgh/m^2" : massflux(); break;
                    case "Kilogram/hour/square foot -kgh/ft^2" : massflux(); break;
                    case "Kilogram/second/square meter -kgs/m^2" : massflux(); break;
                    case "Gram/second/sq. centimeter -gs/cm^2" : massflux(); break;
                    case "Pound/hour/square foot -lbh/ft^2" : massflux(); break;
                    case "Pound/second/square foot -lbs/ft^2" : massflux(); break;

                    case "Kilogram/pascal/second/square meter -kg/Pa/s/m^2" : permeabiltiy(); break;
                    case "Permeability (0°C) -µ (0°C)" : permeabiltiy(); break;
                    case "Permeability (23°C) -µ (23°C)" : permeabiltiy(); break;
                    case "Permeability inches (0°C) -µ in(0°C)" : permeabiltiy(); break;
                    case "Permeability inches (23°C) -µ in(23°C)" : permeabiltiy(); break;

                    //surface tension
                    case "Newton/meter -N/m" : surfacetension(); break;
                    case "Millinewton/meter -mN/m" : surfacetension(); break;
                    case "Gram-force/centimeter -gf/cm" : surfacetension(); break;
                    case "Dyne/centimeter -dyn/cm" : surfacetension(); break;
                    case "Erg/square centimeter -erg/cm^2" : surfacetension(); break;
                    case "Erg/square millimeter -erg/mm^2" : surfacetension(); break;
                    case "Poundal/inch -lb/in" : surfacetension(); break;
                    case "Pound-force/inch -lbf/in" : surfacetension(); break;

                    //visosity
                    case "Pascal second -Pa*s" : viscositydynamic(); break;
                    case "Kilogram-force second/square meter -kg-Ns/m^2" : viscositydynamic(); break;
                    case "Newton second/square meter -N*s/m^2" : viscositydynamic(); break;
                    case "Millinewton second/sq. meter -mNs/m^2" : viscositydynamic(); break;
                    case "Dyne second/sq. centimeter -dyns/cm^2" : viscositydynamic(); break;
                    case "Poise -P" : viscositydynamic(); break;
                    case "Exapoise -EP" : viscositydynamic(); break;
                    case "Petapoise -PP" : viscositydynamic(); break;
                    case "Terapoise -TP" : viscositydynamic(); break;
                    case "Gigapoise -GP" : viscositydynamic(); break;
                    case "Megapoise -MP" : viscositydynamic(); break;
                    case "Kilopoise -kP" : viscositydynamic(); break;
                    case "Hectopoise -hP" : viscositydynamic(); break;
                    case "Dekapoise -daP" : viscositydynamic(); break;
                    case "Decipoise -dP" : viscositydynamic(); break;
                    case "Centipoise -cP" : viscositydynamic(); break;
                    case "Millipoise -mP" : viscositydynamic(); break;
                    case "Micropoise -μP" : viscositydynamic(); break;
                    case "Nanopoise -nP" : viscositydynamic(); break;
                    case "Picopoise -pP" : viscositydynamic(); break;
                    case "Femtopoise -fP" : viscositydynamic(); break;
                    case "Attopoise -aP" : viscositydynamic(); break;
                    case "Pound-force second/sq. inch -lb-Ns/in^2" : viscositydynamic(); break;
                    case "Pound-force second/sq. foot -lb-Ns/ft^2" : viscositydynamic(); break;
                    case "Poundal second/square foot -lbs/ft^2" : viscositydynamic(); break;
                    case "Gram/centimeter/second -g/(cm*s)" : viscositydynamic(); break;
                    case "Slug/foot/second -slug/(ft*s)" : viscositydynamic(); break;
                    case "Pound/foot/second -lb/(ft*s)" : viscositydynamic(); break;
                    case "Pound/foot/hour -lb/(ft*h)" : viscositydynamic(); break;


                    case "Square meter/second -m^2/s" : viscositykinematic(); break;
                    case "Square meter/hour -m^2/h" : viscositykinematic(); break;
                    case "Square centimeter/second -cm^2/s" : viscositykinematic(); break;
                    case "Square millimeter/second -mm^2/s" : viscositykinematic(); break;
                    case "Square foot/second -ft^2/s" : viscositykinematic(); break;
                    case "Square foot/hour -ft^2/h" : viscositykinematic(); break;
                    case "Square inch/second -in^2/s" : viscositykinematic(); break;
                    case "Stokes -St" : viscositykinematic(); break;
                    case "Exastokes -ESt" : viscositykinematic(); break;
                    case "Petastokes -PSt" : viscositykinematic(); break;
                    case "Terastokes -TSt" : viscositykinematic(); break;
                    case "Gigastokes -GSt" : viscositykinematic(); break;
                    case "Megastokes -MSt" : viscositykinematic(); break;
                    case "Kilostokes -kSt" : viscositykinematic(); break;
                    case "Hectostokes -hSt" : viscositykinematic(); break;
                    case "Dekastokes -daSt" : viscositykinematic(); break;
                    case "Decistokes -dSt" : viscositykinematic(); break;
                    case "Centistokes -cSt" : viscositykinematic(); break;
                    case "Millistokes -mSt" : viscositykinematic(); break;
                    case "Microstokes -μSt" : viscositykinematic(); break;
                    case "Nanostokes -nSt" : viscositykinematic(); break;
                    case "Picostokes -pSt" : viscositykinematic(); break;
                    case "Femtostokes -fSt" : viscositykinematic(); break;
                    case "Attostokes -aSt" : viscositykinematic(); break;


                }
            }
        });
        }

    private void viscositykinematic() {
        Intent i1=new Intent(SearchActivity.this,ViscosityKinematicActivity.class);
        startActivity(i1);
    }

    private void viscositydynamic() {
        Intent i2=new Intent(SearchActivity.this,ViscosityDynamicActivity.class);
        startActivity(i2);
    }

    private void surfacetension() {
        Intent i3=new Intent(SearchActivity.this,SurfaceTensionActivity.class);
        startActivity(i3);
    }

    private void permeabiltiy() {
        Intent i4=new Intent(SearchActivity.this,PermeabillityActivity.class);
        startActivity(i4);
    }

    private void massflux() {
        Intent i5=new Intent(SearchActivity.this,MassFluxDensityActivity.class);
        startActivity(i5);
    }

    private void flowmolar() {
        Intent i6=new Intent(SearchActivity.this,FlowMolarActivity.class);
        startActivity(i6);
    }

    private void flowmass() {
        Intent i7=new Intent(SearchActivity.this,FlowMassActivity.class);
        startActivity(i7);
    }

    private void flow() {
        Intent i8=new Intent(SearchActivity.this,FlowActivity.class);
        startActivity(i8);
    }

    private void concentrationsolution() {
        Intent i9=new Intent(SearchActivity.this,ConcentrationSolutionActivity.class);
        startActivity(i9);
    }

    private void concentrationmolar() {
        Intent i10=new Intent(SearchActivity.this,ConcentrationMolarActivity.class);
        startActivity(i10);
    }


    @Override
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {

    }

    @Override
    public void onTextChanged(CharSequence s, int start, int before, int count) {
        SearchActivity.this.adapter.getFilter().filter(s);

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



