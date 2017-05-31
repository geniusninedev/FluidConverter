package com.nineinfosys.fluidconverter.Engin;

import java.util.ArrayList;


public class FlowMassConverter {
	
	private double   kilogramsecond ,  gramsecond, gramminute,gramhour, gramday, milligramminute ,milligramhour,milligramday,kilogramminute,kilogramhour,kilogramday ,exagramsecond,petagramsecond,teragramsecond, gigagramsecond, megagramsecond,hectogramsecond , dekagramsecond ,decigramsecond , centigramsecond,milligramsecond,microgramsecond ,tonmetricsecond, tonmetricminute,tonmetrichour, tonmetricday,tonshorthour,poundsecond,poundminute, poundhour, poundday  ;
	private String conversionFrom;
	private double edtValue;
	
			
			public FlowMassConverter(String conversionFrom, double edtValue) {
				// TODO Auto-generated constructor stub
				this.conversionFrom = conversionFrom;
				this.edtValue = edtValue;
			}

			public ArrayList<ConversionResults> calculateFlowMassConverterConversion()
		    {
		    	
				ArrayList<ConversionResults> converterArray = new ArrayList<ConversionResults>();
					
				ConversionResults results= new ConversionResults();
		    		 	
				switch(conversionFrom)
				{
				case "Kilogram/second -kg/s":
					
					kilogramsecond=(edtValue)*1;
					gramsecond=(edtValue)*1000;
					gramminute=(edtValue)*60000;
					gramhour=(edtValue)*3600000;
					gramday=(edtValue)*86400000;
					milligramminute=(edtValue)*60000000;
					milligramhour=(edtValue)*3600000000.0;
					milligramday=(edtValue)*86400000000.0;
					
					kilogramminute=(edtValue)*60;
					kilogramhour=(edtValue)*3600;
					kilogramday=(edtValue)*86400;
					exagramsecond=(edtValue)*1.E-15;
					
					petagramsecond=(edtValue)*1.E-12;
					teragramsecond=(edtValue)*1.E-9;
					gigagramsecond=(edtValue)*0.000001;
					megagramsecond=(edtValue)*0.001;
					hectogramsecond=(edtValue)*10;
					
					dekagramsecond=(edtValue)*100;
					decigramsecond=(edtValue)*10000;
					
					centigramsecond=(edtValue)*100000;
					milligramsecond=(edtValue)*1000000;
					
					microgramsecond=(edtValue)*1000000000;
					tonmetricsecond=(edtValue)*0.001;
					tonmetricminute=(edtValue)*0.06;
					tonmetrichour=(edtValue)*3.6;
					tonmetricday=(edtValue)*86.4;
					tonshorthour=(edtValue)*3.9683207193;
					poundsecond   =(edtValue)*2.2046226218;
					poundminute  =(edtValue)*132.27735731;
					poundhour =(edtValue)*7936.6414387;
					poundday  =(edtValue)*190479.39453;
					
					break;
					
                  case "Gram/second -g/s":
					
					kilogramsecond=(edtValue)*0.001;
					gramsecond=(edtValue)*1;
					gramminute=(edtValue)*60;
					gramhour=(edtValue)*3600;
					gramday=(edtValue)*86400;
					milligramminute=(edtValue)*60000;
					milligramhour=(edtValue)*3600000;
					milligramday=(edtValue)*86400000;
					
					kilogramminute=(edtValue)*0.06;
					kilogramhour=(edtValue)*3.6;
					kilogramday=(edtValue)*86.4;
					exagramsecond=(edtValue)*1.E-18;
					
					petagramsecond=(edtValue)*1.E-15;
					teragramsecond=(edtValue)*1.E-12;
					gigagramsecond=(edtValue)*1.E-9;
					megagramsecond=(edtValue)*0.000001;
					hectogramsecond=(edtValue)*0.01;
					
					dekagramsecond=(edtValue)*0.1;
					decigramsecond=(edtValue)*10;
					
					centigramsecond=(edtValue)*100;
					milligramsecond=(edtValue)*1000;
				
					microgramsecond=(edtValue)*1000000;
					tonmetricsecond=(edtValue)*0.000001;
					tonmetricminute=(edtValue)*0.00006;
					tonmetrichour=(edtValue)*0.0036;
					tonmetricday=(edtValue)*0.0864;
					tonshorthour=(edtValue)*0.0039683207;
					poundsecond   =(edtValue)*0.0022046226;
					poundminute  =(edtValue)*0.1322773573;
					poundhour =(edtValue)*7.9366414387;
					poundday  =(edtValue)*190.47939453;
					
					break;
					
      case "Gram/minute -g/min":
	
	kilogramsecond=(edtValue)*0.0000166667;
	gramsecond=(edtValue)*0.0166666667;
	gramminute=(edtValue)*1;
	gramhour=(edtValue)*60;
	gramday=(edtValue)*1440;
	milligramminute=(edtValue)*1000;
	milligramhour=(edtValue)*60000;
	milligramday=(edtValue)*1440000;
	
	kilogramminute=(edtValue)*0.001;
	kilogramhour=(edtValue)*0.06;
	kilogramday=(edtValue)*1.44;
	exagramsecond=(edtValue)*1.666666666E-20;
	
	petagramsecond=(edtValue)*1.666666666E-17;
	teragramsecond=(edtValue)*1.666666666E-14;
	gigagramsecond=(edtValue)*1.666666666E-11;
	megagramsecond=(edtValue)*1.666666666E-8;
	hectogramsecond=(edtValue)*0.0001666667;
	
	dekagramsecond=(edtValue)*0.0016666667;
	decigramsecond=(edtValue)*0.1666666667;
	
	centigramsecond=(edtValue)*1.6666666667;
	milligramsecond=(edtValue)*16.666666667;
	
	microgramsecond=(edtValue)*16666.666667;
	tonmetricsecond=(edtValue)*1.666666666E-8;
	tonmetricminute=(edtValue)*0.000001;
	tonmetrichour=(edtValue)*0.00006;
	tonmetricday=(edtValue)*0.00144;
	tonshorthour=(edtValue)*0.0000661387;
	poundsecond   =(edtValue)*0.0000367437;
	poundminute  =(edtValue)*0.0022046226;
	poundhour =(edtValue)*0.1322773573;
	poundday  =(edtValue)*3.1746565755;
	
	break;
	
	
case "Gram/hour -g/h":
	
	kilogramsecond=(edtValue)*2.777777777E-7;
	gramsecond=(edtValue)*0.0002777778;
	gramminute=(edtValue)*0.0166666667;
	gramhour=(edtValue)*1;
	gramday=(edtValue)*24;
	milligramminute=(edtValue)*16.666666667;
	milligramhour=(edtValue)*1000;
	milligramday=(edtValue)*24000;
	
	kilogramminute=(edtValue)*0.0000166667;
	kilogramhour=(edtValue)*0.001;
	kilogramday=(edtValue)*0.024;
	exagramsecond=(edtValue)*2.777777777E-22;
	
	petagramsecond=(edtValue)*2.777777777E-19;
	teragramsecond=(edtValue)*2.777777777E-16;
	gigagramsecond=(edtValue)*2.777777777E-13;
	megagramsecond=(edtValue)*2.777777777E-10;
	hectogramsecond=(edtValue)*0.0000027778;
	
	dekagramsecond=(edtValue)*0.0000277778;
	decigramsecond=(edtValue)*0.0027777778;
	
	centigramsecond=(edtValue)*0.0277777778;
	milligramsecond=(edtValue)*0.2777777778;

	microgramsecond=(edtValue)*277.77777778;
	tonmetricsecond=(edtValue)*2.777777777E-10;
	tonmetricminute=(edtValue)*1.666666666E-8;
	tonmetrichour=(edtValue)*0.000001;
	tonmetricday=(edtValue)*0.000024;
	tonshorthour=(edtValue)*0.0000011023;
	poundsecond   =(edtValue)*6.123951727E-7;
	poundminute  =(edtValue)*0.0000367437;
	poundhour =(edtValue)*0.0022046226;
	poundday  =(edtValue)*0.0529109429;
	
	break;
	
	
case "Gram/day -g/d":
	
	kilogramsecond=(edtValue)*1.157407407E-8;
	gramsecond=(edtValue)*0.0000115741;
	gramminute=(edtValue)*0.0006944444;
	gramhour=(edtValue)*0.0416666667;
	gramday=(edtValue)*1;
	milligramminute=(edtValue)*0.6944444444;
	milligramhour=(edtValue)*41.666666667;
	milligramday=(edtValue)*1000;
	
	kilogramminute=(edtValue)*6.944444444E-7;
	kilogramhour=(edtValue)*0.0000416667;
	kilogramday=(edtValue)*0.001;
	exagramsecond=(edtValue)*1.157407407E-23;
	
	petagramsecond=(edtValue)*1.157407407E-20;
	teragramsecond=(edtValue)*1.157407407E-17;
	gigagramsecond=(edtValue)*1.157407407E-14;
	megagramsecond=(edtValue)*1.157407407E-11;
	hectogramsecond=(edtValue)*1.157407407E-7;
	
	dekagramsecond=(edtValue)*0.0000011574;
	decigramsecond=(edtValue)*0.0001157407;
	
	centigramsecond=(edtValue)*0.0011574074;
	milligramsecond=(edtValue)*0.0115740741;

	microgramsecond=(edtValue)*11.574074074;
	tonmetricsecond=(edtValue)*1.157407407E-11;
	tonmetricminute=(edtValue)*6.944444444E-10;
	tonmetrichour=(edtValue)*4.166666666E-8;
	tonmetricday=(edtValue)*0.000001;
	tonshorthour=(edtValue)*4.592963795E-8;
	poundsecond   =(edtValue)*2.551646553E-8;
	poundminute  =(edtValue)*0.000001531;
	poundhour =(edtValue)*0.0000918593;
	poundday  =(edtValue)*0.0022046226;
	
	break;
	
case "Milligram/minute -mg/min":
	
	kilogramsecond=(edtValue)*1.666666666E-8;
	gramsecond=(edtValue)*0.0000166667;
	gramminute=(edtValue)*0.001;
	gramhour=(edtValue)*0.06;
	gramday=(edtValue)*1.44;
	milligramminute=(edtValue)*1;
	milligramhour=(edtValue)*60;
	milligramday=(edtValue)*1440;
	
	kilogramminute=(edtValue)*0.000001;
	kilogramhour=(edtValue)*0.00006;
	kilogramday=(edtValue)*0.00144;
	exagramsecond=(edtValue)*1.666666666E-23;
	
	petagramsecond=(edtValue)*1.666666666E-20;
	teragramsecond=(edtValue)*1.666666666E-17;
	gigagramsecond=(edtValue)*1.666666666E-14;
	megagramsecond=(edtValue)*1.666666666E-11;
	hectogramsecond=(edtValue)*1.666666666E-7;
	
	dekagramsecond=(edtValue)*0.0000016667;
	decigramsecond=(edtValue)*0.0001666667;
	
	centigramsecond=(edtValue)*0.0016666667;
	milligramsecond=(edtValue)*0.0166666667;
	
	microgramsecond=(edtValue)*16.666666667;
	tonmetricsecond=(edtValue)*1.666666666E-11;
	tonmetricminute=(edtValue)*1.E-9;
	tonmetrichour=(edtValue)*6.E-8;
	tonmetricday=(edtValue)*0.00000144;
	tonshorthour=(edtValue)*6.613867865E-8;
	poundsecond   =(edtValue)*3.674371036E-8;
	poundminute  =(edtValue)*0.0000022046;
	poundhour =(edtValue)*0.0001322774;
	poundday  =(edtValue)*0.0031746566;
	
	break;
	
case "Milligram/hour -mg/h":
	
	kilogramsecond=(edtValue)*2.777777777E-10;
	gramsecond=(edtValue)*2.777777777E-7;
	gramminute=(edtValue)*0.0000166667;
	gramhour=(edtValue)*0.001;
	gramday=(edtValue)*0.024;
	milligramminute=(edtValue)*0.0166666667;
	milligramhour=(edtValue)*1;
	milligramday=(edtValue)*24;
	
	kilogramminute=(edtValue)*1.666666666E-8;
	kilogramhour=(edtValue)*0.000001;
	kilogramday=(edtValue)*0.000024;
	exagramsecond=(edtValue)*2.777777777E-25;
	
	petagramsecond=(edtValue)*2.777777777E-22;
	teragramsecond=(edtValue)*2.777777777E-19;
	gigagramsecond=(edtValue)*2.777777777E-16;
	megagramsecond=(edtValue)*2.777777777E-13;
	hectogramsecond=(edtValue)*2.777777777E-9;
	
	dekagramsecond=(edtValue)*2.777777777E-8;
	decigramsecond=(edtValue)*0.0000027778;
	
	centigramsecond=(edtValue)*0.0000277778;
	milligramsecond=(edtValue)*0.0002777778;
	
	microgramsecond=(edtValue)*0.2777777778;
	tonmetricsecond=(edtValue)*2.777777777E-13;
	tonmetricminute=(edtValue)*1.666666666E-11;
	tonmetrichour=(edtValue)*1.E-9;
	tonmetricday=(edtValue)*2.4E-8;
	tonshorthour=(edtValue)*1.10231131E-9;
	poundsecond   =(edtValue)*6.123951727E-10;
	poundminute  =(edtValue)*3.674371036E-8;
	poundhour =(edtValue)*0.0000022046;
	poundday  =(edtValue)*0.0000529109;
	
	break;
	
case "Milligram/day -mg/d":
	
	kilogramsecond=(edtValue)*1.157407407E-11;
	gramsecond=(edtValue)*1.157407407E-8;
	gramminute=(edtValue)*6.944444444E-7;
	gramhour=(edtValue)*0.0000416667;
	gramday=(edtValue)*0.001;
	milligramminute=(edtValue)*0.0006944444;
	milligramhour=(edtValue)*0.0416666667;
	milligramday=(edtValue)*1;
	
	kilogramminute=(edtValue)*6.944444444E-10;
	kilogramhour=(edtValue)*4.166666666E-8;
	kilogramday=(edtValue)*0.000001;
	exagramsecond=(edtValue)*1.157407407E-26;
	
	petagramsecond=(edtValue)*1.157407407E-23;
	teragramsecond=(edtValue)*1.157407407E-20;
	gigagramsecond=(edtValue)*1.157407407E-17;
	megagramsecond=(edtValue)*1.157407407E-14;
	hectogramsecond=(edtValue)*1.157407407E-10;
	
	dekagramsecond=(edtValue)*1.157407407E-9;
	decigramsecond=(edtValue)*1.157407407E-7;
	
	centigramsecond=(edtValue)*0.0000011574;
	milligramsecond=(edtValue)*0.0000115741;
	
	microgramsecond=(edtValue)*0.0115740741;
	tonmetricsecond=(edtValue)*1.157407407E-14;
	tonmetricminute=(edtValue)*6.944444444E-13;
	tonmetrichour=(edtValue)*4.166666666E-11;
	tonmetricday=(edtValue)*1.E-9;
	tonshorthour=(edtValue)*4.592963795E-11;
	poundsecond=(edtValue)*2.551646553E-11;
	poundminute=(edtValue)*1.530987931E-9;
	poundhour =(edtValue)*9.185927591E-8;
	poundday  =(edtValue)*0.0000022046;
	
	break;
	
case "Kilogram/minute -kg/m":
	
	kilogramsecond=(edtValue)*0.0166666667;
	gramsecond=(edtValue)*16.666666667;
	gramminute=(edtValue)*1000;
	gramhour=(edtValue)*60000;
	gramday=(edtValue)*1440000;
	milligramminute=(edtValue)*1000000;
	milligramhour=(edtValue)*60000000.0;
	milligramday=(edtValue)*1440000000.0;
	
	kilogramminute=(edtValue)*1;
	kilogramhour=(edtValue)*60;
	kilogramday=(edtValue)*1440;
	exagramsecond=(edtValue)*1.666666666E-17;
	
	petagramsecond=(edtValue)*1.666666666E-14;
	teragramsecond=(edtValue)*1.666666666E-11;
	gigagramsecond=(edtValue)*1.666666666E-8;
	megagramsecond=(edtValue)*0.0000166667;
	hectogramsecond=(edtValue)*0.1666666667;
	
	dekagramsecond=(edtValue)*1.6666666667;
	decigramsecond=(edtValue)*166.66666667;
	
	centigramsecond=(edtValue)*1666.6666667;
	milligramsecond=(edtValue)*16666.666667;
	
	microgramsecond=(edtValue)*16666666.667;
	tonmetricsecond=(edtValue)*0.0000166667;
	tonmetricminute=(edtValue)*0.001;
	tonmetrichour=(edtValue)*0.06;
	tonmetricday=(edtValue)*1.44;
	tonshorthour=(edtValue)*0.0661386787;
	poundsecond =(edtValue)*0.0367437104;
	poundminute=(edtValue)*2.2046226218;
	poundhour=(edtValue)*132.27735731;
	poundday=(edtValue)*3174.6565755;
	
	break;
	
case "Kilogram/hour -kg/h":
	
	kilogramsecond=(edtValue)*0.0002777778;
	gramsecond=(edtValue)*0.2777777778;
	gramminute=(edtValue)*16.666666667;
	gramhour=(edtValue)*1000;
	gramday=(edtValue)*24000;

	milligramhour=(edtValue)*16666.666667;
	milligramday=(edtValue)*24000000;
	
	kilogramminute=(edtValue)*0.0166666667;
	kilogramhour=(edtValue)*1;
	kilogramday=(edtValue)*24;
	exagramsecond=(edtValue)*2.777777777E-19;
	
	petagramsecond=(edtValue)*2.777777777E-16;
	teragramsecond=(edtValue)*2.777777777E-13;
	gigagramsecond=(edtValue)*2.777777777E-10;
	megagramsecond=(edtValue)*2.777777777E-7;
	hectogramsecond=(edtValue)*0.0027777778;
	
	dekagramsecond=(edtValue)*0.0277777778;
	decigramsecond=(edtValue)*2.7777777778;
	
	centigramsecond=(edtValue)*27.777777778;
	milligramsecond=(edtValue)*277.77777778;
	
	microgramsecond=(edtValue)*277777.77778;
	tonmetricsecond=(edtValue)*2.777777777E-7;
	tonmetricminute=(edtValue)*0.0000166667;
	tonmetrichour=(edtValue)*0.001;
	tonmetricday=(edtValue)*0.024;
	tonshorthour=(edtValue)*0.0011023113;
	poundsecond =(edtValue)*0.0006123952;
	poundminute  =(edtValue)*0.0367437104;
	poundhour =(edtValue)*2.2046226218;
	poundday  =(edtValue)*52.910942924;
	
	break;
	
case "Kilogram/day -kg/d":
	
	kilogramsecond=(edtValue)*0.0000115741;
	gramsecond=(edtValue)*0.0115740741;
	gramminute=(edtValue)*0.6944444444;
	gramhour=(edtValue)*41.666666667;
	gramday=(edtValue)*1000;
	milligramminute=(edtValue)*694.44444444;
	milligramhour=(edtValue)*41666.666667;
	milligramday=(edtValue)*1000000;
	
	kilogramminute=(edtValue)*0.0006944444;
	kilogramhour=(edtValue)*0.0416666667;
	kilogramday=(edtValue)*1;
	exagramsecond=(edtValue)*1.157407407E-20;
	
	petagramsecond=(edtValue)*1.157407407E-17;
	teragramsecond=(edtValue)*1.157407407E-14;
	gigagramsecond=(edtValue)*1.157407407E-11;
	megagramsecond=(edtValue)*1.157407407E-8;
	hectogramsecond=(edtValue)*0.0001157407;
	
	dekagramsecond=(edtValue)*0.0011574074;
	decigramsecond=(edtValue)*0.1157407407;
	
	centigramsecond=(edtValue)*1.1574074074;
	milligramsecond=(edtValue)*11.574074074;

	microgramsecond=(edtValue)*11574.074074;
	tonmetricsecond=(edtValue)*1.157407407E-8;
	tonmetricminute=(edtValue)*6.944444444E-7;
	tonmetrichour=(edtValue)*0.0000416667;
	tonmetricday=(edtValue)*0.001;
	tonshorthour=(edtValue)*0.0000459296;
	poundsecond =(edtValue)*0.0000255165;
	poundminute=(edtValue)*0.0015309879;
	poundhour =(edtValue)*0.0918592759;
	poundday  =(edtValue)*2.2046226218;
	
	break;
	
case "Exagram/second -Eg/s":
	
	kilogramsecond=(edtValue)*1000000000000000.0;
	gramsecond=(edtValue)*1000000000000000000.0;
	gramminute=(edtValue)*60000000000000000000.0;
	gramhour=(edtValue)*3.6E+21;
	gramday=(edtValue)*8.64E+22;
	milligramminute=(edtValue)*6.E+22;
	milligramhour=(edtValue)*3.6E+24;
	milligramday=(edtValue)*8.64E+25;
	
	kilogramminute=(edtValue)*60000000000000000.0;
	kilogramhour=(edtValue)*3600000000000000000.0;
	kilogramday=(edtValue)*86400000000000000000.0;
	exagramsecond=(edtValue)*1;
	
	petagramsecond=(edtValue)*1000;
	teragramsecond=(edtValue)*1000000;
	gigagramsecond=(edtValue)*1000000000;
	megagramsecond=(edtValue)*1000000000000.0;
	hectogramsecond=(edtValue)*10000000000000000.0;
	
	dekagramsecond=(edtValue)*100000000000000000.0;
	decigramsecond=(edtValue)*10000000000000000000.0;
	
	centigramsecond=(edtValue)*100000000000000000000.0;
	milligramsecond=(edtValue)*1.E+21;
	
	microgramsecond=(edtValue)*1.E+24;
	tonmetricsecond=(edtValue)*1000000000000.0;
	tonmetricminute=(edtValue)*60000000000000.0;
	tonmetrichour=(edtValue)*3600000000000000.0;
	tonmetricday=(edtValue)*86400000000000000.0;
	tonshorthour=(edtValue)*3968320719327800.0;
	poundsecond   =(edtValue)*2204622621848800.0;
	poundminute  =(edtValue)*132277357310930000.0;
	poundhour =(edtValue)*7936641438655600000.0;
	poundday  =(edtValue)*190479394527729980000.0;
	
	break;
case "Petagram/second -Pg/s":
	
	kilogramsecond=(edtValue)*1000000000000.0;
	gramsecond=(edtValue)*1000000000000000.0;
	gramminute=(edtValue)*60000000000000000.0;
	gramhour=(edtValue)*3600000000000000000.0;
	gramday=(edtValue)*86400000000000000000.0;
	milligramminute=(edtValue)*60000000000000000000.0;
	milligramhour=(edtValue)*3.6E+21;
	milligramday=(edtValue)*8.64E+22;
	
	kilogramminute=(edtValue)*60000000000000.0;
	kilogramhour=(edtValue)*3600000000000000.0;
	kilogramday=(edtValue)*86400000000000000.0;
	exagramsecond=(edtValue)*0.001;
	
	petagramsecond=(edtValue)*1;
	teragramsecond=(edtValue)*1000;
	gigagramsecond=(edtValue)*1000000;
	megagramsecond=(edtValue)*1000000;
	hectogramsecond=(edtValue)*10000000000000.0;
	
	dekagramsecond=(edtValue)*100000000000000.0;
	decigramsecond=(edtValue)*10000000000000000.0;
	
	centigramsecond=(edtValue)*100000000000000000.0;
	milligramsecond=(edtValue)*1000000000000000000.0;
	
	microgramsecond=(edtValue)*1.E+21;
	tonmetricsecond=(edtValue)*1000000000;
	tonmetricminute=(edtValue)*60000000000.0;
	tonmetrichour=(edtValue)*3600000000000.0;
	tonmetricday=(edtValue)*86400000000000.0;
	tonshorthour=(edtValue)*3968320719328.0;
	poundsecond   =(edtValue)*2204622621849.0;
	poundminute  =(edtValue)*132277357310930.0;
	poundhour =(edtValue)*7936641438655600.0;
	poundday  =(edtValue)*190479394527730000.0;
	
	break;
	
case "Teragram/second -Tg/s":
	
	kilogramsecond=(edtValue)*1000000000.0;
	gramsecond=(edtValue)*1000000000000.0;
	gramminute=(edtValue)*60000000000000.0;
	gramhour=(edtValue)*3600000000000000.0;
	gramday=(edtValue)*86400000000000000.0;
	milligramminute=(edtValue)*60000000000000000.0;
	milligramhour=(edtValue)*3600000000000000000.0;
	milligramday=(edtValue)*86400000000000000000.0;
	
	kilogramminute=(edtValue)*60000000000.0;
	kilogramhour=(edtValue)*3600000000000.0;
	kilogramday=(edtValue)*86400000000000.0;
	exagramsecond=(edtValue)*0.000001;
	
	petagramsecond=(edtValue)*0.001;
	teragramsecond=(edtValue)*1;
	gigagramsecond=(edtValue)*1000;
	megagramsecond=(edtValue)*1000000;
	hectogramsecond=(edtValue)*10000000000.0;
	
	dekagramsecond=(edtValue)*100000000000.0;
	decigramsecond=(edtValue)*10000000000000.0;
	
	centigramsecond=(edtValue)*100000000000000.0;
	milligramsecond=(edtValue)*1000000000000000.0;
	
	microgramsecond=(edtValue)*1000000000000000000.0;
	tonmetricsecond=(edtValue)*1000000;
	tonmetricminute=(edtValue)*60000000;
	tonmetrichour=(edtValue)*3600000000.0;
	tonmetricday=(edtValue)*86400000000.0;
	tonshorthour=(edtValue)*3968320719.3;
	poundsecond   =(edtValue)*2204622621.8;
	poundminute  =(edtValue)*132277357311.0;
	poundhour =(edtValue)*7936641438656.0;
	poundday  =(edtValue)*190479394527730.0;
	
	break;
	
case "Gigagram/second -Gg/s":
	
	kilogramsecond=(edtValue)*1000000;
	gramsecond=(edtValue)*1000000000;
	gramminute=(edtValue)*60000000000.0;
	gramhour=(edtValue)*3600000000000.0;
	gramday=(edtValue)*86400000000000.0;
	milligramminute=(edtValue)*60000000000000.0;
	milligramhour=(edtValue)*3600000000000000.0;
	milligramday=(edtValue)*86400000000000000.0;
	
	kilogramminute=(edtValue)*60000000;
	kilogramhour=(edtValue)*3600000000.0;
	kilogramday=(edtValue)*86400000000.0;
	exagramsecond=(edtValue)*1.E-9;
	
	petagramsecond=(edtValue)*0.000001;
	teragramsecond=(edtValue)*0.001;
	gigagramsecond=(edtValue)*1;
	megagramsecond=(edtValue)*1000;
	hectogramsecond=(edtValue)*10000000;
	
	dekagramsecond=(edtValue)*100000000;
	decigramsecond=(edtValue)*10000000000.0;
	
	centigramsecond=(edtValue)*100000000000.0;
	milligramsecond=(edtValue)*1000000000000.0;
	
	microgramsecond=(edtValue)*1000000000000000.0;
	tonmetricsecond=(edtValue)*1000;
	tonmetricminute=(edtValue)*60000;
	tonmetrichour=(edtValue)*3600000;
	tonmetricday=(edtValue)*86400000;
	tonshorthour=(edtValue)*3968320.7193;
	poundsecond   =(edtValue)*2204622.6218;
	poundminute  =(edtValue)*132277357.31;
	poundhour =(edtValue)*7936641438.7;
	poundday  =(edtValue)*190479394528.0;
	
	break;
	
case "Megagram/second -Mg/s":
	
	kilogramsecond=(edtValue)*1000;
	gramsecond=(edtValue)*1000000;
	gramminute=(edtValue)*60000000;
	gramhour=(edtValue)*3600000000.0;
	gramday=(edtValue)*86400000000.0;
	milligramminute=(edtValue)*60000000000.0;
	milligramhour=(edtValue)*3600000000000.0;
	milligramday=(edtValue)*86400000000000.0;
	
	kilogramminute=(edtValue)*60000;
	kilogramhour=(edtValue)*3600000;
	kilogramday=(edtValue)*86400000;
	exagramsecond=(edtValue)*1.E-12;
	
	petagramsecond=(edtValue)*1.E-9;
	teragramsecond=(edtValue)*0.000001;
	gigagramsecond=(edtValue)*0.001;
	megagramsecond=(edtValue)*1;
	hectogramsecond=(edtValue)*10000;
	
	dekagramsecond=(edtValue)*100000;
	decigramsecond=(edtValue)*10000000;
	
	centigramsecond=(edtValue)*100000000;
	milligramsecond=(edtValue)*1000000000;
	
	microgramsecond=(edtValue)*1000000000000.0;
	tonmetricsecond=(edtValue)*1;
	tonmetricminute=(edtValue)*60;
	tonmetrichour=(edtValue)*3600;
	tonmetricday=(edtValue)*86400;
	tonshorthour=(edtValue)*3968.3207193;
	poundsecond   =(edtValue)*2204.6226218;
	poundminute  =(edtValue)*132277.35731;
	poundhour =(edtValue)*7936641.4387;
	poundday  =(edtValue)*190479394.53;
	
	break;
	
case "Hectogram/second -hg/s":
	
	kilogramsecond=(edtValue)*0.1;
	gramsecond=(edtValue)*100;
	gramminute=(edtValue)*6000;
	gramhour=(edtValue)*360000;
	gramday=(edtValue)*8640000;
	milligramminute=(edtValue)*6000000;
	milligramhour=(edtValue)*360000000;
	milligramday=(edtValue)*8640000000.0;
	
	kilogramminute=(edtValue)*6;
	kilogramhour=(edtValue)*360;
	kilogramday=(edtValue)*8640;
	exagramsecond=(edtValue)*1.E-16;
	
	petagramsecond=(edtValue)*1.E-13;
	teragramsecond=(edtValue)*1.E-10;
	gigagramsecond=(edtValue)*1.E-7;
	megagramsecond=(edtValue)*0.0001;
	hectogramsecond=(edtValue)*1;
	
	dekagramsecond=(edtValue)*10;
	decigramsecond=(edtValue)*1000;
	
	centigramsecond=(edtValue)*10000;
	milligramsecond=(edtValue)*100000;
	
	microgramsecond=(edtValue)*100000000;
	tonmetricsecond=(edtValue)*0.0001;
	tonmetricminute=(edtValue)*0.006;
	tonmetrichour=(edtValue)*0.36;
	tonmetricday=(edtValue)*8.64;
	tonshorthour=(edtValue)*0.3968320719;
	poundsecond   =(edtValue)*0.2204622622;
	poundminute  =(edtValue)*13.227735731;
	poundhour =(edtValue)*793.66414387;
	poundday  =(edtValue)*19047.939453;
	
	break;
	
case "Dekagram/second -dag/s":
	
	kilogramsecond=(edtValue)*0.01;
	gramsecond=(edtValue)*10;
	gramminute=(edtValue)*600;
	gramhour=(edtValue)*36000;
	gramday=(edtValue)*864000;
	milligramminute=(edtValue)*600000;
	milligramhour=(edtValue)*36000000.0;
	milligramday=(edtValue)*864000000.0;
	
	kilogramminute=(edtValue)*0.6;
	kilogramhour=(edtValue)*36;
	kilogramday=(edtValue)*864;
	exagramsecond=(edtValue)*1.E-17;
	
	petagramsecond=(edtValue)*1.E-14;
	teragramsecond=(edtValue)*1.E-11;
	gigagramsecond=(edtValue)*1.E-8;
	megagramsecond=(edtValue)*0.00001;
	hectogramsecond=(edtValue)*0.1;
	
	dekagramsecond=(edtValue)*1;
	decigramsecond=(edtValue)*100;
	
	centigramsecond=(edtValue)*1000;
	milligramsecond=(edtValue)*10000;
	
	microgramsecond=(edtValue)*10000000;
	tonmetricsecond=(edtValue)*0.00001;
	tonmetricminute=(edtValue)*0.0006;
	tonmetrichour=(edtValue)*0.036;
	tonmetricday=(edtValue)*0.864;
	tonshorthour=(edtValue)*0.0396832072;
	poundsecond   =(edtValue)*0.0220462262;
	poundminute  =(edtValue)*1.3227735731;
	poundhour =(edtValue)*79.366414387;
	poundday  =(edtValue)*1904.7939453;
	
	break;
	
case "Decigram/second -dg/s":
	
	kilogramsecond=(edtValue)*0.0001;
	gramsecond=(edtValue)*0.1;
	gramminute=(edtValue)*6;
	gramhour=(edtValue)*360;
	gramday=(edtValue)*8640;
	milligramminute=(edtValue)*6000;
	milligramhour=(edtValue)*360000;
	milligramday=(edtValue)*8640000;
	
	kilogramminute=(edtValue)*0.006;
	kilogramhour=(edtValue)*0.36;
	kilogramday=(edtValue)*8.64;
	exagramsecond=(edtValue)*1.E-19;
	
	petagramsecond=(edtValue)*1.E-16;
	teragramsecond=(edtValue)*1.E-13;
	gigagramsecond=(edtValue)*1.E-10;
	megagramsecond=(edtValue)*1.E-7;
	hectogramsecond=(edtValue)*0.001;
	
	dekagramsecond=(edtValue)*0.01;
	decigramsecond=(edtValue)*1;
	
	centigramsecond=(edtValue)*10;
	milligramsecond=(edtValue)*100;

	microgramsecond=(edtValue)*100000;
	tonmetricsecond=(edtValue)*1.E-7;
	tonmetricminute=(edtValue)*0.000006;
	tonmetrichour=(edtValue)*0.00036;
	tonmetricday=(edtValue)*0.00864;
	tonshorthour=(edtValue)*0.0003968321;
	poundsecond   =(edtValue)*0.0002204623;
	poundminute  =(edtValue)*0.0132277357;
	poundhour =(edtValue)*0.7936641439;
	poundday  =(edtValue)*19.047939453;
	
	break;
	
case "Centigram/second -cg/s":
	
	kilogramsecond=(edtValue)*0.00001;
	gramsecond=(edtValue)*0.01;
	gramminute=(edtValue)*0.6;
	gramhour=(edtValue)*36;
	gramday=(edtValue)*864;
	milligramminute=(edtValue)*600;
	milligramhour=(edtValue)*36000;
	milligramday=(edtValue)*864000;
	
	kilogramminute=(edtValue)*0.0006;
	kilogramhour=(edtValue)*0.036;
	kilogramday=(edtValue)*0.864;
	exagramsecond=(edtValue)*1.E-20;
	
	petagramsecond=(edtValue)*1.E-17;
	teragramsecond=(edtValue)*1.E-14;
	gigagramsecond=(edtValue)*1.E-11;
	megagramsecond=(edtValue)*1.E-8;
	hectogramsecond=(edtValue)*0.0001;
	
	dekagramsecond=(edtValue)*0.001;
	decigramsecond=(edtValue)*0.1;
	
	centigramsecond=(edtValue)*1;
	milligramsecond=(edtValue)*10;
	
	microgramsecond=(edtValue)*10000;
	tonmetricsecond=(edtValue)*1.E-8;
	tonmetricminute=(edtValue)*6.E-7;
	tonmetrichour=(edtValue)*0.000036;
	tonmetricday=(edtValue)*0.000864;
	tonshorthour=(edtValue)*0.0000396832;
	poundsecond   =(edtValue)*0.0000220462;
	poundminute  =(edtValue)*0.0013227736;
	poundhour =(edtValue)*0.0793664144;
	poundday  =(edtValue)*1.9047939453;
	
	break;
	
case "Milligram/second -mg/s":
	
	kilogramsecond=(edtValue)*0.000001;
	gramsecond=(edtValue)*0.001;
	gramminute=(edtValue)*0.06;
	gramhour=(edtValue)*3.6;
	gramday=(edtValue)*86.4;
	milligramminute=(edtValue)*60;
	milligramhour=(edtValue)*3600;
	milligramday=(edtValue)*86400;
	
	kilogramminute=(edtValue)*0.00006;
	kilogramhour=(edtValue)*0.0036;
	kilogramday=(edtValue)*0.0864;
	exagramsecond=(edtValue)*1.E-21;
	
	petagramsecond=(edtValue)*1.E-18;
	teragramsecond=(edtValue)*1.E-15;
	gigagramsecond=(edtValue)*1.E-12;
	megagramsecond=(edtValue)*1.E-9;
	hectogramsecond=(edtValue)*0.00001;
	
	dekagramsecond=(edtValue)*0.0001;
	decigramsecond=(edtValue)*0.01;
	
	centigramsecond=(edtValue)*0.1;
	milligramsecond=(edtValue)*1;

	microgramsecond=(edtValue)*1000;
	tonmetricsecond=(edtValue)*1.E-9;
	tonmetricminute=(edtValue)*6.E-8;
	tonmetrichour=(edtValue)*0.0000036;
	tonmetricday=(edtValue)*0.0000864;
	tonshorthour=(edtValue)*0.0000039683;
	poundsecond   =(edtValue)*0.0000022046;
	poundminute  =(edtValue)*0.0001322774;
	poundhour =(edtValue)*0.0079366414;
	poundday  =(edtValue)*0.1904793945;
	
	break;
	

	
case "Microgram/second -μg/s":
	
	kilogramsecond=(edtValue)*1.E-9;
	gramsecond=(edtValue)*0.000001;
	gramminute=(edtValue)*0.00006;
	gramhour=(edtValue)*0.0036;
	gramday=(edtValue)*0.0864;
	milligramminute=(edtValue)*0.06;
	milligramhour=(edtValue)*3.6;
	milligramday=(edtValue)*86.4;
	
	kilogramminute=(edtValue)*6.E-8;
	kilogramhour=(edtValue)*0.0000036;
	kilogramday=(edtValue)*0.0000864;
	exagramsecond=(edtValue)*1.E-24;
	
	petagramsecond=(edtValue)*1.E-21;
	teragramsecond=(edtValue)*1.E-18;
	gigagramsecond=(edtValue)*1.E-15;
	megagramsecond=(edtValue)*1.E-12;
	hectogramsecond=(edtValue)*1.E-8;
	
	dekagramsecond=(edtValue)*1.E-7;
	decigramsecond=(edtValue)*0.00001;
	
	centigramsecond=(edtValue)*0.0001;
	milligramsecond=(edtValue)*0.001;
	
	microgramsecond=(edtValue)*1;
	tonmetricsecond=(edtValue)*1.E-12;
	tonmetricminute=(edtValue)*6.E-11;
	tonmetrichour=(edtValue)*3.6E-9;
	tonmetricday=(edtValue)*8.64E-8;
	tonshorthour=(edtValue)*3.968320719E-9;
	poundsecond   =(edtValue)*2.204622621E-9;
	poundminute  =(edtValue)*1.322773573E-7;
	poundhour =(edtValue)*0.0000079366;
	poundday  =(edtValue)*0.0001904794;
	
	break;
	
case "Ton (metric)/second -t/s":
	
	kilogramsecond=(edtValue)*1000;
	gramsecond=(edtValue)*1000000;
	gramminute=(edtValue)*60000000;
	gramhour=(edtValue)*3600000000.0;
	gramday=(edtValue)*86400000000.0;
	milligramminute=(edtValue)*60000000000.0;
	milligramhour=(edtValue)*3600000000000.0;
	milligramday=(edtValue)*86400000000000.0;
	
	kilogramminute=(edtValue)*60000;
	kilogramhour=(edtValue)*3600000;
	kilogramday=(edtValue)*86400000;
	exagramsecond=(edtValue)*1.E-12;
	
	petagramsecond=(edtValue)*1.E-9;
	teragramsecond=(edtValue)*0.000001;
	gigagramsecond=(edtValue)*0.001;
	megagramsecond=(edtValue)*1;
	hectogramsecond=(edtValue)*10000;
	
	dekagramsecond=(edtValue)*100000;
	decigramsecond=(edtValue)*10000000;
	
	centigramsecond=(edtValue)*100000000;
	milligramsecond=(edtValue)*1000000000;
	
	microgramsecond=(edtValue)*1000000000000.0;
	tonmetricsecond=(edtValue)*1;
	tonmetricminute=(edtValue)*60;
	tonmetrichour=(edtValue)*3600;
	tonmetricday=(edtValue)*86400;
	tonshorthour=(edtValue)*3968.3207193;
	poundsecond   =(edtValue)*2204.6226218;
	poundminute  =(edtValue)*132277.35731;
	poundhour =(edtValue)*7936641.4387;
	poundday  =(edtValue)*190479394.53;
	
	break;
	
case "Ton (metric)/minute -t/min":
	
	kilogramsecond=(edtValue)*16.666666667;
	gramsecond=(edtValue)*16666.666667;
	gramminute=(edtValue)*1000000;
	gramhour=(edtValue)*60000000;
	gramday=(edtValue)*1440000000;
	milligramminute=(edtValue)*1000000000;
	milligramhour=(edtValue)*60000000000.0;
	milligramday=(edtValue)*1440000000000.0;
	
	kilogramminute=(edtValue)*1000;
	kilogramhour=(edtValue)*60000;
	kilogramday=(edtValue)*1440000;
	exagramsecond=(edtValue)*1.666666666E-14;
	
	petagramsecond=(edtValue)*1.666666666E-11;
	teragramsecond=(edtValue)*1.666666666E-8;
	gigagramsecond=(edtValue)*0.0000166667;
	megagramsecond=(edtValue)*0.0166666667;
	hectogramsecond=(edtValue)*166.66666667;
	
	dekagramsecond=(edtValue)*1666.6666667;
	decigramsecond=(edtValue)*166666.66667;
	
	centigramsecond=(edtValue)*1666666.6667;
	milligramsecond=(edtValue)*16666666.667;
	
	microgramsecond=(edtValue)*16666666667.0;
	tonmetricsecond=(edtValue)*0.0166666667;
	tonmetricminute=(edtValue)*1;
	tonmetrichour=(edtValue)*60;
	tonmetricday=(edtValue)*1440;
	tonshorthour=(edtValue)*66.138678655;
	poundsecond   =(edtValue)*36.743710364;
	poundminute  =(edtValue)*2204.6226218;
	poundhour =(edtValue)*132277.35731;
	poundday  =(edtValue)*3174656.5755;
	
	break;
	
case "Ton (metric)/hour -t/h":
	
	kilogramsecond=(edtValue)*0.2777777778;
	gramsecond=(edtValue)*277.77777778;
	gramminute=(edtValue)*16666.666667;
	gramhour=(edtValue)*1000000;
	gramday=(edtValue)*24000000;
	milligramminute=(edtValue)*16666666.667;
	milligramhour=(edtValue)*1000000000;
	milligramday=(edtValue)*24000000000.0;
	
	kilogramminute=(edtValue)*16.666666667;
	kilogramhour=(edtValue)*1000;
	kilogramday=(edtValue)*24000;
	exagramsecond=(edtValue)*2.777777777E-16;
	
	petagramsecond=(edtValue)*2.777777777E-13;
	teragramsecond=(edtValue)*2.777777777E-10;
	gigagramsecond=(edtValue)*2.777777777E-7;
	megagramsecond=(edtValue)*0.0002777778;
	hectogramsecond=(edtValue)*2.7777777778;
	
	dekagramsecond=(edtValue)*2.7777777778;
	decigramsecond=(edtValue)*2777.7777778;
	
	centigramsecond=(edtValue)*27777.777778;
	milligramsecond=(edtValue)*277777.77778;
	
	microgramsecond=(edtValue)*277777777.78;
	tonmetricsecond=(edtValue)*0.0002777778;
	tonmetricminute=(edtValue)*0.0166666667;
	tonmetrichour=(edtValue)*1;
	tonmetricday=(edtValue)*24;
	tonshorthour=(edtValue)*1.1023113109;
	poundsecond   =(edtValue)*0.6123951727;
	poundminute  =(edtValue)*36.743710364;
	poundhour =(edtValue)*2204.6226218;
	poundday  =(edtValue)*52910.942924;
	
	break;
	
case "Ton (metric)/day -t/d":
	
	kilogramsecond=(edtValue)*0.0115740741;
	gramsecond=(edtValue)*11.574074074;
	gramminute=(edtValue)*694.44444444;
	gramhour=(edtValue)*41666.666667;
	gramday=(edtValue)*1000000;
	milligramminute=(edtValue)*694444.44444;
	milligramhour=(edtValue)*41666666.667;
	milligramday=(edtValue)*1000000000;
	
	kilogramminute=(edtValue)*0.6944444444;
	kilogramhour=(edtValue)*41.666666667;
	kilogramday=(edtValue)*1000;
	exagramsecond=(edtValue)*1.157407407E-17;
	
	petagramsecond=(edtValue)*1.157407407E-14;
	teragramsecond=(edtValue)*1.157407407E-11;
	gigagramsecond=(edtValue)*1.157407407E-8;
	megagramsecond=(edtValue)*0.0000115741;
	hectogramsecond=(edtValue)*0.1157407407;
	
	dekagramsecond=(edtValue)*1.1574074074;
	decigramsecond=(edtValue)*115.74074074;
	
	centigramsecond=(edtValue)*1157.4074074;
	milligramsecond=(edtValue)*11574.074074;
	
	microgramsecond=(edtValue)*11574074.074;
	tonmetricsecond=(edtValue)*0.0000115741;
	tonmetricminute=(edtValue)*0.0006944444;
	tonmetrichour=(edtValue)*0.0416666667;
	tonmetricday=(edtValue)*1;
	tonshorthour=(edtValue)*0.045929638;
	poundsecond   =(edtValue)*0.0255164655;
	poundminute  =(edtValue)*1.5309879318;
	poundhour =(edtValue)*91.85927591;
	poundday  =(edtValue)*2204.6226218;
	
	break;
	
case "Ton (short)/hour -ton(US)/h":
	
	kilogramsecond=(edtValue)*0.2519957611;
	gramsecond=(edtValue)*251.99576111;
	gramminute=(edtValue)*15119.745667;
	gramhour=(edtValue)*907184.74;
	gramday=(edtValue)*21772433.76;
	milligramminute=(edtValue)*15119745.667;
	milligramhour=(edtValue)*907184740.0;
	milligramday=(edtValue)*21772433760.0;
	
	kilogramminute=(edtValue)*15.119745667;
	kilogramhour=(edtValue)*907.18474;
	kilogramday=(edtValue)*21772.43376;
	exagramsecond=(edtValue)*2.519957611E-16;
	
	petagramsecond=(edtValue)*2.519957611E-13;
	teragramsecond=(edtValue)*2.519957611E-10;
	gigagramsecond=(edtValue)*2.519957611E-7;
	megagramsecond=(edtValue)*0.0002519958;
	hectogramsecond=(edtValue)*2.5199576111;
	
	dekagramsecond=(edtValue)*25.199576111;
	decigramsecond=(edtValue)*2519.9576111;
	
	centigramsecond=(edtValue)*25199.576111;
	milligramsecond=(edtValue)*251995.76111;
	
	microgramsecond=(edtValue)*251995761.11;
	tonmetricsecond=(edtValue)*0.0002519958;
	tonmetricminute=(edtValue)*0.0151197457;
	tonmetrichour=(edtValue)*0.90718474;
	tonmetricday=(edtValue)*21.77243376;
	tonshorthour=(edtValue)*1;
	poundsecond   =(edtValue)*0.5555555556;
	poundminute  =(edtValue)*33.333333333;
	poundhour =(edtValue)*2000;
	poundday  =(edtValue)*48000;
	
	break;
	
case "Pound/second -lb/s":
	
	kilogramsecond=(edtValue)*0.45359237;
	gramsecond=(edtValue)*453.59237;
	gramminute=(edtValue)*27215.5422;
	gramhour=(edtValue)*1632932.532;
	gramday=(edtValue)*39190380.768;
	milligramminute=(edtValue)*27215542.2;
	milligramhour=(edtValue)*1632932532;
	milligramday=(edtValue)*39190380768.0;
	
	kilogramminute=(edtValue)*27.2155422;
	kilogramhour=(edtValue)*1632.932532;
	kilogramday=(edtValue)*39190.380768;
	exagramsecond=(edtValue)*4.535923699E-16;
	
	petagramsecond=(edtValue)*4.535923699E-13;
	teragramsecond=(edtValue)*4.535923699E-10;
	gigagramsecond=(edtValue)*4.535923699E-7;
	megagramsecond=(edtValue)*0.0004535924;
	hectogramsecond=(edtValue)*4.5359237;
	
	dekagramsecond=(edtValue)*45.359237;
	decigramsecond=(edtValue)*4535.9237;
	
	centigramsecond=(edtValue)*45359.237;
	milligramsecond=(edtValue)*453592.37;
	
	microgramsecond=(edtValue)*453592370;
	tonmetricsecond=(edtValue)*0.0004535924;
	tonmetricminute=(edtValue)*0.0272155422;
	tonmetrichour=(edtValue)*1.632932532;
	tonmetricday=(edtValue)*39.190380768;
	tonshorthour=(edtValue)*1.8;
	poundsecond   =(edtValue)*1;
	
	poundminute  =(edtValue)*60;
	poundhour =(edtValue)*3600;
	poundday  =(edtValue)*86400;
	
	break;
	
case "Pound/minute -lb/min":
	
	kilogramsecond=(edtValue)*0.0075598728;
	gramsecond=(edtValue)*7.5598728333;
	gramminute=(edtValue)*453.59237;
	gramhour=(edtValue)*27215.5422;
	gramday=(edtValue)*653173.0128;
	milligramminute=(edtValue)*453592.37;
	milligramhour=(edtValue)*27215542.2;
	milligramday=(edtValue)*653173012.8;
	
	kilogramminute=(edtValue)*0.45359237;
	kilogramhour=(edtValue)*27.2155422;
	kilogramday=(edtValue)*653.1730128;
	exagramsecond=(edtValue)*7.559872833E-18;
	
	petagramsecond=(edtValue)*7.559872833E-15;
	teragramsecond=(edtValue)*7.559872833E-12;
	gigagramsecond=(edtValue)*7.559872833E-9;
	megagramsecond=(edtValue)*0.0000075599;
	hectogramsecond=(edtValue)*0.0755987283;
	
	dekagramsecond=(edtValue)*0.7559872833;
	decigramsecond=(edtValue)*75.598728333;
	
	centigramsecond=(edtValue)*755.98728333;
	milligramsecond=(edtValue)*7559.8728333;
	
	microgramsecond=(edtValue)*7559872.8333;
	tonmetricsecond=(edtValue)*0.0000075599;
	tonmetricminute=(edtValue)*0.0004535924;
	tonmetrichour=(edtValue)*0.0272155422;
	tonmetricday=(edtValue)*0.6531730128;
	tonshorthour=(edtValue)*0.03;
	poundsecond   =(edtValue)*0.0166666667;
	poundminute  =(edtValue)*1;
	poundhour =(edtValue)*60;
	poundday  =(edtValue)*1440;
	
	break;
	
case "Pound/hour -lb/h":
	
	kilogramsecond=(edtValue)*0.0001259979;
	gramsecond=(edtValue)*0.1259978806;
	gramminute=(edtValue)*7.5598728333;
	gramhour=(edtValue)*453.59237;
	gramday=(edtValue)*10886.21688;
	milligramminute=(edtValue)*7559.8728333;
	milligramhour=(edtValue)*453592.37;
	milligramday=(edtValue)*10886216.88;
	
	kilogramminute=(edtValue)*0.0075598728;
	kilogramhour=(edtValue)*0.45359237;
	kilogramday=(edtValue)*10.88621688;
	exagramsecond=(edtValue)*1.259978805E-19;
	
	petagramsecond=(edtValue)*1.259978805E-16;
	teragramsecond=(edtValue)*1.259978805E-13;
	gigagramsecond=(edtValue)*1.259978805E-10;
	megagramsecond=(edtValue)*1.259978805E-7;
	hectogramsecond=(edtValue)*0.0012599788;
	
	dekagramsecond=(edtValue)*0.0125997881;
	decigramsecond=(edtValue)*1.2599788056;
	
	centigramsecond=(edtValue)*12.599788056;
	milligramsecond=(edtValue)*125.99788056;
	
	microgramsecond=(edtValue)*125997.88056;
	tonmetricsecond=(edtValue)*1.259978805E-7;
	tonmetricminute=(edtValue)*0.0000075599;
	tonmetrichour=(edtValue)*0.0004535924;
	tonmetricday=(edtValue)*0.0108862169;
	tonshorthour=(edtValue)*0.0005;
	poundsecond   =(edtValue)*0.0002777778;
	poundminute  =(edtValue)*0.0166666667;
	poundhour =(edtValue)*1;
	poundday  =(edtValue)*24;
	
	break;
	

case "Pound/day -lb/d":
	
	kilogramsecond=(edtValue)*0.0000052499;
	gramsecond=(edtValue)*0.0052499117;
	gramminute=(edtValue)*0.3149947014;
	gramhour=(edtValue)*18.899682083;
	gramday=(edtValue)*453.59237;
	milligramminute=(edtValue)*314.99470139;
	milligramhour=(edtValue)*18899.682083;
	milligramday=(edtValue)*453592.37;
	
	kilogramminute=(edtValue)*0.0003149947;
	kilogramhour=(edtValue)*0.0188996821;
	kilogramday=(edtValue)*0.45359237;
	exagramsecond=(edtValue)*5.249911689E-21;
	
	petagramsecond=(edtValue)*5.249911689E-18;
	teragramsecond=(edtValue)*5.249911689E-15;
	gigagramsecond=(edtValue)*5.249911689E-12;
	megagramsecond=(edtValue)*5.249911689E-9;
	hectogramsecond=(edtValue)*0.0000524991;
	
	dekagramsecond=(edtValue)*0.0005249912;
	decigramsecond=(edtValue)*0.0524991169;
	
	centigramsecond=(edtValue)*0.524991169;
	milligramsecond=(edtValue)*5.2499116898;
	
	microgramsecond=(edtValue)*5249.9116898;
	tonmetricsecond=(edtValue)*5.249911689E-9;
	tonmetricminute=(edtValue)*3.149947013E-7;
	tonmetrichour=(edtValue)*0.0000188997;
	tonmetricday=(edtValue)*0.0004535924;
	tonshorthour=(edtValue)*0.0000208333;
	poundsecond=(edtValue)*0.0000115741;
	poundminute=(edtValue)*0.0006944444;
	poundhour=(edtValue)*0.0416666667;
	poundday =(edtValue)*1;
	
	break;
	
					
				}
				
				
				results. setKilogramsecond( kilogramsecond); 

				results. setGramsecond( gramsecond);

				results. setGramminute( gramminute);

				results. setGramhour( gramhour) ;
				results. setGramday( gramday); 

				results. setMilligramminute( milligramminute);
				

				results. setMilligramhour( milligramhour) ;

				results. setMilligramday( milligramday);

				results. setKilogramminute( kilogramminute);

				results. setKilogramhour( kilogramhour);

				results. setKilogramday( kilogramday);
				results. setExagramsecond( exagramsecond); 

				results. setPetagramsecond( petagramsecond);
				

				results. setTeragramsecond( teragramsecond);

				results. setGigagramsecond( gigagramsecond) ;

				results. setMegagramsecond( megagramsecond); 

				results. setHectogramsecond( hectogramsecond) ;
				results. setDekagramsecond( dekagramsecond) ;
				results. setDecigramsecond( decigramsecond);

				results. setCentigramsecond( centigramsecond);

				results. setMilligramsecond( milligramsecond);
				results. setMicrogramsecond( microgramsecond) ;

				results. setTonmetricsecond( tonmetricsecond);
				results. setTonmetricminute( tonmetricminute) ;

				results. setTonmetrichour( tonmetrichour); 

				results. setTonmetricday( tonmetricday) ;

				results. setTonshorthour( tonshorthour) ;

				results. setPoundsecond( poundsecond) ;

				results. setPoundminute( poundminute) ;

				results. setPoundhour( poundhour); 

				results. setPoundday( poundday); 
				

				converterArray.add(results);
			    return converterArray;

				
				
				
				
		    }
			public class ConversionResults{
				private double   kilogramsecond ,  gramsecond, gramminute,gramhour, gramday, milligramminute ,milligramhour,milligramday,kilogramminute,kilogramhour,kilogramday ,exagramsecond,petagramsecond,teragramsecond, gigagramsecond, megagramsecond,hectogramsecond , dekagramsecond ,decigramsecond , centigramsecond,milligramsecond,microgramsecond ,tonmetricsecond, tonmetricminute,tonmetrichour, tonmetricday,tonshorthour,poundsecond,poundminute, poundhour, poundday  ;

