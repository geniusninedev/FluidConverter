package com.nineinfosys.fluidconverter.Engin;

import java.util.ArrayList;


public class MassFluxDensity {
	
	
	
	private double  gramsecondpersquaremeter,  kilogramperhourpersquaremeter, kilogramperhourpersquarefoot ,kilogramsecondsquaremeter, gramsecondsqcentimeter, poundhourpersquarefoot ,poundsecondsquarefoot  ;
	private String conversionFrom;
	private double edtValue;
	
			
			public MassFluxDensity(String conversionFrom, double edtValue) {
				// TODO Auto-generated constructor stub
				this.conversionFrom = conversionFrom;
				this.edtValue = edtValue;
			}

			public ArrayList<ConversionResults> calculateMassFluxDensityConversion()
		    {
		    	
				ArrayList<ConversionResults> converterArray = new ArrayList<ConversionResults>();
					
				ConversionResults results= new ConversionResults();
		    		 	
				switch(conversionFrom)
				{
				case "Gram/second/square meter -gs/m^2":
					
					gramsecondpersquaremeter=(edtValue)*1;
					kilogramperhourpersquaremeter=(edtValue)*3.5999999997;
					kilogramperhourpersquarefoot=(edtValue)*0.3344509438;
					kilogramsecondsquaremeter=(edtValue)*0.001;
					gramsecondsqcentimeter=(edtValue)*0.0001;
					poundhourpersquarefoot=(edtValue)*0.7373381093;
					poundsecondsquarefoot=(edtValue)*0.0002048161;
				
				
					break;
					
					
	               case "Kilogram/hour/square meter -kgh/m^2":
					
					gramsecondpersquaremeter=(edtValue)*0.2777777778;
					kilogramperhourpersquaremeter=(edtValue)*1;
					kilogramperhourpersquarefoot=(edtValue)*0.09290304;
					kilogramsecondsquaremeter=(edtValue)*0.0002777778;
					gramsecondsqcentimeter=(edtValue)*0.0000277778;
					poundhourpersquarefoot=(edtValue)*0.2048161415;
					poundsecondsquarefoot=(edtValue)*0.0000568934;
				
				
					break;
					
					
					
	               case "Kilogram/hour/square foot -kgh/ft^2":
					
					gramsecondpersquaremeter=(edtValue)*2.9899751173;
					kilogramperhourpersquaremeter=(edtValue)*10.763910421;
					kilogramperhourpersquarefoot=(edtValue)*1;
					kilogramsecondsquaremeter=(edtValue)*0.0029899751;
					gramsecondsqcentimeter=(edtValue)*0.0002989975;
					poundhourpersquarefoot=(edtValue)*2.2046226;
					poundsecondsquarefoot=(edtValue)*0.0006123952;
				
				
					break;
					
					
					
	case "Kilogram/second/square meter -kgs/m^2":
					
					gramsecondpersquaremeter=(edtValue)*1000;
					kilogramperhourpersquaremeter=(edtValue)*3599.9999997;
					kilogramperhourpersquarefoot=(edtValue)*334.45094383;
					kilogramsecondsquaremeter=(edtValue)*1;
					gramsecondsqcentimeter=(edtValue)*0.1;
					poundhourpersquarefoot=(edtValue)*737.33810934;
					poundsecondsquarefoot=(edtValue)*0.2048161415;
				
				
					break;
					
	case "Gram/second/sq. centimeter -gs/cm^2":
		
		gramsecondpersquaremeter=(edtValue)*10000;
		kilogramperhourpersquaremeter=(edtValue)*35999.999997;
		kilogramperhourpersquarefoot=(edtValue)*3344.5094383;
		kilogramsecondsquaremeter=(edtValue)*10;
		gramsecondsqcentimeter=(edtValue)*1;
		poundhourpersquarefoot=(edtValue)*7373.3810934;
		poundsecondsquarefoot=(edtValue)*2.0481614149;
	
	
		break;
		
	case "Pound/hour/square foot -lbh/ft^2":
		
		gramsecondpersquaremeter=(edtValue)*1.3562299132;
		kilogramperhourpersquaremeter=(edtValue)*4.882427687;
		kilogramperhourpersquarefoot=(edtValue)*0.4535923745;
		kilogramsecondsquaremeter=(edtValue)*0.0013562299;
		gramsecondsqcentimeter=(edtValue)*0.000135623;
		poundhourpersquarefoot=(edtValue)*1;
		poundsecondsquarefoot=(edtValue)*0.0002777778;
	
	
		break;
		
	case "Pound/second/square foot -lbs/ft^2":
		
		gramsecondpersquaremeter=(edtValue)*4882.4276873;
		kilogramperhourpersquaremeter=(edtValue)*17576.739673;
		kilogramperhourpersquarefoot=(edtValue)*1632.9325482;
		kilogramsecondsquaremeter=(edtValue)*4.8824276873;
		gramsecondsqcentimeter=(edtValue)*0.4882427687;
		poundhourpersquarefoot=(edtValue)*3599.9999999;
		poundsecondsquarefoot=(edtValue)*1;
	
	break;
					
				}
				
				results. setGramsecondpersquaremeter( gramsecondpersquaremeter); 

				

				results. setKilogramperhourpersquaremeter( kilogramperhourpersquaremeter) ;

				results. setKilogramperhourpersquarefoot( kilogramperhourpersquarefoot) ;

				results. setKilogramsecondsquaremeter( kilogramsecondsquaremeter);

				results. setGramsecondsqcentimeter( gramsecondsqcentimeter);

				results. setPoundhourpersquarefoot( poundhourpersquarefoot) ;

				results. setPoundsecondsquarefoot( poundsecondsquarefoot) ;
				
				
				
				converterArray.add(results);
			    return converterArray;
			
	    }

		
		public class ConversionResults{
			
