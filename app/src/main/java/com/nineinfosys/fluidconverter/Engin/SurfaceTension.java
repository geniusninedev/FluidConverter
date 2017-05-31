package com.nineinfosys.fluidconverter.Engin;

import java.util.ArrayList;


public class SurfaceTension {
	
	private double newton,millinewton,gram,dyne,ergcenti,ergmilli,poundinch,poundforce;
	private double edtValue;
	private String conversionFrom;
	
			
		
			
			public SurfaceTension(String conversionFrom, double edtValue) {
				
				this.conversionFrom = conversionFrom;
				this.edtValue = edtValue;
			}

			public ArrayList<ConversionResults> calculateSurfaceTensionConversion()
			
		    {
		    	
				ArrayList<ConversionResults> converterArray = new ArrayList<ConversionResults>();
					
				ConversionResults results= new ConversionResults();
		    		 	
				switch(conversionFrom)
				
				{
				
				case "Newton/meter -N/m":
					
					newton=(edtValue)*1;
					millinewton=(edtValue)*1000;
					gram=(edtValue)*1.019716213;
					dyne=(edtValue)*1000;
					ergcenti=(edtValue)*1000;
					ergmilli=(edtValue)*10;
					poundinch=(edtValue)*0.1837185501;
					poundforce=(edtValue)*0.0057101471;
					
					 break;
					
				case "Millinewton/meter -mN/m":
					
					newton=(edtValue)*0.001;
					millinewton=(edtValue)*1;
					gram=(edtValue)*0.0010197162;
					dyne=(edtValue)*1;
					ergcenti=(edtValue)*1;
					ergmilli=(edtValue)*0.01;
					poundinch=(edtValue)*0.0001837186;
					poundforce=(edtValue)*0.0000057101;
					
			
					break;
					
				case "Gram-force/centimeter -gf/cm":
					
					newton=(edtValue)*0.980665;
					millinewton=(edtValue)*980.66499998;
					gram=(edtValue)*1;
					dyne=(edtValue)*980.66499998;
					ergcenti=(edtValue)*980.66499998;
					ergmilli=(edtValue)*9.8066499998;
					poundinch=(edtValue)*0.1801663519;
					poundforce=(edtValue)*0.0055997414;
					 
					 
			     break;	
				case "Dyne/centimeter -dyn/cm":
					
					newton=(edtValue)*0.001;
					millinewton=(edtValue)*1;
					gram=(edtValue)*0.0010197162;
					dyne=(edtValue)*1;
					ergcenti=(edtValue)*1;
					ergmilli=(edtValue)*0.01;
					poundinch=(edtValue)*0.0001837186;
					poundforce=(edtValue)*0.0000057101;
					 
					
					break;	
				case "Erg/square centimeter -erg/cm^2":
					
					newton=(edtValue)*0.001;
					millinewton=(edtValue)*1;
					gram=(edtValue)*0.0010197162;
					dyne=(edtValue)*1;
					ergcenti=(edtValue)*1;
					ergmilli=(edtValue)*0.01;
					poundinch=(edtValue)*0.0001837186;
					poundforce=(edtValue)*0.0000057101;
					 
					
					break;	
					
                    case "Erg/square millimeter -erg/mm^2":
					
					newton=(edtValue)*0.1;
					millinewton=(edtValue)*100;
					gram=(edtValue)*0.1019716213;
					dyne=(edtValue)*100;
					ergcenti=(edtValue)*100;
					ergmilli=(edtValue)*1;
					poundinch=(edtValue)*0.018371855;
					poundforce=(edtValue)*0.0005710147;
					
					break;
                    case "Poundal/inch -lb/in":
    					
    					newton=(edtValue)*5.443108491;
    					millinewton=(edtValue)*5443.108491;
    					gram=(edtValue)*5.5504259774;
    					dyne=(edtValue)*5443.108491;
    					ergcenti=(edtValue)*5443.108491;
    					ergmilli=(edtValue)*54.43108491;
    					poundinch=(edtValue)*1;
    					poundforce=(edtValue)*0.0310809502;
    					 
    					
    					break;	
    					
                        case "Pound-force/inch -lbf/in":
    					
    					newton=(edtValue)*175.12683699;
    					millinewton=(edtValue)*175126.83699;
    					gram=(edtValue)*178.57967501;
    					dyne=(edtValue)*175126.83699;
    					ergcenti=(edtValue)*175126.83699;
    					ergmilli=(edtValue)*1751.2683699;
    					poundinch=(edtValue)*32.174048575;
    					poundforce=(edtValue)*1;
    					
    					break;
				
				} 
					 results.setNewton(newton);
	    	         results.setMillinewton(millinewton);
	    	         results.setGram(gram); 
	    	         results.setDyne(dyne);
	    	         results.setErgcenti(ergcenti);
	    	         results.setErgmilli(ergmilli); 
	    	         results.setPoundinch(poundinch);
	    	         results.setPoundforce(poundforce);
	    	         converterArray.add(results);
	    	         
	 			    return converterArray;     
	    	         
			   
			  }
					  public class ConversionResults{
			   			   
						  private double newton,millinewton,gram,dyne,ergcenti,ergmilli,poundinch,poundforce;

						public double getNewton() {
							return newton;
						}

						public void setNewton(double newton) {
							this.newton = newton;
						}

						public double getMillinewton() {
							return millinewton;
						}

						public void setMillinewton(double millinewton) {
							this.millinewton = millinewton;
						}

						public double getGram() {
							return gram;
						}

						public void setGram(double gram) {
							this.gram = gram;
						}

						public double getDyne() {
							return dyne;
						}

						public void setDyne(double dyne) {
							this.dyne = dyne;
						}

						public double getErgcenti() {
							return ergcenti;
						}

						public void setErgcenti(double ergcenti) {
							this.ergcenti = ergcenti;
						}

						public double getErgmilli() {
							return ergmilli;
						}

						public void setErgmilli(double ergmilli) {
							this.ergmilli = ergmilli;
						}

						public double getPoundinch() {
							return poundinch;
						}

						public void setPoundinch(double poundinch) {
							this.poundinch = poundinch;
						}

						public double getPoundforce() {
							return poundforce;
						}

						public void setPoundforce(double poundforce) {
							this.poundforce = poundforce;
						}

						
					  }
}

