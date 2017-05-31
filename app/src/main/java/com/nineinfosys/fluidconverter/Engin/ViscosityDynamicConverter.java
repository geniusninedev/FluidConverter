package com.nineinfosys.fluidconverter.Engin;

import java.util.ArrayList;


public class ViscosityDynamicConverter {
	private double pascalsecond,kilogramforcesecondpersquaremeter,newtonsecondpersquaremeter,millinewtonsecondppersqmeter,dynesecondpersqcentimeter,poise,exapoise,petapoise
	,terapoise,gigapoise,megapoise,kilopoise,hectopoise,dekapoise,decipoise,centipoise,millipoise,micropoise,nanopoise,picopoise,femtopoise,attopoise,poundforcesecondpersqinch
	,poundforcesecondpersqfoot,poundalsecondpersquarefoot,grampercentimeterpersecond,slugperfootpersecond,poundperfootpersecond,poundperfootperhour;
	private double edtValue;
	private String conversionFrom;
	//private String conversionTo;
	public ViscosityDynamicConverter(String conversionFrom, double edtValue){
		// TODO Auto-generated constructor stub
		this.conversionFrom = conversionFrom;
		this.edtValue = edtValue;
	}
	public ArrayList<ConversionResults> calculateViscosityConversion()
    {
		
		ArrayList<ConversionResults> converterArray = new ArrayList<ConversionResults>();
			
		ConversionResults results= new ConversionResults();
    		 	
		switch(conversionFrom)
		{
		case "Pascal second -Pa*s":
			
			pascalsecond=(edtValue)*1;
			kilogramforcesecondpersquaremeter=(edtValue)*0.1019716213;
			newtonsecondpersquaremeter=(edtValue)*1;
			millinewtonsecondppersqmeter=(edtValue)*1000;
			dynesecondpersqcentimeter=(edtValue)*10;
			poise=(edtValue)*10;
			exapoise=(edtValue)*1.E-17;
			petapoise=(edtValue)*1.E-14;
			terapoise=(edtValue)*1.E-11;
			gigapoise=(edtValue)*1.E-8;
			megapoise=(edtValue)*0.00001;
			kilopoise=(edtValue)*0.01;
			hectopoise=(edtValue)*0.1;
			dekapoise=(edtValue)*1;
			decipoise=(edtValue)*100;
			centipoise=(edtValue)*1000;
			millipoise=(edtValue)*10000;
			micropoise=(edtValue)*10000000;
			nanopoise=(edtValue)*10000000000.0000000000;
			picopoise=(edtValue)*10000000000000.0000000000;
			femtopoise=(edtValue)*10000000000000000.0000000000;
			attopoise=(edtValue)*10000000000000000000.0000000000;
			poundforcesecondpersqinch=(edtValue)*0.0001450377;
			poundforcesecondpersqfoot=(edtValue)*0.0208854342;
			poundalsecondpersquarefoot=(edtValue)*0.6719689751;
			grampercentimeterpersecond=(edtValue)*10;
			slugperfootpersecond=(edtValue)*0.0208854342;
			poundperfootpersecond=(edtValue)*0.6719689751;
			poundperfootperhour=(edtValue)*2419.0883105;
		
			
			break;
			
		case "Kilogram-force second/square meter -kg-Ns/m^2":
			
			pascalsecond=(edtValue)*9.80665;
			kilogramforcesecondpersquaremeter=(edtValue)*1;
			newtonsecondpersquaremeter=(edtValue)*9.80665;
			millinewtonsecondppersqmeter=(edtValue)*9806.65;
			dynesecondpersqcentimeter=(edtValue)*98.0665;
			poise=(edtValue)*98.0665;
			exapoise=(edtValue)*9.80665E-17;
			petapoise=(edtValue)*9.80665E-14;
			terapoise=(edtValue)*9.80665E-11;
			gigapoise=(edtValue)*9.80665E-8;
			megapoise=(edtValue)*0.0000980665;
			kilopoise=(edtValue)*0.0980665;
			hectopoise=(edtValue)*0.980665;
			dekapoise=(edtValue)*9.80665;
			decipoise=(edtValue)*980.665;
			centipoise=(edtValue)*9806.65;
			millipoise=(edtValue)*98066.5;
			micropoise=(edtValue)*98066500;
			nanopoise=(edtValue)*98066500000.0000000000;
			picopoise=(edtValue)*98066500000003.0000000000;
			femtopoise=(edtValue)*98066500000002700.0000000000;
			attopoise=(edtValue)*98066500000002720000.0000000000;
			poundforcesecondpersqinch=(edtValue)*0.0014223343;
			poundforcesecondpersqfoot=(edtValue)*0.2048161436;
			poundalsecondpersquarefoot=(edtValue)*6.5897645501;
			grampercentimeterpersecond=(edtValue)*98.0665;
			slugperfootpersecond=(edtValue)*0.2048161436;
			poundperfootpersecond=(edtValue)*6.5897645501;
			poundperfootperhour=(edtValue)*23723.15238;
			
			break;
			
		case "Newton second/square meter -N*s/m^2":
			
			pascalsecond=(edtValue)*1;
			kilogramforcesecondpersquaremeter=(edtValue)*0.1019716213;
			newtonsecondpersquaremeter=(edtValue)*1;
			millinewtonsecondppersqmeter=(edtValue)*1000;
			dynesecondpersqcentimeter=(edtValue)*10;
			poise=(edtValue)*10;
			exapoise=(edtValue)*1.E-17;
			petapoise=(edtValue)*1.E-14;
			terapoise=(edtValue)*1.E-11;
			gigapoise=(edtValue)*1.E-8;
			megapoise=(edtValue)*0.00001;
			kilopoise=(edtValue)*0.01;
			hectopoise=(edtValue)*0.1;
			dekapoise=(edtValue)*1;
			decipoise=(edtValue)*100;
			centipoise=(edtValue)*1000;
			millipoise=(edtValue)*10000;
			micropoise=(edtValue)*10000000;
			nanopoise=(edtValue)*10000000000.0000000000;
			picopoise=(edtValue)*10000000000000.0000000000;
			femtopoise=(edtValue)*10000000000000000.0000000000;
			attopoise=(edtValue)*10000000000000000000.0000000000;
			poundforcesecondpersqinch=(edtValue)*0.0001450377;
			poundforcesecondpersqfoot=(edtValue)*0.0208854342;
			poundalsecondpersquarefoot=(edtValue)*0.6719689751;
			grampercentimeterpersecond=(edtValue)*10;
			slugperfootpersecond=(edtValue)*0.0208854342;
			poundperfootpersecond=(edtValue)*0.6719689751;
			poundperfootperhour=(edtValue)*2419.0883105;
			
			break;	
		case "Millinewton second/sq. meter -mNs/m^2":
			
			pascalsecond=(edtValue)*0.001;
			kilogramforcesecondpersquaremeter=(edtValue)*0.0001019716;
			newtonsecondpersquaremeter=(edtValue)*0.001;
			millinewtonsecondppersqmeter=(edtValue)*1;
			dynesecondpersqcentimeter=(edtValue)*0.01;
			poise=(edtValue)*0.01;
			exapoise=(edtValue)*1.E-20;
			petapoise=(edtValue)*1.E-17;
			terapoise=(edtValue)*1.E-14;
			gigapoise=(edtValue)*1.E-11;
			megapoise=(edtValue)*1.E-8;
			kilopoise=(edtValue)*0.00001;
			hectopoise=(edtValue)*0.0001;
			dekapoise=(edtValue)*0.001;
			decipoise=(edtValue)*0.1;
			centipoise=(edtValue)*1;
			millipoise=(edtValue)*10;
			micropoise=(edtValue)*10000;
			nanopoise=(edtValue)*10000000;
			picopoise=(edtValue)*10000000000.0000000000;
			femtopoise=(edtValue)*10000000000000.0000000000;
			attopoise=(edtValue)*10000000000000000.0000000000;
			poundforcesecondpersqinch=(edtValue)*1.450377377E-7;
			poundforcesecondpersqfoot=(edtValue)*0.0000208854;
			poundalsecondpersquarefoot=(edtValue)*0.000671969;
			grampercentimeterpersecond=(edtValue)*0.01;
			slugperfootpersecond=(edtValue)*0.0000208854;
			poundperfootpersecond=(edtValue)*0.000671969;
			poundperfootperhour=(edtValue)*2.4190883105;
			
			break;	
		case "Dyne second/sq. centimeter -dyns/cm^2":
			
			pascalsecond=(edtValue)*0.1;
			kilogramforcesecondpersquaremeter=(edtValue)*0.0101971621;
			newtonsecondpersquaremeter=(edtValue)*0.1;
			millinewtonsecondppersqmeter=(edtValue)*100;
			dynesecondpersqcentimeter=(edtValue)*1;
			poise=(edtValue)*1;
			exapoise=(edtValue)*1.E-18;
			petapoise=(edtValue)*1.E-15;
			terapoise=(edtValue)*1.E-12;
			gigapoise=(edtValue)*1.E-9;
			megapoise=(edtValue)*0.000001;
			kilopoise=(edtValue)*0.001;
			hectopoise=(edtValue)*0.01;
			dekapoise=(edtValue)*0.1;
			decipoise=(edtValue)*10;
			centipoise=(edtValue)*100;
			millipoise=(edtValue)*1000;
			micropoise=(edtValue)*1000000;
			nanopoise=(edtValue)*1000000000;
			picopoise=(edtValue)*1000000000000.0000000000;
			femtopoise=(edtValue)*1000000000000000.0000000000;
			attopoise=(edtValue)*1000000000000000000.0000000000;
			poundforcesecondpersqinch=(edtValue)*0.0000145038;
			poundforcesecondpersqfoot=(edtValue)*0.0020885434;
			poundalsecondpersquarefoot=(edtValue)*0.0671968975;
			grampercentimeterpersecond=(edtValue)*1;
			slugperfootpersecond=(edtValue)*0.0020885434;
			poundperfootpersecond=(edtValue)*0.0671968975;
			poundperfootperhour=(edtValue)*241.90883105;
			
			break;	
		case "Poise -P":
			
			pascalsecond=(edtValue)*0.1;
			kilogramforcesecondpersquaremeter=(edtValue)*0.0101971621;
			newtonsecondpersquaremeter=(edtValue)*0.1;
			millinewtonsecondppersqmeter=(edtValue)*100;
			dynesecondpersqcentimeter=(edtValue)*1;
			poise=(edtValue)*1;
			exapoise=(edtValue)*1.E-18;
			petapoise=(edtValue)*1.E-15;
			terapoise=(edtValue)*1.E-12;
			gigapoise=(edtValue)*1.E-9;
			megapoise=(edtValue)*0.000001;
			kilopoise=(edtValue)*0.001;
			hectopoise=(edtValue)*0.01;
			dekapoise=(edtValue)*0.1;
			decipoise=(edtValue)*10;
			centipoise=(edtValue)*100;
			millipoise=(edtValue)*1000;
			micropoise=(edtValue)*1000000;
			nanopoise=(edtValue)*1000000000;
			picopoise=(edtValue)*1000000000000.0000000000;
			femtopoise=(edtValue)*1000000000000000.0000000000;
			attopoise=(edtValue)*1000000000000000000.0000000000;
			poundforcesecondpersqinch=(edtValue)*0.0000145038;
			poundforcesecondpersqfoot=(edtValue)*0.0020885434;
			poundalsecondpersquarefoot=(edtValue)*0.0671968975;
			grampercentimeterpersecond=(edtValue)*1;
			slugperfootpersecond=(edtValue)*0.0020885434;
			poundperfootpersecond=(edtValue)*0.0671968975;
			poundperfootperhour=(edtValue)*241.90883105;
			
			break;
			
		case "Exapoise -EP":
			
			pascalsecond=(edtValue)*100000000000000000.0000000000;
			kilogramforcesecondpersquaremeter=(edtValue)*10197162129779000.0000000000;
			newtonsecondpersquaremeter=(edtValue)*100000000000000000.0000000000;
			millinewtonsecondppersqmeter=(edtValue)*100000000000000000000.0000000000;
			dynesecondpersqcentimeter=(edtValue)*1000000000000000000.0000000000;
			poise=(edtValue)*1000000000000000000.0000000000;
			exapoise=(edtValue)*1;
			petapoise=(edtValue)*1000;
			terapoise=(edtValue)*1000000;
			gigapoise=(edtValue)*1000000000;
			megapoise=(edtValue)*1000000000000.0000000000;
			kilopoise=(edtValue)*1000000000000000.0000000000;
			hectopoise=(edtValue)*10000000000000000.0000000000;
			dekapoise=(edtValue)*100000000000000000.0000000000;
			decipoise=(edtValue)*10000000000000000000.0000000000;
			centipoise=(edtValue)*100000000000000000000.0000000000;
			millipoise=(edtValue)*1.E+21;
			micropoise=(edtValue)*1.E+24;
			nanopoise=(edtValue)*9.999999999E+26;
			picopoise=(edtValue)*1.E+30;
			femtopoise=(edtValue)*9.999999999E+32;
			attopoise=(edtValue)*1.E+36;
			poundforcesecondpersqinch=(edtValue)*14503773773021.0000000000;
			poundforcesecondpersqfoot=(edtValue)*2088543423320000.0000000000;
			poundalsecondpersquarefoot=(edtValue)*67196897514000000.0000000000;
			grampercentimeterpersecond=(edtValue)*1000000000000000000.0000000000;
			slugperfootpersecond=(edtValue)*2088543423320000.0000000000;
			poundperfootpersecond=(edtValue)*67196897514000000.0000000000;
			poundperfootperhour=(edtValue)*241908831050219980000.0000000000;
			
			break;		
			
		case "Petapoise -PP":
			
			pascalsecond=(edtValue)*100000000000000.0000000000;
			kilogramforcesecondpersquaremeter=(edtValue)*10197162129779.0000000000;
			newtonsecondpersquaremeter=(edtValue)*100000000000000.0000000000;
			millinewtonsecondppersqmeter=(edtValue)*100000000000000000.0000000000;
			dynesecondpersqcentimeter=(edtValue)*1000000000000000.0000000000;
			poise=(edtValue)*1000000000000000.0000000000;
			exapoise=(edtValue)*0.001;
			petapoise=(edtValue)*1;
			terapoise=(edtValue)*1000;
			gigapoise=(edtValue)*1000000;
			megapoise=(edtValue)*1000000000;
			kilopoise=(edtValue)*1000000000000.0000000000;
			hectopoise=(edtValue)*10000000000000.0000000000;
			dekapoise=(edtValue)*100000000000000.0000000000;
			decipoise=(edtValue)*10000000000000000.0000000000;
			centipoise=(edtValue)*100000000000000000.0000000000;
			millipoise=(edtValue)*1000000000000000000.0000000000;
			micropoise=(edtValue)*1.E+21;
			nanopoise=(edtValue)*9.999999999E+23;
			picopoise=(edtValue)*1.E+27;
			femtopoise=(edtValue)*9.999999999E+29;
			attopoise=(edtValue)*1.E+33;
			poundforcesecondpersqinch=(edtValue)*14503773773.0000000000;
			poundforcesecondpersqfoot=(edtValue)*2088543423320.0000000000;
			poundalsecondpersquarefoot=(edtValue)*67196897514000.0000000000;
			grampercentimeterpersecond=(edtValue)*1000000000000000.0000000000;
			slugperfootpersecond=(edtValue)*2088543423320.0000000000;
			poundperfootpersecond=(edtValue)*67196897514000.0000000000;
			poundperfootperhour=(edtValue)*241908831050220000.0000000000;
			
			break;		
	case "Terapoise -TP":
			
		pascalsecond=(edtValue)*100000000000.0000000000;
		kilogramforcesecondpersquaremeter=(edtValue)*10197162130.0000000000;
		newtonsecondpersquaremeter=(edtValue)*100000000000.0000000000;
		millinewtonsecondppersqmeter=(edtValue)*100000000000000.0000000000;
		dynesecondpersqcentimeter=(edtValue)*1000000000000.0000000000;
		poise=(edtValue)*1000000000000.0000000000;
		exapoise=(edtValue)*0.000001;
		petapoise=(edtValue)*0.001;
		terapoise=(edtValue)*1;
		gigapoise=(edtValue)*1000;
		megapoise=(edtValue)*1000000;
		kilopoise=(edtValue)*1000000000;
		hectopoise=(edtValue)*10000000000.0000000000;
		dekapoise=(edtValue)*100000000000.0000000000;
		decipoise=(edtValue)*10000000000000.0000000000;
		centipoise=(edtValue)*100000000000000.0000000000;
		millipoise=(edtValue)*1000000000000000.0000000000;
		micropoise=(edtValue)*1000000000000000000.0000000000;
		nanopoise=(edtValue)*999999999999999900000.0000000000;
		picopoise=(edtValue)*1.E+24;
		femtopoise=(edtValue)*9.999999999E+26;
		attopoise=(edtValue)*1.E+30;
		poundforcesecondpersqinch=(edtValue)*14503773.773;
		poundforcesecondpersqfoot=(edtValue)*2088543423.3;
		poundalsecondpersquarefoot=(edtValue)*67196897514.0000000000;
		grampercentimeterpersecond=(edtValue)*1000000000000.0000000000;
		slugperfootpersecond=(edtValue)*2088543423.3;
		poundperfootpersecond=(edtValue)*67196897514.0000000000;
		poundperfootperhour=(edtValue)*241908831050220.0000000000;
			
			break;	
		case "Gigapoise -GP":
			
			pascalsecond=(edtValue)*100000000;
			kilogramforcesecondpersquaremeter=(edtValue)*10197162.13;
			newtonsecondpersquaremeter=(edtValue)*100000000;
			millinewtonsecondppersqmeter=(edtValue)*100000000000.0000000000;
			dynesecondpersqcentimeter=(edtValue)*1000000000;
			poise=(edtValue)*1000000000;
			exapoise=(edtValue)*1.E-9;
			petapoise=(edtValue)*0.000001;
			terapoise=(edtValue)*0.001;
			gigapoise=(edtValue)*1;
			megapoise=(edtValue)*1000;
			kilopoise=(edtValue)*1000000;
			hectopoise=(edtValue)*10000000;
			dekapoise=(edtValue)*100000000;
			decipoise=(edtValue)*10000000000.0000000000;
			centipoise=(edtValue)*100000000000.0000000000;
			millipoise=(edtValue)*1000000000000.0000000000;
			micropoise=(edtValue)*1000000000000000.0000000000;
			nanopoise=(edtValue)*999999999999999900.0000000000;
			picopoise=(edtValue)*1.E+21;
			femtopoise=(edtValue)*9.999999999E+23;
			attopoise=(edtValue)*1.E+27;
			poundforcesecondpersqinch=(edtValue)*14503.773773;
			poundforcesecondpersqfoot=(edtValue)*2088543.4233;
			poundalsecondpersquarefoot=(edtValue)*67196897.514;
			grampercentimeterpersecond=(edtValue)*1000000000.0000000000;
			slugperfootpersecond=(edtValue)*2088543.4233;
			poundperfootpersecond=(edtValue)*67196897.514;
			poundperfootperhour=(edtValue)*241908831050.0000000000;
			
			break;
			
		case "Megapoise -MP":
			
			pascalsecond=(edtValue)*100000;
			kilogramforcesecondpersquaremeter=(edtValue)*10197.16213;
			newtonsecondpersquaremeter=(edtValue)*100000;
			millinewtonsecondppersqmeter=(edtValue)*100000000;
			dynesecondpersqcentimeter=(edtValue)*1000000;
			poise=(edtValue)*1000000;
			exapoise=(edtValue)*1.E-12;
			petapoise=(edtValue)*1.E-9;
			terapoise=(edtValue)*0.000001;
			gigapoise=(edtValue)*0.001;
			megapoise=(edtValue)*1;
			kilopoise=(edtValue)*1000;
			hectopoise=(edtValue)*10000;
			dekapoise=(edtValue)*100000;
			decipoise=(edtValue)*10000000;
			centipoise=(edtValue)*100000000;
			millipoise=(edtValue)*1000000000;
			micropoise=(edtValue)*1000000000000.0000000000;
			nanopoise=(edtValue)*1000000000000000.0000000000;
			picopoise=(edtValue)*1000000000000000000.0000000000;
			femtopoise=(edtValue)*999999999999999900000.0000000000;
			attopoise=(edtValue)*1.E+24;
			poundforcesecondpersqinch=(edtValue)*14.503773773;
			poundforcesecondpersqfoot=(edtValue)*2088.5434233;
			poundalsecondpersquarefoot=(edtValue)*67196.897514;
			grampercentimeterpersecond=(edtValue)*1000000.0000000000;
			slugperfootpersecond=(edtValue)*2088.5434233;
			poundperfootpersecond=(edtValue)*67196.897514;
			poundperfootperhour=(edtValue)*241908831.05;
			
			break;		
			
		case "Kilopoise -kP":
			
			pascalsecond=(edtValue)*100;
			kilogramforcesecondpersquaremeter=(edtValue)*10.19716213;
			newtonsecondpersquaremeter=(edtValue)*100;
			millinewtonsecondppersqmeter=(edtValue)*100000;
			dynesecondpersqcentimeter=(edtValue)*1000;
			poise=(edtValue)*1000;
			exapoise=(edtValue)*1.E-15;
			petapoise=(edtValue)*1.E-12;
			terapoise=(edtValue)*1.E-9;
			gigapoise=(edtValue)*0.000001;
			megapoise=(edtValue)*0.001;
			kilopoise=(edtValue)*1;
			hectopoise=(edtValue)*10;
			dekapoise=(edtValue)*100;
			decipoise=(edtValue)*10000;
			centipoise=(edtValue)*100000;
			millipoise=(edtValue)*1000000;
			micropoise=(edtValue)*1000000000;
			nanopoise=(edtValue)*1000000000000.0000000000;
			picopoise=(edtValue)*1000000000000000.0000000000;
			femtopoise=(edtValue)*999999999999999900.0000000000;
			attopoise=(edtValue)*1.E+21;
			poundforcesecondpersqinch=(edtValue)*0.0145037738;
			poundforcesecondpersqfoot=(edtValue)*2.0885434233;
			poundalsecondpersquarefoot=(edtValue)*67.196897514;
			grampercentimeterpersecond=(edtValue)*1000;
			slugperfootpersecond=(edtValue)*2.0885434233;
			poundperfootpersecond=(edtValue)*67.196897514;
			poundperfootperhour=(edtValue)*241908.83105;
			
			break;		
			
			
case "Hectopoise -hP":
			
	pascalsecond=(edtValue)*10;
	kilogramforcesecondpersquaremeter=(edtValue)*1.019716213;
	newtonsecondpersquaremeter=(edtValue)*10;
	millinewtonsecondppersqmeter=(edtValue)*10000;
	dynesecondpersqcentimeter=(edtValue)*100;
	poise=(edtValue)*100;
	exapoise=(edtValue)*1.E-16;
	petapoise=(edtValue)*1.E-13;
	terapoise=(edtValue)*1.E-10;
	gigapoise=(edtValue)*1.E-7;
	megapoise=(edtValue)*0.0001;
	kilopoise=(edtValue)*0.1;
	hectopoise=(edtValue)*1;
	dekapoise=(edtValue)*10;
	decipoise=(edtValue)*1000;
	centipoise=(edtValue)*10000;
	millipoise=(edtValue)*100000;
	micropoise=(edtValue)*100000000;
	nanopoise=(edtValue)*100000000000.0000000000;
	picopoise=(edtValue)*100000000000000.0000000000;
	femtopoise=(edtValue)*99999999999999980.0000000000;
	attopoise=(edtValue)*100000000000000000000.0000000000;
	poundforcesecondpersqinch=(edtValue)*0.0014503774;
	poundforcesecondpersqfoot=(edtValue)*0.2088543423;
	poundalsecondpersquarefoot=(edtValue)*6.7196897514;
	grampercentimeterpersecond=(edtValue)*100;
	slugperfootpersecond=(edtValue)*0.2088543423;
	poundperfootpersecond=(edtValue)*6.7196897514;
	poundperfootperhour=(edtValue)*24190.883105;
			
			break;	
		case "Dekapoise -daP":
			
			pascalsecond=(edtValue)*1;
			kilogramforcesecondpersquaremeter=(edtValue)*0.1019716213;
			newtonsecondpersquaremeter=(edtValue)*1;
			millinewtonsecondppersqmeter=(edtValue)*1000;
			dynesecondpersqcentimeter=(edtValue)*10;
			poise=(edtValue)*10;
			exapoise=(edtValue)*1.E-17;
			petapoise=(edtValue)*1.E-14;
			terapoise=(edtValue)*1.E-11;
			gigapoise=(edtValue)*1.E-8;
			megapoise=(edtValue)*0.00001;
			kilopoise=(edtValue)*0.01;
			hectopoise=(edtValue)*0.1;
			dekapoise=(edtValue)*1;
			decipoise=(edtValue)*100;
			centipoise=(edtValue)*1000;
			millipoise=(edtValue)*10000;
			micropoise=(edtValue)*10000000;
			nanopoise=(edtValue)*10000000000.0;
			picopoise=(edtValue)*10000000000000.0;
			femtopoise=(edtValue)*10000000000000000.0;
			attopoise=(edtValue)*10000000000000000000.0;
			poundforcesecondpersqinch=(edtValue)*0.0001450377;
			poundforcesecondpersqfoot=(edtValue)*0.0208854342;
			poundalsecondpersquarefoot=(edtValue)*0.6719689751;
			grampercentimeterpersecond=(edtValue)*10;
			slugperfootpersecond=(edtValue)*0.0208854342;
			poundperfootpersecond=(edtValue)*0.6719689751;
			poundperfootperhour=(edtValue)*2419.0883105;
			
			break;	
		case "Decipoise -dP":
			
			pascalsecond=(edtValue)*0.01;
			kilogramforcesecondpersquaremeter=(edtValue)*0.0010197162;
			newtonsecondpersquaremeter=(edtValue)*0.01;
			millinewtonsecondppersqmeter=(edtValue)*10;
			dynesecondpersqcentimeter=(edtValue)*0.1;
			poise=(edtValue)*0.1;
			exapoise=(edtValue)*1.E-19;
			petapoise=(edtValue)*1.E-16;
			terapoise=(edtValue)*1.E-13;
			gigapoise=(edtValue)*1.E-10;
			megapoise=(edtValue)*1.E-7;
			kilopoise=(edtValue)*0.0001;
			hectopoise=(edtValue)*0.001;
			dekapoise=(edtValue)*0.01;
			decipoise=(edtValue)*1;
			centipoise=(edtValue)*10;
			millipoise=(edtValue)*100;
			micropoise=(edtValue)*100000;
			nanopoise=(edtValue)*100000000;
			picopoise=(edtValue)*100000000000.0000000000;
			femtopoise=(edtValue)*100000000000000.0000000000;
			attopoise=(edtValue)*100000000000000000.0000000000;
			poundforcesecondpersqinch=(edtValue)*0.0000014504;
			poundforcesecondpersqfoot=(edtValue)*0.0002088543;
			poundalsecondpersquarefoot=(edtValue)*0.0067196898;
			grampercentimeterpersecond=(edtValue)*0.1;
			slugperfootpersecond=(edtValue)*0.0002088543;
			poundperfootpersecond=(edtValue)*0.0067196898;
			poundperfootperhour=(edtValue)*24.190883105;
			
			break;	
		case "Centipoise -cP":
			
			pascalsecond=(edtValue)*0.001;
			kilogramforcesecondpersquaremeter=(edtValue)*0.0001019716;
			newtonsecondpersquaremeter=(edtValue)*0.001;
			millinewtonsecondppersqmeter=(edtValue)*1;
			dynesecondpersqcentimeter=(edtValue)*0.01;
			poise=(edtValue)*0.01;
			exapoise=(edtValue)*1.E-20;
			petapoise=(edtValue)*1.E-17;
			terapoise=(edtValue)*1.E-14;
			gigapoise=(edtValue)*1.E-11;
			megapoise=(edtValue)*1.E-8;
			kilopoise=(edtValue)*0.00001;
			hectopoise=(edtValue)*0.0001;
			dekapoise=(edtValue)*0.001;
			decipoise=(edtValue)*0.1;
			centipoise=(edtValue)*1;
			millipoise=(edtValue)*10;
			micropoise=(edtValue)*10000;
			nanopoise=(edtValue)*10000000;
			picopoise=(edtValue)*10000000000.0000000000;
			femtopoise=(edtValue)*10000000000000.0000000000;
			attopoise=(edtValue)*10000000000000000.0000000000;
			poundforcesecondpersqinch=(edtValue)*1.450377377E-7;
			poundforcesecondpersqfoot=(edtValue)*0.0000208854;
			poundalsecondpersquarefoot=(edtValue)*0.000671969;
			grampercentimeterpersecond=(edtValue)*0.01;
			slugperfootpersecond=(edtValue)*0.0000208854;
			poundperfootpersecond=(edtValue)*0.000671969;
			poundperfootperhour=(edtValue)*2.4190883105;
			
			break;
			
		case "Millipoise -mP":
			
			pascalsecond=(edtValue)*0.0001;
			kilogramforcesecondpersquaremeter=(edtValue)*0.0000101972;
			newtonsecondpersquaremeter=(edtValue)*0.0001;
			millinewtonsecondppersqmeter=(edtValue)*0.1;
			dynesecondpersqcentimeter=(edtValue)*0.001;
			poise=(edtValue)*0.001;
			exapoise=(edtValue)*1.E-21;
			petapoise=(edtValue)*1.E-18;
			terapoise=(edtValue)*1.E-15;
			gigapoise=(edtValue)*1.E-12;
			megapoise=(edtValue)*1.E-9;
			kilopoise=(edtValue)*0.000001;
			hectopoise=(edtValue)*0.00001;
			dekapoise=(edtValue)*0.0001;
			decipoise=(edtValue)*0.01;
			centipoise=(edtValue)*0.1;
			millipoise=(edtValue)*1;
			micropoise=(edtValue)*1000;
			nanopoise=(edtValue)*1000000;
			picopoise=(edtValue)*1000000000;
			femtopoise=(edtValue)*1000000000000.0000000000;
			attopoise=(edtValue)*1000000000000000.0000000000;
			poundforcesecondpersqinch=(edtValue)*1.450377377E-8;
			poundforcesecondpersqfoot=(edtValue)*0.0000020885;
			poundalsecondpersquarefoot=(edtValue)*0.0000671969;
			grampercentimeterpersecond=(edtValue)*0.001;
			slugperfootpersecond=(edtValue)*0.0000020885;
			poundperfootpersecond=(edtValue)*0.0000671969;
			poundperfootperhour=(edtValue)*0.2419088311;
			
			break;		
			
		case "Micropoise -μP":
			
			pascalsecond=(edtValue)*1.E-7;
			kilogramforcesecondpersquaremeter=(edtValue)*1.019716212E-8;
			newtonsecondpersquaremeter=(edtValue)*1.E-7;
			millinewtonsecondppersqmeter=(edtValue)*0.0001;
			dynesecondpersqcentimeter=(edtValue)*0.000001;
			poise=(edtValue)*0.000001;
			exapoise=(edtValue)*1.E-24;
			petapoise=(edtValue)*1.E-21;
			terapoise=(edtValue)*1.E-18;
			gigapoise=(edtValue)*1.E-15;
			megapoise=(edtValue)*1.E-12;
			kilopoise=(edtValue)*1.E-9;
			hectopoise=(edtValue)*1.E-8;
			dekapoise=(edtValue)*1.E-7;
			decipoise=(edtValue)*0.00001;
			centipoise=(edtValue)*0.0001;
			millipoise=(edtValue)*0.001;
			micropoise=(edtValue)*1;
			nanopoise=(edtValue)*1000;
			picopoise=(edtValue)*1000000;
			femtopoise=(edtValue)*1000000000;
			attopoise=(edtValue)*1000000000000.0000000000;
			poundforcesecondpersqinch=(edtValue)*1.450377377E-11;
			poundforcesecondpersqfoot=(edtValue)*2.088543423E-9;
			poundalsecondpersquarefoot=(edtValue)*6.719689751E-8;
			grampercentimeterpersecond=(edtValue)*0.000001;
			slugperfootpersecond=(edtValue)*2.088543423E-9;
			poundperfootpersecond=(edtValue)*6.719689751E-8;
			poundperfootperhour=(edtValue)*0.0002419088;
			
			break;		
	case "Nanopoise -nP":
			
		pascalsecond=(edtValue)*1.E-10;
		kilogramforcesecondpersquaremeter=(edtValue)*1.019716212E-11;
		newtonsecondpersquaremeter=(edtValue)*1.E-10;
		millinewtonsecondppersqmeter=(edtValue)*1.E-7;
		dynesecondpersqcentimeter=(edtValue)*1.E-9;
		poise=(edtValue)*1.E-9;
		exapoise=(edtValue)*1.E-27;
		petapoise=(edtValue)*1.E-24;
		terapoise=(edtValue)*1.E-21;
		gigapoise=(edtValue)*1.E-18;
		megapoise=(edtValue)*1.E-15;
		kilopoise=(edtValue)*1.E-12;
		hectopoise=(edtValue)*1.E-11;
		dekapoise=(edtValue)*1.E-10;
		decipoise=(edtValue)*1.E-8;
		centipoise=(edtValue)*1.E-7;
		millipoise=(edtValue)*0.000001;
		micropoise=(edtValue)*0.001;
		nanopoise=(edtValue)*1;
		picopoise=(edtValue)*1000;
		femtopoise=(edtValue)*1000000;
		attopoise=(edtValue)*1000000000;
		poundforcesecondpersqinch=(edtValue)*1.450377377E-14;
		poundforcesecondpersqfoot=(edtValue)*2.088543423E-12;
		poundalsecondpersquarefoot=(edtValue)*6.719689751E-11;
		grampercentimeterpersecond=(edtValue)*1.E-9;
		slugperfootpersecond=(edtValue)*2.088543423E-12;
		poundperfootpersecond=(edtValue)*6.719689751E-11;
			
			break;	
		case "Picopoise -pP":
			
			pascalsecond=(edtValue)*9.999999999E-14;
			kilogramforcesecondpersquaremeter=(edtValue)*1.019716212E-14;
			newtonsecondpersquaremeter=(edtValue)*9.999999999E-14;
			millinewtonsecondppersqmeter=(edtValue)*9.999999999E-11;
			dynesecondpersqcentimeter=(edtValue)*1.E-12;
			poise=(edtValue)*1.E-12;
			exapoise=(edtValue)*1.E-30;
			petapoise=(edtValue)*1.E-27;
			terapoise=(edtValue)*1.E-24;
			gigapoise=(edtValue)*1.E-21;
			megapoise=(edtValue)*9.999999999E-19;
			kilopoise=(edtValue)*9.999999999E-16;
			hectopoise=(edtValue)*1.E-14;
			dekapoise=(edtValue)*9.999999999E-14;
			decipoise=(edtValue)*1.E-11;
			centipoise=(edtValue)*9.999999999E-11;
			millipoise=(edtValue)*9.999999999E-10;
			micropoise=(edtValue)*0.000001;
			nanopoise=(edtValue)*0.001;
			picopoise=(edtValue)*1;
			femtopoise=(edtValue)*1000;
			attopoise=(edtValue)*1000000;
			poundforcesecondpersqinch=(edtValue)*1.450377377E-17;
			poundforcesecondpersqfoot=(edtValue)*2.088543423E-15;
			poundalsecondpersquarefoot=(edtValue)*6.719689751E-14;
			grampercentimeterpersecond=(edtValue)*1.E-12;
			slugperfootpersecond=(edtValue)*2.088543423E-15;
			poundperfootpersecond=(edtValue)*6.719689751E-14;
			poundperfootperhour=(edtValue)*2.41908831E-10;
			
			break;
			
		case "Femtopoise -fP":
			
			pascalsecond=(edtValue)*1.E-16;
			kilogramforcesecondpersquaremeter=(edtValue)*1.019716212E-17;
			newtonsecondpersquaremeter=(edtValue)*1.E-16;
			millinewtonsecondppersqmeter=(edtValue)*1.E-13;
			dynesecondpersqcentimeter=(edtValue)*1.E-15;
			poise=(edtValue)*1.E-15;
			exapoise=(edtValue)*1.E-33;
			petapoise=(edtValue)*1.E-30;
			terapoise=(edtValue)*1.E-27;
			gigapoise=(edtValue)*1.E-24;
			megapoise=(edtValue)*1.E-21;
			kilopoise=(edtValue)*1.E-18;
			hectopoise=(edtValue)*1.E-17;
			dekapoise=(edtValue)*1.E-16;
			decipoise=(edtValue)*1.E-16;
			centipoise=(edtValue)*1.E-13;
			millipoise=(edtValue)*1.E-12;
			micropoise=(edtValue)*1.E-9;
			nanopoise=(edtValue)*0.000001;
			picopoise=(edtValue)*0.001;
			femtopoise=(edtValue)*1;
			attopoise=(edtValue)*1000;
			poundforcesecondpersqinch=(edtValue)*1.450377377E-20;
			poundforcesecondpersqfoot=(edtValue)*2.088543423E-18;
			poundalsecondpersquarefoot=(edtValue)*6.719689751E-17;
			grampercentimeterpersecond=(edtValue)*1.E-15;
			slugperfootpersecond=(edtValue)*2.088543423E-18;
			poundperfootpersecond=(edtValue)*6.719689751E-17;
			poundperfootperhour=(edtValue)*2.41908831E-13;
			
			break;		
			
		case "Attopoise -aP":
			
			pascalsecond=(edtValue)*1.E-19;
			kilogramforcesecondpersquaremeter=(edtValue)*1.019716212E-20;
			newtonsecondpersquaremeter=(edtValue)*1.E-19;
			millinewtonsecondppersqmeter=(edtValue)*1.E-16;
			dynesecondpersqcentimeter=(edtValue)*9.999999999E-19;
			poise=(edtValue)*9.999999999E-19;
			exapoise=(edtValue)*1.E-36;
			petapoise=(edtValue)*1.E-33;
			terapoise=(edtValue)*9.999999999E-31;
			gigapoise=(edtValue)*9.999999999E-28;
			megapoise=(edtValue)*1.E-24;
			kilopoise=(edtValue)*1.E-21;
			hectopoise=(edtValue)*1.E-20;
			dekapoise=(edtValue)*1.E-19;
			decipoise=(edtValue)*9.999999999E-18;
			centipoise=(edtValue)*1.E-16;
			millipoise=(edtValue)*9.999999999E-16;
			micropoise=(edtValue)*1.E-12;
			nanopoise=(edtValue)*9.999999999E-10;
			picopoise=(edtValue)*0.000001;
			femtopoise=(edtValue)*0.001;
			attopoise=(edtValue)*1;
			poundforcesecondpersqinch=(edtValue)*1.450377377E-23;
			poundforcesecondpersqfoot=(edtValue)*2.088543423E-21;
			poundalsecondpersquarefoot=(edtValue)*6.719689751E-20;
			grampercentimeterpersecond=(edtValue)*9.999999999E-19;
			slugperfootpersecond=(edtValue)*2.088543423E-21;
			poundperfootpersecond=(edtValue)*6.719689751E-20;
			poundperfootperhour=(edtValue)*2.41908831E-16;
			
			break;	
			
			
			
		case "Pound-force second/sq. inch -lb-Ns/in^2":
			
			pascalsecond=(edtValue)*6894.7572932;
			kilogramforcesecondpersquaremeter=(edtValue)*703.06957964;
			newtonsecondpersquaremeter=(edtValue)*6894.7572932;
			millinewtonsecondppersqmeter=(edtValue)*6894757.2932;
			dynesecondpersqcentimeter=(edtValue)*68947.572932;
			poise=(edtValue)*68947.572932;
			exapoise=(edtValue)*6.894757293E-14;
			petapoise=(edtValue)*6.894757293E-11;
			terapoise=(edtValue)*6.894757293E-8;
			gigapoise=(edtValue)*0.0000689476;
			megapoise=(edtValue)*0.0689475729;
			kilopoise=(edtValue)*68.947572932;
			hectopoise=(edtValue)*689.47572932;
			dekapoise=(edtValue)*6894.7572932;
			decipoise=(edtValue)*689475.72932;
			centipoise=(edtValue)*6894757.2932;
			millipoise=(edtValue)*68947572.932;
			micropoise=(edtValue)*68947572932.0000000000;
			nanopoise=(edtValue)*68947572931683.0000000000;
			picopoise=(edtValue)*68947572931683250.0000000000;
			femtopoise=(edtValue)*68947572931683240000.0000000000;
			attopoise=(edtValue)*6.894757293E+22;
			poundforcesecondpersqinch=(edtValue)*1;
			poundforcesecondpersqfoot=(edtValue)*144;
			poundalsecondpersquarefoot=(edtValue)*4633.0629921;
			grampercentimeterpersecond=(edtValue)*68947.572932;
			slugperfootpersecond=(edtValue)*144;
			poundperfootpersecond=(edtValue)*4633.0629921;
			poundperfootperhour=(edtValue)*16679026.772;
			
			break;
			
		case "Pound-force second/sq. foot -lb-Ns/ft^2":
			
			pascalsecond=(edtValue)*47.88025898;
			kilogramforcesecondpersquaremeter=(edtValue)*4.8824276364;
			newtonsecondpersquaremeter=(edtValue)*47.88025898;
			millinewtonsecondppersqmeter=(edtValue)*47880.25898;
			dynesecondpersqcentimeter=(edtValue)*478.8025898;
			poise=(edtValue)*478.8025898;
			exapoise=(edtValue)*4.788025898E-16;
			petapoise=(edtValue)*4.788025898E-13;
			terapoise=(edtValue)*4.788025898E-10;
			gigapoise=(edtValue)*4.788025898E-7;
			megapoise=(edtValue)*0.0004788026;
			kilopoise=(edtValue)*0.4788025898;
			hectopoise=(edtValue)*4.788025898;
			dekapoise=(edtValue)*47.88025898;
			decipoise=(edtValue)*4788.025898;
			centipoise=(edtValue)*47880.25898;
			millipoise=(edtValue)*478802.5898;
			micropoise=(edtValue)*478802589.8;
			nanopoise=(edtValue)*478802589802.0;
			picopoise=(edtValue)*478802589802215.0;
			femtopoise=(edtValue)*478802589802215040.0;
			attopoise=(edtValue)*478802589802215100000.0;
			poundforcesecondpersqinch=(edtValue)*0.0069444444;
			poundforcesecondpersqfoot=(edtValue)*1;
			poundalsecondpersquarefoot=(edtValue)*32.174048556;
			grampercentimeterpersecond=(edtValue)*478.8025898;
			slugperfootpersecond=(edtValue)*1;
			poundperfootpersecond=(edtValue)*32.174048556;
			poundperfootperhour=(edtValue)*115826.5748;
			
			break;		
			
		case "Poundal second/square foot -lbs/ft^2":
			
			pascalsecond=(edtValue)*1.4881639436;
			kilogramforcesecondpersquaremeter=(edtValue)*0.1517504901;
			newtonsecondpersquaremeter=(edtValue)*1.4881639436;
			millinewtonsecondppersqmeter=(edtValue)*1488.1639436;
			dynesecondpersqcentimeter=(edtValue)*14.881639436;
			poise=(edtValue)*14.881639436;
			exapoise=(edtValue)*1.488163943E-17;
			petapoise=(edtValue)*1.488163943E-14;
			terapoise=(edtValue)*1.488163943E-11;
			gigapoise=(edtValue)*1.488163943E-8;
			megapoise=(edtValue)*0.0000148816;
			kilopoise=(edtValue)*0.0148816394;
			hectopoise=(edtValue)*0.1488163944;
			dekapoise=(edtValue)*1.4881639436;
			decipoise=(edtValue)*148.81639436;
			centipoise=(edtValue)*1488.1639436;
			millipoise=(edtValue)*14881.639436;
			micropoise=(edtValue)*14881639.436;
			nanopoise=(edtValue)*14881639436.0;
			picopoise=(edtValue)*14881639435685.0;
			femtopoise=(edtValue)*14881639435684616.0;
			attopoise=(edtValue)*14881639435684618000.0;
			poundforcesecondpersqinch=(edtValue)*0.0002158399;
			poundforcesecondpersqfoot=(edtValue)*0.0310809502;
			poundalsecondpersquarefoot=(edtValue)*1;
			grampercentimeterpersecond=(edtValue)*14.881639436;
			slugperfootpersecond=(edtValue)*0.0310809502;
			poundperfootpersecond=(edtValue)*1;
			poundperfootperhour=(edtValue)*3600;
			
			break;		
	case "Gram/centimeter/second -g/(cm*s)":
			
		pascalsecond=(edtValue)*0.1;
		kilogramforcesecondpersquaremeter=(edtValue)*0.0101971621;
		newtonsecondpersquaremeter=(edtValue)*0.1;
		millinewtonsecondppersqmeter=(edtValue)*100;
		dynesecondpersqcentimeter=(edtValue)*1;
		poise=(edtValue)*1;
		exapoise=(edtValue)*1.E-18;
		petapoise=(edtValue)*1.E-15;
		terapoise=(edtValue)*1.E-12;
		gigapoise=(edtValue)*1.E-9;
		megapoise=(edtValue)*0.000001;
		kilopoise=(edtValue)*0.001;
		hectopoise=(edtValue)*0.01;
		dekapoise=(edtValue)*0.1;
		decipoise=(edtValue)*10;
		centipoise=(edtValue)*100;
		millipoise=(edtValue)*1000;
		micropoise=(edtValue)*1000000;
		nanopoise=(edtValue)*1000000000;
		picopoise=(edtValue)*1000000000000.0;
		femtopoise=(edtValue)*1000000000000000.0;
		attopoise=(edtValue)*1000000000000000000.0;
		poundforcesecondpersqinch=(edtValue)*0.0000145038;
		poundforcesecondpersqfoot=(edtValue)*0.0020885434;
		poundalsecondpersquarefoot=(edtValue)*0.0671968975;
		grampercentimeterpersecond=(edtValue)*1;
		slugperfootpersecond=(edtValue)*0.0020885434;
		poundperfootpersecond=(edtValue)*0.0671968975;
		poundperfootperhour=(edtValue)*241.90883105;
			
			break;	
		case "Slug/foot/second -slug/(ft*s)":
			
			pascalsecond=(edtValue)*47.88025898;
			kilogramforcesecondpersquaremeter=(edtValue)*4.8824276364;
			newtonsecondpersquaremeter=(edtValue)*47.88025898;
			millinewtonsecondppersqmeter=(edtValue)*47880.25898;
			dynesecondpersqcentimeter=(edtValue)*478.8025898;
			poise=(edtValue)*478.8025898;
			exapoise=(edtValue)*4.788025898E-16;
			petapoise=(edtValue)*4.788025898E-13;
			terapoise=(edtValue)*4.788025898E-10;
			gigapoise=(edtValue)*4.788025898E-7;
			megapoise=(edtValue)*0.0004788026;
			kilopoise=(edtValue)*0.4788025898;
			hectopoise=(edtValue)*4.788025898;
			dekapoise=(edtValue)*47.88025898;
			decipoise=(edtValue)*4788.025898;
			centipoise=(edtValue)*47880.25898;
			millipoise=(edtValue)*478802.5898;
			micropoise=(edtValue)*478802589.8;
			nanopoise=(edtValue)*478802589802.0;
			picopoise=(edtValue)*478802589802215.0;
			femtopoise=(edtValue)*478802589802215040.0;
			attopoise=(edtValue)*478802589802215100000.0;
			poundforcesecondpersqinch=(edtValue)*0.0069444444;
			poundforcesecondpersqfoot=(edtValue)*1;
			poundalsecondpersquarefoot=(edtValue)*32.174048556;
			grampercentimeterpersecond=(edtValue)*478.8025898;
			slugperfootpersecond=(edtValue)*1;
			poundperfootpersecond=(edtValue)*32.174048556;
			poundperfootperhour=(edtValue)*115826.5748;
			
			break;
			
		case "Pound/foot/second -lb/(ft*s)":
			
			pascalsecond=(edtValue)*1.4881639436;
			kilogramforcesecondpersquaremeter=(edtValue)*0.1517504901;
			newtonsecondpersquaremeter=(edtValue)*1.4881639436;
			millinewtonsecondppersqmeter=(edtValue)*1488.1639436;
			dynesecondpersqcentimeter=(edtValue)*14.881639436;
			poise=(edtValue)*14.881639436;
			exapoise=(edtValue)*1.488163943E-17;
			petapoise=(edtValue)*1.488163943E-14;
			terapoise=(edtValue)*1.488163943E-11;
			gigapoise=(edtValue)*1.488163943E-8;
			megapoise=(edtValue)*0.0000148816;
			kilopoise=(edtValue)*0.0148816394;
			hectopoise=(edtValue)*0.1488163944;
			dekapoise=(edtValue)*1.4881639436;
			decipoise=(edtValue)*148.81639436;
			centipoise=(edtValue)*1488.1639436;
			millipoise=(edtValue)*14881.639436;
			micropoise=(edtValue)*14881639.436;
			nanopoise=(edtValue)*14881639436.0;
			picopoise=(edtValue)*14881639435685.0;
			femtopoise=(edtValue)*14881639435684616.0;
			attopoise=(edtValue)*14881639435684618000.0;
			poundforcesecondpersqinch=(edtValue)*0.0002158399;
			poundforcesecondpersqfoot=(edtValue)*0.0310809502;
			poundalsecondpersquarefoot=(edtValue)*1;
			grampercentimeterpersecond=(edtValue)*14.881639436;
			slugperfootpersecond=(edtValue)*0.0310809502;
			poundperfootpersecond=(edtValue)*1;
			poundperfootperhour=(edtValue)*3600;
			
			break;		
			
		case "Pound/foot/hour -lb/(ft*h)":
			
			pascalsecond=(edtValue)*0.0004133789;
			kilogramforcesecondpersquaremeter=(edtValue)*0.0000421529;
			newtonsecondpersquaremeter=(edtValue)*0.0004133789;
			millinewtonsecondppersqmeter=(edtValue)*0.4133788732;
			dynesecondpersqcentimeter=(edtValue)*0.0041337887;
			poise=(edtValue)*0.0041337887;
			exapoise=(edtValue)*4.133788732E-21;
			petapoise=(edtValue)*4.133788732E-18;
			terapoise=(edtValue)*4.133788732E-15;
			gigapoise=(edtValue)*4.133788732E-12;
			megapoise=(edtValue)*4.133788732E-9;
			kilopoise=(edtValue)*0.0000041338;
			hectopoise=(edtValue)*0.0000413379;
			dekapoise=(edtValue)*0.0004133789;
			decipoise=(edtValue)*0.0413378873;
			centipoise=(edtValue)*0.4133788732;
			millipoise=(edtValue)*4.1337887321;
			micropoise=(edtValue)*4133.7887321;
			nanopoise=(edtValue)*4133788.7321;
			picopoise=(edtValue)*4133788732.1;
			femtopoise=(edtValue)*4133788732138.0;
			attopoise=(edtValue)*4133788732137692.0;
			poundforcesecondpersqinch=(edtValue)*5.995553659E-8;
			poundforcesecondpersqfoot=(edtValue)*0.0000086336;
			poundalsecondpersquarefoot=(edtValue)*0.0002777778;
			grampercentimeterpersecond=(edtValue)*0.0041337887;
			slugperfootpersecond=(edtValue)*0.0000086336;
			poundperfootpersecond=(edtValue)*0.0002777778;
			poundperfootperhour=(edtValue)*1;
            break;
		case "Default":
			break;
			
		}
		 results.setPascalsecond(pascalsecond);
		 results.setKilogramforcesecondpersquaremeter(kilogramforcesecondpersquaremeter);
		 results.setNewtonsecondpersquaremeter(newtonsecondpersquaremeter);
		 results.setMillinewtonsecondppersqmeter(millinewtonsecondppersqmeter);
		 results.setDynesecondpersqcentimeter(dynesecondpersqcentimeter);
		 results.setPoise(poise);
		 results.setExapoise(exapoise);
		 results.setPetapoise(petapoise);
		 results.setTerapoise(terapoise);
		 results.setGigapoise(gigapoise);
		 results.setMegapoise(megapoise);
		 results.setKilopoise(kilopoise);
		 results.setHectopoise(hectopoise);
		 results.setDekapoise(dekapoise);
		 results.setDecipoise(decipoise);
		 results.setCentipoise(centipoise);
		 results.setMillipoise(millipoise);
		 results.setMicropoise(micropoise);
		 results.setNanopoise(nanopoise);
		 results.setPicopoise(picopoise);
		 results.setFemtopoise(femtopoise);
		 results.setAttopoise(attopoise);
		 results.setPoundforcesecondpersqinch(poundforcesecondpersqinch);
		 results.setPoundforcesecondpersqfoot(poundforcesecondpersqfoot);
		 results.setPoundalsecondpersquarefoot(poundalsecondpersquarefoot);
		 results.setGrampercentimeterpersecond(grampercentimeterpersecond);
		 results.setSlugperfootpersecond(slugperfootpersecond);
		 results.setPoundperfootpersecond(poundperfootpersecond);
		 results.setPoundperfootperhour(poundperfootperhour);
		 
		 converterArray.add(results);
		return converterArray;
}

public 	class ConversionResults{
		private double pascalsecond,kilogramforcesecondpersquaremeter,newtonsecondpersquaremeter,millinewtonsecondppersqmeter,dynesecondpersqcentimeter,poise,exapoise,petapoise
		,terapoise,gigapoise,megapoise,kilopoise,hectopoise,dekapoise,decipoise,centipoise,millipoise,micropoise,nanopoise,picopoise,femtopoise,attopoise,poundforcesecondpersqinch
		,poundforcesecondpersqfoot,poundalsecondpersquarefoot,grampercentimeterpersecond,slugperfootpersecond,poundperfootpersecond,poundperfootperhour;

