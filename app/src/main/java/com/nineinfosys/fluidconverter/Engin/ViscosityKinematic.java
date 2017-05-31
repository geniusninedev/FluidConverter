package com.nineinfosys.fluidconverter.Engin;

import java.util.ArrayList;

public class ViscosityKinematic {
	
	private double   squaremeterpersecond,  squaremeterperhour, squarecentimeterpersecond , squaremillimetersecond, squarefootsecond , squarefoothour ,  squareinchsecond ,stokes  ,exastokes ,petastokes ,terastokes ,gigastokes , megastokes ,kilostokes , hectostokes ,dekastokes ,decistokes,centistokes ,millistokes ,microstokes,nanostokes, picostokes ,femtostokes , attostokes   ;
	private String conversionFrom;
	private double edtValue;
	
			
			public ViscosityKinematic(String conversionFrom, double edtValue) {
				// TODO Auto-generated constructor stub
				this.conversionFrom = conversionFrom;
				this.edtValue = edtValue;
			}

			public ArrayList<ConversionResults> calculateViscosityKinematicConversion()
		    {
		    	
				ArrayList<ConversionResults> converterArray = new ArrayList<ConversionResults>();
					
				ConversionResults results= new ConversionResults();
		    		 	
				switch(conversionFrom)
				{
				case "Square meter/second -m^2/s":
					
					squaremeterpersecond=(edtValue)*1;
					squaremeterperhour=(edtValue)*3600;
					squarecentimeterpersecond=(edtValue)*10000;
					squaremillimetersecond=(edtValue)*1000000;
					squarefootsecond=(edtValue)*10.763910417;
					
					squarefoothour=(edtValue)*38750.0775;
					squareinchsecond=(edtValue)*1550.0031;
					stokes=(edtValue)*10000;
					exastokes=(edtValue)*1.E-14;
					petastokes=(edtValue)*1.E-11;
					
					terastokes=(edtValue)*1.E-8;
					gigastokes=(edtValue)*0.00001;
					megastokes=(edtValue)*0.01;
					kilostokes=(edtValue)*10;
					hectostokes=(edtValue)*100;
					dekastokes=(edtValue)*1000;
					decistokes=(edtValue)*100000;
					
					centistokes=(edtValue)*1000000;
					millistokes=(edtValue)*10000000;
					microstokes=(edtValue)*10000000000.0;
					nanostokes=(edtValue)*10000000000000.0;
					
					picostokes=(edtValue)*10000000000000000.0;
					femtostokes=(edtValue)*10000000000000000000.0;
					attostokes=(edtValue)*1.E+22;
					
					break;
					
					
					
case "Square meter/hour -m^2/h":
					
					squaremeterpersecond=(edtValue)*0.0002777778;
					squaremeterperhour=(edtValue)*1;
					squarecentimeterpersecond=(edtValue)*2.7777777778;
					squaremillimetersecond=(edtValue)*277.77777778;
					squarefootsecond=(edtValue)*0.0029899751;
					
					squarefoothour=(edtValue)*10.763910417;
					squareinchsecond=(edtValue)*0.4305564167;
					stokes=(edtValue)*2.7777777778;
					exastokes=(edtValue)*2.777777777E-18;
					petastokes=(edtValue)*2.777777777E-15;
					
					terastokes=(edtValue)*2.777777777E-12;
					gigastokes=(edtValue)*2.777777777E-9;
					megastokes=(edtValue)*0.0000027778;
					kilostokes=(edtValue)*0.0027777778;
					hectostokes=(edtValue)*0.0277777778;
					dekastokes=(edtValue)*0.2777777778;
					decistokes=(edtValue)*27.777777778;
					
					centistokes=(edtValue)*277.77777778;
					millistokes=(edtValue)*2777.7777778;
					microstokes=(edtValue)*2777777.7778;
					nanostokes=(edtValue)*2777777777.8;
					
					picostokes=(edtValue)*2777777777778.0;
					femtostokes=(edtValue)*2777777777777778.0;
					attostokes=(edtValue)*2777777777777777700.0;
					
					break;
					
					
					
case "Square centimeter/second -cm^2/s":
	
	squaremeterpersecond=(edtValue)*0.0001;
	squaremeterperhour=(edtValue)*0.36;
	squarecentimeterpersecond=(edtValue)*1;
	squaremillimetersecond=(edtValue)*100;
	squarefootsecond=(edtValue)*0.001076391;
	
	squarefoothour=(edtValue)*3.87500775;
	squareinchsecond=(edtValue)*0.15500031;
	stokes=(edtValue)*1;
	exastokes=(edtValue)*18;
	petastokes=(edtValue)*15;
	
	terastokes=(edtValue)*12;
	gigastokes=(edtValue)*1.E-9;
	megastokes=(edtValue)*0.000001;
	kilostokes=(edtValue)*0.001;
	hectostokes=(edtValue)*0.01;
	dekastokes=(edtValue)*0.1;
	decistokes=(edtValue)*10;
	
	centistokes=(edtValue)*100;
	millistokes=(edtValue)*1000;
	microstokes=(edtValue)*1000000;
	nanostokes=(edtValue)*1000000000.0;
	
	picostokes=(edtValue)*1000000000000.0;
	femtostokes=(edtValue)*1000000000000000.0;
	attostokes=(edtValue)*1000000000000000000.0;
	
	break;
	
	
	
	
	
	
case "Square millimeter/second -mm^2/s":
	
	squaremeterpersecond=(edtValue)*0.000001;
	squaremeterperhour=(edtValue)*0.0036;
	squarecentimeterpersecond=(edtValue)*0.01;
	squaremillimetersecond=(edtValue)*1;
	squarefootsecond=(edtValue)*0.0000107639;
	
	squarefoothour=(edtValue)*0.0387500775;
	squareinchsecond=(edtValue)*0.0015500031;
	stokes=(edtValue)*0.01;
	exastokes=(edtValue)*1.E-20;
	petastokes=(edtValue)*1.E-17;
	
	terastokes=(edtValue)*1.E-14;
	gigastokes=(edtValue)*1.E-11;
	megastokes=(edtValue)*1.E-8;
	kilostokes=(edtValue)*0.00001;
	hectostokes=(edtValue)*0.0001;
	dekastokes=(edtValue)*0.001;
	decistokes=(edtValue)*0.1;
	
	centistokes=(edtValue)*1;
	millistokes=(edtValue)*10;
	microstokes=(edtValue)*10000;
	nanostokes=(edtValue)*10000000;
	
	picostokes=(edtValue)*10000000000.0;
	femtostokes=(edtValue)*10000000000000.0;
	attostokes=(edtValue)*10000000000000.0;
	
	break;
	
	
	
case "Square foot/second -ft^2/s":
	
	squaremeterpersecond=(edtValue)*0.09290304;
	squaremeterperhour=(edtValue)*334.450944;
	squarecentimeterpersecond=(edtValue)*929.0304;
	squaremillimetersecond=(edtValue)*92903.04;
	squarefootsecond=(edtValue)*1;
	
	squarefoothour=(edtValue)*3600;
	squareinchsecond=(edtValue)*144;
	stokes=(edtValue)*929.0304;
	exastokes=(edtValue)*9.290304E-16;
	petastokes=(edtValue)*9.290304E-13;
	
	terastokes=(edtValue)*9.290304E-10;
	gigastokes=(edtValue)*9.290304E-7;
	megastokes=(edtValue)*0.0009290304;
	kilostokes=(edtValue)*0.9290304;
	hectostokes=(edtValue)*9.290304;
	dekastokes=(edtValue)*92.90304;
	decistokes=(edtValue)*9290.304;
	
	centistokes=(edtValue)*92903.04;
	millistokes=(edtValue)*929030.4;
	microstokes=(edtValue)*929030400;
	nanostokes=(edtValue)*929030400001.0;
	
	picostokes=(edtValue)*929030400000839.0;
	femtostokes=(edtValue)*929030400000839000.0;
	attostokes=(edtValue)*929030400000839100000.0;
	
	break;
	
	
	
case "Square foot/hour -ft^2/h":
	
	squaremeterpersecond=(edtValue)*0.0000258064;
	squaremeterperhour=(edtValue)*0.09290304;
	squarecentimeterpersecond=(edtValue)*0.258064;
	squaremillimetersecond=(edtValue)*25.8064;
	squarefootsecond=(edtValue)*0.0002777778;
	
	squarefoothour=(edtValue)*1;
	squareinchsecond=(edtValue)*0.04;
	stokes=(edtValue)*0.258064;
	exastokes=(edtValue)*2.58064E-19;
	petastokes=(edtValue)*2.58064E-16;
	
	terastokes=(edtValue)*2.58064E-13;
	gigastokes=(edtValue)*2.58064E-10;
	megastokes=(edtValue)*2.58064E-7;
	kilostokes=(edtValue)*0.000258064;
	hectostokes=(edtValue)*0.00258064;
	dekastokes=(edtValue)*0.0258064;
	decistokes=(edtValue)*2.58064;
	
	centistokes=(edtValue)*25.8064;
	millistokes=(edtValue)*258.064;
	microstokes=(edtValue)*258064;
	nanostokes=(edtValue)*258064000;
	
	picostokes=(edtValue)*258064000000.0;
	femtostokes=(edtValue)*258064000000000.0;
	attostokes=(edtValue)*258064000000000030.0;
	
	break;
	
	
case "Square inch/second -in^2/s":
	
	squaremeterpersecond=(edtValue)*0.00064516;
	squaremeterperhour=(edtValue)*2.322576;
	squarecentimeterpersecond=(edtValue)*6.4516;
	squaremillimetersecond=(edtValue)*645.16;
	squarefootsecond=(edtValue)*0.0069444444;
	
	squarefoothour=(edtValue)*25;
	squareinchsecond=(edtValue)*1;
	stokes=(edtValue)*6.4516;
	exastokes=(edtValue)*6.4516E-18;
	petastokes=(edtValue)*6.4516E-15;
	
	terastokes=(edtValue)*6.4516E-12;
	gigastokes=(edtValue)*6.4516E-9;
	megastokes=(edtValue)*0.0000064516;
	kilostokes=(edtValue)*0.0064516;
	hectostokes=(edtValue)*0.064516;
	dekastokes=(edtValue)*0.64516;
	decistokes=(edtValue)*64.516;
	
	centistokes=(edtValue)*645.16;
	millistokes=(edtValue)*6451.6;
	microstokes=(edtValue)*6451600;
	nanostokes=(edtValue)*6451600000.0;
	
	picostokes=(edtValue)*6451600000000.0;
	femtostokes=(edtValue)*6451600000000000.0;
	attostokes=(edtValue)*6451600000000000000.0;
	
	break;
	
	
case "Stokes -St":
	
	squaremeterpersecond=(edtValue)*0.0001;
	squaremeterperhour=(edtValue)*0.36;
	squarecentimeterpersecond=(edtValue)*1;
	squaremillimetersecond=(edtValue)*100;
	squarefootsecond=(edtValue)*0.001076391;
	
	squarefoothour=(edtValue)*3.87500775;
	squareinchsecond=(edtValue)*0.15500031;
	stokes=(edtValue)*1;
	exastokes=(edtValue)*1.E-18;
	petastokes=(edtValue)*1.E-15;
	
	terastokes=(edtValue)*1.E-12;
	gigastokes=(edtValue)*1.E-9;
	megastokes=(edtValue)*0.000001;
	kilostokes=(edtValue)*0.001;
	hectostokes=(edtValue)*0.01;
	dekastokes=(edtValue)*0.1;
	decistokes=(edtValue)*10;
	
	centistokes=(edtValue)*100;
	millistokes=(edtValue)*1000;
	microstokes=(edtValue)*1000000;
	nanostokes=(edtValue)*1000000000;
	
	picostokes=(edtValue)*1000000000000.0;
	femtostokes=(edtValue)*1000000000000000.0;
	attostokes=(edtValue)*1000000000000000000.0;
	
	break;
	
case "Exastokes -ESt":
	
	squaremeterpersecond=(edtValue)*100000000000000.0;
	squaremeterperhour=(edtValue)*360000000000000000.0;
	squarecentimeterpersecond=(edtValue)*1000000000000000000.0;
	squaremillimetersecond=(edtValue)*100000000000000000000.0;
	squarefootsecond=(edtValue)*1076391041670000.0;
	
	squarefoothour=(edtValue)*3875007750015500000.0;
	squareinchsecond=(edtValue)*155000310000620000.0;
	stokes=(edtValue)*1000000000000000000.0;
	exastokes=(edtValue)*1;
	petastokes=(edtValue)*1000;
	
	terastokes=(edtValue)*1000000;
	gigastokes=(edtValue)*1000000000;
	megastokes=(edtValue)*1000000000000.0;
	kilostokes=(edtValue)*1000000000000000.0;
	hectostokes=(edtValue)*10000000000000000.0;
	dekastokes=(edtValue)*100000000000000000.0;
	decistokes=(edtValue)*10000000000000000000.0;
	
	centistokes=(edtValue)*100000000000000000000.0;
	millistokes=(edtValue)*1.E+21;
	microstokes=(edtValue)*1.E+24;
	nanostokes=(edtValue)*1.E+27;
	
	picostokes=(edtValue)*1.E+30;
	femtostokes=(edtValue)*1.E+33;
	attostokes=(edtValue)*1.E+36;
	
	break;
	
case "Petastokes -PSt":
	
	squaremeterpersecond=(edtValue)*100000000000.0;
	squaremeterperhour=(edtValue)*360000000000000.0;
	squarecentimeterpersecond=(edtValue)*1000000000000000.0;
	squaremillimetersecond=(edtValue)*100000000000000000.0;
	squarefootsecond=(edtValue)*1076391041670.0;
	
	squarefoothour=(edtValue)*3875007750015500.0;
	squareinchsecond=(edtValue)*155000310000620.0;
	stokes=(edtValue)*1000000000000000.0;
	exastokes=(edtValue)*0.001;
	petastokes=(edtValue)*1;
	
	terastokes=(edtValue)*1000;
	gigastokes=(edtValue)*1000000;
	megastokes=(edtValue)*1000000000;
	kilostokes=(edtValue)*1000000000000.0;
	hectostokes=(edtValue)*10000000000000.0;
	dekastokes=(edtValue)*100000000000000.0;
	decistokes=(edtValue)*10000000000000000.0;
	
	centistokes=(edtValue)*100000000000000000.0;
	millistokes=(edtValue)*1000000000000000000.0;
	microstokes=(edtValue)*1.E+21;
	nanostokes=(edtValue)*1.E+24;
	
	picostokes=(edtValue)*1.E+27;
	femtostokes=(edtValue)*9.999999999E+29;
	attostokes=(edtValue)*1.E+33;
	
	break;
	
case "Terastokes -TSt":
	
	squaremeterpersecond=(edtValue)*100000000;
	squaremeterperhour=(edtValue)*360000000000.0;
	squarecentimeterpersecond=(edtValue)*1000000000000.0;
	squaremillimetersecond=(edtValue)*100000000000000.0;
	squarefootsecond=(edtValue)*1076391041.7;
	
	squarefoothour=(edtValue)*3875007750016.0;
	squareinchsecond=(edtValue)*155000310001.0;
	stokes=(edtValue)*1000000000000.0;
	exastokes=(edtValue)*0.000001;
	petastokes=(edtValue)*0.001;
	
	terastokes=(edtValue)*1;
	gigastokes=(edtValue)*1000;
	megastokes=(edtValue)*1000000;
	kilostokes=(edtValue)*1000000000;
	hectostokes=(edtValue)*10000000000.0;
	dekastokes=(edtValue)*100000000000.0;
	decistokes=(edtValue)*10000000000000.0;
	
	centistokes=(edtValue)*100000000000000.0;
	millistokes=(edtValue)*1000000000000000.0;
	microstokes=(edtValue)*1000000000000000000.0;
	nanostokes=(edtValue)*1.E+21;
	
	picostokes=(edtValue)*1.E+24;
	femtostokes=(edtValue)*1.E+27;
	attostokes=(edtValue)*1.E+30;
	
	break;
	
case "Gigastokes -GSt":
	
	squaremeterpersecond=(edtValue)*100000;
	squaremeterperhour=(edtValue)*360000000;
	squarecentimeterpersecond=(edtValue)*1000000000;
	squaremillimetersecond=(edtValue)*100000000000.0;
	squarefootsecond=(edtValue)*1076391.0417;
	
	squarefoothour=(edtValue)*3875007750.0;
	squareinchsecond=(edtValue)*155000310;
	stokes=(edtValue)*1000000000;
	exastokes=(edtValue)*1.E-9;
	petastokes=(edtValue)*0.000001;
	
	terastokes=(edtValue)*0.001;
	gigastokes=(edtValue)*1;
	megastokes=(edtValue)*1000;
	kilostokes=(edtValue)*1000000;
	hectostokes=(edtValue)*10000000;
	dekastokes=(edtValue)*100000000;
	decistokes=(edtValue)*10000000000.0;
	
	centistokes=(edtValue)*100000000000.0;
	millistokes=(edtValue)*1000000000000.0;
	microstokes=(edtValue)*1000000000000000.0;
	nanostokes=(edtValue)*1000000000000000000.0;
	
	picostokes=(edtValue)*1.E+21;
	femtostokes=(edtValue)*1.E+24;
	attostokes=(edtValue)*1.E+27;
	
	
	break;
	
case "Megastokes -MSt":
	
	squaremeterpersecond=(edtValue)*100;
	squaremeterperhour=(edtValue)*360000;
	squarecentimeterpersecond=(edtValue)*1000000;
	squaremillimetersecond=(edtValue)*100000000;
	squarefootsecond=(edtValue)*1076.3910417;
	
	squarefoothour=(edtValue)*3875007.75;
	squareinchsecond=(edtValue)*155000.31;
	stokes=(edtValue)*1000000;
	exastokes=(edtValue)*1.E-12;
	petastokes=(edtValue)*1.E-9;
	
	terastokes=(edtValue)*0.000001;
	gigastokes=(edtValue)*0.001;
	megastokes=(edtValue)*1;
	kilostokes=(edtValue)*1000;
	hectostokes=(edtValue)*10000;
	dekastokes=(edtValue)*100000;
	decistokes=(edtValue)*10000000;
	
	centistokes=(edtValue)*100000000;
	millistokes=(edtValue)*1000000000;
	microstokes=(edtValue)*1000000000000.0;
	nanostokes=(edtValue)*1000000000000000.0;
	
	picostokes=(edtValue)*1000000000000000000.0;
	femtostokes=(edtValue)*1.E+21;
	attostokes=(edtValue)*1.E+24;
	
	break;
	
case "Kilostokes -kSt":
	
	squaremeterpersecond=(edtValue)*0.1;
	squaremeterperhour=(edtValue)*360;
	squarecentimeterpersecond=(edtValue)*1000;
	squaremillimetersecond=(edtValue)*100000;
	squarefootsecond=(edtValue)*1.0763910417;
	
	squarefoothour=(edtValue)*3875.00775;
	squareinchsecond=(edtValue)*155.00031;
	stokes=(edtValue)*1000;
	exastokes=(edtValue)*1.E-15;
	petastokes=(edtValue)*1.E-12;
	
	terastokes=(edtValue)*1.E-9;
	gigastokes=(edtValue)*0.000001;
	megastokes=(edtValue)*0.001;
	kilostokes=(edtValue)*1;
	hectostokes=(edtValue)*10;
	dekastokes=(edtValue)*100;
	decistokes=(edtValue)*10000;
	
	centistokes=(edtValue)*100000;
	millistokes=(edtValue)*1000000;
	microstokes=(edtValue)*1000000000;
	nanostokes=(edtValue)*1000000000000.0;
	
	picostokes=(edtValue)*1000000000000000.0;
	femtostokes=(edtValue)*1000000000000000000.0;
	attostokes=(edtValue)*1.E+21;
	
	break;
	
case "Hectostokes -hSt":
	
	squaremeterpersecond=(edtValue)*0.01;
	squaremeterperhour=(edtValue)*36;
	squarecentimeterpersecond=(edtValue)*100;
	squaremillimetersecond=(edtValue)*10000;
	squarefootsecond=(edtValue)*0.1076391042;
	
	squarefoothour=(edtValue)*387.500775;
	squareinchsecond=(edtValue)*15.500031;
	stokes=(edtValue)*100;
	exastokes=(edtValue)*1.E-16;
	petastokes=(edtValue)*1.E-13;
	
	terastokes=(edtValue)*1.E-10;
	gigastokes=(edtValue)*1.E-7;
	megastokes=(edtValue)*0.0001;
	kilostokes=(edtValue)*0.1;
	hectostokes=(edtValue)*1;
	dekastokes=(edtValue)*10;
	decistokes=(edtValue)*1000;
	
	centistokes=(edtValue)*10000;
	millistokes=(edtValue)*100000;
	microstokes=(edtValue)*100000000;
	nanostokes=(edtValue)*100000000000.0;
	
	picostokes=(edtValue)*100000000000000.0;
	femtostokes=(edtValue)*100000000000000000.0;
	attostokes=(edtValue)*100000000000000000000.0;
	
	break;
	
	
case "Dekastokes -daSt":
	
	squaremeterpersecond=(edtValue)*0.001;
	squaremeterperhour=(edtValue)*3.6;
	squarecentimeterpersecond=(edtValue)*10;
	squaremillimetersecond=(edtValue)*1000;
	squarefootsecond=(edtValue)*0.0107639104;
	
	squarefoothour=(edtValue)*38.7500775;
	squareinchsecond=(edtValue)*1.5500031;
	stokes=(edtValue)*10;
	exastokes=(edtValue)*1.E-17;
	petastokes=(edtValue)*1.E-14;
	
	terastokes=(edtValue)*1.E-11;
	gigastokes=(edtValue)*1.E-8;
	megastokes=(edtValue)*0.00001;
	kilostokes=(edtValue)*0.01;
	hectostokes=(edtValue)*0.1;
	dekastokes=(edtValue)*1;
	decistokes=(edtValue)*100;
	
	centistokes=(edtValue)*1000;
	millistokes=(edtValue)*10000;
	microstokes=(edtValue)*10000000;
	nanostokes=(edtValue)*10000000000.0;
	
	picostokes=(edtValue)*10000000000000.0;
	femtostokes=(edtValue)*10000000000000000.0;
	attostokes=(edtValue)*10000000000000000000.0;
	
	break;
	
	
case "Decistokes -dSt":
	
	squaremeterpersecond=(edtValue)*0.00001;
	squaremeterperhour=(edtValue)*0.036;
	squarecentimeterpersecond=(edtValue)*0.1;
	squaremillimetersecond=(edtValue)*10;
	squarefootsecond=(edtValue)*0.0001076391;
	
	squarefoothour=(edtValue)*0.387500775;
	squareinchsecond=(edtValue)*0.015500031;
	stokes=(edtValue)*0.1;
	exastokes=(edtValue)*1.E-19;
	petastokes=(edtValue)*1.E-16;
	
	terastokes=(edtValue)*1.E-13;
	gigastokes=(edtValue)*1.E-10;
	megastokes=(edtValue)*1.E-7;
	kilostokes=(edtValue)*0.0001;
	hectostokes=(edtValue)*0.001;
	dekastokes=(edtValue)*0.01;
	decistokes=(edtValue)*1;
	
	centistokes=(edtValue)*10;
	millistokes=(edtValue)*100;
	microstokes=(edtValue)*100000;
	nanostokes=(edtValue)*100000000;
	
	picostokes=(edtValue)*100000000000.0;
	femtostokes=(edtValue)*100000000000000.0;
	attostokes=(edtValue)*100000000000000000.0;
	
	break;
	
	
	
case "Centistokes -cSt":
	
	squaremeterpersecond=(edtValue)*0.000001;
	squaremeterperhour=(edtValue)*0.0036;
	squarecentimeterpersecond=(edtValue)*0.01;
	squaremillimetersecond=(edtValue)*1;
	squarefootsecond=(edtValue)*0.0000107639;
	
	squarefoothour=(edtValue)*0.0387500775;
	squareinchsecond=(edtValue)*0.0015500031;
	stokes=(edtValue)*0.01;
	exastokes=(edtValue)*1.E-20;
	petastokes=(edtValue)*1.E-17;
	
	terastokes=(edtValue)*1.E-14;
	gigastokes=(edtValue)*1.E-11;
	megastokes=(edtValue)*1.E-8;
	kilostokes=(edtValue)*0.00001;
	hectostokes=(edtValue)*0.0001;
	dekastokes=(edtValue)*0.001;
	decistokes=(edtValue)*0.1;
	
	centistokes=(edtValue)*1;
	millistokes=(edtValue)*10;
	microstokes=(edtValue)*10000;
	nanostokes=(edtValue)*10000000;
	
	picostokes=(edtValue)*10000000000.0;
	femtostokes=(edtValue)*10000000000000.0;
	attostokes=(edtValue)*10000000000000000.0;
	
	break;
	
case "Millistokes -mSt":
	
	squaremeterpersecond=(edtValue)*1.E-7;
	squaremeterperhour=(edtValue)*0.00036;
	squarecentimeterpersecond=(edtValue)*0.001;
	squaremillimetersecond=(edtValue)*0.1;
	squarefootsecond=(edtValue)*0.0000010764;
	
	squarefoothour=(edtValue)*0.0038750078;
	squareinchsecond=(edtValue)*0.0001550003;
	stokes=(edtValue)*0.001;
	exastokes=(edtValue)*1.E-21;
	petastokes=(edtValue)*1.E-18;
	
	terastokes=(edtValue)*1.E-15;
	gigastokes=(edtValue)*1.E-12;
	megastokes=(edtValue)*1.E-9;
	kilostokes=(edtValue)*0.000001;
	hectostokes=(edtValue)*0.000001;
	dekastokes=(edtValue)*0.0001;
	decistokes=(edtValue)*0.01;
	
	centistokes=(edtValue)*0.1;
	millistokes=(edtValue)*1;
	microstokes=(edtValue)*1000;
	nanostokes=(edtValue)*1000000;
	
	picostokes=(edtValue)*1000000000.0;
	femtostokes=(edtValue)*1000000000000.0;
	attostokes=(edtValue)*1000000000000000.0;
	
	break;
	
case "Microstokes -μSt":
	
	squaremeterpersecond=(edtValue)*1.E-10;
	squaremeterperhour=(edtValue)*3.6E-7;
	squarecentimeterpersecond=(edtValue)*0.000001;
	squaremillimetersecond=(edtValue)*0.0001;
	squarefootsecond=(edtValue)*1.076391041E-9;
	
	squarefoothour=(edtValue)*0.000003875;
	squareinchsecond=(edtValue)*1.5500031E-7;
	stokes=(edtValue)*0.000001;
	exastokes=(edtValue)*1.E-24;
	petastokes=(edtValue)*1.E-21;
	
	terastokes=(edtValue)*1.E-18;
	gigastokes=(edtValue)*1.E-15;
	megastokes=(edtValue)*1.E-12;
	kilostokes=(edtValue)*1.E-9;
	hectostokes=(edtValue)*1.E-8;
	dekastokes=(edtValue)*1.E-7;
	decistokes=(edtValue)*0.00001;
	
	centistokes=(edtValue)*0.0001;
	millistokes=(edtValue)*0.001;
	microstokes=(edtValue)*1;
	nanostokes=(edtValue)*1000;
	
	picostokes=(edtValue)*1000000;
	femtostokes=(edtValue)*1000000000;
	attostokes=(edtValue)*1000000000000.0;
	
	break;
	
case "Nanostokes -nSt":
	
	squaremeterpersecond=(edtValue)*1.E-13;
	squaremeterperhour=(edtValue)*3.6E-10;
	squarecentimeterpersecond=(edtValue)*1.E-9;
	squaremillimetersecond=(edtValue)*1.E-7;
	squarefootsecond=(edtValue)*1.076391041E-12;
	
	squarefoothour=(edtValue)*3.87500775E-9;
	squareinchsecond=(edtValue)*1.5500031E-10;
	stokes=(edtValue)*1.E-9;
	exastokes=(edtValue)*1.E-27;
	petastokes=(edtValue)*1.E-24;
	
	terastokes=(edtValue)*1.E-21;
	gigastokes=(edtValue)*1.E-18;
	megastokes=(edtValue)*1.E-15;
	kilostokes=(edtValue)*1.E-12;
	hectostokes=(edtValue)*1.E-11;
	dekastokes=(edtValue)*1.E-10;
	decistokes=(edtValue)*1.E-8;
	
	centistokes=(edtValue)*1.E-7;
	millistokes=(edtValue)*0.000001;
	microstokes=(edtValue)*0.001;
	nanostokes=(edtValue)*1;
	
	picostokes=(edtValue)*1000;
	femtostokes=(edtValue)*1000000;
	attostokes=(edtValue)*1000000000;
	
	break;
	
	
case "Picostokes -pSt":
	
	squaremeterpersecond=(edtValue)*1.E-16;
	squaremeterperhour=(edtValue)*3.6E-13;
	squarecentimeterpersecond=(edtValue)*1.E-12;
	squaremillimetersecond=(edtValue)*1.E-12;
	squarefootsecond=(edtValue)*1.076391041E-15;
	
	squarefoothour=(edtValue)*3.87500775E-12;
	squareinchsecond=(edtValue)*1.5500031E-13;
	stokes=(edtValue)*1.E-12;
	exastokes=(edtValue)*9.999999999E-31;
	petastokes=(edtValue)*1.E-27;
	
	terastokes=(edtValue)*1.E-24;
	gigastokes=(edtValue)*1.E-21;
	megastokes=(edtValue)*1.E-18;
	kilostokes=(edtValue)*1.E-15;
	hectostokes=(edtValue)*1.E-14;
	dekastokes=(edtValue)*1.E-13;
	decistokes=(edtValue)*1.E-11;
	
	centistokes=(edtValue)*1.E-10;
	millistokes=(edtValue)*1.E-9;
	microstokes=(edtValue)*0.000001;
	nanostokes=(edtValue)*0.001;
	
	picostokes=(edtValue)*1;
	femtostokes=(edtValue)*1000;
	attostokes=(edtValue)*1000000;
	
	break;
	
case "Femtostokes -fSt":
	
	squaremeterpersecond=(edtValue)*1.E-19;
	squaremeterperhour=(edtValue)*3.6E-16;
	squarecentimeterpersecond=(edtValue)*1.E-15;
	squaremillimetersecond=(edtValue)*1.E-13;
	squarefootsecond=(edtValue)*1.076391041E-18;
	
	squarefoothour=(edtValue)*3.87500775E-15;
	squareinchsecond=(edtValue)*1.5500031E-16;
	stokes=(edtValue)*1.E-15;
	exastokes=(edtValue)*1.E-33;
	petastokes=(edtValue)*1.E-30;
	
	terastokes=(edtValue)*1.E-27;
	gigastokes=(edtValue)*1.E-24;
	megastokes=(edtValue)*1.E-21;
	kilostokes=(edtValue)*1.E-18;
	hectostokes=(edtValue)*1.E-17;
	dekastokes=(edtValue)*1.E-16;
	decistokes=(edtValue)*1.E-14;
	
	centistokes=(edtValue)*1.E-13;
	millistokes=(edtValue)*1.E-12;
	microstokes=(edtValue)*1.E-9;
	nanostokes=(edtValue)*0.000001;
	
	picostokes=(edtValue)*0.001;
	femtostokes=(edtValue)*1;
	attostokes=(edtValue)*1000;
	
	break;
	
case "Attostokes -aSt":
	
	squaremeterpersecond=(edtValue)*9.999999999E-23;
	squaremeterperhour=(edtValue)*3.599999999E-19;
	squarecentimeterpersecond=(edtValue)*9.999999999E-19;
	squaremillimetersecond=(edtValue)*1.E-16;
	squarefootsecond=(edtValue)*1.076391041E-21;
	
	squarefoothour=(edtValue)*3.87500775E-18;
	squareinchsecond=(edtValue)*1.5500031E-19;
	stokes=(edtValue)*9.999999999E-19;
	exastokes=(edtValue)*1.E-36;
	petastokes=(edtValue)*9.999999999E-34;
	
	terastokes=(edtValue)*9.999999999E-31;
	gigastokes=(edtValue)*1.E-27;
	megastokes=(edtValue)*1.E-24;
	kilostokes=(edtValue)*1.E-21;
	hectostokes=(edtValue)*1.E-20;
	dekastokes=(edtValue)*1.E-19;
	decistokes=(edtValue)*9.999999999E-18;
	
	centistokes=(edtValue)*1.E-16;
	millistokes=(edtValue)*9.999999999E-16;
	microstokes=(edtValue)*1.E-12;
	nanostokes=(edtValue)*1.E-9;
	
	picostokes=(edtValue)*0.000001;
	femtostokes=(edtValue)*0.001;
	attostokes=(edtValue)*1;
	

	break;
					
				}
				results. setSquaremeterpersecond( squaremeterpersecond) ;

				results. setSquaremeterperhour( squaremeterperhour); 

				results. setSquarecentimeterpersecond( squarecentimeterpersecond) ;

				results. setSquaremillimetersecond( squaremillimetersecond) ;

				results. setSquarefootsecond( squarefootsecond); 

				results. setSquarefoothour( squarefoothour);
				

				results. setSquareinchsecond( squareinchsecond) ;

				results. setStokes( stokes);

				results. setExastokes( exastokes);

				results. setPetastokes( petastokes) ;
				results. setTerastokes( terastokes);

				results. setGigastokes( gigastokes) ;

				results. setMegastokes( megastokes);

				results. setKilostokes( kilostokes) ;

				results. setHectostokes( hectostokes) ;

				results. setDekastokes( dekastokes) ;

				results. setDecistokes( decistokes) ;

				results. setCentistokes( centistokes);

				results. setMillistokes( millistokes);

				results. setMicrostokes( microstokes); 
				results. setNanostokes( nanostokes) ;

				results. setPicostokes( picostokes) ;
				results. setFemtostokes( femtostokes) ;

				results. setAttostokes( attostokes);
				
				
				
				converterArray.add(results);
			    return converterArray;
			
				
		    }

			
			public class ConversionResults{
				
