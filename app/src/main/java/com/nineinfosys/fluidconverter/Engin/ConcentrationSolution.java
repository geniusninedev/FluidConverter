package com.nineinfosys.fluidconverter.Engin;

import java.util.ArrayList;


public class ConcentrationSolution {
	
	
	private double   kilogramperlite,  gramperliter, milligramperliter , partmillion , graingallonUS , graingallonUK ,poundgallonUS ,poundgallonUK,poundmilliongallonUS,poundmilliongallonUK,poundpercubicfoot   ;
	private String conversionFrom;
	private double edtValue;
	
			
			public ConcentrationSolution(String conversionFrom, double edtValue) {
				// TODO Auto-generated constructor stub
				this.conversionFrom = conversionFrom;
				this.edtValue = edtValue;
			}

			public ArrayList<ConversionResults> calculateConcentrationSolutionConversion()
		    {
		    	
				ArrayList<ConversionResults> converterArray = new ArrayList<ConversionResults>();
					
				ConversionResults results= new ConversionResults();
		    		 	
				switch(conversionFrom)
				{
				case "Kilogram/liter -kg/L":
					
					kilogramperlite=(edtValue)*1;
					gramperliter=(edtValue)*1000;
					milligramperliter=(edtValue)*1000000;
					partmillion=(edtValue)*1001142.303;
					graingallonUS=(edtValue)*58417.8306;
					graingallonUK=(edtValue)*70156.88929;
					poundgallonUS=(edtValue)*8.345404374;
					poundgallonUK=(edtValue)*10.02241276;
					poundmilliongallonUS=(edtValue)*8345404.374;
					poundmilliongallonUK=(edtValue)*10022412.76;
					poundpercubicfoot=(edtValue)*62.42796;
				
					break;
					
case "Gram/liter -g/L":
					
					kilogramperlite=(edtValue)*0.001;
					gramperliter=(edtValue)*1;
					milligramperliter=(edtValue)*1000;
					partmillion=(edtValue)*1001.142303;
					graingallonUS=(edtValue)*58.4178306;
					graingallonUK=(edtValue)*70.15688929;
					poundgallonUS=(edtValue)*0.0083454044;
					poundgallonUK=(edtValue)*0.0100224128;
					poundmilliongallonUS=(edtValue)*8345.404374;
					poundmilliongallonUK=(edtValue)*10022.41276;
					poundpercubicfoot=(edtValue)*0.06242796;
				
					break;
case "Milligram/liter -mg/L":
	
	kilogramperlite=(edtValue)*0.000001;
	gramperliter=(edtValue)*0.001;
	milligramperliter=(edtValue)*1;
	partmillion=(edtValue)*1.001142303;
	graingallonUS=(edtValue)*0.0584178306;
	graingallonUK=(edtValue)*0.0701568893;
	poundgallonUS=(edtValue)*0.0000083454;
	poundgallonUK=(edtValue)*0.0000100224;
	poundmilliongallonUS=(edtValue)*8.345404374;
	poundmilliongallonUK=(edtValue)*10.02241276;
	poundpercubicfoot=(edtValue)*0.000062428;

	break;
case "Part/million (ppm) -p/m":
	
	kilogramperlite=(edtValue)*9.988590003E-7;
	gramperliter=(edtValue)*0.000998859;
	milligramperliter=(edtValue)*0.9988590004;
	partmillion=(edtValue)*1;
	graingallonUS=(edtValue)*0.0583511759;
	graingallonUK=(edtValue)*0.0700768403;
	poundgallonUS=(edtValue)*0.0000083359;
	poundgallonUK=(edtValue)*0.000010011;
	poundmilliongallonUS=(edtValue)*8.3358822707;
	poundmilliongallonUK=(edtValue)*10.010977191;
	poundpercubicfoot=(edtValue)*0.0000623567;

	break;
case "Grain/gallon (US) -gr/gal(US)":
	
	kilogramperlite=(edtValue)*0.0000171181;
	gramperliter=(edtValue)*0.0171180612;
	milligramperliter=(edtValue)*17.118061211;
	partmillion=(edtValue)*17.137615223;
	graingallonUS=(edtValue)*1;
	graingallonUK=(edtValue)*1.2009499252;
	poundgallonUS=(edtValue)*0.0001428571;
	poundgallonUK=(edtValue)*0.0001715643;
	poundmilliongallonUS=(edtValue)*142.8571429;
	poundmilliongallonUK=(edtValue)*171.5642751;
	poundpercubicfoot=(edtValue)*0.0010686456;

	break;
case "Grain/gallon (UK) -gr/gal(UK)":
	
	kilogramperlite=(edtValue)*0.0000142538;
	gramperliter=(edtValue)*0.0142537677;
	milligramperliter=(edtValue)*14.253767664;
	partmillion=(edtValue)*14.270049786;
	graingallonUS=(edtValue)*0.8326741848;
	graingallonUK=(edtValue)*1;
	poundgallonUS=(edtValue)*10.0001189535;
	poundgallonUK=(edtValue)*0.0001428571;
	poundmilliongallonUS=(edtValue)*118.95345501;
	poundmilliongallonUK=(edtValue)*142.85714292;
	poundpercubicfoot=(edtValue)*0.0008898336;

	break;
case "Pound/gallon (US) -lb/gal(US)":
	
	kilogramperlite=(edtValue)*0.1198264284;
	gramperliter=(edtValue)*119.82642844;
	milligramperliter=(edtValue)*119826.42844;
	partmillion=(edtValue)*119963.30653;
	graingallonUS=(edtValue)*6999.9999978;
	graingallonUK=(edtValue)*8406.6494739;
	poundgallonUS=(edtValue)*1;
	poundgallonUK=(edtValue)*1.2009499254;
	poundmilliongallonUS=(edtValue)*1000000;
	poundmilliongallonUK=(edtValue)*1200949.9254;
	poundpercubicfoot=(edtValue)*7.4805194814;

	break;
case "Pound/gallon (UK) -lb/gal(UK)":
	
	kilogramperlite=(edtValue)*0.0997763736;
	gramperliter=(edtValue)*99.776373608;
	milligramperliter=(edtValue)*99776.373608;
	partmillion=(edtValue)*99890.348459;
	graingallonUS=(edtValue)*5828.7192913;
	graingallonUK=(edtValue)*6999.999997;
	poundgallonUS=(edtValue)*0.8326741847;
	poundgallonUK=(edtValue)*1;
	poundmilliongallonUS=(edtValue)*832674.18473;
	poundmilliongallonUK=(edtValue)*1000000;
	poundpercubicfoot=(edtValue)*6.2288354606;

	break;
case "Pound/million gallon (US) -lb/mgal(US)":
	
	kilogramperlite=(edtValue)*1.198264284E-7;
	gramperliter=(edtValue)*0.0001198264;
	milligramperliter=(edtValue)*0.1198264284;
	partmillion=(edtValue)*0.1199633065;
	graingallonUS=(edtValue)*0.007;
	graingallonUK=(edtValue)*0.0084066495;
	poundgallonUS=(edtValue)*0.000001;
	poundgallonUK=(edtValue)*0.0000012009;
	poundmilliongallonUS=(edtValue)*1;
	poundmilliongallonUK=(edtValue)*1.2009499254;
	poundpercubicfoot=(edtValue)*0.0000074805;

	break;
case "Pound/million gallon (UK) -lb/mgal(UK)":
	
	kilogramperlite=(edtValue)*9.97763736E-8;
	gramperliter=(edtValue)*0.0000997764;
	milligramperliter=(edtValue)*0.0997763736;
	partmillion=(edtValue)*0.0998903485;
	graingallonUS=(edtValue)*0.0058287193;
	graingallonUK=(edtValue)*0.007;
	poundgallonUS=(edtValue)*8.326741847E-7;
	poundgallonUK=(edtValue)*0.000001;
	poundmilliongallonUS=(edtValue)*0.8326741847;
	poundmilliongallonUK=(edtValue)*1;
	poundpercubicfoot=(edtValue)*0.0000062288;

	break;
case "Pound/cubic foot -lb/ft^3":
	
	kilogramperlite=(edtValue)*0.0160184635;
	gramperliter=(edtValue)*16.018463522;
	milligramperliter=(edtValue)*16018.463522;
	partmillion=(edtValue)*16036.761461;
	graingallonUS=(edtValue)*935.76388849;
	graingallonUK=(edtValue)*1123.8055719;
	poundgallonUS=(edtValue)*0.1336805555;
	poundgallonUK=(edtValue)*0.1605436532;
	poundmilliongallonUS=(edtValue)*133680.55554;
	poundmilliongallonUK=(edtValue)*160543.6532;
	poundpercubicfoot=(edtValue)*1;
break;

	
					
					
					
				}
				
				
				results. setKilogramperlite( kilogramperlite);

				results. setGramperliter( gramperliter); 
				results. setMilligramperliter( milligramperliter);

				results. setPartmillion( partmillion);

				results. setGraingallonUS( graingallonUS);

				results. setGraingallonUK( graingallonUK);
				results. setPoundgallonUS( poundgallonUS) ;

				results. setPoundgallonUK( poundgallonUK);

				results. setPoundmilliongallonUS( poundmilliongallonUS);

				results. setPoundmilliongallonUK( poundmilliongallonUK) ;

				results. setPoundpercubicfoot( poundpercubicfoot) ;
				
				converterArray.add(results);
			    return converterArray;
			
	    }

		
		public class ConversionResults{
			