		public double getPascalsecond() {
			return pascalsecond;
		}

		public void setPascalsecond(double pascalsecond) {
			this.pascalsecond = pascalsecond;
		}

		public double getKilogramforcesecondpersquaremeter() {
			return kilogramforcesecondpersquaremeter;
		}

		public void setKilogramforcesecondpersquaremeter(
				double kilogramforcesecondpersquaremeter) {
			this.kilogramforcesecondpersquaremeter = kilogramforcesecondpersquaremeter;
		}

		public double getNewtonsecondpersquaremeter() {
			return newtonsecondpersquaremeter;
		}

		public void setNewtonsecondpersquaremeter(double newtonsecondpersquaremeter) {
			this.newtonsecondpersquaremeter = newtonsecondpersquaremeter;
		}

		public double getMillinewtonsecondppersqmeter() {
			return millinewtonsecondppersqmeter;
		}

		public void setMillinewtonsecondppersqmeter(double millinewtonsecondppersqmeter) {
			this.millinewtonsecondppersqmeter = millinewtonsecondppersqmeter;
		}

		public double getDynesecondpersqcentimeter() {
			return dynesecondpersqcentimeter;
		}

		public void setDynesecondpersqcentimeter(double dynesecondpersqcentimeter) {
			this.dynesecondpersqcentimeter = dynesecondpersqcentimeter;
		}

