package com.nineinfosys.fluidconverter.Engin;

import java.util.ArrayList;


public class ConcentrationMolarConverter {
	
	private double molpercubicmeter,molperliter,molpercubiccm,molcubicmm,kilomolcubicmeter,kilomolliter,kilomolcubiccm,kilomolcubicmm,milimolcubicmeter,milimolliter,milimolcubiccm,milimolcubicmm;
	

	private double edtValue;
	private String conversionFrom;
	
			
			public ConcentrationMolarConverter(String conversionFrom, double edtValue) {
				// TODO Auto-generated constructor stub
				this.conversionFrom = conversionFrom;
				this.edtValue = edtValue;
			}

			public ArrayList<ConversionResults> calculateConcentrationConversion()
		    {
		    	
				ArrayList<ConversionResults> converterArray = new ArrayList<ConversionResults>();
					
				ConversionResults results= new ConversionResults();
		    		 	
				switch(conversionFrom)
				{
				case "Mol/cubic meter -mol/m^3":
					
					molpercubicmeter=(edtValue)*1;
					molperliter=(edtValue)*0.001;
					molpercubiccm=(edtValue)*0.000001;
					molcubicmm=(edtValue)*1.E-9;
					kilomolcubicmeter=(edtValue)*0.001;
					kilomolliter=(edtValue)*0.000001;
					kilomolcubiccm=(edtValue)*1.E-9;
					kilomolcubicmm=(edtValue)*1.E-12;
					milimolcubicmeter=(edtValue)*1000;
					milimolliter=(edtValue)*1;
					milimolcubiccm=(edtValue)*0.001;
					milimolcubicmm=(edtValue)*0.000001;
				break;
				
              case "Mol/liter -mol/L":
					
					molpercubicmeter=(edtValue)*1000;
					molperliter=(edtValue)*1;
					molpercubiccm=(edtValue)*0.001;
					molcubicmm=(edtValue)*0.000001;
					kilomolcubicmeter=(edtValue)*1;
					kilomolliter=(edtValue)*0.001;
					kilomolcubiccm=(edtValue)*0.000001;
					kilomolcubicmm=(edtValue)*1.E-9;
					milimolcubicmeter=(edtValue)*1000000;
					milimolliter=(edtValue)*1000;
					milimolcubiccm=(edtValue)*1;
					milimolcubicmm=(edtValue)*0.001;
				break;
				
              case "Mol/cubic centimeter -mol/cm^3":
					
					molpercubicmeter=(edtValue)*1000000;
					molperliter=(edtValue)*1000;
					molpercubiccm=(edtValue)*1;
					molcubicmm=(edtValue)*0.001;
					kilomolcubicmeter=(edtValue)*1000;
					kilomolliter=(edtValue)*1;
					kilomolcubiccm=(edtValue)*0.001;
					kilomolcubicmm=(edtValue)*0.000001;
					milimolcubicmeter=(edtValue)*1000000000;
					milimolliter=(edtValue)*1000000;
					milimolcubiccm=(edtValue)*1000;
					milimolcubicmm=(edtValue)*1;
				break;
				
              case "Mol/cubic millimeter -mol/mm^3":
					
					molpercubicmeter=(edtValue)*1000000000;
					molperliter=(edtValue)*1000000;
					molpercubiccm=(edtValue)*1000;
					molcubicmm=(edtValue)*1;
					kilomolcubicmeter=(edtValue)*1000000;
					kilomolliter=(edtValue)*1000;
					kilomolcubiccm=(edtValue)*1;
					kilomolcubicmm=(edtValue)*0.001;
					milimolcubicmeter=(edtValue)*1000000000000.0;
					milimolliter=(edtValue)*1000000000.0;
					milimolcubiccm=(edtValue)*1000000;
					milimolcubicmm=(edtValue)*1000;
				break;
				
              case "Kilomol/cubic meter -kmol/m^3":
					
					molpercubicmeter=(edtValue)*1000;
					molperliter=(edtValue)*1;
					molpercubiccm=(edtValue)*0.001;
					molcubicmm=(edtValue)*0.000001;
					kilomolcubicmeter=(edtValue)*1;
					kilomolliter=(edtValue)*0.001;
					kilomolcubiccm=(edtValue)*0.000001;
					kilomolcubicmm=(edtValue)*1.E-9;
					milimolcubicmeter=(edtValue)*1000000;
					milimolliter=(edtValue)*1000;
					milimolcubiccm=(edtValue)*1;
					milimolcubicmm=(edtValue)*0.001;
				break;
              case "Kilomol/liter -kmol/L":
					
					molpercubicmeter=(edtValue)*1000000;
					molperliter=(edtValue)*1000;
					molpercubiccm=(edtValue)*1;
					molcubicmm=(edtValue)*0.001;
					kilomolcubicmeter=(edtValue)*1000;
					kilomolliter=(edtValue)*1;
					kilomolcubiccm=(edtValue)*0.001;
					kilomolcubicmm=(edtValue)*0.000001;
					milimolcubicmeter=(edtValue)*1000000000;
					milimolliter=(edtValue)*1000000;
					milimolcubiccm=(edtValue)*1000;
					milimolcubicmm=(edtValue)*1;
				break;
				
              case "Kilomol/cubic centimeter -kmol/cm^3":
					
					molpercubicmeter=(edtValue)*1000000000;
					molperliter=(edtValue)*1000000;
					molpercubiccm=(edtValue)*1000;
					molcubicmm=(edtValue)*1;
					kilomolcubicmeter=(edtValue)*1000000;
					kilomolliter=(edtValue)*1000;
					kilomolcubiccm=(edtValue)*1;
					kilomolcubicmm=(edtValue)*0.001;
					milimolcubicmeter=(edtValue)*1000000000000.0;
					milimolliter=(edtValue)*1000000000;
					milimolcubiccm=(edtValue)*1000000;
					milimolcubicmm=(edtValue)*1000;
				break;
				
              case "Kilomol/cubic millimeter -kmol/mm^3":
					
					molpercubicmeter=(edtValue)*1000000000000.0;
					molperliter=(edtValue)*1000000000.0;
					molpercubiccm=(edtValue)*1000000;
					molcubicmm=(edtValue)*1000;
					kilomolcubicmeter=(edtValue)*1000000000;
					kilomolliter=(edtValue)*1000000;
					kilomolcubiccm=(edtValue)*1000;
					kilomolcubicmm=(edtValue)*1;
					milimolcubicmeter=(edtValue)*1000000000000000.0;
					milimolliter=(edtValue)*1000000000000.0;
					milimolcubiccm=(edtValue)*1000000000.0;
					milimolcubicmm=(edtValue)*1000000;
				break;
				
              case "Millimol/cubic meter -mmol/m^3":
					
					molpercubicmeter=(edtValue)*0.001;
					molperliter=(edtValue)*0.000001;
					molpercubiccm=(edtValue)*1.E-9;
					molcubicmm=(edtValue)*1.E-12;
					kilomolcubicmeter=(edtValue)*0.000001;
					kilomolliter=(edtValue)*1.E-9;
					kilomolcubiccm=(edtValue)*1.E-12;
					kilomolcubicmm=(edtValue)*1.E-15;
					milimolcubicmeter=(edtValue)*1;
					milimolliter=(edtValue)*0.001;
					milimolcubiccm=(edtValue)*0.000001;
					milimolcubicmm=(edtValue)*1.E-9;
				break;
				
              case "Millimol/liter -mmol/L":

					molpercubicmeter=(edtValue)*1;
					molperliter=(edtValue)*0.001;
					molpercubiccm=(edtValue)*0.000001;
					molcubicmm=(edtValue)*1.E-9;
					kilomolcubicmeter=(edtValue)*0.001;
					kilomolliter=(edtValue)*0.000001;
					kilomolcubiccm=(edtValue)*1.E-9;
					kilomolcubicmm=(edtValue)*1.E-12;
					milimolcubicmeter=(edtValue)*1000;
					milimolliter=(edtValue)*1;
					milimolcubiccm=(edtValue)*0.001;
					milimolcubicmm=(edtValue)*0.000001;
				break;
				
              case "Millimol/cubic centimeter -mmol/cm^3":
					
					molpercubicmeter=(edtValue)*1000;
					molperliter=(edtValue)*1;
					molpercubiccm=(edtValue)*0.001;
					molcubicmm=(edtValue)*0.000001;
					kilomolcubicmeter=(edtValue)*1;
					kilomolliter=(edtValue)*0.001;
					kilomolcubiccm=(edtValue)*0.000001;
					kilomolcubicmm=(edtValue)*1.E-9;
					milimolcubicmeter=(edtValue)*1000000;
					milimolliter=(edtValue)*1000;
					milimolcubiccm=(edtValue)*1;
					milimolcubicmm=(edtValue)*0.001;
				break;
				
              case "Millimol/cubic millimeter -mmol/mm^3":
					
					molpercubicmeter=(edtValue)*1000000;
					molperliter=(edtValue)*1000;
					molpercubiccm=(edtValue)*1;
					molcubicmm=(edtValue)*0.001;
					kilomolcubicmeter=(edtValue)*1000;
					kilomolliter=(edtValue)*1;
					kilomolcubiccm=(edtValue)*0.001;
					kilomolcubicmm=(edtValue)*0.000001;
					milimolcubicmeter=(edtValue)*1000000000;
					milimolliter=(edtValue)*1000000;
					milimolcubiccm=(edtValue)*1000;
					milimolcubicmm=(edtValue)*1;
				break;
				
				
				}
				
	
				 results.setMolpercubicmeter(molpercubicmeter);
				 results.setMolperliter(molperliter);
				 results.setMolpercubiccm(molpercubiccm);
				 results.setMolcubicmm(molcubicmm);
				 results.setKilomolcubicmeter(kilomolcubicmeter);
				 results.setKilomolliter(kilomolliter);
				 results.setKilomolcubiccm(kilomolcubiccm);
				 results.setKilomolcubicmm(kilomolcubicmm);
				 results.setMilimolcubicmeter(milimolcubicmeter);
				 results.setMilimolliter(milimolliter);
				 results.setMilimolcubiccm(milimolcubiccm);
				 results.setMilimolcubicmm(milimolcubicmm);
				
	    	        
    	         converterArray.add(results);
		    return converterArray;
		    }
			 public class ConversionResults{	
				private double molpercubicmeter,molperliter,molpercubiccm,molcubicmm,kilomolcubicmeter,kilomolliter,kilomolcubiccm,kilomolcubicmm,milimolcubicmeter,milimolliter,milimolcubiccm,milimolcubicmm;

