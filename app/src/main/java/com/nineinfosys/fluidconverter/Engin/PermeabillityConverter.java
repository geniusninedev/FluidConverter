package com.nineinfosys.fluidconverter.Engin;

import java.util.ArrayList;


public class PermeabillityConverter {
	
	private double  kilogramperpascalpersecondpersquaremeter ,  permeability0degree, permeability23degree, permeabilityinches,  permeabilityinches23C  ;
	private String conversionFrom;
	private double edtValue;
	
			
			public PermeabillityConverter(String conversionFrom, double edtValue) {
				// TODO Auto-generated constructor stub
				this.conversionFrom = conversionFrom;
				this.edtValue = edtValue;
			}

			public ArrayList<ConversionResults> calculatePermeabillityConverterConversion()
		    {
		    	
				ArrayList<ConversionResults> converterArray = new ArrayList<ConversionResults>();
					
				ConversionResults results= new ConversionResults();
		    		 	
				switch(conversionFrom)
				{
				case "Kilogram/pascal/second/square meter -kg/Pa/s/m^2":
					
					kilogramperpascalpersecondpersquaremeter=(edtValue)*1;
					permeability0degree=(edtValue)*17478392337.0;
					permeability23degree=(edtValue)*17405682955.0;
					permeabilityinches=(edtValue)*688127055780.0;
					permeabilityinches23C=(edtValue)*685264752037.0;
					
					break;

           case "Permeability (0°C) -µ (0°C)":
					
        	   kilogramperpascalpersecondpersquaremeter=(edtValue)*5.721349999E-11;
				permeability0degree=(edtValue)*1;
				permeability23degree=(edtValue)*0.9958400418;
				permeabilityinches=(edtValue)*39.370157306;
				permeabilityinches23C=(edtValue)*39.206394891;
					
					break;
					
           case "Permeability (23°C) -µ (23°C)":
				
        	   kilogramperpascalpersecondpersquaremeter=(edtValue)*5.745249999E-11;
				permeability0degree=(edtValue)*1.0041773358;
				permeability23degree=(edtValue)*1;
				permeabilityinches=(edtValue)*39.534619672;
				permeabilityinches23C=(edtValue)*39.370173166;
				
				break;
				
           case "Permeability inches (0°C) -µ in(0°C)":
				
				kilogramperpascalpersecondpersquaremeter=(edtValue)*1.453219999E-12;
				permeability0degree=(edtValue)*0.0253999493;
				permeability23degree=(edtValue)*0.0252942866;
				permeabilityinches=(edtValue)*1;
				permeabilityinches23C=(edtValue)*0.995840443;
				
				break;
				
           case "Permeability inches (23°C) -µ in(23°C)":
				
				kilogramperpascalpersecondpersquaremeter=(edtValue)*1.459289999E-12;
				permeability0degree=(edtValue)*0.0255060432;
				permeability23degree=(edtValue)*0.0253999391;
				permeabilityinches=(edtValue)*1.0041769312;
				permeabilityinches23C=(edtValue)*1;
			   break;
			
					
				}
				
				
				results. setKilogramperpascalpersecondpersquaremeter( kilogramperpascalpersecondpersquaremeter);

				
				results. setPermeability0degree( permeability0degree) ;

				results. setPermeability23degree( permeability23degree) ;

				results. setPermeabilityinches( permeabilityinches) ;
				

				results. setPermeabilityinches23C( permeabilityinches23C);

				
				
				
				
				
				
				
				
				
				
				
				converterArray.add(results);
			    return converterArray;
			
	    }

		
		public class ConversionResults{
			
			private double  kilogramperpascalpersecondpersquaremeter ,  permeability0degree, permeability23degree, permeabilityinches,  permeabilityinches23C  ;

			public double getKilogramperpascalpersecondpersquaremeter() {
				return kilogramperpascalpersecondpersquaremeter;
			}

			public void setKilogramperpascalpersecondpersquaremeter(double kilogramperpascalpersecondpersquaremeter) {
				this.kilogramperpascalpersecondpersquaremeter = kilogramperpascalpersecondpersquaremeter;
			}

			public double getPermeability0degree() {
				return permeability0degree;
			}

			public void setPermeability0degree(double permeability0degree) {
				this.permeability0degree = permeability0degree;
			}

			public double getPermeability23degree() {
				return permeability23degree;
			}

			public void setPermeability23degree(double permeability23degree) {
				this.permeability23degree = permeability23degree;
			}

			public double getPermeabilityinches() {
				return permeabilityinches;
			}

			public void setPermeabilityinches(double permeabilityinches) {
				this.permeabilityinches = permeabilityinches;
			}

			public double getPermeabilityinches23C() {
				return permeabilityinches23C;
			}

			public void setPermeabilityinches23C(double permeabilityinches23c) {
				permeabilityinches23C = permeabilityinches23c;
			}

		}
}