		public double getPoise() {
			return poise;
		}

		public void setPoise(double poise) {
			this.poise = poise;
		}

		public double getExapoise() {
			return exapoise;
		}

		public void setExapoise(double exapoise) {
			this.exapoise = exapoise;
		}

		public double getPetapoise() {
			return petapoise;
		}

		public void setPetapoise(double petapoise) {
			this.petapoise = petapoise;
		}

		public double getTerapoise() {
			return terapoise;
		}

		public void setTerapoise(double terapoise) {
			this.terapoise = terapoise;
		}

		public double getGigapoise() {
			return gigapoise;
		}

		public void setGigapoise(double gigapoise) {
			this.gigapoise = gigapoise;
		}

		public double getMegapoise() {
			return megapoise;
		}

		public void setMegapoise(double megapoise) {
			this.megapoise = megapoise;
		}

		public double getKilopoise() {
			return kilopoise;
		}

		public void setKilopoise(double kilopoise) {
			this.kilopoise = kilopoise;
		}

		public double getHectopoise() {
			return hectopoise;
		}

		public void setHectopoise(double hectopoise) {
			this.hectopoise = hectopoise;
		}

		public double getDekapoise() {
			return dekapoise;
		}

		public void setDekapoise(double dekapoise) {
			this.dekapoise = dekapoise;
		}