				public double getMolpercubicmeter() {
					return molpercubicmeter;
				}

				public void setMolpercubicmeter(double molpercubicmeter) {
					this.molpercubicmeter = molpercubicmeter;
				}

				public double getMolperliter() {
					return molperliter;
				}

				public void setMolperliter(double molperliter) {
					this.molperliter = molperliter;
				}

				public double getMolpercubiccm() {
					return molpercubiccm;
				}

				public void setMolpercubiccm(double molpercubiccm) {
					this.molpercubiccm = molpercubiccm;
				}

				public double getMolcubicmm() {
					return molcubicmm;
				}

				public void setMolcubicmm(double molcubicmm) {
					this.molcubicmm = molcubicmm;
				}

				public double getKilomolcubicmeter() {
					return kilomolcubicmeter;
				}

				public void setKilomolcubicmeter(double kilomolcubicmeter) {
					this.kilomolcubicmeter = kilomolcubicmeter;
				}

				public double getKilomolliter() {
					return kilomolliter;
				}

				public void setKilomolliter(double kilomolliter) {
					this.kilomolliter = kilomolliter;
				}

				public double getKilomolcubiccm() {
					return kilomolcubiccm;
				}

				public void setKilomolcubiccm(double kilomolcubiccm) {
					this.kilomolcubiccm = kilomolcubiccm;
				}

				public double getKilomolcubicmm() {
					return kilomolcubicmm;
				}

				public void setKilomolcubicmm(double kilomolcubicmm) {
					this.kilomolcubicmm = kilomolcubicmm;
				}

				public double getMilimolcubicmeter() {
					return milimolcubicmeter;
				}

				public void setMilimolcubicmeter(double milimolcubicmeter) {
					this.milimolcubicmeter = milimolcubicmeter;
				}

				public double getMilimolliter() {
					return milimolliter;
				}

				public void setMilimolliter(double milimolliter) {
					this.milimolliter = milimolliter;
				}

				public double getMilimolcubiccm() {
					return milimolcubiccm;
				}

				public void setMilimolcubiccm(double milimolcubiccm) {
					this.milimolcubiccm = milimolcubiccm;
				}

				public double getMilimolcubicmm() {
					return milimolcubicmm;
				}

				public void setMilimolcubicmm(double milimolcubicmm) {
					this.milimolcubicmm = milimolcubicmm;
				}
				
		
}}
