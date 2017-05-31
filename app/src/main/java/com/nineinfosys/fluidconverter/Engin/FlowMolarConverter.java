package com.nineinfosys.fluidconverter.Engin;

import java.util.ArrayList;


public class FlowMolarConverter {
	
	private double   molsecond , examolsecond, petamolsecond,teramolsecond, gigamolsecond, megamolsecond  ,kilomolsecond,hectomolsecond ,dekamolsecond,decimolsecond, centimolsecond , millimolsecond,micromolsecond,nanomolsecond, picomolsecond, femtomolsecond,attomolsecond ,  molminute  ,molhour , molday ,millimolminute,millimolhour ,millimolday,  kilomolminute ,kilomolhour , kilomolday   ;

	private String conversionFrom;
	private double edtValue;
	
			
			public FlowMolarConverter(String conversionFrom, double edtValue) {
				// TODO Auto-generated constructor stub
				this.conversionFrom = conversionFrom;
				this.edtValue = edtValue;
			}

			public ArrayList<ConversionResults> calculateFlowMolarConverterConversion()
		    {
		    	
				ArrayList<ConversionResults> converterArray = new ArrayList<ConversionResults>();
					
				ConversionResults results= new ConversionResults();
		    		 	
				switch(conversionFrom)
				{
				case "Mol/second -mol/s":
					
					molsecond=(edtValue)*1;
					examolsecond=(edtValue)*1.E-18;
					petamolsecond=(edtValue)*1.E-15;
					teramolsecond=(edtValue)*1.E-12;
					gigamolsecond=(edtValue)*1.E-9;
					megamolsecond=(edtValue)*0.000001;
					kilomolsecond=(edtValue)*0.001;
					hectomolsecond=(edtValue)*0.01;
					
					dekamolsecond=(edtValue)*0.1;
					decimolsecond=(edtValue)*10;
					centimolsecond=(edtValue)*100;
					millimolsecond=(edtValue)*1000;
					
					micromolsecond=(edtValue)*1000000;
					nanomolsecond=(edtValue)*1000000000.0;
					picomolsecond=(edtValue)*1000000000000.0;
					femtomolsecond=(edtValue)*1000000000000000.0;
					attomolsecond=(edtValue)*1000000000000000000.0;
					
					molminute=(edtValue)*60;
					molhour=(edtValue)*3600;
					
					molday=(edtValue)*86400;
					millimolminute=(edtValue)*60000;
					
					millimolhour=(edtValue)*3600000;
					millimolday=(edtValue)*86400000.0;
					kilomolminute=(edtValue)*0.06;
					kilomolhour=(edtValue)*3.6;
					kilomolday=(edtValue)*86.4;
				
					
					break;
					
					
               case "Examol/second -Emol/s":
					
					molsecond=(edtValue)*1000000000000000000.0;
					examolsecond=(edtValue)*1;
					petamolsecond=(edtValue)*1000;
					teramolsecond=(edtValue)*1000000;
					gigamolsecond=(edtValue)*1000000000;
					megamolsecond=(edtValue)*1000000000000.0;
					kilomolsecond=(edtValue)*1000000000000000.0;
					hectomolsecond=(edtValue)*10000000000000000.0;
					
					dekamolsecond=(edtValue)*100000000000000000.0;
					decimolsecond=(edtValue)*10000000000000000000.0;
					centimolsecond=(edtValue)*100000000000000000000.0;
					millimolsecond=(edtValue)*1.E+21;
					
					micromolsecond=(edtValue)*1.E+24;
					nanomolsecond=(edtValue)*1.E+27;
					picomolsecond=(edtValue)*1.E+30;
					femtomolsecond=(edtValue)*1.E+33;
					attomolsecond=(edtValue)*1.E+36;
					
					molminute=(edtValue)*60000000000000000000.0;
					molhour=(edtValue)*3.6E+21;
					
					molday=(edtValue)*8.64E+22;
					millimolminute=(edtValue)*6.E+22;
					
					millimolhour=(edtValue)*3.6E+24;
					millimolday=(edtValue)*8.64E+25;
					kilomolminute=(edtValue)*60000000000000000.0;
					kilomolhour=(edtValue)*3600000000000000000.0;
					kilomolday=(edtValue)*86400000000000000000.0;
				
					
					break;
					
               case "Petamol/second -Pmol/s":
					
					molsecond=(edtValue)*1000000000000000.0;
					examolsecond=(edtValue)*0.001;
					petamolsecond=(edtValue)*1;
					teramolsecond=(edtValue)*1000;
					gigamolsecond=(edtValue)*1000000;
					megamolsecond=(edtValue)*1000000000;
					kilomolsecond=(edtValue)*1000000000000.0;
					hectomolsecond=(edtValue)*10000000000000.0;
					
					dekamolsecond=(edtValue)*100000000000000.0;
					decimolsecond=(edtValue)*10000000000000000.0;
					centimolsecond=(edtValue)*100000000000000000.0;
					millimolsecond=(edtValue)*1000000000000000000.0;
					
					micromolsecond=(edtValue)*1.E+21;
					nanomolsecond=(edtValue)*1.E+24;
					picomolsecond=(edtValue)*1.E+27;
					femtomolsecond=(edtValue)*9.999999999E+29;
					attomolsecond=(edtValue)*1.E+33;
					
					molminute=(edtValue)*60000000000000000.0;
					molhour=(edtValue)*3600000000000000000.0;
					
					molday=(edtValue)*86400000000000000000.0;
					millimolminute=(edtValue)*60000000000000000000.0;
					
					millimolhour=(edtValue)*3.6E+21;
					millimolday=(edtValue)*8.64E+22;
					kilomolminute=(edtValue)*60000000000000.0;
					kilomolhour=(edtValue)*3600000000000000.0;
					kilomolday=(edtValue)*86400000000000000.0;
				
					
					break;
					
					
               case "Teramol/second -Tmol/s":
					
					molsecond=(edtValue)*1000000000000.0;
					examolsecond=(edtValue)*0.000001;
					petamolsecond=(edtValue)*0.001;
					teramolsecond=(edtValue)*1;
					gigamolsecond=(edtValue)*1000;
					megamolsecond=(edtValue)*1000000;
					kilomolsecond=(edtValue)*1000000000;
					hectomolsecond=(edtValue)*10000000000.0;
					
					dekamolsecond=(edtValue)*100000000000.0;
					decimolsecond=(edtValue)*10000000000000.0;
					centimolsecond=(edtValue)*100000000000000.0;
					millimolsecond=(edtValue)*1000000000000000.0;
					
					micromolsecond=(edtValue)*1000000000000000000.0;
					nanomolsecond=(edtValue)*1.E+21;
					picomolsecond=(edtValue)*1.E+24;
					femtomolsecond=(edtValue)*1.E+27;
					attomolsecond=(edtValue)*1.E+30;
					
					molminute=(edtValue)*60000000000000.0;
					molhour=(edtValue)*3600000000000000.0;
					
					molday=(edtValue)*86400000000000000.0;
					millimolminute=(edtValue)*60000000000000000.0;
					
					millimolhour=(edtValue)*3600000000000000000.0;
					millimolday=(edtValue)*86400000000000000000.0;
					kilomolminute=(edtValue)*60000000000.0;
					kilomolhour=(edtValue)*3600000000000.0;
					kilomolday=(edtValue)*86400000000000.0;
				
					
					break;
					
					
               case "Gigamol/second -Gmol/s":
					
					molsecond=(edtValue)*1000000000;
					examolsecond=(edtValue)*1.E-9;
					petamolsecond=(edtValue)*0.000001;
					teramolsecond=(edtValue)*0.001;
					gigamolsecond=(edtValue)*1;
					megamolsecond=(edtValue)*1000;
					kilomolsecond=(edtValue)*1000000;
					hectomolsecond=(edtValue)*10000000;
					
					dekamolsecond=(edtValue)*100000000.0;
					decimolsecond=(edtValue)*10000000000.0;
					centimolsecond=(edtValue)*100000000000.0;
					millimolsecond=(edtValue)*1000000000000.0;
					
					micromolsecond=(edtValue)*1000000000000000.0;
					nanomolsecond=(edtValue)*1000000000000000000.0;
					picomolsecond=(edtValue)*1.E+21;
					femtomolsecond=(edtValue)*1.E+24;
					attomolsecond=(edtValue)*1.E+27;
					
					molminute=(edtValue)*60000000000.0;
					molhour=(edtValue)*3600000000000.0;
					
					molday=(edtValue)*86400000000000.0;
					millimolminute=(edtValue)*60000000000000.0;
					
					millimolhour=(edtValue)*3600000000000000.0;
					millimolday=(edtValue)*86400000000000000.0;
					kilomolminute=(edtValue)*60000000;
					kilomolhour=(edtValue)*3600000000.0;
					kilomolday=(edtValue)*86400000000.0;
				
					
					break;
					
					
               case "Megamol/second -Mmol/s":
					
					molsecond=(edtValue)*1000000;
					examolsecond=(edtValue)*1.E-12;
					petamolsecond=(edtValue)*1.E-9;
					teramolsecond=(edtValue)*0.000001;
					gigamolsecond=(edtValue)*0.001;
					megamolsecond=(edtValue)*1;
					kilomolsecond=(edtValue)*1000;
					hectomolsecond=(edtValue)*10000;
					
					dekamolsecond=(edtValue)*100000;
					decimolsecond=(edtValue)*10000000;
					centimolsecond=(edtValue)*100000000;
					millimolsecond=(edtValue)*1000000000;
					
					micromolsecond=(edtValue)*1000000000000.0;
					nanomolsecond=(edtValue)*1000000000000000.0;
					picomolsecond=(edtValue)*1000000000000000000.0;
					femtomolsecond=(edtValue)*1.E+21;
					attomolsecond=(edtValue)*1.E+24;
					
					molminute=(edtValue)*60000000;
					molhour=(edtValue)*3600000000.0;
					
					molday=(edtValue)*86400000000.0;
					millimolminute=(edtValue)*60000000000.0;
					
					millimolhour=(edtValue)*3600000000000.0;
					millimolday=(edtValue)*86400000000000.0;
					kilomolminute=(edtValue)*60000;
					kilomolhour=(edtValue)*3600000;
					kilomolday=(edtValue)*86400000;
				
					
					break;
					
					
               case "Kilomol/second -kmol/s":
					
					molsecond=(edtValue)*1000;
					examolsecond=(edtValue)*1.E-15;
					petamolsecond=(edtValue)*1.E-12;
					teramolsecond=(edtValue)*1.E-9;
					gigamolsecond=(edtValue)*0.000001;
					megamolsecond=(edtValue)*0.001;
					kilomolsecond=(edtValue)*1;
					hectomolsecond=(edtValue)*10;
					
					dekamolsecond=(edtValue)*100;
					decimolsecond=(edtValue)*10000;
					centimolsecond=(edtValue)*100000;
					millimolsecond=(edtValue)*1000000;
					
					micromolsecond=(edtValue)*1000000000;
					nanomolsecond=(edtValue)*1000000000000.0;
					picomolsecond=(edtValue)*1000000000000000.0;
					femtomolsecond=(edtValue)*1000000000000000000.0;
					attomolsecond=(edtValue)*1.E+21;
					
					molminute=(edtValue)*60000;
					molhour=(edtValue)*3600000;
					
					molday=(edtValue)*86400000;
					millimolminute=(edtValue)*60000000;
					
					millimolhour=(edtValue)*3600000000.0;
					millimolday=(edtValue)*86400000000.0;
					kilomolminute=(edtValue)*60;
					kilomolhour=(edtValue)*3600;
					kilomolday=(edtValue)*86400;
				
					
					break;
					
               case "Hectomol/second -hmol/s":
					
					molsecond=(edtValue)*100;
					examolsecond=(edtValue)*1.E-16;
					petamolsecond=(edtValue)*1.E-13;
					teramolsecond=(edtValue)*1.E-10;
					gigamolsecond=(edtValue)*1.E-7;
					megamolsecond=(edtValue)*0.0001;
					kilomolsecond=(edtValue)*0.1;
					hectomolsecond=(edtValue)*1;
					
					dekamolsecond=(edtValue)*10;
					decimolsecond=(edtValue)*1000;
					centimolsecond=(edtValue)*10000;
					millimolsecond=(edtValue)*100000;
					
					micromolsecond=(edtValue)*100000000;
					nanomolsecond=(edtValue)*100000000000.0;
					picomolsecond=(edtValue)*100000000000000.0;
					femtomolsecond=(edtValue)*100000000000000000.0;
					attomolsecond=(edtValue)*100000000000000000000.0;
					
					molminute=(edtValue)*6000;
					molhour=(edtValue)*360000;
					
					molday=(edtValue)*8640000;
					millimolminute=(edtValue)*6000000;
					
					millimolhour=(edtValue)*360000000;
					millimolday=(edtValue)*8640000000.0;
					kilomolminute=(edtValue)*6;
					kilomolhour=(edtValue)*360;
					kilomolday=(edtValue)*8640;
				
					
					break;
					
               case "Dekamol/second -damol/s":
					
					molsecond=(edtValue)*10;
					examolsecond=(edtValue)*1.E-17;
					petamolsecond=(edtValue)*1.E-14;
					teramolsecond=(edtValue)*1.E-11;
					gigamolsecond=(edtValue)*1.E-8;
					megamolsecond=(edtValue)*0.00001;
					kilomolsecond=(edtValue)*0.01;
					hectomolsecond=(edtValue)*0.1;
					
					dekamolsecond=(edtValue)*1;
					decimolsecond=(edtValue)*100;
					centimolsecond=(edtValue)*1000;
					millimolsecond=(edtValue)*10000;
					
					micromolsecond=(edtValue)*10000000;
					nanomolsecond=(edtValue)*10000000000.0;
					picomolsecond=(edtValue)*10000000000000.0;
					femtomolsecond=(edtValue)*10000000000000000.0;
					attomolsecond=(edtValue)*10000000000000000000.0;
					
					molminute=(edtValue)*600;
					molhour=(edtValue)*36000;
					
					molday=(edtValue)*864000;
					millimolminute=(edtValue)*600000;
					
					millimolhour=(edtValue)*36000000;
					millimolday=(edtValue)*864000000;
					kilomolminute=(edtValue)*0.6;
					kilomolhour=(edtValue)*36;
					kilomolday=(edtValue)*864;
				
					
					break;
					
               case "Decimol/second -dmol/s":
					
					molsecond=(edtValue)*0.1;
					examolsecond=(edtValue)*1.E-19;
					petamolsecond=(edtValue)*1.E-16;
					teramolsecond=(edtValue)*1.E-13;
					gigamolsecond=(edtValue)*1.E-10;
					megamolsecond=(edtValue)*1.E-7;
					kilomolsecond=(edtValue)*0.0001;
					hectomolsecond=(edtValue)*0.001;
					
					dekamolsecond=(edtValue)*0.01;
					decimolsecond=(edtValue)*1;
					centimolsecond=(edtValue)*10;
					millimolsecond=(edtValue)*100;
					
					micromolsecond=(edtValue)*100000;
					nanomolsecond=(edtValue)*100000000;
					picomolsecond=(edtValue)*100000000000.0;
					femtomolsecond=(edtValue)*100000000000000.0;
					attomolsecond=(edtValue)*100000000000000000.0;
					
					molminute=(edtValue)*6;
					molhour=(edtValue)*360;
					
					molday=(edtValue)*8640;
					millimolminute=(edtValue)*6000;
					
					millimolhour=(edtValue)*360000;
					millimolday=(edtValue)*8640000;
					kilomolminute=(edtValue)*0.006;
					kilomolhour=(edtValue)*0.36;
					kilomolday=(edtValue)*8.64;
				
					
					break;
					
               case "Centimol/second -cmol/s":
					
					molsecond=(edtValue)*0.01;
					examolsecond=(edtValue)*1.E-20;
					petamolsecond=(edtValue)*1.E-17;
					teramolsecond=(edtValue)*1.E-14;
					gigamolsecond=(edtValue)*1.E-11;
					megamolsecond=(edtValue)*1.E-8;
					kilomolsecond=(edtValue)*0.00001;
					hectomolsecond=(edtValue)*0.0001;
					
					dekamolsecond=(edtValue)*0.001;
					decimolsecond=(edtValue)*0.1;
					centimolsecond=(edtValue)*1;
					millimolsecond=(edtValue)*10;
					
					micromolsecond=(edtValue)*10000;
					nanomolsecond=(edtValue)*10000000;
					picomolsecond=(edtValue)*10000000000.0;
					femtomolsecond=(edtValue)*10000000000000.0;
					attomolsecond=(edtValue)*10000000000000000.0;
					
					molminute=(edtValue)*0.6;
					molhour=(edtValue)*36;
					
					molday=(edtValue)*864;
					millimolminute=(edtValue)*600;
					
					millimolhour=(edtValue)*36000;
					millimolday=(edtValue)*864000;
					kilomolminute=(edtValue)*0.0006;
					kilomolhour=(edtValue)*0.036;
					kilomolday=(edtValue)*0.864;
				
					
					break;
					
               case "Millimol/second -mmol/s":
					
					molsecond=(edtValue)*0.001;
					examolsecond=(edtValue)*1.E-21;
					petamolsecond=(edtValue)*1.E-18;
					teramolsecond=(edtValue)*1.E-15;
					gigamolsecond=(edtValue)*1.E-12;
					megamolsecond=(edtValue)*1.E-9;
					kilomolsecond=(edtValue)*0.000001;
					hectomolsecond=(edtValue)*0.00001;
					
					dekamolsecond=(edtValue)*0.0001;
					decimolsecond=(edtValue)*0.01;
					centimolsecond=(edtValue)*0.1;
					millimolsecond=(edtValue)*1;
					
					micromolsecond=(edtValue)*1000;
					nanomolsecond=(edtValue)*1000000;
					picomolsecond=(edtValue)*1000000000;
					femtomolsecond=(edtValue)*1000000000000.0;
					attomolsecond=(edtValue)*1000000000000000.0;
					
					molminute=(edtValue)*0.06;
					molhour=(edtValue)*3.6;
					
					molday=(edtValue)*86.4;
					millimolminute=(edtValue)*60;
					
					millimolhour=(edtValue)*3600;
					millimolday=(edtValue)*86400;
					kilomolminute=(edtValue)*0.00006;
					kilomolhour=(edtValue)*0.0036;
					kilomolday=(edtValue)*0.0864;
				
					
					break;
					
               case "Micromol/second -μmol/s":
					
					molsecond=(edtValue)*0.000001;
					examolsecond=(edtValue)*1.E-24;
					petamolsecond=(edtValue)*1.E-21;
					teramolsecond=(edtValue)*1.E-18;
					gigamolsecond=(edtValue)*1.E-15;
					megamolsecond=(edtValue)*1.E-12;
					kilomolsecond=(edtValue)*1.E-9;
					hectomolsecond=(edtValue)*1.E-8;
					
					dekamolsecond=(edtValue)*1.E-7;
					decimolsecond=(edtValue)*0.00001;
					centimolsecond=(edtValue)*0.0001;
					millimolsecond=(edtValue)*0.001;
					
					micromolsecond=(edtValue)*1;
					nanomolsecond=(edtValue)*1000;
					picomolsecond=(edtValue)*1000000;
					femtomolsecond=(edtValue)*1000000000;
					attomolsecond=(edtValue)*1000000000000.0;
					
					molminute=(edtValue)*0.00006;
					molhour=(edtValue)*0.0036;
					
					molday=(edtValue)*0.0864;
					millimolminute=(edtValue)*0.06;
					
					millimolhour=(edtValue)*3.6;
					millimolday=(edtValue)*86.4;
					kilomolminute=(edtValue)*6.E-8;
					kilomolhour=(edtValue)*0.0000036;
					kilomolday=(edtValue)*0.0000864;
				
					
					break;
					
               case "Nanomol/second -nmol/s":
					
					molsecond=(edtValue)*1.E-9;
					examolsecond=(edtValue)*1.E-27;
					petamolsecond=(edtValue)*1.E-24;
					teramolsecond=(edtValue)*1.E-21;
					gigamolsecond=(edtValue)*1.E-18;
					megamolsecond=(edtValue)*1.E-15;
					kilomolsecond=(edtValue)*1.E-12;
					hectomolsecond=(edtValue)*1.E-11;
					
					dekamolsecond=(edtValue)*1.E-10;
					decimolsecond=(edtValue)*1.E-8;
					centimolsecond=(edtValue)*1.E-7;
					millimolsecond=(edtValue)*0.000001;
					
					micromolsecond=(edtValue)*0.001;
					nanomolsecond=(edtValue)*1;
					picomolsecond=(edtValue)*1000;
					femtomolsecond=(edtValue)*1000000;
					attomolsecond=(edtValue)*1000000000;
					
					molminute=(edtValue)*6.E-8;
					molhour=(edtValue)*0.0000036;
					
					molday=(edtValue)*0.0000864;
					millimolminute=(edtValue)*0.00006;
					
					millimolhour=(edtValue)*0.0036;
					millimolday=(edtValue)*0.0864;
					kilomolminute=(edtValue)*6.E-11;
					kilomolhour=(edtValue)*3.6E-9;
					kilomolday=(edtValue)*8.639999999E-8;
				
					
					break;
					
               case "Picomol/second -pmol/s":
					
					molsecond=(edtValue)*1.E-12;
					examolsecond=(edtValue)*9.999999999E-31;
					petamolsecond=(edtValue)*1.E-27;
					teramolsecond=(edtValue)*1.E-24;
					gigamolsecond=(edtValue)*1.E-21;
					megamolsecond=(edtValue)*1.E-18;
					kilomolsecond=(edtValue)*1.E-15;
					hectomolsecond=(edtValue)*1.E-14;
					
					dekamolsecond=(edtValue)*1.E-13;
					decimolsecond=(edtValue)*1.E-11;
					centimolsecond=(edtValue)*1.E-10;
					millimolsecond=(edtValue)*1.E-9;
					
					micromolsecond=(edtValue)*0.000001;
					nanomolsecond=(edtValue)*0.000001;
					picomolsecond=(edtValue)*1;
					femtomolsecond=(edtValue)*1000;
					attomolsecond=(edtValue)*1000000;
					
					molminute=(edtValue)*6.E-11;
					molhour=(edtValue)*3.6E-9;
					
					molday=(edtValue)*8.639999999E-8;
					millimolminute=(edtValue)*6.E-8;
					
					millimolhour=(edtValue)*0.0000036;
					millimolday=(edtValue)*0.0000864;
					kilomolminute=(edtValue)*6.E-14;
					kilomolhour=(edtValue)*3.6E-12;
					kilomolday=(edtValue)*8.64E-11;
				
					
					break;
					
               case "Femtomol/second -fmol/s":
					
					molsecond=(edtValue)*1.E-15;
					examolsecond=(edtValue)*1.E-33;
					petamolsecond=(edtValue)*1.E-30;
					teramolsecond=(edtValue)*1.E-27;
					gigamolsecond=(edtValue)*1.E-24;
					megamolsecond=(edtValue)*1.E-21;
					kilomolsecond=(edtValue)*1.E-18;
					hectomolsecond=(edtValue)*1.E-17;
					
					dekamolsecond=(edtValue)*1.E-16;
					decimolsecond=(edtValue)*1.E-14;
					centimolsecond=(edtValue)*1.E-13;
					millimolsecond=(edtValue)*1.E-12;
					
					micromolsecond=(edtValue)*1.E-9;
					nanomolsecond=(edtValue)*0.000001;
					picomolsecond=(edtValue)*0.001;
					femtomolsecond=(edtValue)*1;
					attomolsecond=(edtValue)*1000;
					
					molminute=(edtValue)*6.E-14;
					molhour=(edtValue)*3.6E-12;
					
					molday=(edtValue)*8.64E-11;
					millimolminute=(edtValue)*6.E-11;
					
					millimolhour=(edtValue)*3.6E-9;
					millimolday=(edtValue)*8.64E-8;
					kilomolminute=(edtValue)*6.E-17;
					kilomolhour=(edtValue)*3.6E-15;
					kilomolday=(edtValue)*8.64E-14;
				
					
					break;
               case "Attomol/second -amol/s":
					
					molsecond=(edtValue)*9.999999999E-19;
					examolsecond=(edtValue)*1.E-36;
					petamolsecond=(edtValue)*9.999999999E-34;
					teramolsecond=(edtValue)*9.999999999E-31;
					gigamolsecond=(edtValue)*1.E-27;
					megamolsecond=(edtValue)*1.E-24;
					kilomolsecond=(edtValue)*1.E-21;
					hectomolsecond=(edtValue)*1.E-20;
					
					dekamolsecond=(edtValue)*1.E-19;
					decimolsecond=(edtValue)*9.999999999E-18;
					centimolsecond=(edtValue)*1.E-16;
					millimolsecond=(edtValue)*9.999999999E-16;
					
					micromolsecond=(edtValue)*1.E-12;
					nanomolsecond=(edtValue)*1.E-9;
					picomolsecond=(edtValue)*0.000001;
					femtomolsecond=(edtValue)*0.001;
					attomolsecond=(edtValue)*1;
					
					molminute=(edtValue)*6.E-17;
					molhour=(edtValue)*3.6E-15;
					
					molday=(edtValue)*8.639999999E-14;
					millimolminute=(edtValue)*6.E-14;
					
					millimolhour=(edtValue)*3.599999999E-12;
					millimolday=(edtValue)*8.64E-11;
					kilomolminute=(edtValue)*5.999999999E-20;
					kilomolhour=(edtValue)*3.6E-18;
					kilomolday=(edtValue)*8.64E-17;
				
					
					break;
					
             
					
               case "Mol/minute -mol/min":
					
					molsecond=(edtValue)*0.0166666667;
					examolsecond=(edtValue)*1.666666666E-20;
					petamolsecond=(edtValue)*1.666666666E-17;
					teramolsecond=(edtValue)*1.666666666E-14;
					gigamolsecond=(edtValue)*1.666666666E-11;
					megamolsecond=(edtValue)*1.666666666E-8;
					kilomolsecond=(edtValue)*0.0000166667;
					hectomolsecond=(edtValue)*0.0001666667;
					
					dekamolsecond=(edtValue)*0.0016666667;
					decimolsecond=(edtValue)*0.1666666667;
					centimolsecond=(edtValue)*1.6666666667;
					millimolsecond=(edtValue)*16.666666667;
					
					micromolsecond=(edtValue)*16666.666667;
					nanomolsecond=(edtValue)*16666666.667;
					picomolsecond=(edtValue)*16666666667.0;
					femtomolsecond=(edtValue)*16666666666667.0;
					attomolsecond=(edtValue)*16666666666666668.0;
					
					molminute=(edtValue)*1;
					molhour=(edtValue)*60;
					
					molday=(edtValue)*1440;
					millimolminute=(edtValue)*1000;
					
					millimolhour=(edtValue)*60000;
					millimolday=(edtValue)*1440000;
					kilomolminute=(edtValue)*0.001;
					kilomolhour=(edtValue)*0.001;
					kilomolday=(edtValue)*1.44;
				
					
					break;
					
               case "Mol/hour -mol/h":
					
					molsecond=(edtValue)*0.0002777778;
					examolsecond=(edtValue)*2.777777777E-22;
					petamolsecond=(edtValue)*2.777777777E-19;
					teramolsecond=(edtValue)*2.777777777E-16;
					gigamolsecond=(edtValue)*2.777777777E-13;
					megamolsecond=(edtValue)*2.777777777E-10;
					kilomolsecond=(edtValue)*2.777777777E-7;
					hectomolsecond=(edtValue)*0.0000027778;
					
					dekamolsecond=(edtValue)*0.0000277778;
					decimolsecond=(edtValue)*0.0027777778;
					centimolsecond=(edtValue)*0.0277777778;
					millimolsecond=(edtValue)*0.2777777778;
					
					micromolsecond=(edtValue)*277.77777778;
					nanomolsecond=(edtValue)*277777.77778;
					picomolsecond=(edtValue)*277777777.78;
					femtomolsecond=(edtValue)*277777777778.0;
					attomolsecond=(edtValue)*277777777777778.0;
					
					molminute=(edtValue)*0.0166666667;
					molhour=(edtValue)*1;
					
					molday=(edtValue)*24;
					millimolminute=(edtValue)*16.666666667;
					
					millimolhour=(edtValue)*1000;
					millimolday=(edtValue)*24000;
					kilomolminute=(edtValue)*0.0000166667;
					kilomolhour=(edtValue)*0.001;
					kilomolday=(edtValue)*0.024;
				
					
					break;
					
               case "Mol/day -mol/d":
					
					molsecond=(edtValue)*0.0000115741;
					examolsecond=(edtValue)*1.157407407E-23;
					petamolsecond=(edtValue)*1.157407407E-20;
					teramolsecond=(edtValue)*1.157407407E-17;
					gigamolsecond=(edtValue)*1.157407407E-14;
					megamolsecond=(edtValue)*1.157407407E-11;
					kilomolsecond=(edtValue)*1.157407407E-8;
					hectomolsecond=(edtValue)*1.157407407E-7;
					
					dekamolsecond=(edtValue)*0.0000011574;
					decimolsecond=(edtValue)*0.0001157407;
					centimolsecond=(edtValue)*0.0011574074;
					millimolsecond=(edtValue)*0.0115740741;
					
					micromolsecond=(edtValue)*11.574074074;
					nanomolsecond=(edtValue)*11574.074074;
					picomolsecond=(edtValue)*11574074.074;
					femtomolsecond=(edtValue)*11574074074.0;
					attomolsecond=(edtValue)*11574074074074.0;
					
					molminute=(edtValue)*0.0006944444;
					molhour=(edtValue)*0.0416666667;
					
					molday=(edtValue)*1;
					millimolminute=(edtValue)*0.6944444444;
					
					millimolhour=(edtValue)*41.666666667;
					millimolday=(edtValue)*1000;
					kilomolminute=(edtValue)*6.944444444E-7;
					kilomolhour=(edtValue)*0.0000416667;
					kilomolday=(edtValue)*0.001;
				
					
					break;
					
               case "Millimol/minute -mmol/min":
					
					molsecond=(edtValue)*0.0000166667;
					examolsecond=(edtValue)*1.666666666E-23;
					petamolsecond=(edtValue)*1.666666666E-20;
					teramolsecond=(edtValue)*1.666666666E-17;
					gigamolsecond=(edtValue)*1.666666666E-14;
					megamolsecond=(edtValue)*1.666666666E-11;
					kilomolsecond=(edtValue)*1.666666666E-8;
					hectomolsecond=(edtValue)*1.666666666E-7;
					
					dekamolsecond=(edtValue)*0.0000016667;
					decimolsecond=(edtValue)*0.0001666667;
					centimolsecond=(edtValue)*0.0016666667;
					millimolsecond=(edtValue)*0.0166666667;
					
					micromolsecond=(edtValue)*16.666666667;
					nanomolsecond=(edtValue)*16666.666667;
					picomolsecond=(edtValue)*16666666.667;
					femtomolsecond=(edtValue)*16666666667.0;
					attomolsecond=(edtValue)*16666666666667.0;
					
					molminute=(edtValue)*0.001;
					molhour=(edtValue)*0.06;
					
					molday=(edtValue)*1.44;
					millimolminute=(edtValue)*1;
					
					millimolhour=(edtValue)*60;
					millimolday=(edtValue)*1440;
					kilomolminute=(edtValue)*0.000001;
					kilomolhour=(edtValue)*0.00006;
					kilomolday=(edtValue)*0.00144;
				
					
					break;
					
               case "Millimol/hour -mmol/h":
					
					molsecond=(edtValue)*2.777777777E-7;
					examolsecond=(edtValue)*2.777777777E-25;
					petamolsecond=(edtValue)*2.777777777E-22;
					teramolsecond=(edtValue)*2.777777777E-19;
					gigamolsecond=(edtValue)*2.777777777E-16;
					megamolsecond=(edtValue)*2.777777777E-13;
					kilomolsecond=(edtValue)*2.777777777E-10;
					hectomolsecond=(edtValue)*2.777777777E-9;
					
					dekamolsecond=(edtValue)*2.777777777E-8;
					decimolsecond=(edtValue)*0.0000027778;
					centimolsecond=(edtValue)*0.0000277778;
					millimolsecond=(edtValue)*0.0002777778;
					
					micromolsecond=(edtValue)*0.2777777778;
					nanomolsecond=(edtValue)*277.77777778;
					picomolsecond=(edtValue)*277777.77778;
					femtomolsecond=(edtValue)*277777777.78;
					attomolsecond=(edtValue)*277777777778.0;
					
					molminute=(edtValue)*0.0000166667;
					molhour=(edtValue)*0.001;
					
					molday=(edtValue)*0.024;
					millimolminute=(edtValue)*0.0166666667;
					
					millimolhour=(edtValue)*1;
					millimolday=(edtValue)*24;
					kilomolminute=(edtValue)*1.666666666E-8;
					kilomolhour=(edtValue)*0.000001;
					kilomolday=(edtValue)*0.000024;
				
					
					break;
					
               case "Millimol/day -mmol/d":
					
					molsecond=(edtValue)*1.157407407E-8;
					examolsecond=(edtValue)*1.157407407E-26;
					petamolsecond=(edtValue)*1.157407407E-23;
					teramolsecond=(edtValue)*1.157407407E-20;
					gigamolsecond=(edtValue)*1.157407407E-17;
					megamolsecond=(edtValue)*1.157407407E-14;
					kilomolsecond=(edtValue)*1.157407407E-11;
					hectomolsecond=(edtValue)*1.157407407E-10;
					
					dekamolsecond=(edtValue)*1.157407407E-9;
					decimolsecond=(edtValue)*1.157407407E-7;
					centimolsecond=(edtValue)*0.0000011574;
					millimolsecond=(edtValue)*0.0000115741;
					
					micromolsecond=(edtValue)*0.0115740741;
					nanomolsecond=(edtValue)*11.574074074;
					picomolsecond=(edtValue)*11574.074074;
					femtomolsecond=(edtValue)*11574074.074;
					attomolsecond=(edtValue)*11574074074.0;
					
					molminute=(edtValue)*6.944444444E-7;
					molhour=(edtValue)*0.0000416667;
					
					molday=(edtValue)*0.001;
					millimolminute=(edtValue)*0.0006944444;
					
					millimolhour=(edtValue)*0.0416666667;
					millimolday=(edtValue)*1;
					kilomolminute=(edtValue)*6.944444444E-10;
					kilomolhour=(edtValue)*4.166666666E-8;
					kilomolday=(edtValue)*0.000001;
				
					
					break;
					
               case "Kilomol/minute -kmol/min":
					
					molsecond=(edtValue)*16.666666667;
					examolsecond=(edtValue)*1.666666666E-17;
					petamolsecond=(edtValue)*1.666666666E-14;
					teramolsecond=(edtValue)*1.666666666E-11;
					gigamolsecond=(edtValue)*1.666666666E-8;
					megamolsecond=(edtValue)*0.0000166667;
					kilomolsecond=(edtValue)*0.0166666667;
					hectomolsecond=(edtValue)*0.1666666667;
					
					dekamolsecond=(edtValue)*1.6666666667;
					decimolsecond=(edtValue)*166.66666667;
					centimolsecond=(edtValue)*1666.6666667;
					millimolsecond=(edtValue)*16666.666667;
					
					micromolsecond=(edtValue)*16666666.667;
					nanomolsecond=(edtValue)*16666666667.0;
					picomolsecond=(edtValue)*16666666666667.0;
					femtomolsecond=(edtValue)*16666666666666666.0;
					attomolsecond=(edtValue)*16666666666666668000.0;
					
					molminute=(edtValue)*1000;
					molhour=(edtValue)*60000;
					
					molday=(edtValue)*1440000;
					millimolminute=(edtValue)*1000000;
					
					millimolhour=(edtValue)*60000000;
					millimolday=(edtValue)*1440000000;
					kilomolminute=(edtValue)*1;
					kilomolhour=(edtValue)*60;
					kilomolday=(edtValue)*1440;
				
					
					break;
					
               case "Kilomol/hour -kmol/h":
					
					molsecond=(edtValue)*0.2777777778;
					examolsecond=(edtValue)*2.777777777E-19;
					petamolsecond=(edtValue)*2.777777777E-16;
					teramolsecond=(edtValue)*2.777777777E-13;
					gigamolsecond=(edtValue)*2.777777777E-10;
					megamolsecond=(edtValue)*2.777777777E-7;
					kilomolsecond=(edtValue)*0.0002777778;
					hectomolsecond=(edtValue)*0.0027777778;
					
					dekamolsecond=(edtValue)*0.0277777778;
					decimolsecond=(edtValue)*2.7777777778;
					centimolsecond=(edtValue)*27.777777778;
					millimolsecond=(edtValue)*277.77777778;
					
					micromolsecond=(edtValue)*277777.77778;
					nanomolsecond=(edtValue)*277777777.78;
					picomolsecond=(edtValue)*277777777778.0;
					femtomolsecond=(edtValue)*277777777777778.0;
					attomolsecond=(edtValue)*277777777777777800.0;
					
					molminute=(edtValue)*16.666666667;
					molhour=(edtValue)*1000;
					
					molday=(edtValue)*24000;
					millimolminute=(edtValue)*16666.666667;
					
					millimolhour=(edtValue)*1000000;
					millimolday=(edtValue)*24000000;
					kilomolminute=(edtValue)*0.0166666667;
					kilomolhour=(edtValue)*1;
					kilomolday=(edtValue)*24;
				
					
					break;
					
               case "Kilomol/day -kmol/d":
					
					molsecond=(edtValue)*0.0115740741;
					examolsecond=(edtValue)*1.157407407E-20;
					petamolsecond=(edtValue)*1.157407407E-17;
					teramolsecond=(edtValue)*1.157407407E-14;
					gigamolsecond=(edtValue)*1.157407407E-11;
					megamolsecond=(edtValue)*1.157407407E-8;
					kilomolsecond=(edtValue)*0.0000115741;
					hectomolsecond=(edtValue)*0.0001157407;
					
					dekamolsecond=(edtValue)*0.0011574074;
					decimolsecond=(edtValue)*0.1157407407;
					centimolsecond=(edtValue)*1.1574074074;
					millimolsecond=(edtValue)*11.574074074;
					
					micromolsecond=(edtValue)*11574.074074;
					nanomolsecond=(edtValue)*11574074.074;
					picomolsecond=(edtValue)*11574074074.0;
					femtomolsecond=(edtValue)*11574074074074.0;
					attomolsecond=(edtValue)*11574074074074074.0;
					
					molminute=(edtValue)*0.6944444444;
					molhour=(edtValue)*41.666666667;
					
					molday=(edtValue)*1000;
					millimolminute=(edtValue)*694.44444444;
					
					millimolhour=(edtValue)*41666.666667;
					millimolday=(edtValue)*1000000;
					kilomolminute=(edtValue)*0.0006944444;
					kilomolhour=(edtValue)*0.0416666667;
					kilomolday=(edtValue)*1;
				
					
					break;
               
				}
				
				
				results. setMolsecond( molsecond) ;
				results. setExamolsecond( examolsecond) ;

				results. setPetamolsecond( petamolsecond); 

				results. setTeramolsecond( teramolsecond); 

				results. setGigamolsecond( gigamolsecond) ;

				results. setMegamolsecond( megamolsecond) ;

				results. setKilomolsecond( kilomolsecond) ;
				results. setHectomolsecond( hectomolsecond);

				results. setDekamolsecond( dekamolsecond);
				

				results. setDecimolsecond( decimolsecond);

				results. setCentimolsecond( centimolsecond) ;
				results. setMillimolsecond( millimolsecond);
				results. setMicromolsecond( micromolsecond) ;

				results. setNanomolsecond( nanomolsecond) ;

				results. setPicomolsecond( picomolsecond) ;

				results. setFemtomolsecond( femtomolsecond);

				results. setAttomolsecond( attomolsecond);

				results. setMolminute( molminute) ;

				results. setMolhour( molhour) ;

				results. setMolday( molday) ;
				
				results. setMillimolminute( millimolminute) ;
				results. setMillimolhour( millimolhour) ;

				results. setMillimolday( millimolday) ;
				results. setKilomolminute( kilomolminute) ;

				results. setKilomolhour( kilomolhour); 
				

				results. setKilomolday( kilomolday) ;
				converterArray.add(results);
			    return converterArray;

				
				
				
				
		    }
			public class ConversionResults{
				