			private double  gramsecondpersquaremeter,  kilogramperhourpersquaremeter, kilogramperhourpersquarefoot ,kilogramsecondsquaremeter, gramsecondsqcentimeter, poundhourpersquarefoot ,poundsecondsquarefoot  ;

			public double getGramsecondpersquaremeter() {
				return gramsecondpersquaremeter;
			}

			public void setGramsecondpersquaremeter(double gramsecondpersquaremeter) {
				this.gramsecondpersquaremeter = gramsecondpersquaremeter;
			}

			public double getKilogramperhourpersquaremeter() {
				return kilogramperhourpersquaremeter;
			}

			public void setKilogramperhourpersquaremeter(double kilogramperhourpersquaremeter) {
				this.kilogramperhourpersquaremeter = kilogramperhourpersquaremeter;
			}

			public double getKilogramperhourpersquarefoot() {
				return kilogramperhourpersquarefoot;
			}

			public void setKilogramperhourpersquarefoot(double kilogramperhourpersquarefoot) {
				this.kilogramperhourpersquarefoot = kilogramperhourpersquarefoot;
			}

			public double getKilogramsecondsquaremeter() {
				return kilogramsecondsquaremeter;
			}

			public void setKilogramsecondsquaremeter(double kilogramsecondsquaremeter) {
				this.kilogramsecondsquaremeter = kilogramsecondsquaremeter;
			}

			public double getGramsecondsqcentimeter() {
				return gramsecondsqcentimeter;
			}

			public void setGramsecondsqcentimeter(double gramsecondsqcentimeter) {
				this.gramsecondsqcentimeter = gramsecondsqcentimeter;
			}

			public double getPoundhourpersquarefoot() {
				return poundhourpersquarefoot;
			}

			public void setPoundhourpersquarefoot(double poundhourpersquarefoot) {
				this.poundhourpersquarefoot = poundhourpersquarefoot;
			}

			public double getPoundsecondsquarefoot() {
				return poundsecondsquarefoot;
			}

			public void setPoundsecondsquarefoot(double poundsecondsquarefoot) {
				this.poundsecondsquarefoot = poundsecondsquarefoot;
			}

			
		}
}