		public double getDecipoise() {
			return decipoise;
		}

		public void setDecipoise(double decipoise) {
			this.decipoise = decipoise;
		}

		public double getCentipoise() {
			return centipoise;
		}

		public void setCentipoise(double centipoise) {
			this.centipoise = centipoise;
		}

		public double getMillipoise() {
			return millipoise;
		}

		public void setMillipoise(double millipoise) {
			this.millipoise = millipoise;
		}

		public double getMicropoise() {
			return micropoise;
		}

		public void setMicropoise(double micropoise) {
			this.micropoise = micropoise;
		}

		public double getNanopoise() {
			return nanopoise;
		}

		public void setNanopoise(double nanopoise) {
			this.nanopoise = nanopoise;
		}

		public double getPicopoise() {
			return picopoise;
		}

		public void setPicopoise(double picopoise) {
			this.picopoise = picopoise;
		}

		public double getFemtopoise() {
			return femtopoise;
		}

		public void setFemtopoise(double femtopoise) {
			this.femtopoise = femtopoise;
		}

		public double getAttopoise() {
			return attopoise;
		}

		public void setAttopoise(double attopoise) {
			this.attopoise = attopoise;
		}

		public double getPoundforcesecondpersqinch() {
			return poundforcesecondpersqinch;
		}