				private double   squaremeterpersecond,  squaremeterperhour, squarecentimeterpersecond , squaremillimetersecond, squarefootsecond , squarefoothour ,  squareinchsecond ,stokes  ,exastokes ,petastokes ,terastokes ,gigastokes , megastokes ,kilostokes , hectostokes ,dekastokes ,decistokes,centistokes ,millistokes ,microstokes,nanostokes, picostokes ,femtostokes , attostokes   ;

				public double getSquaremeterpersecond() {
					return squaremeterpersecond;
				}

				public void setSquaremeterpersecond(double squaremeterpersecond) {
					this.squaremeterpersecond = squaremeterpersecond;
				}

				public double getSquaremeterperhour() {
					return squaremeterperhour;
				}

				public void setSquaremeterperhour(double squaremeterperhour) {
					this.squaremeterperhour = squaremeterperhour;
				}

				public double getSquarecentimeterpersecond() {
					return squarecentimeterpersecond;
				}

				public void setSquarecentimeterpersecond(double squarecentimeterpersecond) {
					this.squarecentimeterpersecond = squarecentimeterpersecond;
				}

				public double getSquaremillimetersecond() {
					return squaremillimetersecond;
				}

				public void setSquaremillimetersecond(double squaremillimetersecond) {
					this.squaremillimetersecond = squaremillimetersecond;
				}