				public double getKilogramsecond() {
					return kilogramsecond;
				}

				public void setKilogramsecond(double kilogramsecond) {
					this.kilogramsecond = kilogramsecond;
				}

				public double getGramsecond() {
					return gramsecond;
				}

				public void setGramsecond(double gramsecond) {
					this.gramsecond = gramsecond;
				}

				public double getGramminute() {
					return gramminute;
				}

				public void setGramminute(double gramminute) {
					this.gramminute = gramminute;
				}

				public double getGramhour() {
					return gramhour;
				}

				public void setGramhour(double gramhour) {
					this.gramhour = gramhour;
				}

				public double getGramday() {
					return gramday;
				}

				public void setGramday(double gramday) {
					this.gramday = gramday;
				}

				public double getMilligramminute() {
					return milligramminute;
				}

				public void setMilligramminute(double milligramminute) {
					this.milligramminute = milligramminute;
				}

				public double getMilligramhour() {
					return milligramhour;
				}

				public void setMilligramhour(double milligramhour) {
					this.milligramhour = milligramhour;
				}

				public double getMilligramday() {
					return milligramday;
				}

				public void setMilligramday(double milligramday) {
					this.milligramday = milligramday;
				}

				public double getKilogramminute() {
					return kilogramminute;
				}

				public void setKilogramminute(double kilogramminute) {
					this.kilogramminute = kilogramminute;
				}