		public void setPoundforcesecondpersqinch(double poundforcesecondpersqinch) {
			this.poundforcesecondpersqinch = poundforcesecondpersqinch;
		}

		public double getPoundforcesecondpersqfoot() {
			return poundforcesecondpersqfoot;
		}

		public void setPoundforcesecondpersqfoot(double poundforcesecondpersqfoot) {
			this.poundforcesecondpersqfoot = poundforcesecondpersqfoot;
		}

		public double getPoundalsecondpersquarefoot() {
			return poundalsecondpersquarefoot;
		}

		public void setPoundalsecondpersquarefoot(double poundalsecondpersquarefoot) {
			this.poundalsecondpersquarefoot = poundalsecondpersquarefoot;
		}

		public double getGrampercentimeterpersecond() {
			return grampercentimeterpersecond;
		}

		public void setGrampercentimeterpersecond(double grampercentimeterpersecond) {
			this.grampercentimeterpersecond = grampercentimeterpersecond;
		}

		public double getSlugperfootpersecond() {
			return slugperfootpersecond;
		}

		public void setSlugperfootpersecond(double slugperfootpersecond) {
			this.slugperfootpersecond = slugperfootpersecond;
		}

		public double getPoundperfootpersecond() {
			return poundperfootpersecond;
		}

		public void setPoundperfootpersecond(double poundperfootpersecond) {
			this.poundperfootpersecond = poundperfootpersecond;
		}

		public double getPoundperfootperhour() {
			return poundperfootperhour;
		}

		public void setPoundperfootperhour(double poundperfootperhour) {
			this.poundperfootperhour = poundperfootperhour;
		}
		
	}
}