				private double   molsecond , examolsecond, petamolsecond,teramolsecond, gigamolsecond, megamolsecond  ,kilomolsecond,hectomolsecond ,dekamolsecond,decimolsecond, centimolsecond , millimolsecond,micromolsecond,nanomolsecond, picomolsecond, femtomolsecond,attomolsecond ,  molminute  ,molhour , molday ,millimolminute,millimolhour ,millimolday,  kilomolminute ,kilomolhour , kilomolday   ;

				public double getMolsecond() {
					return molsecond;
				}

				public void setMolsecond(double molsecond) {
					this.molsecond = molsecond;
				}

				public double getExamolsecond() {
					return examolsecond;
				}

				public void setExamolsecond(double examolsecond) {
					this.examolsecond = examolsecond;
				}

				public double getPetamolsecond() {
					return petamolsecond;
				}

				public void setPetamolsecond(double petamolsecond) {
					this.petamolsecond = petamolsecond;
				}

				public double getTeramolsecond() {
					return teramolsecond;
				}

				public void setTeramolsecond(double teramolsecond) {
					this.teramolsecond = teramolsecond;
				}

				public double getGigamolsecond() {
					return gigamolsecond;
				}

				public void setGigamolsecond(double gigamolsecond) {
					this.gigamolsecond = gigamolsecond;
				}