			private double   kilogramperlite,  gramperliter, milligramperliter , partmillion , graingallonUS , graingallonUK ,poundgallonUS ,poundgallonUK,poundmilliongallonUS,poundmilliongallonUK,poundpercubicfoot   ;

			public double getKilogramperlite() {
				return kilogramperlite;
			}

			public void setKilogramperlite(double kilogramperlite) {
				this.kilogramperlite = kilogramperlite;
			}

			public double getGramperliter() {
				return gramperliter;
			}

			public void setGramperliter(double gramperliter) {
				this.gramperliter = gramperliter;
			}

			public double getMilligramperliter() {
				return milligramperliter;
			}

			public void setMilligramperliter(double milligramperliter) {
				this.milligramperliter = milligramperliter;
			}

			public double getPartmillion() {
				return partmillion;
			}

			public void setPartmillion(double partmillion) {
				this.partmillion = partmillion;
			}

			public double getGraingallonUS() {
				return graingallonUS;
			}

			public void setGraingallonUS(double graingallonUS) {
				this.graingallonUS = graingallonUS;
			}

			public double getGraingallonUK() {
				return graingallonUK;
			}

			public void setGraingallonUK(double graingallonUK) {
				this.graingallonUK = graingallonUK;
			}

			public double getPoundgallonUS() {
				return poundgallonUS;
			}

			public void setPoundgallonUS(double poundgallonUS) {
				this.poundgallonUS = poundgallonUS;
			}

			public double getPoundgallonUK() {
				return poundgallonUK;
			}

			public void setPoundgallonUK(double poundgallonUK) {
				this.poundgallonUK = poundgallonUK;
			}

			public double getPoundmilliongallonUS() {
				return poundmilliongallonUS;
			}

			public void setPoundmilliongallonUS(double poundmilliongallonUS) {
				this.poundmilliongallonUS = poundmilliongallonUS;
			}

			public double getPoundmilliongallonUK() {
				return poundmilliongallonUK;
			}

			public void setPoundmilliongallonUK(double poundmilliongallonUK) {
				this.poundmilliongallonUK = poundmilliongallonUK;
			}

			public double getPoundpercubicfoot() {
				return poundpercubicfoot;
			}

			public void setPoundpercubicfoot(double poundpercubicfoot) {
				this.poundpercubicfoot = poundpercubicfoot;
			}
	
			
		}

}