				public double getKilogramhour() {
					return kilogramhour;
				}

				public void setKilogramhour(double kilogramhour) {
					this.kilogramhour = kilogramhour;
				}

				public double getKilogramday() {
					return kilogramday;
				}

				public void setKilogramday(double kilogramday) {
					this.kilogramday = kilogramday;
				}

				public double getExagramsecond() {
					return exagramsecond;
				}

				public void setExagramsecond(double exagramsecond) {
					this.exagramsecond = exagramsecond;
				}

				public double getPetagramsecond() {
					return petagramsecond;
				}

				public void setPetagramsecond(double petagramsecond) {
					this.petagramsecond = petagramsecond;
				}

				public double getTeragramsecond() {
					return teragramsecond;
				}

				public void setTeragramsecond(double teragramsecond) {
					this.teragramsecond = teragramsecond;
				}

				public double getGigagramsecond() {
					return gigagramsecond;
				}

				public void setGigagramsecond(double gigagramsecond) {
					this.gigagramsecond = gigagramsecond;
				}

				public double getMegagramsecond() {
					return megagramsecond;
				}

				public void setMegagramsecond(double megagramsecond) {
					this.megagramsecond = megagramsecond;
				}

				public double getHectogramsecond() {
					return hectogramsecond;
				}

				public void setHectogramsecond(double hectogramsecond) {
					this.hectogramsecond = hectogramsecond;
				}