				public double getMegamolsecond() {
					return megamolsecond;
				}

				public void setMegamolsecond(double megamolsecond) {
					this.megamolsecond = megamolsecond;
				}

				public double getKilomolsecond() {
					return kilomolsecond;
				}

				public void setKilomolsecond(double kilomolsecond) {
					this.kilomolsecond = kilomolsecond;
				}

				public double getHectomolsecond() {
					return hectomolsecond;
				}

				public void setHectomolsecond(double hectomolsecond) {
					this.hectomolsecond = hectomolsecond;
				}

				public double getDekamolsecond() {
					return dekamolsecond;
				}

				public void setDekamolsecond(double dekamolsecond) {
					this.dekamolsecond = dekamolsecond;
				}

				public double getDecimolsecond() {
					return decimolsecond;
				}

				public void setDecimolsecond(double decimolsecond) {
					this.decimolsecond = decimolsecond;
				}

				public double getCentimolsecond() {
					return centimolsecond;
				}

				public void setCentimolsecond(double centimolsecond) {
					this.centimolsecond = centimolsecond;
				}

				public double getMillimolsecond() {
					return millimolsecond;
				}

				public void setMillimolsecond(double millimolsecond) {
					this.millimolsecond = millimolsecond;
				}

				public double getMicromolsecond() {
					return micromolsecond;
				}