				public double getSquarefootsecond() {
					return squarefootsecond;
				}

				public void setSquarefootsecond(double squarefootsecond) {
					this.squarefootsecond = squarefootsecond;
				}

				public double getSquarefoothour() {
					return squarefoothour;
				}

				public void setSquarefoothour(double squarefoothour) {
					this.squarefoothour = squarefoothour;
				}

				public double getSquareinchsecond() {
					return squareinchsecond;
				}

				public void setSquareinchsecond(double squareinchsecond) {
					this.squareinchsecond = squareinchsecond;
				}

				public double getStokes() {
					return stokes;
				}

				public void setStokes(double stokes) {
					this.stokes = stokes;
				}

				public double getExastokes() {
					return exastokes;
				}

				public void setExastokes(double exastokes) {
					this.exastokes = exastokes;
				}

				public double getPetastokes() {
					return petastokes;
				}

				public void setPetastokes(double petastokes) {
					this.petastokes = petastokes;
				}

				public double getTerastokes() {
					return terastokes;
				}

				public void setTerastokes(double terastokes) {
					this.terastokes = terastokes;
				}

				public double getGigastokes() {
					return gigastokes;
				}

				public void setGigastokes(double gigastokes) {
					this.gigastokes = gigastokes;
				}

				public double getMegastokes() {
					return megastokes;
				}