				public double getDekagramsecond() {
					return dekagramsecond;
				}

				public void setDekagramsecond(double dekagramsecond) {
					this.dekagramsecond = dekagramsecond;
				}

				public double getDecigramsecond() {
					return decigramsecond;
				}

				public void setDecigramsecond(double decigramsecond) {
					this.decigramsecond = decigramsecond;
				}

				public double getCentigramsecond() {
					return centigramsecond;
				}

				public void setCentigramsecond(double centigramsecond) {
					this.centigramsecond = centigramsecond;
				}

				public double getMilligramsecond() {
					return milligramsecond;
				}

				public void setMilligramsecond(double milligramsecond) {
					this.milligramsecond = milligramsecond;
				}

				public double getMicrogramsecond() {
					return microgramsecond;
				}

				public void setMicrogramsecond(double microgramsecond) {
					this.microgramsecond = microgramsecond;
				}

				public double getTonmetricsecond() {
					return tonmetricsecond;
				}

				public void setTonmetricsecond(double tonmetricsecond) {
					this.tonmetricsecond = tonmetricsecond;
				}

				public double getTonmetricminute() {
					return tonmetricminute;
				}

				public void setTonmetricminute(double tonmetricminute) {
					this.tonmetricminute = tonmetricminute;
				}

				public double getTonmetrichour() {
					return tonmetrichour;
				}

				public void setTonmetrichour(double tonmetrichour) {
					this.tonmetrichour = tonmetrichour;
				}

				public double getTonmetricday() {
					return tonmetricday;
				}

				public void setTonmetricday(double tonmetricday) {
					this.tonmetricday = tonmetricday;
				}

				public double getTonshorthour() {
					return tonshorthour;
				}

				public void setTonshorthour(double tonshorthour) {
					this.tonshorthour = tonshorthour;
				}

				public double getPoundsecond() {
					return poundsecond;
				}

				public void setPoundsecond(double poundsecond) {
					this.poundsecond = poundsecond;
				}

				public double getPoundminute() {
					return poundminute;
				}

				public void setPoundminute(double poundminute) {
					this.poundminute = poundminute;
				}

				public double getPoundhour() {
					return poundhour;
				}

				public void setPoundhour(double poundhour) {
					this.poundhour = poundhour;
				}

				public double getPoundday() {
					return poundday;
				}

				public void setPoundday(double poundday) {
					this.poundday = poundday;
				}

				
			}

}