				public void setMicromolsecond(double micromolsecond) {
					this.micromolsecond = micromolsecond;
				}

				public double getNanomolsecond() {
					return nanomolsecond;
				}

				public void setNanomolsecond(double nanomolsecond) {
					this.nanomolsecond = nanomolsecond;
				}

				public double getPicomolsecond() {
					return picomolsecond;
				}

				public void setPicomolsecond(double picomolsecond) {
					this.picomolsecond = picomolsecond;
				}

				public double getFemtomolsecond() {
					return femtomolsecond;
				}

				public void setFemtomolsecond(double femtomolsecond) {
					this.femtomolsecond = femtomolsecond;
				}

				public double getAttomolsecond() {
					return attomolsecond;
				}

				public void setAttomolsecond(double attomolsecond) {
					this.attomolsecond = attomolsecond;
				}

				public double getMolminute() {
					return molminute;
				}

				public void setMolminute(double molminute) {
					this.molminute = molminute;
				}

				public double getMolhour() {
					return molhour;
				}

				public void setMolhour(double molhour) {
					this.molhour = molhour;
				}

				public double getMolday() {
					return molday;
				}

				public void setMolday(double molday) {
					this.molday = molday;
				}

				public double getMillimolminute() {
					return millimolminute;
				}

				public void setMillimolminute(double millimolminute) {
					this.millimolminute = millimolminute;
				}

				public double getMillimolhour() {
					return millimolhour;
				}

				public void setMillimolhour(double millimolhour) {
					this.millimolhour = millimolhour;
				}

				public double getMillimolday() {
					return millimolday;
				}

				public void setMillimolday(double millimolday) {
					this.millimolday = millimolday;
				}

				public double getKilomolminute() {
					return kilomolminute;
				}

				public void setKilomolminute(double kilomolminute) {
					this.kilomolminute = kilomolminute;
				}

				public double getKilomolhour() {
					return kilomolhour;
				}

				public void setKilomolhour(double kilomolhour) {
					this.kilomolhour = kilomolhour;
				}

				public double getKilomolday() {
					return kilomolday;
				}

				public void setKilomolday(double kilomolday) {
					this.kilomolday = kilomolday;
				}

				
			}
			}