				public void setMegastokes(double megastokes) {
					this.megastokes = megastokes;
				}

				public double getKilostokes() {
					return kilostokes;
				}

				public void setKilostokes(double kilostokes) {
					this.kilostokes = kilostokes;
				}

				public double getHectostokes() {
					return hectostokes;
				}

				public void setHectostokes(double hectostokes) {
					this.hectostokes = hectostokes;
				}

				public double getDekastokes() {
					return dekastokes;
				}

				public void setDekastokes(double dekastokes) {
					this.dekastokes = dekastokes;
				}

				public double getDecistokes() {
					return decistokes;
				}

				public void setDecistokes(double decistokes) {
					this.decistokes = decistokes;
				}

				public double getCentistokes() {
					return centistokes;
				}

				public void setCentistokes(double centistokes) {
					this.centistokes = centistokes;
				}

				public double getMillistokes() {
					return millistokes;
				}

				public void setMillistokes(double millistokes) {
					this.millistokes = millistokes;
				}

				public double getMicrostokes() {
					return microstokes;
				}

				public void setMicrostokes(double microstokes) {
					this.microstokes = microstokes;
				}

				public double getNanostokes() {
					return nanostokes;
				}

				public void setNanostokes(double nanostokes) {
					this.nanostokes = nanostokes;
				}

				public double getPicostokes() {
					return picostokes;
				}

				public void setPicostokes(double picostokes) {
					this.picostokes = picostokes;
				}

				public double getFemtostokes() {
					return femtostokes;
				}

				public void setFemtostokes(double femtostokes) {
					this.femtostokes = femtostokes;
				}

				public double getAttostokes() {
					return attostokes;
				}

				public void setAttostokes(double attostokes) {
					this.attostokes = attostokes;
				}

			}
}
