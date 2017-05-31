package com.nineinfosys.fluidconverter.Engin;

import java.util.ArrayList;

public class FlowConverter {

	private double cubicmeterpersecond,cubicmeterperday,cubicmeterperhour,cubicmeterperminute,cubiccentimeterperday ,cubiccentimeterperhour,cubiccentimeterperminute,cubiccentimeterpersecond , literperday ,literperhour , literperminute,literpersecond,milliliterperday,milliliterperhour, milliliterperminute,milliliterpersecond ,
	gallonUSperday,gallonUSperhour ,gallonUSperminute ,gallonUSpersecond,gallonUKperday,gallonUKperhour,gallonUKperminute, gallonUKpersecond, kilobarrelUSperday, barrelUSperday, barrelUSperhour,barrelUSperminute,barrelUSpersecond,acrefootperyear,acrefootperday, acrefootperhour, hundredcubicfootperday,hundredcubicfootperhour, hundredcubicfootperminute, ounceperhour
	,ounceperminute,ouncepersecond,ounceUKperhour,ounceUKperminute, ounceUKpersecond,cubicyardperhour,cubicyardperminute,cubicyardpersecond,cubicfootperhour,cubicfootperminute,cubicfootpersecond,cubicinchperhour,cubicinchperminute, cubicinchpersecond,poundpersecond,poundperminute,poundperhour,poundperday,kilogrampersecond,kilogramperminute, kilogramperhour,kilogramperday ;
	private double edtValue;
	private String conversionFrom;
	
	
	
	
	public FlowConverter(String conversionFrom, double edtValue) {
		// TODO Auto-generated constructor stub
		this.conversionFrom = conversionFrom;
		this.edtValue = edtValue;
	}

	public ArrayList<ConversionResults> calculateFlowConversion()
    {
    	
		ArrayList<ConversionResults> converterArray = new ArrayList<ConversionResults>();
			
		ConversionResults results= new ConversionResults();
		
		switch(conversionFrom)
		{
		case "Cubic meter/second -m^3/s":
			
			cubicmeterpersecond=(edtValue)*1;
			cubicmeterperday=(edtValue)* 86400 ;
			cubicmeterperhour=(edtValue)*3600;
			cubicmeterperminute=(edtValue)*60;
			cubiccentimeterperday=(edtValue)*86400000000.0;
			cubiccentimeterperhour=(edtValue)*3600000000.0;
			cubiccentimeterperminute=(edtValue)*60000000;
			cubiccentimeterpersecond=(edtValue)*1000000;
			literperday=(edtValue)*86400000;
			literperhour=(edtValue)*3600000;
			literperminute=(edtValue)*60000;
			literpersecond=(edtValue)*1000;
			milliliterperday=(edtValue)*86400000000.0;
			milliliterperhour=(edtValue)*3600000000.0;
			milliliterperminute=(edtValue)*60000000;
			milliliterpersecond=(edtValue)*1000000;
			gallonUSperday=(edtValue)*22824465.324;
			gallonUSperhour=(edtValue)*951019.38849;
			gallonUSperminute=(edtValue)*15850.323141;
			gallonUSpersecond=(edtValue)*264.17205236;
			gallonUKperday=(edtValue)*19005343.053;
			gallonUKperhour=(edtValue)*791889.29388;
			gallonUKperminute=(edtValue)*13198.154898;
			gallonUKpersecond=(edtValue)*219.9692483;
			kilobarrelUSperday=(edtValue)*543.43965057;
			barrelUSperday=(edtValue)*543439.65057;
			barrelUSperhour=(edtValue)*22643.318774;
			barrelUSperminute=(edtValue)*377.38864623;
			barrelUSpersecond=(edtValue)*6.2898107704;
			acrefootperyear=(edtValue)*25566.549013;
			acrefootperday=(edtValue)*70.045339761;
			acrefootperhour=(edtValue)*2.9185558234;
			hundredcubicfootperday=(edtValue)*30511.872047;
			
			hundredcubicfootperhour=(edtValue)*1271.328002 ;
			hundredcubicfootperminute=(edtValue)*21.188800033 ;
			ounceperhour=(edtValue)*121730481.73;
			ounceperminute=(edtValue)*2028841.3621;
			ouncepersecond=(edtValue)*33814.022702;
			ounceUKperhour=(edtValue)*126702279.16;
			ounceUKperminute=(edtValue)*2111704.6527;
			ounceUKpersecond=(edtValue)*35195.077546;
			cubicyardperhour=(edtValue)*4708.6222293;
			cubicyardperminute=(edtValue)*78.477037155;
			cubicyardpersecond=(edtValue)*1.3079506193;
			cubicfootperhour=(edtValue)*127132.8002;
			cubicfootperminute=(edtValue)*2118.8800032;
			cubicfootpersecond=(edtValue)*35.31466672;
			
			cubicinchperhour=(edtValue)*219685478.73;
			cubicinchperminute=(edtValue)*3661424.6457;
			cubicinchpersecond=(edtValue)*61023.744095;
			poundpersecond=(edtValue)*1629.9415632;
			poundperminute=(edtValue)*97796.493784;
			poundperhour=(edtValue)*5867789.625;
			poundperday=(edtValue)*140826951.05;
			kilogrampersecond=(edtValue)*739.32905643;
			kilogramperminute=(edtValue)*44359.743394;
			kilogramperhour=(edtValue)*2661584.6033;
			kilogramperday=(edtValue)*63878030.484;
			
			
			break;
			
          case "Cubic meter/day -m^3/d":
			
			cubicmeterpersecond=(edtValue)*0.0000115741;
			cubicmeterperday=(edtValue)* 1 ;
			cubicmeterperhour=(edtValue)*0.0416666667;
			cubicmeterperminute=(edtValue)*0.0006944444;
			cubiccentimeterperday=(edtValue)*1000000;
			cubiccentimeterperhour=(edtValue)*41666.666667;
			cubiccentimeterperminute=(edtValue)*694.44444444;
			cubiccentimeterpersecond=(edtValue)*11.574074074;
			literperday=(edtValue)*1000;
			literperhour=(edtValue)*41.666666667;
			literperminute=(edtValue)*0.6944444444;
			literpersecond=(edtValue)*0.0115740741;
			milliliterperday=(edtValue)*1000000;
			milliliterperhour=(edtValue)*41666.666667;
			milliliterperminute=(edtValue)*694.44444444;
			milliliterpersecond=(edtValue)*11.574074074;
			gallonUSperday=(edtValue)*264.17205236;
			gallonUSperhour=(edtValue)*11.007168848;
			gallonUSperminute=(edtValue)*0.1834528141;
			gallonUSpersecond=(edtValue)*0.0030575469;
			gallonUKperday=(edtValue)*219.9692483;
			gallonUKperhour=(edtValue)*9.1653853458;
			gallonUKperminute=(edtValue)*0.1527564224;
			gallonUKpersecond=(edtValue)*0.0025459404;
			kilobarrelUSperday=(edtValue)*0.0062898108;
			barrelUSperday=(edtValue)*6.2898107704;
			barrelUSperhour=(edtValue)*0.2620754488;
			barrelUSperminute=(edtValue)*0.0043679241;
			barrelUSpersecond=(edtValue)*0.0000727987;
			acrefootperyear=(edtValue)*0.2959091321;
			acrefootperday=(edtValue)*0.00081071;
			acrefootperhour=(edtValue)*0.0000337796;
			hundredcubicfootperday=(edtValue)*0.3531466672;
			
			hundredcubicfootperhour=(edtValue)*0.0147144445 ;
			hundredcubicfootperminute=(edtValue)*0.0002452407 ;
			ounceperhour=(edtValue)*1408.9176126;
			ounceperminute=(edtValue)*23.48196021;
			ouncepersecond=(edtValue)*0.3913660035;
			ounceUKperhour=(edtValue)*1466.4615644;
			ounceUKperminute=(edtValue)*24.441026073;
			ounceUKpersecond=(edtValue)*0.4073504346;
			cubicyardperhour=(edtValue)*0.0544979425;
			cubicyardperminute=(edtValue)*0.000908299;
			cubicyardpersecond=(edtValue)*0.0000151383;
			cubicfootperhour=(edtValue)*1.4714444467;
			cubicfootperminute=(edtValue)*0.0245240741;
			cubicfootpersecond=(edtValue)*0.0004087346;
			
			cubicinchperhour=(edtValue)*2542.6560038;
			cubicinchperminute=(edtValue)*42.377600066;
			cubicinchpersecond=(edtValue)*0.7062933344;
			poundpersecond=(edtValue)*0.0188650644;
			poundperminute=(edtValue)*1.1319038632;
			poundperhour=(edtValue)*67.914231771;
			poundperday=(edtValue)*1629.9415631;
			kilogrampersecond=(edtValue)*0.0085570493;
			kilogramperminute=(edtValue)*0.5134229559;
			kilogramperhour=(edtValue)*30.805377354;
			kilogramperday=(edtValue)*739.32905653;
			
			
			break;
			

          case "Cubic meter/hour -m^3/h":
  			
  			cubicmeterpersecond=(edtValue)*0.0002777778;
  			cubicmeterperday=(edtValue)* 24 ;
  			cubicmeterperhour=(edtValue)*1;
  			cubicmeterperminute=(edtValue)*0.0166666667;
  			cubiccentimeterperday=(edtValue)*24000000;
  			cubiccentimeterperhour=(edtValue)*1000000;
  			cubiccentimeterperminute=(edtValue)*16666.666667;
  			cubiccentimeterpersecond=(edtValue)*277.77777778;
  			literperday=(edtValue)*24000;
  			literperhour=(edtValue)*1000;
  			literperminute=(edtValue)*16.666666667;
  			literpersecond=(edtValue)*0.2777777778;
  			milliliterperday=(edtValue)*24000000;
  			milliliterperhour=(edtValue)*1000000;
  			milliliterperminute=(edtValue)*16666.666667;
  			milliliterpersecond=(edtValue)*277.77777778;
  			gallonUSperday=(edtValue)*6340.1292566;
  			gallonUSperhour=(edtValue)*264.17205236;
  			gallonUSperminute=(edtValue)*4.4028675393;
  			gallonUSpersecond=(edtValue)*0.0733811257;
  			gallonUKperday=(edtValue)*5279.2619592;
  			gallonUKperhour=(edtValue)*219.9692483;
  			gallonUKperminute=(edtValue)*3.6661541383;
  			gallonUKpersecond=(edtValue)*0.061102569;
  			kilobarrelUSperday=(edtValue)*0.1509554585;
  			barrelUSperday=(edtValue)*150.95545849;
  			barrelUSperhour=(edtValue)*6.2898107704;
  			barrelUSperminute=(edtValue)*0.1048301795;
  			barrelUSpersecond=(edtValue)*0.0017471697;
  			acrefootperyear=(edtValue)*7.1018191702;
  			acrefootperday=(edtValue)*0.0194570388;
  			acrefootperhour=(edtValue)*0.00081071;
  			hundredcubicfootperday=(edtValue)*8.4755200131;
  			
  			hundredcubicfootperhour=(edtValue)*0.3531466672 ;
  			hundredcubicfootperminute=(edtValue)*0.0058857778 ;
  			ounceperhour=(edtValue)*33814.022702;
  			ounceperminute=(edtValue)*563.56704503;
  			ouncepersecond=(edtValue)*9.3927840838;
  			ounceUKperhour=(edtValue)*35195.077546;
  			ounceUKperminute=(edtValue)*586.58462576;
  			ounceUKpersecond=(edtValue)*9.7764104293;
  			cubicyardperhour=(edtValue)*1.3079506193;
  			cubicyardperminute=(edtValue)*0.021799177;
  			cubicyardpersecond=(edtValue)*0.0003633196;
  			cubicfootperhour=(edtValue)*35.314666721;
  			cubicfootperminute=(edtValue)*0.5885777787;
  			cubicfootpersecond=(edtValue)*0.0098096296;
  			
  			cubicinchperhour=(edtValue)*61023.744092;
  			cubicinchperminute=(edtValue)*1017.0624016;
  			cubicinchpersecond=(edtValue)*16.951040026;
  			poundpersecond=(edtValue)*0.4527615453;
  			poundperminute=(edtValue)*27.165692718;
  			poundperhour=(edtValue)*1629.9415625;
  			poundperday=(edtValue)*39118.597514;
  			kilogrampersecond=(edtValue)*0.2053691823;
  			kilogramperminute=(edtValue)*12.322150943;
  			kilogramperhour=(edtValue)*739.32905648;
  			kilogramperday=(edtValue)*17743.897357;
  			
  			break;

          case "Cubic meter/minute -m^3/min":
  			
  			cubicmeterpersecond=(edtValue)*0.0166666667;
  			cubicmeterperday=(edtValue)* 1440 ;
  			cubicmeterperhour=(edtValue)*60;
  			cubicmeterperminute=(edtValue)*1;
  			cubiccentimeterperday=(edtValue)*1440000000;
  			cubiccentimeterperhour=(edtValue)*60000000;
  			cubiccentimeterperminute=(edtValue)*1000000;
  			cubiccentimeterpersecond=(edtValue)*16666.666667;
  			literperday=(edtValue)*1440000;
  			literperhour=(edtValue)*60000;
  			literperminute=(edtValue)*1000;
  			literpersecond=(edtValue)*16.666666667;
  			milliliterperday=(edtValue)*1440000000;
  			milliliterperhour=(edtValue)*60000000;
  			milliliterperminute=(edtValue)*1000000;
  			milliliterpersecond=(edtValue)*16666.666667;
  			gallonUSperday=(edtValue)*380407.7554;
  			gallonUSperhour=(edtValue)*15850.323141;
  			gallonUSperminute=(edtValue)*264.17205236;
  			gallonUSpersecond=(edtValue)*4.4028675393;
  			gallonUKperday=(edtValue)*316755.71755;
  			gallonUKperhour=(edtValue)*13198.154898;
  			gallonUKperminute=(edtValue)*219.9692483;
  			gallonUKpersecond=(edtValue)*3.6661541383;
  			kilobarrelUSperday=(edtValue)*9.0573275094;
  			barrelUSperday=(edtValue)*9057.3275094;
  			barrelUSperhour=(edtValue)*377.38864623;
  			barrelUSperminute=(edtValue)*6.2898107704;
  			barrelUSpersecond=(edtValue)*0.1048301795;
  			acrefootperyear=(edtValue)*426.10915021;
  			acrefootperday=(edtValue)*1.1674223293;
  			acrefootperhour=(edtValue)*0.0486425971;
  			hundredcubicfootperday=(edtValue)*508.53120079;
  			
  			hundredcubicfootperhour=(edtValue)* 21.188800033;
  			hundredcubicfootperminute=(edtValue)*0.3531466672 ;
  			ounceperhour=(edtValue)*2028841.3621;
  			ounceperminute=(edtValue)*33814.022702;
  			ouncepersecond=(edtValue)*563.56704503;
  			ounceUKperhour=(edtValue)*2111704.6527;
  			ounceUKperminute=(edtValue)*35195.077546;
  			ounceUKpersecond=(edtValue)*586.58462576;
  			cubicyardperhour=(edtValue)*78.477037155;
  			cubicyardperminute=(edtValue)*1.3079506193;
  			cubicyardpersecond=(edtValue)*0.021799177;
  			cubicfootperhour=(edtValue)*2118.8800033;
  			cubicfootperminute=(edtValue)*35.31466672;
  			cubicfootpersecond=(edtValue)*0.5885777787;
  			
  			cubicinchperhour=(edtValue)*3661424.6455;
  			cubicinchperminute=(edtValue)*61023.744095;
  			cubicinchpersecond=(edtValue)*1017.0624016;
  			poundpersecond=(edtValue)*27.16569272;
  			poundperminute=(edtValue)*1629.9415631;
  			poundperhour=(edtValue)*97796.493751;
  			poundperday=(edtValue)*2347115.8508;
  			kilogrampersecond=(edtValue)*12.322150941;
  			kilogramperminute=(edtValue)*739.32905656;
  			kilogramperhour=(edtValue)*44359.743389;
  			kilogramperday=(edtValue)*1064633.8414;
  			
  			break;
			
          case "Cubic centimeter/day -cm^3/d":
    			
    			cubicmeterpersecond=(edtValue)*1.157407407E-11;
    			cubicmeterperday=(edtValue)*0.000001 ;
    			cubicmeterperhour=(edtValue)*4.166666666E-8;
    			cubicmeterperminute=(edtValue)*6.944444444E-10;
    			cubiccentimeterperday=(edtValue)*1;
    			cubiccentimeterperhour=(edtValue)*0.0416666667;
    			cubiccentimeterperminute=(edtValue)*0.0006944444;
    			cubiccentimeterpersecond=(edtValue)*0.0000115741;
    			literperday=(edtValue)*0.001;
    			literperhour=(edtValue)*0.0000416667;
    			literperminute=(edtValue)*6.944444444E-7;
    			literpersecond=(edtValue)*1.157407407E-8;
    			milliliterperday=(edtValue)*1;
    			milliliterperhour=(edtValue)*0.0416666667;
    			milliliterperminute=(edtValue)*0.0006944444;
    			milliliterpersecond=(edtValue)*0.0000115741;
    			gallonUSperday=(edtValue)*0.0002641721;
    			gallonUSperhour=(edtValue)*0.0000110072;
    			gallonUSperminute=(edtValue)*1.834528141E-7;
    			gallonUSpersecond=(edtValue)*3.057546902E-9;
    			gallonUKperday=(edtValue)*0.0002199692;
    			gallonUKperhour=(edtValue)*0.0000091654;
    			gallonUKperminute=(edtValue)*1.527564224E-7;
    			gallonUKpersecond=(edtValue)*2.545940373E-9;
    			kilobarrelUSperday=(edtValue)*6.28981077E-9;
    			barrelUSperday=(edtValue)*0.0000062898;
    			barrelUSperhour=(edtValue)*2.620754487E-7;
    			barrelUSperminute=(edtValue)*4.367924146E-9;
    			barrelUSpersecond=(edtValue)*7.279873576E-11;
    			acrefootperyear=(edtValue)*2.95909132E-7;
    			acrefootperday=(edtValue)*8.107099509E-10;
    			acrefootperhour=(edtValue)*3.377958128E-11;
    			hundredcubicfootperday=(edtValue)*3.531466672E-7;
    			
    			hundredcubicfootperhour=(edtValue)* 1.471444446E-8;
    			hundredcubicfootperminute=(edtValue)* 2.452407411E-10;
    			ounceperhour=(edtValue)*0.0014089176;
    			ounceperminute=(edtValue)*0.000023482;
    			ouncepersecond=(edtValue)*3.913660034E-7;
    			ounceUKperhour=(edtValue)*0.0014664616;
    			ounceUKperminute=(edtValue)*0.000024441;
    			ounceUKpersecond=(edtValue)*4.073504345E-7;
    			cubicyardperhour=(edtValue)*5.449794246E-8;
    			cubicyardperminute=(edtValue)*9.082990411E-10;
    			cubicyardpersecond=(edtValue)*1.513831735E-11;
    			cubicfootperhour=(edtValue)*0.0000014714;
    			cubicfootperminute=(edtValue)*2.452407411E-8;
    			cubicfootpersecond=(edtValue)*4.087345685E-10;
    			
    			cubicinchperhour=(edtValue)*0.002542656;
    			cubicinchperminute=(edtValue)*0.0000423776;
    			cubicinchpersecond=(edtValue)*7.062933344E-7;
    			poundpersecond=(edtValue)*1.886506438E-8;
    			poundperminute=(edtValue)*0.0000011319;
    			poundperhour=(edtValue)*0.0000679142;
    			poundperday=(edtValue)*0.0016299416;
    			kilogrampersecond=(edtValue)*8.557049264E-9;
    			kilogramperminute=(edtValue)*5.134229559E-7;
    			kilogramperhour=(edtValue)*0.0000308054;
    			kilogramperday=(edtValue)*0.0007393291;
    			
    			break;
  				
          case "Cubic centimeter/hour -cm^3/h":
  			
  			cubicmeterpersecond=(edtValue)*2.777777777E-10;
  			cubicmeterperday=(edtValue)*0.000024 ;
  			cubicmeterperhour=(edtValue)*0.000001;
  			cubicmeterperminute=(edtValue)*1.666666666E-8;
  			cubiccentimeterperday=(edtValue)*24;
  			cubiccentimeterperhour=(edtValue)*1;
  			cubiccentimeterperminute=(edtValue)*0.0166666667;
  			cubiccentimeterpersecond=(edtValue)*0.0002777778;
  			literperday=(edtValue)*0.024;
  			literperhour=(edtValue)*0.001;
  			literperminute=(edtValue)*0.0000166667;
  			literpersecond=(edtValue)*2.777777777E-7;
  			milliliterperday=(edtValue)*24;
  			milliliterperhour=(edtValue)*1;
  			milliliterperminute=(edtValue)*0.0166666667;
  			milliliterpersecond=(edtValue)*0.0002777778;
  			gallonUSperday=(edtValue)*0.0063401293;
  			gallonUSperhour=(edtValue)*0.0002641721;
  			gallonUSperminute=(edtValue)*0.0000044029;
  			gallonUSpersecond=(edtValue)*7.338112565E-8;
  			gallonUKperday=(edtValue)*0.005279262;
  			gallonUKperhour=(edtValue)*0.0002199692;
  			gallonUKperminute=(edtValue)*0.0000036662;
  			gallonUKpersecond=(edtValue)*6.110256897E-8;
  			kilobarrelUSperday=(edtValue)*1.509554584E-7;
  			barrelUSperday=(edtValue)*0.0001509555;
  			barrelUSperhour=(edtValue)*0.0000062898;
  			barrelUSperminute=(edtValue)*1.048301795E-7;
  			barrelUSpersecond=(edtValue)*1.747169658E-9;
  			acrefootperyear=(edtValue)*0.0000071018;
  			acrefootperday=(edtValue)*1.945703882E-8;
  			acrefootperhour=(edtValue)*8.107099509E-10;
  			hundredcubicfootperday=(edtValue)*0.0000084755;
  			
  			hundredcubicfootperhour=(edtValue)*3.531466672E-7 ;
  			hundredcubicfootperminute=(edtValue)*5.885777786E-9 ;
  			ounceperhour=(edtValue)*0.0338140227;
  			ounceperminute=(edtValue)*0.000563567;
  			ouncepersecond=(edtValue)*0.0000093928;
  			ounceUKperhour=(edtValue)*0.0351950775;
  			ounceUKperminute=(edtValue)*0.0005865846;
  			ounceUKpersecond=(edtValue)*0.0000097764;
  			cubicyardperhour=(edtValue)*0.000001308;
  			cubicyardperminute=(edtValue)*2.179917698E-8;
  			cubicyardpersecond=(edtValue)*3.633196164E-10;
  			cubicfootperhour=(edtValue)*0.0000353147;
  			cubicfootperminute=(edtValue)*5.885777786E-7;
  			cubicfootpersecond=(edtValue)*9.809629644E-9;
  			
  			cubicinchperhour=(edtValue)*0.0610237441;
  			cubicinchperminute=(edtValue)*0.0010170624;
  			cubicinchpersecond=(edtValue)*0.000016951;
  			poundpersecond=(edtValue)*4.527615453E-7;
  			poundperminute=(edtValue)*0.0000271657;
  			poundperhour=(edtValue)*0.0016299416;
  			poundperday=(edtValue)*0.0391185975;
  			kilogrampersecond=(edtValue)*2.053691823E-7;
  			kilogramperminute=(edtValue)*0.0000123222;
  			kilogramperhour=(edtValue)*0.0007393291;
  			kilogramperday=(edtValue)*0.0177438974;
  			
  			break;
			
			
          case "Cubic centimeter/minute -cm^3/min":
    			
    			cubicmeterpersecond=(edtValue)*1.666666666E-8;
    			cubicmeterperday=(edtValue)*0.00144 ;
    			cubicmeterperhour=(edtValue)*0.00006;
    			cubicmeterperminute=(edtValue)*0.000001;
    			cubiccentimeterperday=(edtValue)*1440;
    			cubiccentimeterperhour=(edtValue)*60;
    			cubiccentimeterperminute=(edtValue)*1;
    			cubiccentimeterpersecond=(edtValue)*0.0166666667;
    			literperday=(edtValue)*1.44;
    			literperhour=(edtValue)*0.06;
    			literperminute=(edtValue)*0.001;
    			literpersecond=(edtValue)*0.0000166667;
    			milliliterperday=(edtValue)*1440;
    			milliliterperhour=(edtValue)*60;
    			milliliterperminute=(edtValue)*1;
    			milliliterpersecond=(edtValue)*0.0166666667;
    			gallonUSperday=(edtValue)*0.3804077554;
    			gallonUSperhour=(edtValue)*0.0158503231;
    			gallonUSperminute=(edtValue)*0.0002641721;
    			gallonUSpersecond=(edtValue)*0.0000044029;
    			gallonUKperday=(edtValue)*0.3167557176;
    			gallonUKperhour=(edtValue)*0.0131981549;
    			gallonUKperminute=(edtValue)*0.0002199692;
    			gallonUKpersecond=(edtValue)*0.0000036662;
    			kilobarrelUSperday=(edtValue)*0.0000090573;
    			barrelUSperday=(edtValue)*0.0090573275;
    			barrelUSperhour=(edtValue)*0.0003773886;
    			barrelUSperminute=(edtValue)*0.0000062898;
    			barrelUSpersecond=(edtValue)*1.048301795E-7;
    			acrefootperyear=(edtValue)*0.0004261092;
    			acrefootperday=(edtValue)*0.0000011674;
    			acrefootperhour=(edtValue)*4.864259705E-8;
    			hundredcubicfootperday=(edtValue)*0.0005085312;
    			
    			hundredcubicfootperhour=(edtValue)*0.0000211888 ;
    			hundredcubicfootperminute=(edtValue)*3.531466672E-7 ;
    			ounceperhour=(edtValue)*2.0288413621;
    			ounceperminute=(edtValue)*0.0338140227;
    			ouncepersecond=(edtValue)*0.000563567;
    			ounceUKperhour=(edtValue)*2.1117046527;
    			ounceUKperminute=(edtValue)*0.0351950775;
    			ounceUKpersecond=(edtValue)*0.0005865846;
    			cubicyardperhour=(edtValue)*0.000078477;
    			cubicyardperminute=(edtValue)*0.000001308;
    			cubicyardpersecond=(edtValue)*2.179917698E-8;
    			cubicfootperhour=(edtValue)*0.00211888;
    			cubicfootperminute=(edtValue)*0.0000353147;
    			cubicfootpersecond=(edtValue)*5.885777786E-7;
    			
    			cubicinchperhour=(edtValue)*3.6614246455;
    			cubicinchperminute=(edtValue)*0.0610237441;
    			cubicinchpersecond=(edtValue)*0.0010170624;
    			poundpersecond=(edtValue)*0.0000271657;
    			poundperminute=(edtValue)*0.0016299416;
    			poundperhour=(edtValue)*0.0977964938;
    			poundperday=(edtValue)*2.3471158508;
    			kilogrampersecond=(edtValue)*0.0000123222;
    			kilogramperminute=(edtValue)*0.0007393291;
    			kilogramperhour=(edtValue)*0.0443597434;
    			kilogramperday=(edtValue)*1.0646338414;
    			
    			break;
  			
          case "Cubic centimeter/second -cm^3/s":
  			
  			cubicmeterpersecond=(edtValue)*0.000001;
  			cubicmeterperday=(edtValue)*0.0864 ;
  			cubicmeterperhour=(edtValue)*0.0036;
  			cubicmeterperminute=(edtValue)*0.00006;
  			cubiccentimeterperday=(edtValue)*86400;
  			cubiccentimeterperhour=(edtValue)*3600;
  			cubiccentimeterperminute=(edtValue)*60;
  			cubiccentimeterpersecond=(edtValue)*1;
  			literperday=(edtValue)*86.4;
  			literperhour=(edtValue)*3.6;
  			literperminute=(edtValue)*0.06;
  			literpersecond=(edtValue)*0.001;
  			milliliterperday=(edtValue)*86400;
  			milliliterperhour=(edtValue)*3600;
  			milliliterperminute=(edtValue)*60;
  			milliliterpersecond=(edtValue)*1;
  			gallonUSperday=(edtValue)*22.824465324;
  			gallonUSperhour=(edtValue)*0.9510193885;
  			gallonUSperminute=(edtValue)*0.0158503231;
  			gallonUSpersecond=(edtValue)*0.0002641721;
  			gallonUKperday=(edtValue)*19.005343053;
  			gallonUKperhour=(edtValue)*0.7918892939;
  			gallonUKperminute=(edtValue)*0.0131981549;
  			gallonUKpersecond=(edtValue)*0.0002199692;
  			kilobarrelUSperday=(edtValue)*0.0005434397;
  			barrelUSperday=(edtValue)*0.5434396506;
  			barrelUSperhour=(edtValue)*0.0226433188;
  			barrelUSperminute=(edtValue)*0.0003773886;
  			barrelUSpersecond=(edtValue)*0.0000062898;
  			acrefootperyear=(edtValue)*0.025566549;
  			acrefootperday=(edtValue)*0.0000700453;
  			acrefootperhour=(edtValue)*0.0000029186;
  			hundredcubicfootperday=(edtValue)*0.030511872;
  			
  			hundredcubicfootperhour=(edtValue)*0.001271328;
  			hundredcubicfootperminute=(edtValue)* 0.0000211888;
  			ounceperhour=(edtValue)*121.73048173;
  			ounceperminute=(edtValue)*2.0288413621;
  			ouncepersecond=(edtValue)*0.0338140227;
  			ounceUKperhour=(edtValue)*126.70227916;
  			ounceUKperminute=(edtValue)*2.1117046527;
  			ounceUKpersecond=(edtValue)*0.0351950775;
  			cubicyardperhour=(edtValue)*0.0047086222;
  			cubicyardperminute=(edtValue)*0.000078477;
  			cubicyardpersecond=(edtValue)*0.000001308;
  			cubicfootperhour=(edtValue)*0.1271328002;
  			cubicfootperminute=(edtValue)*0.00211888;
  			cubicfootpersecond=(edtValue)*0.0000353147;
  			
  			cubicinchperhour=(edtValue)*219.68547873;
  			cubicinchperminute=(edtValue)*3.6614246457;
  			cubicinchpersecond=(edtValue)*0.0610237441;
  			poundpersecond=(edtValue)*0.0016299416;
  			poundperminute=(edtValue)*0.0977964938;
  			poundperhour=(edtValue)*5.867789625;
  			poundperday=(edtValue)*140.82695105;
  			kilogrampersecond=(edtValue)*0.0007393291;
  			kilogramperminute=(edtValue)*0.0443597434;
  			kilogramperhour=(edtValue)*2.6615846033;
  			kilogramperday=(edtValue)*63.878030484;
  			
  			break;
			
  			
          case  "Liter/day -L/d":
  			
  			 cubicmeterpersecond=(edtValue)*1.157407407E-8;
  			 cubicmeterperday=(edtValue)*0.001 ;
  			cubicmeterperhour=(edtValue)*0.0000416667;
  			cubicmeterperminute=(edtValue)*6.944444444E-7;
  			cubiccentimeterperday=(edtValue)*1000;
  			cubiccentimeterperhour=(edtValue)*41.666666667;
  			cubiccentimeterperminute=(edtValue)*0.6944444444;
  			cubiccentimeterpersecond=(edtValue)*0.0115740741;
  			literperday=(edtValue)*1;
  			literperhour=(edtValue)*0.0416666667;
  			literperminute=(edtValue)*0.0006944444;
  			literpersecond=(edtValue)*0.0000115741;
  			milliliterperday=(edtValue)*1000;
  			milliliterperhour=(edtValue)*41.666666667;
  			milliliterperminute=(edtValue)*0.6944444444;
  			milliliterpersecond=(edtValue)*0.0115740741;
  			gallonUSperday=(edtValue)*0.2641720524;
  			gallonUSperhour=(edtValue)*0.0110071688;
  			gallonUSperminute=(edtValue)*0.0001834528;
  			gallonUSpersecond=(edtValue)*0.0000030575;
  			gallonUKperday=(edtValue)*0.2199692483;
  			gallonUKperhour=(edtValue)*0.0091653853;
  			gallonUKperminute=(edtValue)*0.0001527564;
  			gallonUKpersecond=(edtValue)*0.0000025459;
  			kilobarrelUSperday=(edtValue)*0.0000062898;
  			barrelUSperday=(edtValue)*0.0062898108;
  			barrelUSperhour=(edtValue)*0.0002620754;
  			barrelUSperminute=(edtValue)*0.0000043679;
  			barrelUSpersecond=(edtValue)*7.279873576E-8;
  			acrefootperyear=(edtValue)*0.0002959091;
  			acrefootperday=(edtValue)*8.107099509E-7;
  			acrefootperhour=(edtValue)*3.377958128E-8;
  			hundredcubicfootperday=(edtValue)*0.0003531467;
  			
  			hundredcubicfootperhour=(edtValue)*0.0000147144;
  			hundredcubicfootperminute=(edtValue)* 2.452407411E-7;
  			ounceperhour=(edtValue)*1.4089176126;
  			ounceperminute=(edtValue)*0.0234819602;
  			ouncepersecond=(edtValue)*0.000391366;
  			ounceUKperhour=(edtValue)*1.4664615644;
  			ounceUKperminute=(edtValue)*0.0244410261;
  			ounceUKpersecond=(edtValue)*0.0004073504;
  			cubicyardperhour=(edtValue)*0.0000544979;
  			cubicyardperminute=(edtValue)*9.082990411E-7;
  			cubicyardpersecond=(edtValue)*1.513831735E-8;
  			cubicfootperhour=(edtValue)*0.0014714444;
  			cubicfootperminute=(edtValue)*0.0000245241;
  			cubicfootpersecond=(edtValue)*4.087345685E-7;
  			
  			cubicinchperhour=(edtValue)*2.5426560038;
  			cubicinchperminute=(edtValue)*0.0423776001;
  			cubicinchpersecond=(edtValue)*0.0007062933;
  			poundpersecond=(edtValue)*0.0000188651;
  			poundperminute=(edtValue)*0.0011319039;
  			poundperhour=(edtValue)*0.0679142318;
  			poundperday=(edtValue)*1.6299415631;
  			kilogrampersecond=(edtValue)*0.000008557;
  			kilogramperminute=(edtValue)*0.000513423;
  			kilogramperhour=(edtValue)*0.0308053774;
  			kilogramperday=(edtValue)*0.7393290565;
  			
  			break;
			
  			
  			
  			
          case "Liter/hour -L/h":
  			
  			cubicmeterpersecond=(edtValue)*2.777777777E-7;
  			cubicmeterperday=(edtValue)*0.024 ;
  			cubicmeterperhour=(edtValue)*0.001;
  			cubicmeterperminute=(edtValue)*0.0000166667;
  			cubiccentimeterperday=(edtValue)*24000;
  			cubiccentimeterperhour=(edtValue)*1000;
  			cubiccentimeterperminute=(edtValue)*16.666666667;
  			cubiccentimeterpersecond=(edtValue)*0.2777777778;
  			literperday=(edtValue)*24;
  			literperhour=(edtValue)*1;
  			literperminute=(edtValue)*0.0166666667;
  			literpersecond=(edtValue)*0.0002777778;
  			milliliterperday=(edtValue)*24000;
  			milliliterperhour=(edtValue)*1000;
  			milliliterperminute=(edtValue)*16.666666667;
  			milliliterpersecond=(edtValue)*0.2777777778;
  			gallonUSperday=(edtValue)*6.3401292566;
  			gallonUSperhour=(edtValue)*0.2641720524;
  			gallonUSperminute=(edtValue)*0.0044028675;
  			gallonUSpersecond=(edtValue)*0.0000733811;
  			gallonUKperday=(edtValue)*5.2792619592;
  			gallonUKperhour=(edtValue)*0.2199692483;
  			gallonUKperminute=(edtValue)*0.0036661541;
  			gallonUKpersecond=(edtValue)*0.0000611026;
  			kilobarrelUSperday=(edtValue)*0.0001509555;
  			barrelUSperday=(edtValue)*0.1509554585;
  			barrelUSperhour=(edtValue)*0.0062898108;
  			barrelUSperminute=(edtValue)*0.0001048302;
  			barrelUSpersecond=(edtValue)*0.0000017472;
  			acrefootperyear=(edtValue)*0.0071018192;
  			acrefootperday=(edtValue)*0.000019457;
  			acrefootperhour=(edtValue)*8.107099509E-7;
  			hundredcubicfootperday=(edtValue)*0.00847552;
  			
  			hundredcubicfootperhour=(edtValue)*0.0003531467;
  			hundredcubicfootperminute=(edtValue)*0.0000058858 ;
  			ounceperhour=(edtValue)*33.814022702;
  			ounceperminute=(edtValue)*0.563567045;
  			ouncepersecond=(edtValue)*0.0093927841;
  			ounceUKperhour=(edtValue)*35.195077546;
  			ounceUKperminute=(edtValue)*0.5865846258;
  			ounceUKpersecond=(edtValue)*0.0097764104;
  			cubicyardperhour=(edtValue)*0.0013079506;
  			cubicyardperminute=(edtValue)*0.0000217992;
  			cubicyardpersecond=(edtValue)*3.633196164E-7;
  			cubicfootperhour=(edtValue)*0.0353146667;
  			cubicfootperminute=(edtValue)*0.0005885778;
  			cubicfootpersecond=(edtValue)*0.0000098096;
  			
  			cubicinchperhour=(edtValue)*61.023744092;
  			cubicinchperminute=(edtValue)*1.0170624016;
  			cubicinchpersecond=(edtValue)*0.01695104;
  			poundpersecond=(edtValue)*0.0004527615;
  			poundperminute=(edtValue)*0.0271656927;
  			poundperhour=(edtValue)*1.6299415625;
  			poundperday=(edtValue)*39.118597514;
  			kilogrampersecond=(edtValue)*0.0002053692;
  			kilogramperminute=(edtValue)*0.0123221509;
  			kilogramperhour=(edtValue)*0.7393290565;
  			kilogramperday=(edtValue)*17.743897357;
  			
  			break;
			
  			
  			
  			
          case "Liter/minute -L/min":
  			
  			cubicmeterpersecond=(edtValue)*0.0000166667;
  			cubicmeterperday=(edtValue)*1.44 ;
  			cubicmeterperhour=(edtValue)*0.06;
  			cubicmeterperminute=(edtValue)*0.001;
  			cubiccentimeterperday=(edtValue)*1440000;
  			cubiccentimeterperhour=(edtValue)*60000;
  			cubiccentimeterperminute=(edtValue)*1000;
  			cubiccentimeterpersecond=(edtValue)*16.666666667;
  			literperday=(edtValue)*1440;
  			literperhour=(edtValue)*60;
  			literperminute=(edtValue)*1;
  			literpersecond=(edtValue)*0.0166666667;
  			milliliterperday=(edtValue)*1440000;
  			milliliterperhour=(edtValue)*60000;
  			milliliterperminute=(edtValue)*1000;
  			milliliterpersecond=(edtValue)*16.666666667;
  			gallonUSperday=(edtValue)*380.4077554;
  			gallonUSperhour=(edtValue)*15.850323141;
  			gallonUSperminute=(edtValue)*0.2641720524;
  			gallonUSpersecond=(edtValue)*0.0044028675;
  			gallonUKperday=(edtValue)*316.75571755;
  			gallonUKperhour=(edtValue)*13.198154898;
  			gallonUKperminute=(edtValue)*0.2199692483;
  			gallonUKpersecond=(edtValue)*0.0036661541;
  			kilobarrelUSperday=(edtValue)*0.0090573275;
  			barrelUSperday=(edtValue)*9.0573275094;
  			barrelUSperhour=(edtValue)*0.3773886462;
  			barrelUSperminute=(edtValue)*0.0062898108;
  			barrelUSpersecond=(edtValue)*0.0001048302;
  			acrefootperyear=(edtValue)*0.4261091502;
  			acrefootperday=(edtValue)*0.0011674223;
  			acrefootperhour=(edtValue)*0.0000486426;
  			hundredcubicfootperday=(edtValue)*0.5085312008;
  			
  			hundredcubicfootperhour=(edtValue)*0.0211888;
  			hundredcubicfootperminute=(edtValue)* 0.0003531467;
  			ounceperhour=(edtValue)*2028.8413621;
  			ounceperminute=(edtValue)*33.814022702;
  			ouncepersecond=(edtValue)*0.563567045;
  			ounceUKperhour=(edtValue)*2111.7046527;
  			ounceUKperminute=(edtValue)*35.195077546;
  			ounceUKpersecond=(edtValue)*0.5865846258;
  			cubicyardperhour=(edtValue)*0.0784770372;
  			cubicyardperminute=(edtValue)*0.0013079506;
  			cubicyardpersecond=(edtValue)*0.0000217992;
  			cubicfootperhour=(edtValue)*2.1188800033;
  			cubicfootperminute=(edtValue)*0.0353146667;
  			cubicfootpersecond=(edtValue)*0.0005885778;
  			
  			cubicinchperhour=(edtValue)*3661.4246455;
  			cubicinchperminute=(edtValue)*61.023744095;
  			cubicinchpersecond=(edtValue)*1.0170624016;
  			poundpersecond=(edtValue)*0.0271656927;
  			poundperminute=(edtValue)*1.6299415631;
  			poundperhour=(edtValue)*97.796493751;
  			poundperday=(edtValue)*2347.1158508;
  			kilogrampersecond=(edtValue)*0.0123221509;
  			kilogramperminute=(edtValue)*0.7393290566;
  			kilogramperhour=(edtValue)*44.359743389;
  			kilogramperday=(edtValue)*1064.6338414;
  			
  			break;
  			
          case "Liter/second -L/s":
  			
  			cubicmeterpersecond=(edtValue)*0.001;
  			cubicmeterperday=(edtValue)*86.4 ;
  			cubicmeterperhour=(edtValue)*3.6;
  			cubicmeterperminute=(edtValue)*0.06;
  			cubiccentimeterperday=(edtValue)*86400000;
  			cubiccentimeterperhour=(edtValue)*3600000;
  			cubiccentimeterperminute=(edtValue)*60000;
  			cubiccentimeterpersecond=(edtValue)*1000;
  			literperday=(edtValue)*86400;
  			literperhour=(edtValue)*3600;
  			literperminute=(edtValue)*60;
  			literpersecond=(edtValue)*1;
  			milliliterperday=(edtValue)*86400000;
  			milliliterperhour=(edtValue)*3600000;
  			milliliterperminute=(edtValue)*60000;
  			milliliterpersecond=(edtValue)*1000;
  			gallonUSperday=(edtValue)*22824.465324;
  			gallonUSperhour=(edtValue)*951.01938849;
  			gallonUSperminute=(edtValue)*15.850323141;
  			gallonUSpersecond=(edtValue)*0.2641720524;
  			gallonUKperday=(edtValue)*19005.343053;
  			gallonUKperhour=(edtValue)*791.88929388;
  			gallonUKperminute=(edtValue)*13.198154898;
  			gallonUKpersecond=(edtValue)*0.2199692483;
  			kilobarrelUSperday=(edtValue)*0.5434396506;
  			barrelUSperday=(edtValue)*543.43965057;
  			barrelUSperhour=(edtValue)*22.643318774;
  			barrelUSperminute=(edtValue)*0.3773886462;
  			barrelUSpersecond=(edtValue)*0.0062898108;
  			acrefootperyear=(edtValue)*25.566549013;
  			acrefootperday=(edtValue)*0.0700453398;
  			acrefootperhour=(edtValue)*0.0029185558;
  			hundredcubicfootperday=(edtValue)*30.511872047;
  			
  			hundredcubicfootperhour=(edtValue)*1.271328002;
  			hundredcubicfootperminute=(edtValue)*0.0211888 ;
  			ounceperhour=(edtValue)*121730.48173;
  			ounceperminute=(edtValue)*2028.8413621;
  			ouncepersecond=(edtValue)*33.814022702;
  			ounceUKperhour=(edtValue)*126702.27916;
  			ounceUKperminute=(edtValue)*2111.7046527;
  			ounceUKpersecond=(edtValue)*35.195077546;
  			cubicyardperhour=(edtValue)*4.7086222293;
  			cubicyardperminute=(edtValue)*0.0784770372;
  			cubicyardpersecond=(edtValue)*0.0013079506;
  			cubicfootperhour=(edtValue)*127.1328002;
  			cubicfootperminute=(edtValue)*2.1188800032;
  			cubicfootpersecond=(edtValue)*0.0353146667;
  			
  			cubicinchperhour=(edtValue)*219685.47873;
  			cubicinchperminute=(edtValue)*3661.4246457;
  			cubicinchpersecond=(edtValue)*61.023744095;
  			poundpersecond=(edtValue)*1.6299415632;
  			poundperminute=(edtValue)*97.796493784;
  			poundperhour=(edtValue)*5867.789625;
  			poundperday=(edtValue)*140826.95105;
  			kilogrampersecond=(edtValue)*0.7393290564;
  			kilogramperminute=(edtValue)*44.359743394;
  			kilogramperhour=(edtValue)*2661.5846033;
  			kilogramperday=(edtValue)*63878.030484;
  			
  			break;
			
  			
          case "Milliliter/day -mL/d":
    			
    			cubicmeterpersecond=(edtValue)*1.157407407E-11;
    			cubicmeterperday=(edtValue)* 0.000001;
    			cubicmeterperhour=(edtValue)*4.166666666E-8;
    			cubicmeterperminute=(edtValue)*6.944444444E-10;
    			cubiccentimeterperday=(edtValue)*1;
    			cubiccentimeterperhour=(edtValue)*0.0416666667;
    			cubiccentimeterperminute=(edtValue)*0.0006944444;
    			cubiccentimeterpersecond=(edtValue)*0.0000115741;
    			literperday=(edtValue)*0.001;
    			literperhour=(edtValue)*0.0000416667;
    			literperminute=(edtValue)*6.944444444E-7;
    			literpersecond=(edtValue)*1.157407407E-8;
    			milliliterperday=(edtValue)*1;
    			milliliterperhour=(edtValue)*0.0416666667;
    			milliliterperminute=(edtValue)*0.0006944444;
    			milliliterpersecond=(edtValue)*0.0000115741;
    			gallonUSperday=(edtValue)*0.0002641721;
    			gallonUSperhour=(edtValue)*0.0000110072;
    			gallonUSperminute=(edtValue)*1.834528141E-7;
    			gallonUSpersecond=(edtValue)*3.057546902E-9;
    			gallonUKperday=(edtValue)*0.0002199692;
    			gallonUKperhour=(edtValue)*0.0000091654;
    			gallonUKperminute=(edtValue)*1.527564224E-7;
    			gallonUKpersecond=(edtValue)*2.545940373E-9;
    			kilobarrelUSperday=(edtValue)*6.28981077E-9;
    			barrelUSperday=(edtValue)*0.0000062898;
    			barrelUSperhour=(edtValue)*2.620754487E-7;
    			barrelUSperminute=(edtValue)*4.367924146E-9;
    			barrelUSpersecond=(edtValue)*7.279873576E-11;
    			acrefootperyear=(edtValue)*2.95909132E-7;
    			acrefootperday=(edtValue)*8.107099509E-10;
    			acrefootperhour=(edtValue)*3.377958128E-11;
    			hundredcubicfootperday=(edtValue)*3.531466672E-7;
    			
    			hundredcubicfootperhour=(edtValue)*1.471444446E-8;
    			hundredcubicfootperminute=(edtValue)* 2.452407411E-10;
    			ounceperhour=(edtValue)*0.0014089176;
    			ounceperminute=(edtValue)*0.000023482;
    			ouncepersecond=(edtValue)*3.913660034E-7;
    			ounceUKperhour=(edtValue)*0.0014664616;
    			ounceUKperminute=(edtValue)*0.000024441;
    			ounceUKpersecond=(edtValue)*4.073504345E-7;
    			cubicyardperhour=(edtValue)*5.449794246E-8;
    			cubicyardperminute=(edtValue)*9.082990411E-10;
    			cubicyardpersecond=(edtValue)*1.513831735E-11;
    			cubicfootperhour=(edtValue)*0.0000014714;
    			cubicfootperminute=(edtValue)*2.452407411E-8;
    			cubicfootpersecond=(edtValue)*4.087345685E-10;
    			
    			cubicinchperhour=(edtValue)*0.002542656;
    			cubicinchperminute=(edtValue)*0.0000423776;
    			cubicinchpersecond=(edtValue)*7.062933344E-7;
    			poundpersecond=(edtValue)*1.886506438E-8;
    			poundperminute=(edtValue)*0.0000011319;
    			poundperhour=(edtValue)*0.0000679142;
    			poundperday=(edtValue)*0.0016299416;
    			kilogrampersecond=(edtValue)*8.557049264E-9;
    			kilogramperminute=(edtValue)*5.134229559E-7;
    			kilogramperhour=(edtValue)*0.0000308054;
    			kilogramperday=(edtValue)*0.0007393291;
    			
    			break;
  			
          case "Milliliter/hour -mL/h":
  			
  			cubicmeterpersecond=(edtValue)*2.777777777E-10;
  			cubicmeterperday=(edtValue)*0.000024 ;
  			cubicmeterperhour=(edtValue)*0.000001;
  			cubicmeterperminute=(edtValue)*1.666666666E-8;
  			cubiccentimeterperday=(edtValue)*24;
  			cubiccentimeterperhour=(edtValue)*1;
  			cubiccentimeterperminute=(edtValue)*0.0166666667;
  			cubiccentimeterpersecond=(edtValue)*0.0002777778;
  			literperday=(edtValue)*0.024;
  			literperhour=(edtValue)*0.001;
  			literperminute=(edtValue)*0.0000166667;
  			literpersecond=(edtValue)*2.777777777E-7;
  			milliliterperday=(edtValue)*24;
  			milliliterperhour=(edtValue)*1;
  			milliliterperminute=(edtValue)*0.0166666667;
  			milliliterpersecond=(edtValue)*0.0002777778;
  			gallonUSperday=(edtValue)*0.0063401293;
  			gallonUSperhour=(edtValue)*0.0002641721;
  			gallonUSperminute=(edtValue)*0.0000044029;
  			gallonUSpersecond=(edtValue)*7.338112565E-8;
  			gallonUKperday=(edtValue)*0.005279262;
  			gallonUKperhour=(edtValue)*0.0002199692;
  			gallonUKperminute=(edtValue)*0.0000036662;
  			gallonUKpersecond=(edtValue)*6.110256897E-8;
  			kilobarrelUSperday=(edtValue)*1.509554584E-7;
  			barrelUSperday=(edtValue)*0.0001509555;
  			barrelUSperhour=(edtValue)*0.0000062898;
  			barrelUSperminute=(edtValue)*1.048301795E-7;
  			barrelUSpersecond=(edtValue)*1.747169658E-9;
  			acrefootperyear=(edtValue)*0.0000071018;
  			acrefootperday=(edtValue)*1.945703882E-8;
  			acrefootperhour=(edtValue)*8.107099509E-10;
  			hundredcubicfootperday=(edtValue)*0.0000084755;
  			
  			hundredcubicfootperhour=(edtValue)*3.531466672E-7;
  			hundredcubicfootperminute=(edtValue)* 5.885777786E-9;
  			ounceperhour=(edtValue)*0.0338140227;
  			ounceperminute=(edtValue)*0.000563567;
  			ouncepersecond=(edtValue)*0.0000093928;
  			ounceUKperhour=(edtValue)*0.0351950775;
  			ounceUKperminute=(edtValue)*0.0005865846;
  			ounceUKpersecond=(edtValue)*0.0000097764;
  			cubicyardperhour=(edtValue)*0.000001308;
  			cubicyardperminute=(edtValue)*0.000001308;
  			cubicyardpersecond=(edtValue)*3.633196164E-10;
  			cubicfootperhour=(edtValue)*0.0000353147;
  			cubicfootperminute=(edtValue)*5.885777786E-7;
  			cubicfootpersecond=(edtValue)*9.809629644E-9;
  			
  			cubicinchperhour=(edtValue)*0.0610237441;
  			cubicinchperminute=(edtValue)*0.0010170624;
  			cubicinchpersecond=(edtValue)*0.000016951;
  			poundpersecond=(edtValue)*4.527615453E-7;
  			poundperminute=(edtValue)*0.0000271657;
  			poundperhour=(edtValue)*0.0016299416;
  			poundperday=(edtValue)*0.0391185975;
  			kilogrampersecond=(edtValue)*2.053691823E-7;
  			kilogramperminute=(edtValue)*0.0000123222;
  			kilogramperhour=(edtValue)*0.0007393291;
  			kilogramperday=(edtValue)*0.0177438974;
  			
  			break;
			
          case "Milliliter/minute -mL/min":
  			
  			cubicmeterpersecond=(edtValue)*1.666666666E-8;
  			cubicmeterperday=(edtValue)*0.00144 ;
  			cubicmeterperhour=(edtValue)*0.00006;
  			cubicmeterperminute=(edtValue)*0.000001;
  			cubiccentimeterperday=(edtValue)*1440;
  			cubiccentimeterperhour=(edtValue)*60;
  			cubiccentimeterperminute=(edtValue)*1;
  			cubiccentimeterpersecond=(edtValue)*0.0166666667;
  			literperday=(edtValue)*1.44;
  			literperhour=(edtValue)*0.06;
  			literperminute=(edtValue)*0.001;
  			literpersecond=(edtValue)*0.0000166667;
  			milliliterperday=(edtValue)*1440;
  			milliliterperhour=(edtValue)*60;
  			milliliterperminute=(edtValue)*1;
  			milliliterpersecond=(edtValue)*0.0166666667;
  			gallonUSperday=(edtValue)*0.3804077554;
  			gallonUSperhour=(edtValue)*0.0158503231;
  			gallonUSperminute=(edtValue)*0.0002641721;
  			gallonUSpersecond=(edtValue)*0.0000044029;
  			gallonUKperday=(edtValue)*0.3167557176;
  			gallonUKperhour=(edtValue)*0.0131981549;
  			gallonUKperminute=(edtValue)*0.0002199692;
  			gallonUKpersecond=(edtValue)*0.0000036662;
  			kilobarrelUSperday=(edtValue)*0.0000090573;
  			barrelUSperday=(edtValue)*0.0090573275;
  			barrelUSperhour=(edtValue)*0.0003773886;
  			barrelUSperminute=(edtValue)*0.0000062898;
  			barrelUSpersecond=(edtValue)*1.048301795E-7;
  			acrefootperyear=(edtValue)*0.0004261092;
  			acrefootperday=(edtValue)*0.0000011674;
  			acrefootperhour=(edtValue)*4.864259705E-8;
  			hundredcubicfootperday=(edtValue)*0.0005085312;
  			
  			hundredcubicfootperhour=(edtValue)*0.0000211888;
  			hundredcubicfootperminute=(edtValue)*3.531466672E-7 ;
  			ounceperhour=(edtValue)*2.0288413621;
  			ounceperminute=(edtValue)*0.0338140227;
  			ouncepersecond=(edtValue)*0.000563567;
  			ounceUKperhour=(edtValue)*2.1117046527;
  			ounceUKperminute=(edtValue)*0.0351950775;
  			ounceUKpersecond=(edtValue)*0.0005865846;
  			cubicyardperhour=(edtValue)*0.000078477;
  			cubicyardperminute=(edtValue)*0.000001308;
  			cubicyardpersecond=(edtValue)*2.179917698E-8;
  			cubicfootperhour=(edtValue)*0.00211888;
  			cubicfootperminute=(edtValue)*0.0000353147;
  			cubicfootpersecond=(edtValue)*5.885777786E-7;
  			
  			cubicinchperhour=(edtValue)*3.6614246455;
  			cubicinchperminute=(edtValue)*0.0610237441;
  			cubicinchpersecond=(edtValue)*0.0010170624;
  			poundpersecond=(edtValue)*0.0000271657;
  			poundperminute=(edtValue)*0.0016299416;
  			poundperhour=(edtValue)*0.0977964938;
  			poundperday=(edtValue)*2.3471158508;
  			kilogrampersecond=(edtValue)*0.0000123222;
  			kilogramperminute=(edtValue)*0.0007393291;
  			kilogramperhour=(edtValue)*0.0443597434;
  			kilogramperday=(edtValue)*1.0646338414;
  			
  			break;
			
			
			
			
			
			
			
          case "Milliliter/second -mL/s":
  			
  			cubicmeterpersecond=(edtValue)*0.000001;
  			cubicmeterperday=(edtValue)*0.0864 ;
  			cubicmeterperhour=(edtValue)*0.0036;
  			cubicmeterperminute=(edtValue)*0.00006;
  			cubiccentimeterperday=(edtValue)*86400;
  			cubiccentimeterperhour=(edtValue)*3600;
  			cubiccentimeterperminute=(edtValue)*60;
  			cubiccentimeterpersecond=(edtValue)*1;
  			literperday=(edtValue)*86.4;
  			literperhour=(edtValue)*3.6;
  			literperminute=(edtValue)*0.06;
  			literpersecond=(edtValue)*0.001;
  			milliliterperday=(edtValue)*86400;
  			milliliterperhour=(edtValue)*3600;
  			milliliterperminute=(edtValue)*60;
  			milliliterpersecond=(edtValue)*1;
  			gallonUSperday=(edtValue)*22.824465324;
  			gallonUSperhour=(edtValue)*0.9510193885;
  			gallonUSperminute=(edtValue)*0.0158503231;
  			gallonUSpersecond=(edtValue)*0.0002641721;
  			gallonUKperday=(edtValue)*19.005343053;
  			gallonUKperhour=(edtValue)*0.7918892939;
  			gallonUKperminute=(edtValue)*0.0131981549;
  			gallonUKpersecond=(edtValue)*0.0002199692;
  			kilobarrelUSperday=(edtValue)*0.0005434397;
  			barrelUSperday=(edtValue)*0.5434396506;
  			barrelUSperhour=(edtValue)*0.0226433188;
  			barrelUSperminute=(edtValue)*0.0003773886;
  			barrelUSpersecond=(edtValue)*0.0000062898;
  			acrefootperyear=(edtValue)*0.025566549;
  			acrefootperday=(edtValue)*0.0000700453;
  			acrefootperhour=(edtValue)*0.0000029186;
  			hundredcubicfootperday=(edtValue)*0.030511872;
  			
  			hundredcubicfootperhour=(edtValue)*0.001271328;
  			hundredcubicfootperminute=(edtValue)*0.0000211888 ;
  			ounceperhour=(edtValue)*121.73048173;
  			ounceperminute=(edtValue)*2.0288413621;
  			ouncepersecond=(edtValue)*0.0338140227;
  			ounceUKperhour=(edtValue)*126.70227916;
  			ounceUKperminute=(edtValue)*2.1117046527;
  			ounceUKpersecond=(edtValue)*0.0351950775;
  			cubicyardperhour=(edtValue)*0.0047086222;
  			cubicyardperminute=(edtValue)*0.000078477;
  			cubicyardpersecond=(edtValue)*0.000001308;
  			cubicfootperhour=(edtValue)*0.1271328002;
  			cubicfootperminute=(edtValue)*0.00211888;
  			cubicfootpersecond=(edtValue)*0.0000353147;
  			
  			cubicinchperhour=(edtValue)*219.68547873;
  			cubicinchperminute=(edtValue)*3.6614246457;
  			cubicinchpersecond=(edtValue)*0.0610237441;
  			poundpersecond=(edtValue)*0.0016299416;
  			poundperminute=(edtValue)*0.0977964938;
  			poundperhour=(edtValue)*5.867789625;
  			poundperday=(edtValue)*140.82695105;
  			kilogrampersecond=(edtValue)*0.0007393291;
  			kilogramperminute=(edtValue)*0.0443597434;
  			kilogramperhour=(edtValue)*2.6615846033;
  			kilogramperday=(edtValue)*63.878030484;
  			
  			break;
			
			
			
          case "Gallon (US)/day -gal(US)/d":
  			
  			cubicmeterpersecond=(edtValue)*4.381263638E-8;
  			cubicmeterperday=(edtValue)*0.0037854118 ;
  			cubicmeterperhour=(edtValue)*0.0001577255;
  			cubicmeterperminute=(edtValue)*0.0000026288;
  			cubiccentimeterperday=(edtValue)*3785.411784;
  			cubiccentimeterperhour=(edtValue)*157.725491;
  			cubiccentimeterperminute=(edtValue)*2.6287581833;
  			cubiccentimeterpersecond=(edtValue)*0.0438126364;
  			literperday=(edtValue)*3.785411784;
  			literperhour=(edtValue)*0.157725491;
  			literperminute=(edtValue)*0.0026287582;
  			literpersecond=(edtValue)*0.0000438126;
  			milliliterperday=(edtValue)*3785.411784;
  			milliliterperhour=(edtValue)*157.725491;
  			milliliterperminute=(edtValue)*2.6287581833;
  			milliliterpersecond=(edtValue)*0.0438126364;
  			gallonUSperday=(edtValue)*1;
  			gallonUSperhour=(edtValue)*0.0416666667;
  			gallonUSperminute=(edtValue)*0.0006944444;
  			gallonUSpersecond=(edtValue)*0.0000115741;
  			gallonUKperday=(edtValue)*0.8326741846;
  			gallonUKperhour=(edtValue)*0.0346947577;
  			gallonUKperminute=(edtValue)*0.000578246;
  			gallonUKpersecond=(edtValue)*0.0000096374;
  			kilobarrelUSperday=(edtValue)*0.0000238095;
  			barrelUSperday=(edtValue)*0.0238095238;
  			barrelUSperhour=(edtValue)*0.0009920635;
  			barrelUSperminute=(edtValue)*0.0000165344;
  			barrelUSpersecond=(edtValue)*2.755731922E-7;
  			acrefootperyear=(edtValue)*0.0011201379;
  			acrefootperday=(edtValue)*0.0000030689;
  			acrefootperhour=(edtValue)*1.27869625E-7;
  			hundredcubicfootperday=(edtValue)*0.0013368056;
  			
  			hundredcubicfootperhour=(edtValue)*0.0000557002;
  			hundredcubicfootperminute=(edtValue)*9.283371913E-7 ;
  			ounceperhour=(edtValue)*5.3333333333;
  			ounceperminute=(edtValue)*0.0888888889;
  			ouncepersecond=(edtValue)*0.0014814815;
  			ounceUKperhour=(edtValue)*5.5511608867;
  			ounceUKperminute=(edtValue)*0.0925193481;
  			ounceUKpersecond=(edtValue)*0.0015419891;
  			cubicyardperhour=(edtValue)*0.0002062972;
  			cubicyardperminute=(edtValue)*0.0000034383;
  			cubicyardpersecond=(edtValue)*5.730476489E-8;
  			cubicfootperhour=(edtValue)*0.0055700231;
  			cubicfootperminute=(edtValue)*0.0000928337;
  			cubicfootpersecond=(edtValue)*0.0000015472;
  			
  			cubicinchperhour=(edtValue)*9.6249999995;
  			cubicinchperminute=(edtValue)*0.1604166667;
  			cubicinchpersecond=(edtValue)*0.0026736111;
  			poundpersecond=(edtValue)*0.000071412;
  			poundperminute=(edtValue)*0.0042847222;
  			poundperhour=(edtValue)*0.2570833332;
  			poundperday=(edtValue)*6.1700000001;
  			kilogrampersecond=(edtValue)*0.000032392;
  			kilogramperminute=(edtValue)*0.0019435173;
  			kilogramperhour=(edtValue)*0.1166110384;
  			kilogramperday=(edtValue)*2.7986649228;
  			
  			break;
			
			
			
			
          case "Gallon (US)/hour -gal(US)/h":
  			
  			cubicmeterpersecond=(edtValue)*0.0000010515;
  			cubicmeterperday=(edtValue)*0.0908498828 ;
  			cubicmeterperhour=(edtValue)*0.0037854118;
  			cubicmeterperminute=(edtValue)*0.0000630902;
  			cubiccentimeterperday=(edtValue)*90849.882816;
  			cubiccentimeterperhour=(edtValue)*3785.411784;
  			cubiccentimeterperminute=(edtValue)*63.0901964;
  			cubiccentimeterpersecond=(edtValue)*1.0515032733;
  			literperday=(edtValue)*90.849882816;
  			literperhour=(edtValue)*3.785411784;
  			literperminute=(edtValue)*0.0630901964;
  			literpersecond=(edtValue)*0.0010515033;
  			milliliterperday=(edtValue)*90849.882816;
  			milliliterperhour=(edtValue)*3785.411784;
  			milliliterperminute=(edtValue)*63.0901964;
  			milliliterpersecond=(edtValue)*1.0515032733;
  			gallonUSperday=(edtValue)*24;
  			gallonUSperhour=(edtValue)*1;
  			gallonUSperminute=(edtValue)*0.0166666667;
  			gallonUSpersecond=(edtValue)*0.0002777778;
  			gallonUKperday=(edtValue)*19.984180431;
  			gallonUKperhour=(edtValue)*0.8326741846;
  			gallonUKperminute=(edtValue)*0.0138779031;
  			gallonUKpersecond=(edtValue)*0.0002312984;
  			kilobarrelUSperday=(edtValue)*0.0005714286;
  			barrelUSperday=(edtValue)*0.5714285714;
  			barrelUSperhour=(edtValue)*0.0238095238;
  			barrelUSperminute=(edtValue)*0.0003968254;
  			barrelUSpersecond=(edtValue)*0.0000066138;
  			acrefootperyear=(edtValue)*0.02688331;
  			acrefootperday=(edtValue)*0.0000736529;
  			acrefootperhour=(edtValue)*0.0000030689;
  			hundredcubicfootperday=(edtValue)*0.0320833333;
  			
  			hundredcubicfootperhour=(edtValue)*0.0013368056;
  			hundredcubicfootperminute=(edtValue)*0.0000222801 ;
  			ounceperhour=(edtValue)*128;
  			ounceperminute=(edtValue)*2.1333333333;
  			ouncepersecond=(edtValue)*0.0355555556;
  			ounceUKperhour=(edtValue)*133.22786128;
  			ounceUKperminute=(edtValue)*2.2204643547;
  			ounceUKpersecond=(edtValue)*0.0370077392;
  			cubicyardperhour=(edtValue)*0.0049511317;
  			cubicyardperminute=(edtValue)*0.0000825189;
  			cubicyardpersecond=(edtValue)*0.0000013753;
  			cubicfootperhour=(edtValue)*0.1336805556;
  			cubicfootperminute=(edtValue)*0.0022280093;
  			cubicfootpersecond=(edtValue)*0.0000371335;
  			
  			cubicinchperhour=(edtValue)*230.99999999;
  			cubicinchperminute=(edtValue)*3.85;
  			cubicinchpersecond=(edtValue)*0.0641666667;
  			poundpersecond=(edtValue)*0.0017138889;
  			poundperminute=(edtValue)*0.1028333333;
  			poundperhour=(edtValue)*6.169999998;
  			poundperday=(edtValue)*148.08;
  			kilogrampersecond=(edtValue)*0.0007774069;
  			kilogramperminute=(edtValue)*0.0466444154;
  			kilogramperhour=(edtValue)*2.7986649227;
  			kilogramperday=(edtValue)*67.167958148;
  			
  			break;
			
          case "Gallon (US)/minute -gal(US)/min":
    			
    			cubicmeterpersecond=(edtValue)*0.0000630902;
    			cubicmeterperday=(edtValue)*5.450992969 ;
    			cubicmeterperhour=(edtValue)*0.227124707;
    			cubicmeterperminute=(edtValue)*0.0037854118;
    			cubiccentimeterperday=(edtValue)*5450992.969;
    			cubiccentimeterperhour=(edtValue)*227124.70704;
    			cubiccentimeterperminute=(edtValue)*3785.411784;
    			cubiccentimeterpersecond=(edtValue)*63.0901964;
    			literperday=(edtValue)*5450.992969;
    			literperhour=(edtValue)*227.12470704;
    			literperminute=(edtValue)*3.785411784;
    			literpersecond=(edtValue)*0.0630901964;
    			milliliterperday=(edtValue)*5450992.969;
    			milliliterperhour=(edtValue)*227124.70704;
    			milliliterperminute=(edtValue)*3785.411784;
    			milliliterpersecond=(edtValue)*63.0901964;
    			gallonUSperday=(edtValue)*1440;
    			gallonUSperhour=(edtValue)*60;
    			gallonUSperminute=(edtValue)*1;
    			gallonUSpersecond=(edtValue)*0.0166666667;
    			gallonUKperday=(edtValue)*1199.0508259;
    			gallonUKperhour=(edtValue)*49.960451078;
    			gallonUKperminute=(edtValue)*0.8326741846;
    			gallonUKpersecond=(edtValue)*0.0138779031;
    			kilobarrelUSperday=(edtValue)*0.0342857143;
    			barrelUSperday=(edtValue)*34.285714286;
    			barrelUSperhour=(edtValue)*1.4285714286;
    			barrelUSperminute=(edtValue)*0.0238095238;
    			barrelUSpersecond=(edtValue)*0.0003968254;
    			acrefootperyear=(edtValue)*1.6129985985;
    			acrefootperday=(edtValue)*0.0044191742;
    			acrefootperhour=(edtValue)*0.0001841323;
    			hundredcubicfootperday=(edtValue)*1.925;
    			
    			hundredcubicfootperhour=(edtValue)*0.0802083333;
    			hundredcubicfootperminute=(edtValue)*0.0013368056 ;
    			ounceperhour=(edtValue)*7680;
    			ounceperminute=(edtValue)*128;
    			ouncepersecond=(edtValue)*2.1333333333;
    			ounceUKperhour=(edtValue)*7993.6716768;
    			ounceUKperminute=(edtValue)*133.22786128;
    			ounceUKpersecond=(edtValue)*2.2204643547;
    			cubicyardperhour=(edtValue)*0.2970679012;
    			cubicyardperminute=(edtValue)*0.0049511317;
    			cubicyardpersecond=(edtValue)*0.0000825189;
    			cubicfootperhour=(edtValue)*8.0208333333;
    			cubicfootperminute=(edtValue)*0.1336805555;
    			cubicfootpersecond=(edtValue)*0.0022280093;
    			
    			cubicinchperhour=(edtValue)*13859.999999;
    			cubicinchperminute=(edtValue)*231;
    			cubicinchpersecond=(edtValue)*3.85;
    			poundpersecond=(edtValue)*0.1028333333;
    			poundperminute=(edtValue)*6.1700000001;
    			poundperhour=(edtValue)*370.19999988;
    			poundperday=(edtValue)*8884.8000002;
    			kilogrampersecond=(edtValue)*0.0466444154;
    			kilogramperminute=(edtValue)*2.798664923;
    			kilogramperhour=(edtValue)*167.91989536;
    			kilogramperday=(edtValue)*4030.0774889;
    			
    			break;
  			
          case "Gallon (US)/second -gal(US)/s":
    			
    			cubicmeterpersecond=(edtValue)*0.0037854118;
    			cubicmeterperday=(edtValue)*327.05957814 ;
    			cubicmeterperhour=(edtValue)*13.627482422;
    			cubicmeterperminute=(edtValue)*0.227124707;
    			cubiccentimeterperday=(edtValue)*327059578.14;
    			cubiccentimeterperhour=(edtValue)*13627482.422;
    			cubiccentimeterperminute=(edtValue)*227124.70704;
    			cubiccentimeterpersecond=(edtValue)*3785.411784;
    			literperday=(edtValue)*327059.57814;
    			literperhour=(edtValue)*13627.482422;
    			literperminute=(edtValue)*227.12470704;
    			literpersecond=(edtValue)*3.785411784;
    			milliliterperday=(edtValue)*327059578.14;
    			milliliterperhour=(edtValue)*13627482.422;
    			milliliterperminute=(edtValue)*227124.70704;
    			milliliterpersecond=(edtValue)*3785.411784;
    			gallonUSperday=(edtValue)*86400;
    			gallonUSperhour=(edtValue)*3600;
    			gallonUSperminute=(edtValue)*60;
    			gallonUSpersecond=(edtValue)*1;
    			gallonUKperday=(edtValue)*71943.049552;
    			gallonUKperhour=(edtValue)*2997.6270647;
    			gallonUKperminute=(edtValue)*49.960451078;
    			gallonUKpersecond=(edtValue)*0.8326741846;
    			kilobarrelUSperday=(edtValue)*2.0571428571;
    			barrelUSperday=(edtValue)*2057.1428571;
    			barrelUSperhour=(edtValue)*85.714285714;
    			barrelUSperminute=(edtValue)*1.4285714286;
    			barrelUSpersecond=(edtValue)*0.0238095238;
    			acrefootperyear=(edtValue)*96.779915909;
    			acrefootperday=(edtValue)*0.2651504545;
    			acrefootperhour=(edtValue)*0.0110479356;
    			hundredcubicfootperday=(edtValue)*115.5;
    			
    			hundredcubicfootperhour=(edtValue)*4.8125;
    			hundredcubicfootperminute=(edtValue)* 0.0802083333;
    			ounceperhour=(edtValue)*460800;
    			ounceperminute=(edtValue)*7680;
    			ouncepersecond=(edtValue)*128;
    			ounceUKperhour=(edtValue)*479620.30061;
    			ounceUKperminute=(edtValue)*7993.6716768;
    			ounceUKpersecond=(edtValue)*133.22786128;
    			cubicyardperhour=(edtValue)*17.824074073;
    			cubicyardperminute=(edtValue)*0.2970679012;
    			cubicyardpersecond=(edtValue)*0.0049511317;
    			cubicfootperhour=(edtValue)*481.25;
    			cubicfootperminute=(edtValue)*8.0208333329;
    			cubicfootpersecond=(edtValue)*0.1336805555;
    			
    			cubicinchperhour=(edtValue)*831599.99996;
    			cubicinchperminute=(edtValue)*13860;
    			cubicinchpersecond=(edtValue)*231;
    			poundpersecond=(edtValue)*6.1700000005;
    			poundperminute=(edtValue)*370.2;
    			poundperhour=(edtValue)*22211.999993;
    			poundperday=(edtValue)*533088.00001;
    			kilogrampersecond=(edtValue)*2.7986649225;
    			kilogramperminute=(edtValue)*167.91989538;
    			kilogramperhour=(edtValue)*10075.193722;
    			kilogramperday=(edtValue)*241804.64933;
    			
    			break;
  			
  			
          case "Gallon (UK)/day -gal(UK)/d":
    			
    			cubicmeterpersecond=(edtValue)*5.26167824E-8;
    			cubicmeterperday=(edtValue)* 0.00454609;
    			cubicmeterperhour=(edtValue)*0.0001894204;
    			cubicmeterperminute=(edtValue)*0.000003157;
    			cubiccentimeterperday=(edtValue)*4546.09;
    			cubiccentimeterperhour=(edtValue)*189.42041667;
    			cubiccentimeterperminute=(edtValue)*3.1570069444;
    			cubiccentimeterpersecond=(edtValue)*0.0526167824;
    			literperday=(edtValue)*4.54609;
    			literperhour=(edtValue)*0.1894204167;
    			literperminute=(edtValue)*0.0031570069;
    			literpersecond=(edtValue)*0.0000526168;
    			milliliterperday=(edtValue)*4546.09;
    			milliliterperhour=(edtValue)*189.42041667;
    			milliliterperminute=(edtValue)*3.1570069444;
    			milliliterpersecond=(edtValue)*0.0526167824;
    			gallonUSperday=(edtValue)*1.2009499255;
    			gallonUSperhour=(edtValue)*0.0500395802;
    			gallonUSperminute=(edtValue)*0.000833993;
    			gallonUSpersecond=(edtValue)*0.0000138999;
    			gallonUKperday=(edtValue)*1;
    			gallonUKperhour=(edtValue)*0.0416666667;
    			gallonUKperminute=(edtValue)*0.0006944444;
    			gallonUKpersecond=(edtValue)*0.0000115741;
    			kilobarrelUSperday=(edtValue)*0.000028594;
    			barrelUSperday=(edtValue)*0.0285940458;
    			barrelUSperhour=(edtValue)*0.0011914186;
    			barrelUSperminute=(edtValue)*0.000019857;
    			barrelUSpersecond=(edtValue)*3.309496046E-7;
    			acrefootperyear=(edtValue)*0.0013452295;
    			acrefootperday=(edtValue)*0.0000036856;
    			acrefootperhour=(edtValue)*1.535650167E-7;
    			hundredcubicfootperday=(edtValue)*0.0016054365;
    			
    			hundredcubicfootperhour=(edtValue)*0.0000668932;
    			hundredcubicfootperminute=(edtValue)*0.0000011149 ;
    			ounceperhour=(edtValue)*6.4050662694;
    			ounceperminute=(edtValue)*0.1067511045;
    			ouncepersecond=(edtValue)*0.0017791851;
    			ounceUKperhour=(edtValue)*6.6666662533;
    			ounceUKperminute=(edtValue)*0.1111111042;
    			ounceUKpersecond=(edtValue)*0.0018518517;
    			cubicyardperhour=(edtValue)*0.0002477526;
    			cubicyardperminute=(edtValue)*0.0000041292;
    			cubicyardpersecond=(edtValue)*6.882015313E-8;
    			cubicfootperhour=(edtValue)*0.0066893189;
    			cubicfootperminute=(edtValue)*0.0001114886;
    			cubicfootpersecond=(edtValue)*0.0000018581;
    			
    			cubicinchperhour=(edtValue)*11.559143032;
    			cubicinchperminute=(edtValue)*0.1926523839;
    			cubicinchpersecond=(edtValue)*0.0032108731;
    			poundpersecond=(edtValue)*0.0000857623;
    			poundperminute=(edtValue)*0.0051457368;
    			poundperhour=(edtValue)*0.3087442099;
    			poundperday=(edtValue)*7.4098610405;
    			kilogrampersecond=(edtValue)*0.0000389011;
    			kilogramperminute=(edtValue)*0.002334067;
    			kilogramperhour=(edtValue)*0.1400440179;
    			kilogramperday=(edtValue)*3.3610564306;
    			
    			break;
  			
  			
          case "Gallon (UK)/hour -gal(UK)/h":
    			
    			cubicmeterpersecond=(edtValue)*0.0000012628;
    			cubicmeterperday=(edtValue)*0.10910616 ;
    			cubicmeterperhour=(edtValue)*0.00454609;
    			cubicmeterperminute=(edtValue)*0.0000757682;
    			cubiccentimeterperday=(edtValue)*109106.16;
    			cubiccentimeterperhour=(edtValue)*4546.09;
    			cubiccentimeterperminute=(edtValue)*75.768166667;
    			cubiccentimeterpersecond=(edtValue)*1.2628027778;
    			literperday=(edtValue)*109.10616;
    			literperhour=(edtValue)*4.54609;
    			literperminute=(edtValue)*0.0757681667;
    			literpersecond=(edtValue)*0.0012628028;
    			milliliterperday=(edtValue)*109106.16;
    			milliliterperhour=(edtValue)*4546.09;
    			milliliterperminute=(edtValue)*75.768166667;
    			milliliterpersecond=(edtValue)*1.2628027778;
    			gallonUSperday=(edtValue)*28.822798212;
    			gallonUSperhour=(edtValue)*1.2009499255;
    			gallonUSperminute=(edtValue)*0.0200158321;
    			gallonUSpersecond=(edtValue)*0.0003335972;
    			gallonUKperday=(edtValue)*24;
    			gallonUKperhour=(edtValue)*1;
    			gallonUKperminute=(edtValue)*0.0166666667;
    			gallonUKpersecond=(edtValue)*0.0002777778;
    			kilobarrelUSperday=(edtValue)*0.0006862571;
    			barrelUSperday=(edtValue)*0.6862571003;
    			barrelUSperhour=(edtValue)*0.0285940458;
    			barrelUSperminute=(edtValue)*0.0004765674;
    			barrelUSpersecond=(edtValue)*0.0000079428;
    			acrefootperyear=(edtValue)*0.0322855091;
    			acrefootperday=(edtValue)*0.0000884534;
    			acrefootperhour=(edtValue)*0.0000036856;
    			hundredcubicfootperday=(edtValue)*0.0385304768;
    			
    			hundredcubicfootperhour=(edtValue)*0.0016054365;
    			hundredcubicfootperminute=(edtValue)*0.0000267573 ;
    			ounceperhour=(edtValue)*153.72159046;
    			ounceperminute=(edtValue)*2.5620265077;
    			ouncepersecond=(edtValue)*0.0427004418;
    			ounceUKperhour=(edtValue)*159.99999008;
    			ounceUKperminute=(edtValue)*2.6666665013;
    			ounceUKpersecond=(edtValue)*0.0444444417;
    			cubicyardperhour=(edtValue)*0.0059460612;
    			cubicyardperminute=(edtValue)*0.000099101;
    			cubicyardpersecond=(edtValue)*0.0000016517;
    			cubicfootperhour=(edtValue)*0.1605436532;
    			cubicfootperminute=(edtValue)*0.0026757276;
    			cubicfootpersecond=(edtValue)*0.0000445955;
    			
    			cubicinchperhour=(edtValue)*277.41943278;
    			cubicinchperminute=(edtValue)*4.6236572132;
    			cubicinchpersecond=(edtValue)*0.0770609536;
    			poundpersecond=(edtValue)*0.0020582947;
    			poundperminute=(edtValue)*0.123497684;
    			poundperhour=(edtValue)*7.4098610379;
    			poundperday=(edtValue)*177.83666497;
    			kilogrampersecond=(edtValue)*0.0009336268;
    			kilogramperminute=(edtValue)*0.0560176072;
    			kilogramperhour=(edtValue)*3.3610564304;
    			kilogramperday=(edtValue)*80.665354334;
    			
    			break;
  			
  			
  			
          case "Gallon (UK)/minute -gal(UK)/min":
    			
    			cubicmeterpersecond=(edtValue)*0.0000757682;
    			cubicmeterperday=(edtValue)*6.5463696 ;
    			cubicmeterperhour=(edtValue)*0.2727654;
    			cubicmeterperminute=(edtValue)*0.00454609;
    			cubiccentimeterperday=(edtValue)*6546369.6;
    			cubiccentimeterperhour=(edtValue)*272765.4;
    			cubiccentimeterperminute=(edtValue)*4546.09;
    			cubiccentimeterpersecond=(edtValue)*75.768166667;
    			literperday=(edtValue)*6546.3696;
    			literperhour=(edtValue)*272.7654;
    			literperminute=(edtValue)*4.54609;
    			literpersecond=(edtValue)*0.0757681667;
    			milliliterperday=(edtValue)*6546369.6;
    			milliliterperhour=(edtValue)*272765.4;
    			milliliterperminute=(edtValue)*4546.09;
    			milliliterpersecond=(edtValue)*75.768166667;
    			gallonUSperday=(edtValue)*1729.3678927;
    			gallonUSperhour=(edtValue)*72.05699553;
    			gallonUSperminute=(edtValue)*1.2009499255;
    			gallonUSpersecond=(edtValue)*0.0200158321;
    			gallonUKperday=(edtValue)*1440;
    			gallonUKperhour=(edtValue)*60;
    			gallonUKperminute=(edtValue)*1;
    			gallonUKpersecond=(edtValue)*0.0166666667;
    			kilobarrelUSperday=(edtValue)*0.041175426;
    			barrelUSperday=(edtValue)*41.175426017;
    			barrelUSperhour=(edtValue)*1.7156427507;
    			barrelUSperminute=(edtValue)*0.0285940458;
    			barrelUSpersecond=(edtValue)*0.0004765674;
    			acrefootperyear=(edtValue)*1.9371305467;
    			acrefootperday=(edtValue)*0.005307207;
    			acrefootperhour=(edtValue)*0.0002211336;
    			hundredcubicfootperday=(edtValue)*2.3118286066;
    			
    			hundredcubicfootperhour=(edtValue)*0.0963261919;
    			hundredcubicfootperminute=(edtValue)*0.0016054365 ;
    			ounceperhour=(edtValue)*9223.2954279;
    			ounceperminute=(edtValue)*153.72159046;
    			ouncepersecond=(edtValue)*2.5620265077;
    			ounceUKperhour=(edtValue)*9599.9994048;
    			ounceUKperminute=(edtValue)*159.99999008;
    			ounceUKpersecond=(edtValue)*2.6666665013;
    			cubicyardperhour=(edtValue)*0.3567636738;
    			cubicyardperminute=(edtValue)*0.0059460612;
    			cubicyardpersecond=(edtValue)*0.000099101;
    			cubicfootperhour=(edtValue)*9.6326191942;
    			cubicfootperminute=(edtValue)*0.1605436532;
    			cubicfootpersecond=(edtValue)*0.0026757276;
    			
    			cubicinchperhour=(edtValue)*16645.165967;
    			cubicinchperminute=(edtValue)*277.41943279;
    			cubicinchpersecond=(edtValue)*4.6236572132;
    			poundpersecond=(edtValue)*0.123497684;
    			poundperminute=(edtValue)*7.4098610404;
    			poundperhour=(edtValue)*444.59166228;
    			poundperday=(edtValue)*10670.199898;
    			kilogrampersecond=(edtValue)*0.0560176072;
    			kilogramperminute=(edtValue)*3.3610564307;
    			kilogramperhour=(edtValue)*201.66338582;
    			kilogramperday=(edtValue)*4839.9212601;
    			
    			break;
  			
  			
          case "Gallon (UK)/second -gal(UK)/s":
    			
    			cubicmeterpersecond=(edtValue)*0.00454609;
    			cubicmeterperday=(edtValue)*392.782176 ;
    			cubicmeterperhour=(edtValue)*16.365924;
    			cubicmeterperminute=(edtValue)*0.2727654;
    			cubiccentimeterperday=(edtValue)*392782176;
    			cubiccentimeterperhour=(edtValue)*16365924;
    			cubiccentimeterperminute=(edtValue)*272765.4;
    			cubiccentimeterpersecond=(edtValue)*4546.09;
    			literperday=(edtValue)*392782.176;
    			literperhour=(edtValue)*16365.924;
    			literperminute=(edtValue)*272.7654;
    			literpersecond=(edtValue)*4.54609;
    			milliliterperday=(edtValue)*392782176;
    			milliliterperhour=(edtValue)*16365924;
    			milliliterperminute=(edtValue)*272765.4;
    			milliliterpersecond=(edtValue)*4546.09;
    			gallonUSperday=(edtValue)*103762.07356;
    			gallonUSperhour=(edtValue)*4323.4197318;
    			gallonUSperminute=(edtValue)*72.05699553;
    			gallonUSpersecond=(edtValue)*1.2009499255;
    			gallonUKperday=(edtValue)*86400;
    			gallonUKperhour=(edtValue)*3600;
    			gallonUKperminute=(edtValue)*60;
    			gallonUKpersecond=(edtValue)*1;
    			kilobarrelUSperday=(edtValue)*2.470525561;
    			barrelUSperday=(edtValue)*2470.525561;
    			barrelUSperhour=(edtValue)*102.93856504;
    			barrelUSperminute=(edtValue)*1.7156427507;
    			barrelUSpersecond=(edtValue)*0.0285940458;
    			acrefootperyear=(edtValue)*116.2278328;
    			acrefootperday=(edtValue)*0.3184324186;
    			acrefootperhour=(edtValue)*0.0132680174;
    			hundredcubicfootperday=(edtValue)*138.7097164;
    			
    			hundredcubicfootperhour=(edtValue)*5.7795715165;
    			hundredcubicfootperminute=(edtValue)*0.0963261919 ;
    			ounceperhour=(edtValue)*553397.72567;
    			ounceperminute=(edtValue)*9223.2954279;
    			ouncepersecond=(edtValue)*153.72159046;
    			ounceUKperhour=(edtValue)*575999.96429;
    			ounceUKperminute=(edtValue)*9599.9994048;
    			ounceUKpersecond=(edtValue)*159.99999008;
    			cubicyardperhour=(edtValue)*21.40582043;
    			cubicyardperminute=(edtValue)*0.3567636738;
    			cubicyardpersecond=(edtValue)*0.0059460612;
    			cubicfootperhour=(edtValue)*577.95715165;
    			cubicfootperminute=(edtValue)*9.6326191937;
    			cubicfootpersecond=(edtValue)*0.1605436532;
    			
    			cubicinchperhour=(edtValue)*998709.958;
    			cubicinchperminute=(edtValue)*16645.165967;
    			cubicinchpersecond=(edtValue)*277.41943279;
    			poundpersecond=(edtValue)*7.409861041;
    			poundperminute=(edtValue)*444.59166243;
    			poundperhour=(edtValue)*26675.499737;
    			poundperday=(edtValue)*640211.9939;
    			kilogrampersecond=(edtValue)*3.3610564302;
    			kilogramperminute=(edtValue)*201.66338584;
    			kilogramperhour=(edtValue)*12099.803149;
    			kilogramperday=(edtValue)*290395.2756;
    			
    			break;
  			
    			
          case "Kilobarrel (US)/day -kbbl(US)/d":
    			
    			cubicmeterpersecond=(edtValue)*0.0018401307;
    			cubicmeterperday=(edtValue)*158.98729493 ;
    			cubicmeterperhour=(edtValue)*6.624470622;
    			cubicmeterperminute=(edtValue)*0.1104078437;
    			cubiccentimeterperday=(edtValue)*158987294.93;
    			cubiccentimeterperhour=(edtValue)*6624470.622;
    			cubiccentimeterperminute=(edtValue)*110407.8437;
    			cubiccentimeterpersecond=(edtValue)*1840.1307283;
    			literperday=(edtValue)*158987.29493;
    			literperhour=(edtValue)*6624.470622;
    			literperminute=(edtValue)*110.4078437;
    			literpersecond=(edtValue)*1.8401307283;
    			milliliterperday=(edtValue)*158987294.93;
    			milliliterperhour=(edtValue)*6624470.622;
    			milliliterperminute=(edtValue)*110407.8437;
    			milliliterpersecond=(edtValue)*1840.1307283;
    			gallonUSperday=(edtValue)*42000;
    			gallonUSperhour=(edtValue)*1750;
    			gallonUSperminute=(edtValue)*29.166666667;
    			gallonUSpersecond=(edtValue)*0.4861111111;
    			gallonUKperday=(edtValue)*34972.315754;
    			gallonUKperhour=(edtValue)*1457.1798231;
    			gallonUKperminute=(edtValue)*24.286330385;
    			gallonUKpersecond=(edtValue)*0.4047721731;
    			kilobarrelUSperday=(edtValue)*1;
    			barrelUSperday=(edtValue)*1000;
    			barrelUSperhour=(edtValue)*41.666666667;
    			barrelUSperminute=(edtValue)*0.6944444444;
    			barrelUSpersecond=(edtValue)*0.0115740741;
    			acrefootperyear=(edtValue)*47.045792456;
    			acrefootperday=(edtValue)*0.1288925821;
    			acrefootperhour=(edtValue)*0.0053705243;
    			hundredcubicfootperday=(edtValue)*56.145833333;
    			
    			hundredcubicfootperhour=(edtValue)*2.3394097222;
    			hundredcubicfootperminute=(edtValue)* 0.038990162;
    			ounceperhour=(edtValue)*224000;
    			ounceperminute=(edtValue)*3733.3333333;
    			ouncepersecond=(edtValue)*62.222222222;
    			ounceUKperhour=(edtValue)*233148.75724;
    			ounceUKperminute=(edtValue)*3885.8126207;
    			ounceUKpersecond=(edtValue)*64.763543678;
    			cubicyardperhour=(edtValue)*8.6644804522;
    			cubicyardperminute=(edtValue)*0.1444080075;
    			cubicyardpersecond=(edtValue)*0.0024068001;
    			cubicfootperhour=(edtValue)*233.94097222;
    			cubicfootperminute=(edtValue)*3.8990162035;
    			cubicfootpersecond=(edtValue)*0.0649836034;
    			
    			cubicinchperhour=(edtValue)*404249.99998;
    			cubicinchperminute=(edtValue)*6737.5;
    			cubicinchpersecond=(edtValue)*112.29166667;
    			poundpersecond=(edtValue)*2.9993055558;
    			poundperminute=(edtValue)*179.95833334;
    			poundperhour=(edtValue)*10797.499996;
    			poundperday=(edtValue)*259140.00001;
    			kilogrampersecond=(edtValue)*1.3604621151;
    			kilogramperminute=(edtValue)*81.62772692;
    			kilogramperhour=(edtValue)*4897.6636147;
    			kilogramperday=(edtValue)*117543.92676;
    			
    			break;
  			
    			
          case "Barrel (US)/day -bbl(US)/d":
    			
    			cubicmeterpersecond=(edtValue)*0.0000018401;
    			cubicmeterperday=(edtValue)*0.1589872949 ;
    			cubicmeterperhour=(edtValue)*0.0066244706;
    			cubicmeterperminute=(edtValue)*0.0001104078;
    			cubiccentimeterperday=(edtValue)*158987.29493;
    			cubiccentimeterperhour=(edtValue)*6624.470622;
    			cubiccentimeterperminute=(edtValue)*110.4078437;
    			cubiccentimeterpersecond=(edtValue)*1.8401307283;
    			literperday=(edtValue)*158.98729493;
    			literperhour=(edtValue)*6.624470622;
    			literperminute=(edtValue)*0.1104078437;
    			literpersecond=(edtValue)*0.0018401307;
    			milliliterperday=(edtValue)*158987.29493;
    			milliliterperhour=(edtValue)*6624.470622;
    			milliliterperminute=(edtValue)*110.4078437;
    			milliliterpersecond=(edtValue)*1.8401307283;
    			gallonUSperday=(edtValue)*42;
    			gallonUSperhour=(edtValue)*1.75;
    			gallonUSperminute=(edtValue)*0.0291666667;
    			gallonUSpersecond=(edtValue)*0.0004861111;
    			gallonUKperday=(edtValue)*34.972315754;
    			gallonUKperhour=(edtValue)*1.4571798231;
    			gallonUKperminute=(edtValue)*0.0242863304;
    			gallonUKpersecond=(edtValue)*0.0004047722;
    			kilobarrelUSperday=(edtValue)*0.001;
    			barrelUSperday=(edtValue)*1;
    			barrelUSperhour=(edtValue)*0.0416666667;
    			barrelUSperminute=(edtValue)*0.0006944444;
    			barrelUSpersecond=(edtValue)*0.0000115741;
    			acrefootperyear=(edtValue)*0.0470457925;
    			acrefootperday=(edtValue)*0.0001288926;
    			acrefootperhour=(edtValue)*0.0000053705;
    			hundredcubicfootperday=(edtValue)*0.0561458333;
    			
    			hundredcubicfootperhour=(edtValue)*0.0023394097;
    			hundredcubicfootperminute=(edtValue)*0.0000389902 ;
    			ounceperhour=(edtValue)*224;
    			ounceperminute=(edtValue)*3.7333333333;
    			ouncepersecond=(edtValue)*0.0622222222;
    			ounceUKperhour=(edtValue)*233.14875724;
    			ounceUKperminute=(edtValue)*3.8858126207;
    			ounceUKpersecond=(edtValue)*0.0647635437;
    			cubicyardperhour=(edtValue)*0.0086644805;
    			cubicyardperminute=(edtValue)*0.000144408;
    			cubicyardpersecond=(edtValue)*0.0000024068;
    			cubicfootperhour=(edtValue)*0.2339409722;
    			cubicfootperminute=(edtValue)*0.0038990162;
    			cubicfootpersecond=(edtValue)*0.0000649836;
    			
    			cubicinchperhour=(edtValue)*404.24999998;
    			cubicinchperminute=(edtValue)*6.7375;
    			cubicinchpersecond=(edtValue)*0.1122916667;
    			poundpersecond=(edtValue)*0.0029993056;
    			poundperminute=(edtValue)*0.1799583333;
    			poundperhour=(edtValue)*10.797499996;
    			poundperday=(edtValue)*259.14000001;
    			kilogrampersecond=(edtValue)*0.0013604621;
    			kilogramperminute=(edtValue)*0.0816277269;
    			kilogramperhour=(edtValue)*4.8976636147;
    			kilogramperday=(edtValue)*117.54392676;
    			
    			break;
  			
    			
          case "Barrel (US)/hour -bbl(US)/h":
    			
    			cubicmeterpersecond=(edtValue)*0.0000441631;
    			cubicmeterperday=(edtValue)*3.8156950783 ;
    			cubicmeterperhour=(edtValue)*0.1589872949;
    			cubicmeterperminute=(edtValue)*0.0026497882;
    			cubiccentimeterperday=(edtValue)*3815695.0783;
    			cubiccentimeterperhour=(edtValue)*158987.29493;
    			cubiccentimeterperminute=(edtValue)*2649.7882488;
    			cubiccentimeterpersecond=(edtValue)*44.16313748;
    			literperday=(edtValue)*3815.6950783;
    			literperhour=(edtValue)*158.98729493;
    			literperminute=(edtValue)*2.6497882488;
    			literpersecond=(edtValue)*0.0441631375;
    			milliliterperday=(edtValue)*3815695.0783;
    			milliliterperhour=(edtValue)*158987.29493;
    			milliliterperminute=(edtValue)*2649.7882488;
    			milliliterpersecond=(edtValue)*44.16313748;
    			gallonUSperday=(edtValue)*1008;
    			gallonUSperhour=(edtValue)*42;
    			gallonUSperminute=(edtValue)*0.7;
    			gallonUSpersecond=(edtValue)*0.0116666667;
    			gallonUKperday=(edtValue)*839.33557811;
    			gallonUKperhour=(edtValue)*34.972315754;
    			gallonUKperminute=(edtValue)*0.5828719292;
    			gallonUKpersecond=(edtValue)*0.0097145322;
    			kilobarrelUSperday=(edtValue)*0.024;
    			barrelUSperday=(edtValue)*24;
    			barrelUSperhour=(edtValue)*1;
    			barrelUSperminute=(edtValue)*0.0166666667;
    			barrelUSpersecond=(edtValue)*0.0002777778;
    			acrefootperyear=(edtValue)*1.1290990189;
    			acrefootperday=(edtValue)*0.003093422;
    			acrefootperhour=(edtValue)*0.0001288926;
    			hundredcubicfootperday=(edtValue)*1.3475;
    			
    			hundredcubicfootperhour=(edtValue)*0.0561458333;
    			hundredcubicfootperminute=(edtValue)*0.0009357639 ;
    			ounceperhour=(edtValue)*5376;
    			ounceperminute=(edtValue)*89.6;
    			ouncepersecond=(edtValue)*1.4933333333;
    			ounceUKperhour=(edtValue)*5595.5701738;
    			ounceUKperminute=(edtValue)*93.259502896;
    			ounceUKpersecond=(edtValue)*1.5543250483;
    			cubicyardperhour=(edtValue)*0.2079475309;
    			cubicyardperminute=(edtValue)*0.0034657922;
    			cubicyardpersecond=(edtValue)*0.0000577632;
    			cubicfootperhour=(edtValue)*5.6145833333;
    			cubicfootperminute=(edtValue)*0.0935763889;
    			cubicfootpersecond=(edtValue)*0.0015596065;
    			
    			cubicinchperhour=(edtValue)*9701.9999995;
    			cubicinchperminute=(edtValue)*161.7;
    			cubicinchpersecond=(edtValue)*2.695;
    			poundpersecond=(edtValue)*0.0719833333;
    			poundperminute=(edtValue)*4.319;
    			poundperhour=(edtValue)*259.13999991;
    			poundperday=(edtValue)*6219.3600001;
    			kilogrampersecond=(edtValue)*0.0326510908;
    			kilogramperminute=(edtValue)*1.9590654461;
    			kilogramperhour=(edtValue)*117.54392675;
    			kilogramperday=(edtValue)*2821.0542422;
    			
    			break;
  			
    			
          case "Barrel (US)/minute -bbl(US)/min":
    			
    			cubicmeterpersecond=(edtValue)*0.0026497882;
    			cubicmeterperday=(edtValue)*228.9417047 ;
    			cubicmeterperhour=(edtValue)*9.5392376957;
    			cubicmeterperminute=(edtValue)*0.1589872949;
    			cubiccentimeterperday=(edtValue)*228941704.7;
    			cubiccentimeterperhour=(edtValue)*9539237.6957;
    			cubiccentimeterperminute=(edtValue)*158987.29493;
    			cubiccentimeterpersecond=(edtValue)*2649.7882488;
    			literperday=(edtValue)*228941.7047;
    			literperhour=(edtValue)*9539.2376957;
    			literperminute=(edtValue)*158.98729493;
    			literpersecond=(edtValue)*2.6497882488;
    			milliliterperday=(edtValue)*228941704.7;
    			milliliterperhour=(edtValue)*9539237.6957;
    			milliliterperminute=(edtValue)*158987.29493;
    			milliliterpersecond=(edtValue)*2649.7882488;
    			gallonUSperday=(edtValue)*60480;
    			gallonUSperhour=(edtValue)*2520;
    			gallonUSperminute=(edtValue)*42;
    			gallonUSpersecond=(edtValue)*0.7;
    			gallonUKperday=(edtValue)*50360.134686;
    			gallonUKperhour=(edtValue)*2098.3389453;
    			gallonUKperminute=(edtValue)*34.972315754;
    			gallonUKpersecond=(edtValue)*0.5828719292;
    			kilobarrelUSperday=(edtValue)*1.44;
    			barrelUSperday=(edtValue)*1440;
    			barrelUSperhour=(edtValue)*60;
    			barrelUSperminute=(edtValue)*1;
    			barrelUSpersecond=(edtValue)*0.0166666667;
    			acrefootperyear=(edtValue)*67.745941136;
    			acrefootperday=(edtValue)*0.1856053182;
    			acrefootperhour=(edtValue)*0.0077335549;
    			hundredcubicfootperday=(edtValue)*80.85;
    			
    			hundredcubicfootperhour=(edtValue)*3.36875;
    			hundredcubicfootperminute=(edtValue)*0.0561458333 ;
    			ounceperhour=(edtValue)*322560;
    			ounceperminute=(edtValue)*5376;
    			ouncepersecond=(edtValue)*89.6;
    			ounceUKperhour=(edtValue)*335734.21043;
    			ounceUKperminute=(edtValue)*5595.5701738;
    			ounceUKpersecond=(edtValue)*93.259502896;
    			cubicyardperhour=(edtValue)*12.476851851;
    			cubicyardperminute=(edtValue)*0.2079475309;
    			cubicyardpersecond=(edtValue)*0.0034657922;
    			cubicfootperhour=(edtValue)*336.875;
    			cubicfootperminute=(edtValue)*5.6145833331;
    			cubicfootpersecond=(edtValue)*0.0935763889;
    			
    			cubicinchperhour=(edtValue)*582119.99997;
    			cubicinchperminute=(edtValue)*9702;
    			cubicinchpersecond=(edtValue)*161.7;
    			poundpersecond=(edtValue)*4.3190000004;
    			poundperminute=(edtValue)*259.14;
    			poundperhour=(edtValue)*15548.399995;
    			poundperday=(edtValue)*373161.60001;
    			kilogrampersecond=(edtValue)*1.9590654457;
    			kilogramperminute=(edtValue)*117.54392676;
    			kilogramperhour=(edtValue)*7052.6356051;
    			kilogramperday=(edtValue)*169263.25453;
    			
    			break;
  			
    			
          case "Barrel (US)/second -bbl(US)/s":
    			
    			cubicmeterpersecond=(edtValue)*0.1589872949;
    			cubicmeterperday=(edtValue)* 13736.502282;
    			cubicmeterperhour=(edtValue)*572.35426174;
    			cubicmeterperminute=(edtValue)*9.5392376957;
    			cubiccentimeterperday=(edtValue)*13736502.282;
    			cubiccentimeterperhour=(edtValue)*572354261.74;
    			cubiccentimeterperminute=(edtValue)*9539237.6957;
    			cubiccentimeterpersecond=(edtValue)*158987.29493;
    			literperday=(edtValue)*13736502.282;
    			literperhour=(edtValue)*572354.26174;
    			literperminute=(edtValue)*9539.2376957;
    			literpersecond=(edtValue)*158.98729493;
    			milliliterperday=(edtValue)*13736502282.0;
    			milliliterperhour=(edtValue)*572354261.74;
    			milliliterperminute=(edtValue)*9539237.6957;
    			milliliterpersecond=(edtValue)*158987.29493;
    			gallonUSperday=(edtValue)*3628800;
    			gallonUSperhour=(edtValue)*151200;
    			gallonUSperminute=(edtValue)*2520;
    			gallonUSpersecond=(edtValue)*42;
    			gallonUKperday=(edtValue)*3021608.0812;
    			gallonUKperhour=(edtValue)*125900.33672;
    			gallonUKperminute=(edtValue)*2098.3389453;
    			gallonUKpersecond=(edtValue)*34.972315754;
    			kilobarrelUSperday=(edtValue)*86.4;
    			barrelUSperday=(edtValue)*86400;
    			barrelUSperhour=(edtValue)*3600;
    			barrelUSperminute=(edtValue)*60;
    			barrelUSpersecond=(edtValue)*1;
    			acrefootperyear=(edtValue)*4064.7564682;
    			acrefootperday=(edtValue)*11.136319091;
    			acrefootperhour=(edtValue)*0.4640132955;
    			hundredcubicfootperday=(edtValue)*4851;
    			
    			hundredcubicfootperhour=(edtValue)*202.125;
    			hundredcubicfootperminute=(edtValue)*3.36875 ;
    			ounceperhour=(edtValue)*19353600;
    			ounceperminute=(edtValue)*322560;
    			ouncepersecond=(edtValue)*5376;
    			ounceUKperhour=(edtValue)*20144052.626;
    			ounceUKperminute=(edtValue)*335734.21043;
    			ounceUKpersecond=(edtValue)*5595.5701738;
    			cubicyardperhour=(edtValue)*748.61111107;
    			cubicyardperminute=(edtValue)*12.476851851;
    			cubicyardpersecond=(edtValue)*0.2079475309;
    			cubicfootperhour=(edtValue)*20212.5;
    			cubicfootperminute=(edtValue)*336.87499998;
    			cubicfootpersecond=(edtValue)*5.6145833331;
    			
    			cubicinchperhour=(edtValue)*34927199.998;
    			cubicinchperminute=(edtValue)*582120;
    			cubicinchpersecond=(edtValue)*9702;
    			poundpersecond=(edtValue)*259.14000002;
    			poundperminute=(edtValue)*15548.4;
    			poundperhour=(edtValue)*932903.99969;
    			poundperday=(edtValue)*22389696.001;
    			kilogrampersecond=(edtValue)*117.54392674;
    			kilogramperminute=(edtValue)*7052.6356059;
    			kilogramperhour=(edtValue)*423158.13631;
    			kilogramperday=(edtValue)*10155795.272;
    			
    			break;
  			
    			
          case "Acre-foot/year -ac*ft/y":
    			
    			cubicmeterpersecond=(edtValue)*0.0000391136;
    			cubicmeterperday=(edtValue)*3.3794158123 ;
    			cubicmeterperhour=(edtValue)*0.1408089922;
    			cubicmeterperminute=(edtValue)*0.0023468165;
    			cubiccentimeterperday=(edtValue)*3379415.8123;
    			cubiccentimeterperhour=(edtValue)*140808.99218;
    			cubiccentimeterperminute=(edtValue)*2346.8165363;
    			cubiccentimeterpersecond=(edtValue)*39.113608939;
    			literperday=(edtValue)*3379.4158123;
    			literperhour=(edtValue)*140.80899218;
    			literperminute=(edtValue)*2.3468165363;
    			literpersecond=(edtValue)*0.0391136089;
    			milliliterperday=(edtValue)*3379415.8123;
    			milliliterperhour=(edtValue)*140808.99218;
    			milliliterperminute=(edtValue)*2346.8165363;
    			milliliterpersecond=(edtValue)*39.113608939;
    			gallonUSperday=(edtValue)*892.74721091;
    			gallonUSperhour=(edtValue)*37.197800455;
    			gallonUSperminute=(edtValue)*0.6199633409;
    			gallonUSpersecond=(edtValue)*0.0103327223;
    			gallonUKperday=(edtValue)*743.36755592;
    			gallonUKperhour=(edtValue)*30.973648164;
    			gallonUKperminute=(edtValue)*0.5162274694;
    			gallonUKpersecond=(edtValue)*0.0086037912;
    			kilobarrelUSperday=(edtValue)*0.021255886;
    			barrelUSperday=(edtValue)*21.255885974;
    			barrelUSperhour=(edtValue)*0.8856619156;
    			barrelUSperminute=(edtValue)*0.0147610319;
    			barrelUSpersecond=(edtValue)*0.0002460172;
    			acrefootperyear=(edtValue)*1;
    			acrefootperday=(edtValue)*0.002739726;
    			acrefootperhour=(edtValue)*0.0001141553;
    			hundredcubicfootperday=(edtValue)*1.1934294312;
    			
    			hundredcubicfootperhour=(edtValue)*0.0497262263;
    			hundredcubicfootperminute=(edtValue)*0.0008287704 ;
    			ounceperhour=(edtValue)*4761.3184582;
    			ounceperminute=(edtValue)*79.355307637;
    			ouncepersecond=(edtValue)*1.3225884606;
    			ounceUKperhour=(edtValue)*4955.7833989;
    			ounceUKperminute=(edtValue)*82.596389981;
    			ounceUKpersecond=(edtValue)*1.3766064997;
    			cubicyardperhour=(edtValue)*0.1841712085;
    			cubicyardperminute=(edtValue)*0.0030695201;
    			cubicyardpersecond=(edtValue)*0.0000511587;
    			cubicfootperhour=(edtValue)*4.9726226302;
    			cubicfootperminute=(edtValue)*0.0828770438;
    			cubicfootpersecond=(edtValue)*0.0013812841;
    			
    			cubicinchperhour=(edtValue)*8592.6919046;
    			cubicinchperminute=(edtValue)*143.21153175;
    			cubicinchpersecond=(edtValue)*2.3868588625;
    			poundpersecond=(edtValue)*0.0637528969;
    			poundperminute=(edtValue)*3.8251738135;
    			poundperhour=(edtValue)*229.51042873;
    			poundperday=(edtValue)*5508.2502915;
    			kilogrampersecond=(edtValue)*0.0289178276;
    			kilogramperminute=(edtValue)*1.7350696557;
    			kilogramperhour=(edtValue)*104.10417933;
    			kilogramperday=(edtValue)*2498.5003041;
    			
    			break;
  			
    			
          case "Acre-foot/day -ac*ft/d":
    			
    			cubicmeterpersecond=(edtValue)*0.0142764673;
    			cubicmeterperday=(edtValue)*1233.4867715 ;
    			cubicmeterperhour=(edtValue)*51.395282146;
    			cubicmeterperminute=(edtValue)*0.8565880358;
    			cubiccentimeterperday=(edtValue)*1233486771.5;
    			cubiccentimeterperhour=(edtValue)*51395282.146;
    			cubiccentimeterperminute=(edtValue)*856588.03576;
    			cubiccentimeterpersecond=(edtValue)*14276.467263;
    			literperday=(edtValue)*1233486.7715;
    			literperhour=(edtValue)*51395.282146;
    			literperminute=(edtValue)*856.58803576;
    			literpersecond=(edtValue)*14.276467263;
    			milliliterperday=(edtValue)*1233486771.5;
    			milliliterperhour=(edtValue)*51395282.146;
    			milliliterperminute=(edtValue)*856588.03576;
    			milliliterpersecond=(edtValue)*14276.467263;
    			gallonUSperday=(edtValue)*14276.467263;
    			gallonUSperhour=(edtValue)*13577.197166;
    			gallonUSperminute=(edtValue)*226.28661943;
    			gallonUSpersecond=(edtValue)*3.7714436572;
    			gallonUKperday=(edtValue)*271329.15791;
    			gallonUKperhour=(edtValue)*11305.38158;
    			gallonUKperminute=(edtValue)*188.42302633;
    			gallonUKpersecond=(edtValue)*3.1403837721;
    			kilobarrelUSperday=(edtValue)*7.7583983805;
    			barrelUSperday=(edtValue)*7758.3983805;
    			barrelUSperhour=(edtValue)*323.26659919;
    			barrelUSperminute=(edtValue)*5.3877766531;
    			barrelUSpersecond=(edtValue)*0.0897962776;
    			acrefootperyear=(edtValue)*365;
    			acrefootperday=(edtValue)*1;
    			acrefootperhour=(edtValue)*0.0416666667;
    			hundredcubicfootperday=(edtValue)*435.60174241;
    			
    			hundredcubicfootperhour=(edtValue)*18.1500726;
    			hundredcubicfootperminute=(edtValue)*0.30250121 ;
    			ounceperhour=(edtValue)*1737881.2372;
    			ounceperminute=(edtValue)*28964.687287;
    			ouncepersecond=(edtValue)*482.74478812;
    			ounceUKperhour=(edtValue)*1808860.9406;
    			ounceUKperminute=(edtValue)*30147.682343;
    			ounceUKpersecond=(edtValue)*502.46137239;
    			cubicyardperhour=(edtValue)*67.222491109;
    			cubicyardperminute=(edtValue)*1.1203748518;
    			cubicyardpersecond=(edtValue)*0.0186729142;
    			cubicfootperhour=(edtValue)*1815.00726;
    			cubicfootperminute=(edtValue)*30.250120999;
    			cubicfootpersecond=(edtValue)*0.5041686833;
    			
    			cubicinchperhour=(edtValue)*3136332.5452;
    			cubicinchperminute=(edtValue)*52272.209089;
    			cubicinchpersecond=(edtValue)*871.20348481;
    			poundpersecond=(edtValue)*23.269807367;
    			poundperminute=(edtValue)*1396.1884419;
    			poundperhour=(edtValue)*83771.306486;
    			poundperday=(edtValue)*2010511.3564;
    			kilogrampersecond=(edtValue)*10.555007071;
    			kilogramperminute=(edtValue)*633.30042434;
    			kilogramperhour=(edtValue)*37998.025456;
    			kilogramperday=(edtValue)*911952.61101;
    			
    			break;
  			
    			
  			
  			
          case "Acre-foot/hour -ac*ft/h":
  			
  			cubicmeterpersecond=(edtValue)*0.3426352143;
  			cubicmeterperday=(edtValue)*29603.682516 ;
  			cubicmeterperhour=(edtValue)*1233.4867715;
  			cubicmeterperminute=(edtValue)*20.558112858;
  			cubiccentimeterperday=(edtValue)*29603682516.0;
  			cubiccentimeterperhour=(edtValue)*1233486771.5;
  			cubiccentimeterperminute=(edtValue)*20558112.858;
  			cubiccentimeterpersecond=(edtValue)*342635.2143;
  			literperday=(edtValue)*29603682.516;
  			literperhour=(edtValue)*1233486.7715;
  			literperminute=(edtValue)*20558.112858;
  			literpersecond=(edtValue)*342.6352143;
  			milliliterperday=(edtValue)*29603682516.0;
  			milliliterperhour=(edtValue)*1233486771.5;
  			milliliterperminute=(edtValue)*20558112.858;
  			milliliterpersecond=(edtValue)*342635.2143;
  			gallonUSperday=(edtValue)*7820465.5676;
  			gallonUSperhour=(edtValue)*325852.73198;
  			gallonUSperminute=(edtValue)*5430.8788664;
  			gallonUSpersecond=(edtValue)*90.514647773;
  			gallonUKperday=(edtValue)*6511899.7899;
  			gallonUKperhour=(edtValue)*271329.15791;
  			gallonUKperminute=(edtValue)*4522.1526319;
  			gallonUKpersecond=(edtValue)*75.369210531;
  			kilobarrelUSperday=(edtValue)*186.20156113;
  			barrelUSperday=(edtValue)*186201.56113;
  			barrelUSperhour=(edtValue)*7758.3983805;
  			barrelUSperminute=(edtValue)*129.30663968;
  			barrelUSpersecond=(edtValue)*2.1551106613;
  			acrefootperyear=(edtValue)*8760;
  			acrefootperday=(edtValue)*24;
  			acrefootperhour=(edtValue)*1;
  			hundredcubicfootperday=(edtValue)*10454.441818;
  			
  			hundredcubicfootperhour=(edtValue)*435.60174241;
  			hundredcubicfootperminute=(edtValue)*7.2600290401 ;
  			ounceperhour=(edtValue)*41709149.694;
  			ounceperminute=(edtValue)*695152.4949;
  			ouncepersecond=(edtValue)*11585.874915;
  			ounceUKperhour=(edtValue)*43412662.574;
  			ounceUKperminute=(edtValue)*723544.37624;
  			ounceUKpersecond=(edtValue)*12059.072937;
  			cubicyardperhour=(edtValue)*1613.3397866;
  			cubicyardperminute=(edtValue)*26.888996444;
  			cubicyardpersecond=(edtValue)*0.4481499407;
  			cubicfootperhour=(edtValue)*43560.174241;
  			cubicfootperminute=(edtValue)*726.00290398;
  			cubicfootpersecond=(edtValue)*12.1000484;
  			
  			cubicinchperhour=(edtValue)*75271981.084;
  			cubicinchperminute=(edtValue)*1254533.0181;
  			cubicinchpersecond=(edtValue)*20908.883636;
  			poundpersecond=(edtValue)*558.47537681;
  			poundperminute=(edtValue)*33508.522606;
  			poundperhour=(edtValue)*2010511.3557;
  			poundperday=(edtValue)*48252272.553;
  			kilogrampersecond=(edtValue)*253.32016969;
  			kilogramperminute=(edtValue)*15199.210184;
  			kilogramperhour=(edtValue)*911952.61096;
  			kilogramperday=(edtValue)*21886862.664;
  			
  			break;
  			
  			
          case "Hundred-cubic foot/day -ft^3/d":
  			
  			cubicmeterpersecond=(edtValue)*0.0000327741;
  			cubicmeterperday=(edtValue)*2.8316846592 ;
  			cubicmeterperhour=(edtValue)*0.1179868608;
  			cubicmeterperminute=(edtValue)*0.0019664477;
  			cubiccentimeterperday=(edtValue)*2831684.6592;
  			cubiccentimeterperhour=(edtValue)*117986.8608;
  			cubiccentimeterperminute=(edtValue)*1966.44768;
  			cubiccentimeterpersecond=(edtValue)*32.774128;
  			literperday=(edtValue)*2831.6846592;
  			literperhour=(edtValue)*117.9868608;
  			literperminute=(edtValue)*1.96644768;
  			literpersecond=(edtValue)*0.032774128;
  			milliliterperday=(edtValue)*2831684.6592;
  			milliliterperhour=(edtValue)*117986.8608;
  			milliliterperminute=(edtValue)*1966.44768;
  			milliliterpersecond=(edtValue)*32.774128;
  			gallonUSperday=(edtValue)*748.05194806;
  			gallonUSperhour=(edtValue)*31.168831169;
  			gallonUSperminute=(edtValue)*0.5194805195;
  			gallonUSpersecond=(edtValue)*0.0086580087;
  			gallonUKperday=(edtValue)*622.88354591;
  			gallonUKperhour=(edtValue)*25.953481079;
  			gallonUKperminute=(edtValue)*0.432558018;
  			gallonUKpersecond=(edtValue)*0.0072093003;
  			kilobarrelUSperday=(edtValue)*0.0178107607;
  			barrelUSperday=(edtValue)*17.810760668;
  			barrelUSperhour=(edtValue)*0.7421150278;
  			barrelUSperminute=(edtValue)*0.0123685838;
  			barrelUSpersecond=(edtValue)*0.0002061431;
  			acrefootperyear=(edtValue)*0.8379213499;
  			acrefootperday=(edtValue)*0.0022956749;
  			acrefootperhour=(edtValue)*0.0000956531;
  			hundredcubicfootperday=(edtValue)*1;
  			
  			hundredcubicfootperhour=(edtValue)*0.0416666667;
  			hundredcubicfootperminute=(edtValue)*0.0006944444 ;
  			ounceperhour=(edtValue)*3989.6103896;
  			ounceperminute=(edtValue)*66.493506494;
  			ouncepersecond=(edtValue)*1.1082251082;
  			ounceUKperhour=(edtValue)*4152.5567152;
  			ounceUKperminute=(edtValue)*69.209278587;
  			ounceUKpersecond=(edtValue)*1.1534879765;
  			cubicyardperhour=(edtValue)*0.1543209876;
  			cubicyardperminute=(edtValue)*0.0025720165;
  			cubicyardpersecond=(edtValue)*0.0000428669;
  			cubicfootperhour=(edtValue)*4.1666666667;
  			cubicfootperminute=(edtValue)*0.0694444444;
  			cubicfootpersecond=(edtValue)*0.0011574074;
  			
  			cubicinchperhour=(edtValue)*7199.9999997;
  			cubicinchperminute=(edtValue)*120;
  			cubicinchpersecond=(edtValue)*2;
  			poundpersecond=(edtValue)*0.0534199134;
  			poundperminute=(edtValue)*3.2051948052;
  			poundperhour=(edtValue)*192.31168825;
  			poundperday=(edtValue)*4615.4805196;
  			kilogrampersecond=(edtValue)*0.0242308651;
  			kilogramperminute=(edtValue)*1.453851908;
  			kilogramperhour=(edtValue)*87.231114473;
  			kilogramperday=(edtValue)*2093.5467475;
  			
  			break;
  			
  			
  			
          case "Hundred-cubic foot/hour -ft^3/h":
  			
  			cubicmeterpersecond=(edtValue)*0.0007865791;
  			cubicmeterperday=(edtValue)*67.960431821 ;
  			cubicmeterperhour=(edtValue)*2.8316846592;
  			cubicmeterperminute=(edtValue)*0.0471947443;
  			cubiccentimeterperday=(edtValue)*67960431.821;
  			cubiccentimeterperhour=(edtValue)*2831684.6592;
  			cubiccentimeterperminute=(edtValue)*47194.74432;
  			cubiccentimeterpersecond=(edtValue)*786.579072;
  			literperday=(edtValue)*67960.431821;
  			literperhour=(edtValue)*2831.6846592;
  			literperminute=(edtValue)*47.19474432;
  			literpersecond=(edtValue)*0.786579072;
  			milliliterperday=(edtValue)*67960431.821;
  			milliliterperhour=(edtValue)*2831684.6592;
  			milliliterperminute=(edtValue)*47194.74432;
  			milliliterpersecond=(edtValue)*786.579072;
  			gallonUSperday=(edtValue)*17953.246753;
  			gallonUSperhour=(edtValue)*748.05194806;
  			gallonUSperminute=(edtValue)*12.467532468;
  			gallonUSpersecond=(edtValue)*0.2077922078;
  			gallonUKperday=(edtValue)*14949.205102;
  			gallonUKperhour=(edtValue)*622.88354591;
  			gallonUKperminute=(edtValue)*10.381392432;
  			gallonUKpersecond=(edtValue)*0.1730232072;
  			kilobarrelUSperday=(edtValue)*0.427458256;
  			barrelUSperday=(edtValue)*427.45825603;
  			barrelUSperhour=(edtValue)*17.810760668;
  			barrelUSperminute=(edtValue)*0.2968460111;
  			barrelUSpersecond=(edtValue)*0.0049474335;
  			acrefootperyear=(edtValue)*20.110112397;
  			acrefootperday=(edtValue)*0.0550961983;
  			acrefootperhour=(edtValue)*0.0022956749;
  			hundredcubicfootperday=(edtValue)*24;
  			
  			hundredcubicfootperhour=(edtValue)*1;
  			hundredcubicfootperminute=(edtValue)*0.0166666667 ;
  			ounceperhour=(edtValue)*95750.649351;
  			ounceperminute=(edtValue)*1595.8441559;
  			ouncepersecond=(edtValue)*26.597402598;
  			ounceUKperhour=(edtValue)*99661.361166;
  			ounceUKperminute=(edtValue)*1661.0226861;
  			ounceUKpersecond=(edtValue)*27.683711435;
  			cubicyardperhour=(edtValue)*3.7037037035;
  			cubicyardperminute=(edtValue)*0.0617283951;
  			cubicyardpersecond=(edtValue)*0.0010288066;
  			cubicfootperhour=(edtValue)*100;
  			cubicfootperminute=(edtValue)*1.6666666666;
  			cubicfootpersecond=(edtValue)*0.0277777778;
  			
  			cubicinchperhour=(edtValue)*172799.99999;
  			cubicinchperminute=(edtValue)*2880;
  			cubicinchpersecond=(edtValue)*48;
  			poundpersecond=(edtValue)*1.2820779222;
  			poundperminute=(edtValue)*76.924675326;
  			poundperhour=(edtValue)*4615.480518;
  			poundperday=(edtValue)*110771.53247;
  			kilogrampersecond=(edtValue)*0.5815407631;
  			kilogramperminute=(edtValue)*34.892445793;
  			kilogramperhour=(edtValue)*2093.5467474;
  			kilogramperday=(edtValue)*50245.12194;
  			
  			break;
  			
  			
  			
          case "Hundred-cubic foot/minute -ft^3/min":
  			
  			cubicmeterpersecond=(edtValue)*0.0471947443;
  			cubicmeterperday=(edtValue)*4077.6259093 ;
  			cubicmeterperhour=(edtValue)*169.90107955;
  			cubicmeterperminute=(edtValue)*2.8316846592;
  			cubiccentimeterperday=(edtValue)*4077625909.3;
  			cubiccentimeterperhour=(edtValue)*169901079.55;
  			cubiccentimeterperminute=(edtValue)*2831684.6592;
  			cubiccentimeterpersecond=(edtValue)*47194.74432;
  			literperday=(edtValue)*4077625.9093;
  			literperhour=(edtValue)*169901.07955;
  			literperminute=(edtValue)*2831.6846592;
  			literpersecond=(edtValue)*47.19474432;
  			milliliterperday=(edtValue)*4077625909.3;
  			milliliterperhour=(edtValue)*169901079.55;
  			milliliterperminute=(edtValue)*2831684.6592;
  			milliliterpersecond=(edtValue)*47194.74432;
  			gallonUSperday=(edtValue)*1077194.8052;
  			gallonUSperhour=(edtValue)*44883.116883;
  			gallonUSperminute=(edtValue)*748.05194806;
  			gallonUSpersecond=(edtValue)*12.467532468;
  			gallonUKperday=(edtValue)*896952.30611;
  			gallonUKperhour=(edtValue)*37373.012754;
  			gallonUKperminute=(edtValue)*622.88354591;
  			gallonUKpersecond=(edtValue)*10.381392432;
  			kilobarrelUSperday=(edtValue)*25.647495362;
  			barrelUSperday=(edtValue)*25647.495362;
  			barrelUSperhour=(edtValue)*1068.6456401;
  			barrelUSperminute=(edtValue)*17.810760668;
  			barrelUSpersecond=(edtValue)*0.2968460111;
  			acrefootperyear=(edtValue)*1206.6067438;
  			acrefootperday=(edtValue)*3.3057719008;
  			acrefootperhour=(edtValue)*0.1377404959;
  			hundredcubicfootperday=(edtValue)*1440;
  			
  			hundredcubicfootperhour=(edtValue)*60;
  			hundredcubicfootperminute=(edtValue)* 1;
  			ounceperhour=(edtValue)*5745038.9611;
  			ounceperminute=(edtValue)*95750.649351;
  			ouncepersecond=(edtValue)*1595.8441559;
  			ounceUKperhour=(edtValue)*5979681.6699;
  			ounceUKperminute=(edtValue)*99661.361166;
  			ounceUKpersecond=(edtValue)*1661.0226861;
  			cubicyardperhour=(edtValue)*222.22222221;
  			cubicyardperminute=(edtValue)*3.7037037035;
  			cubicyardpersecond=(edtValue)*0.0617283951;
  			cubicfootperhour=(edtValue)*6000;
  			cubicfootperminute=(edtValue)*99.999999996;
  			cubicfootpersecond=(edtValue)*1.6666666666;
  			
  			cubicinchperhour=(edtValue)*10368000;
  			cubicinchperminute=(edtValue)*172800;
  			cubicinchpersecond=(edtValue)*2880;
  			poundpersecond=(edtValue)*76.924675332;
  			poundperminute=(edtValue)*4615.4805195;
  			poundperhour=(edtValue)*276928.83108;
  			poundperday=(edtValue)*6646291.9482;
  			kilogrampersecond=(edtValue)*34.892445787;
  			kilogramperminute=(edtValue)*2093.5467476;
  			kilogramperhour=(edtValue)*125612.80484;
  			kilogramperday=(edtValue)*3014707.3164;
  			
  			break;
  			
  			
  			
          case "Ounce/hour -oz/h":
  			
  			cubicmeterpersecond=(edtValue)*8.214869322E-9;
  			cubicmeterperday=(edtValue)* 0.0007097647;
  			cubicmeterperhour=(edtValue)*0.0000295735;
  			cubicmeterperminute=(edtValue)*4.928921593E-7;
  			cubiccentimeterperday=(edtValue)*709.7647095;
  			cubiccentimeterperhour=(edtValue)*29.573529563;
  			cubiccentimeterperminute=(edtValue)*0.4928921594;
  			cubiccentimeterpersecond=(edtValue)*0.0082148693;
  			literperday=(edtValue)*0.7097647095;
  			literperhour=(edtValue)*0.0295735296;
  			literperminute=(edtValue)*0.0004928922;
  			literpersecond=(edtValue)*0.0000082149;
  			milliliterperday=(edtValue)*709.7647095;
  			milliliterperhour=(edtValue)*29.573529563;
  			milliliterperminute=(edtValue)*0.4928921594;
  			milliliterpersecond=(edtValue)*0.0082148693;
  			gallonUSperday=(edtValue)*0.1875;
  			gallonUSperhour=(edtValue)*0.0078125;
  			gallonUSperminute=(edtValue)*0.0001302083;
  			gallonUSpersecond=(edtValue)*0.0000021701;
  			gallonUKperday=(edtValue)*0.1561264096;
  			gallonUKperhour=(edtValue)*0.0065052671;
  			gallonUKperminute=(edtValue)*0.0065052671;
  			gallonUKpersecond=(edtValue)*0.000001807;
  			kilobarrelUSperday=(edtValue)*0.0000044643;
  			barrelUSperday=(edtValue)*0.0044642857;
  			barrelUSperhour=(edtValue)*0.0001860119;
  			barrelUSperminute=(edtValue)*0.0000031002;
  			barrelUSpersecond=(edtValue)*5.166997354E-8;
  			acrefootperyear=(edtValue)*0.0002100259;
  			acrefootperday=(edtValue)*5.754133128E-7;
  			acrefootperhour=(edtValue)*2.39755547E-8;
  			hundredcubicfootperday=(edtValue)*0.000250651;
  			
  			hundredcubicfootperhour=(edtValue)*0.0000104438;
  			hundredcubicfootperminute=(edtValue)* 1.740632233E-7;
  			ounceperhour=(edtValue)*1;
  			ounceperminute=(edtValue)*0.0166666667;
  			ouncepersecond=(edtValue)*0.0002777778;
  			ounceUKperhour=(edtValue)*1.0408426663;
  			ounceUKperminute=(edtValue)*0.0173473778;
  			ounceUKpersecond=(edtValue)*0.000289123;
  			cubicyardperhour=(edtValue)*0.0000386807;
  			cubicyardperminute=(edtValue)*6.44678605E-7;
  			cubicyardpersecond=(edtValue)*1.074464341E-8;
  			cubicfootperhour=(edtValue)*0.0010443793;
  			cubicfootperminute=(edtValue)*0.0000174063;
  			cubicfootpersecond=(edtValue)*2.901053722E-7;
  			
  			cubicinchperhour=(edtValue)*1.8046874999;
  			cubicinchperminute=(edtValue)*0.030078125;
  			cubicinchpersecond=(edtValue)*0.0005013021;
  			poundpersecond=(edtValue)*0.0000133898;
  			poundperminute=(edtValue)*0.0008033854;
  			poundperhour=(edtValue)*0.048203125;
  			poundperday=(edtValue)*1.156875;
  			kilogrampersecond=(edtValue)*0.0000060735;
  			kilogramperminute=(edtValue)*0.0003644095;
  			kilogramperhour=(edtValue)*0.0218645697;
  			kilogramperday=(edtValue)*0.524749673;
  			
  			break;
  			
  			
  			
          case "Ounce/minute -oz/min":
  			
  			cubicmeterpersecond=(edtValue)*4.928921593E-7;
  			cubicmeterperday=(edtValue)* 0.0425858826;
  			cubicmeterperhour=(edtValue)*0.0017744118;
  			cubicmeterperminute=(edtValue)*0.0000295735;
  			cubiccentimeterperday=(edtValue)*42585.88257;
  			cubiccentimeterperhour=(edtValue)*1774.4117737;
  			cubiccentimeterperminute=(edtValue)*29.573529562;
  			cubiccentimeterpersecond=(edtValue)*0.4928921594;
  			literperday=(edtValue)*42.58588257;
  			literperhour=(edtValue)*1.7744117737;
  			literperminute=(edtValue)*0.0295735296;
  			literpersecond=(edtValue)*0.0004928922;
  			milliliterperday=(edtValue)*42585.88257;
  			milliliterperhour=(edtValue)*1774.4117737;
  			milliliterperminute=(edtValue)*29.573529562;
  			milliliterpersecond=(edtValue)*0.4928921594;
  			gallonUSperday=(edtValue)*11.25;
  			gallonUSperhour=(edtValue)*0.46875;
  			gallonUSperminute=(edtValue)*0.0078125;
  			gallonUSpersecond=(edtValue)*0.0001302083;
  			gallonUKperday=(edtValue)*9.3675845771;
  			gallonUKperhour=(edtValue)*0.390316024;
  			gallonUKperminute=(edtValue)*0.0065052671;
  			gallonUKpersecond=(edtValue)*0.0001084211;
  			kilobarrelUSperday=(edtValue)*0.0002678571;
  			barrelUSperday=(edtValue)*0.2678571429;
  			barrelUSperhour=(edtValue)*0.0111607143;
  			barrelUSperminute=(edtValue)*0.0001860119;
  			barrelUSpersecond=(edtValue)*0.0000031002;
  			acrefootperyear=(edtValue)*0.0126015516;
  			acrefootperday=(edtValue)*0.0000345248;
  			acrefootperhour=(edtValue)*0.0000014385;
  			hundredcubicfootperday=(edtValue)*0.0150390625;
  			
  			hundredcubicfootperhour=(edtValue)*0.0006266276;
  			hundredcubicfootperminute=(edtValue)*0.0000104438 ;
  			ounceperhour=(edtValue)*60;
  			ounceperminute=(edtValue)*1;
  			ouncepersecond=(edtValue)*0.0166666667;
  			ounceUKperhour=(edtValue)*62.450559975;
  			ounceUKperminute=(edtValue)*1.0408426662;
  			ounceUKpersecond=(edtValue)*0.0173473778;
  			cubicyardperhour=(edtValue)*0.002320843;
  			cubicyardperminute=(edtValue)*0.0000386807;
  			cubicyardpersecond=(edtValue)*6.44678605E-7;
  			cubicfootperhour=(edtValue)*0.0626627604;
  			cubicfootperminute=(edtValue)*0.0010443793;
  			cubicfootpersecond=(edtValue)*0.0000174063;
  			
  			cubicinchperhour=(edtValue)*108.28124999;
  			cubicinchperminute=(edtValue)*1.8046875;
  			cubicinchpersecond=(edtValue)*0.030078125;
  			poundpersecond=(edtValue)*0.0008033854;
  			poundperminute=(edtValue)*0.048203125;
  			poundperhour=(edtValue)*2.892187499;
  			poundperday=(edtValue)*69.412500002;
  			kilogrampersecond=(edtValue)*0.0003644095;
  			kilogramperminute=(edtValue)*0.0218645697;
  			kilogramperhour=(edtValue)*1.3118741825;
  			kilogramperday=(edtValue)*31.484980382;
  			
  			break;
  			
  			
  			
          case "Ounce/second -oz/s":
  			
  			cubicmeterpersecond=(edtValue)*0.0000295735;
  			cubicmeterperday=(edtValue)* 2.5551529542;
  			cubicmeterperhour=(edtValue)*0.1064647064;
  			cubicmeterperminute=(edtValue)*0.0017744118;
  			cubiccentimeterperday=(edtValue)*2555152.9542;
  			cubiccentimeterperhour=(edtValue)*106464.70642;
  			cubiccentimeterperminute=(edtValue)*1774.4117737;
  			cubiccentimeterpersecond=(edtValue)*29.573529562;
  			literperday=(edtValue)*2555.1529542;
  			literperhour=(edtValue)*106.46470642;
  			literperminute=(edtValue)*1.7744117737;
  			literpersecond=(edtValue)*0.0295735296;
  			milliliterperday=(edtValue)*2555152.9542;
  			milliliterperhour=(edtValue)*106464.70642;
  			milliliterperminute=(edtValue)*1774.4117737;
  			milliliterpersecond=(edtValue)*29.573529562;
  			gallonUSperday=(edtValue)*675;
  			gallonUSperhour=(edtValue)*28.125;
  			gallonUSperminute=(edtValue)*0.46875;
  			gallonUSpersecond=(edtValue)*0.0078125;
  			gallonUKperday=(edtValue)*568.05507462;
  			gallonUKperhour=(edtValue)*23.418961443;
  			gallonUKperminute=(edtValue)*0.390316024;
  			gallonUKpersecond=(edtValue)*0.0065052671;
  			kilobarrelUSperday=(edtValue)*0.0160714286;
  			barrelUSperday=(edtValue)*16.071428571;
  			barrelUSperhour=(edtValue)*0.6696428571;
  			barrelUSperminute=(edtValue)*0.0111607143;
  			barrelUSpersecond=(edtValue)*0.0001860119;
  			acrefootperyear=(edtValue)*0.756093093;
  			acrefootperday=(edtValue)*0.0020714879;
  			acrefootperhour=(edtValue)*0.000086312;
  			hundredcubicfootperday=(edtValue)*0.90234375;
  			
  			hundredcubicfootperhour=(edtValue)*0.0375976562;
  			hundredcubicfootperminute=(edtValue)*0.0006266276 ;
  			ounceperhour=(edtValue)*3600;
  			ounceperminute=(edtValue)*60;
  			ouncepersecond=(edtValue)*1;
  			ounceUKperhour=(edtValue)*3747.0335985;
  			ounceUKperminute=(edtValue)*62.450559975;
  			ounceUKpersecond=(edtValue)*1.0408426662;
  			cubicyardperhour=(edtValue)*0.1392505787;
  			cubicyardperminute=(edtValue)*0.002320843;
  			cubicyardpersecond=(edtValue)*0.0000386807;
  			cubicfootperhour=(edtValue)*3.759765625;
  			cubicfootperminute=(edtValue)*0.0626627604;
  			cubicfootpersecond=(edtValue)*0.0010443793;
  			
  			cubicinchperhour=(edtValue)*6496.8749997;
  			cubicinchperminute=(edtValue)*108.28125;
  			cubicinchpersecond=(edtValue)*1.8046875;
  			poundpersecond=(edtValue)*0.048203125;
  			poundperminute=(edtValue)*2.8921875;
  			poundperhour=(edtValue)*173.53124994;
  			poundperday=(edtValue)*4164.7500001;
  			kilogrampersecond=(edtValue)*0.0218645697;
  			kilogramperminute=(edtValue)*1.3118741826;
  			kilogramperhour=(edtValue)*78.71245095;
  			kilogramperday=(edtValue)*1889.0988229;
  			
  			break;
  			
  			
  			
          case "Ounce (UK)/hour -oz(UK)/h":
  			
  			cubicmeterpersecond=(edtValue)*7.89251785E-9;
  			cubicmeterperday=(edtValue)*0.0006819135 ;
  			cubicmeterperhour=(edtValue)*0.0000284131;
  			cubicmeterperminute=(edtValue)*4.73551071E-7;
  			cubiccentimeterperday=(edtValue)*681.91354228;
  			cubiccentimeterperhour=(edtValue)*28.413064262;
  			cubiccentimeterperminute=(edtValue)*0.473551071;
  			cubiccentimeterpersecond=(edtValue)*0.0078925179;
  			literperday=(edtValue)*0.6819135423;
  			literperhour=(edtValue)*0.0284130643;
  			literperminute=(edtValue)*0.0004735511;
  			literpersecond=(edtValue)*0.0000078925;
  			milliliterperday=(edtValue)*681.91354228;
  			milliliterperhour=(edtValue)*28.413064262;
  			milliliterperminute=(edtValue)*0.473551071;
  			milliliterpersecond=(edtValue)*0.0078925179;
  			gallonUSperday=(edtValue)*0.1801425;
  			gallonUSperhour=(edtValue)*0.0075059375;
  			gallonUSperminute=(edtValue)*0.000125099;
  			gallonUSpersecond=(edtValue)*0.000002085;
  			gallonUKperday=(edtValue)*0.1500000093;
  			gallonUKperhour=(edtValue)*0.0062500004;
  			gallonUKperminute=(edtValue)*0.0001041667;
  			gallonUKpersecond=(edtValue)*0.0000017361;
  			kilobarrelUSperday=(edtValue)*0.0000042891;
  			barrelUSperday=(edtValue)*0.0042891071;
  			barrelUSperhour=(edtValue)*0.0001787128;
  			barrelUSperminute=(edtValue)*0.0000029785;
  			barrelUSpersecond=(edtValue)*4.964244378E-8;
  			acrefootperyear=(edtValue)*0.0002017844;
  			acrefootperday=(edtValue)*5.528340944E-7;
  			acrefootperhour=(edtValue)*2.303475393E-8;
  			hundredcubicfootperday=(edtValue)*0.0002408155;
  			
  			hundredcubicfootperhour=(edtValue)*0.000010034;
  			hundredcubicfootperminute=(edtValue)*1.672329824E-7 ;
  			ounceperhour=(edtValue)*0.96076;
  			ounceperminute=(edtValue)*0.0160126667;
  			ouncepersecond=(edtValue)*0.0002668778;
  			ounceUKperhour=(edtValue)*1;
  			ounceUKperminute=(edtValue)*0.0166666667;
  			ounceUKpersecond=(edtValue)*0.0002777778;
  			cubicyardperhour=(edtValue)*0.0000371629;
  			cubicyardperminute=(edtValue)*6.193814165E-7;
  			cubicyardpersecond=(edtValue)*1.03230236E-8;
  			cubicfootperhour=(edtValue)*0.0010033979;
  			cubicfootperminute=(edtValue)*0.0000167233;
  			cubicfootpersecond=(edtValue)*2.787216374E-7;
  			
  			cubicinchperhour=(edtValue)*1.7338715624;
  			cubicinchperminute=(edtValue)*0.0288978594;
  			cubicinchpersecond=(edtValue)*0.000481631;
  			poundpersecond=(edtValue)*0.0000128643;
  			poundperminute=(edtValue)*0.0007718606;
  			poundperhour=(edtValue)*0.0463116344;
  			poundperday=(edtValue)*1.111479225;
  			kilogrampersecond=(edtValue)*0.0000058352;
  			kilogramperminute=(edtValue)*0.0003501101;
  			kilogramperhour=(edtValue)*0.021006604;
  			kilogramperday=(edtValue)*0.5041584958;
  			
  			break;
  			
  			
  			
          case "Ounce (UK)/minute -oz(UK)/min":
  			
  			cubicmeterpersecond=(edtValue)*4.73551071E-7;
  			cubicmeterperday=(edtValue)* 0.0409148125;
  			cubicmeterperhour=(edtValue)*0.0017047839;
  			cubicmeterperminute=(edtValue)*0.0000284131;
  			cubiccentimeterperday=(edtValue)*40914.812537;
  			cubiccentimeterperhour=(edtValue)*1704.7838557;
  			cubiccentimeterperminute=(edtValue)*28.413064262;
  			cubiccentimeterpersecond=(edtValue)*0.473551071;
  			literperday=(edtValue)*40.914812537;
  			literperhour=(edtValue)*1.7047838557;
  			literperminute=(edtValue)*0.0284130643;
  			literpersecond=(edtValue)*0.0004735511;
  			milliliterperday=(edtValue)*40914.812537;
  			milliliterperhour=(edtValue)*1704.7838557;
  			milliliterperminute=(edtValue)*28.413064262;
  			milliliterpersecond=(edtValue)*0.473551071;
  			gallonUSperday=(edtValue)*10.80855;
  			gallonUSperhour=(edtValue)*0.45035625;
  			gallonUSperminute=(edtValue)*0.0075059375;
  			gallonUSpersecond=(edtValue)*0.000125099;
  			gallonUKperday=(edtValue)*9.000000558;
  			gallonUKperhour=(edtValue)*0.3750000233;
  			gallonUKperminute=(edtValue)*0.0062500004;
  			gallonUKpersecond=(edtValue)*0.0001041667;
  			kilobarrelUSperday=(edtValue)*0.0002573464;
  			barrelUSperday=(edtValue)*0.2573464286;
  			barrelUSperhour=(edtValue)*0.0107227679;
  			barrelUSperminute=(edtValue)*0.0001787128;
  			barrelUSpersecond=(edtValue)*0.0000029785;
  			acrefootperyear=(edtValue)*0.0121070667;
  			acrefootperday=(edtValue)*0.00003317;
  			acrefootperhour=(edtValue)*0.0000013821;
  			hundredcubicfootperday=(edtValue)*0.0144489297;
  			
  			hundredcubicfootperhour=(edtValue)*0.0006020387;
  			hundredcubicfootperminute=(edtValue)*0.000010034 ;
  			ounceperhour=(edtValue)*57.645599998;
  			ounceperminute=(edtValue)*0.96076;
  			ouncepersecond=(edtValue)*0.0160126667;
  			ounceUKperhour=(edtValue)*60;
  			ounceUKperminute=(edtValue)*1;
  			ounceUKpersecond=(edtValue)*0.0166666667;
  			cubicyardperhour=(edtValue)*0.0022297731;
  			cubicyardperminute=(edtValue)*0.0000371629;
  			cubicyardpersecond=(edtValue)*6.193814165E-7;
  			cubicfootperhour=(edtValue)*0.0602038737;
  			cubicfootperminute=(edtValue)*0.0010033979;
  			cubicfootpersecond=(edtValue)*0.0000167233;
  			
  			cubicinchperhour=(edtValue)*104.03229374;
  			cubicinchperminute=(edtValue)*1.7338715625;
  			cubicinchpersecond=(edtValue)*0.0288978594;
  			poundpersecond=(edtValue)*0.0007718606;
  			poundperminute=(edtValue)*0.0463116344;
  			poundperhour=(edtValue)*2.7786980615;
  			poundperday=(edtValue)*66.6887535;
  			kilogrampersecond=(edtValue)*0.0003501101;
  			kilogramperminute=(edtValue)*0.021006604;
  			kilogramperhour=(edtValue)*1.2603962395;
  			kilogramperday=(edtValue)*30.249509751;
  			
  			break;
  			
  			
  			
          case "Ounce (UK)/second -oz(UK)/s":
  			
  			cubicmeterpersecond=(edtValue)*0.0000284131;
  			cubicmeterperday=(edtValue)*2.4548887522 ;
  			cubicmeterperhour=(edtValue)*0.1022870313;
  			cubicmeterperminute=(edtValue)*0.0017047839;
  			cubiccentimeterperday=(edtValue)*2454888.7522;
  			cubiccentimeterperhour=(edtValue)*102287.03134;
  			cubiccentimeterperminute=(edtValue)*1704.7838557;
  			cubiccentimeterpersecond=(edtValue)*28.413064262;
  			literperday=(edtValue)*2454.8887522;
  			literperhour=(edtValue)*102.28703134;
  			literperminute=(edtValue)*1.7047838557;
  			literpersecond=(edtValue)*0.0284130643;
  			milliliterperday=(edtValue)*2454888.7522;
  			milliliterperhour=(edtValue)*102287.03134;
  			milliliterperminute=(edtValue)*1704.7838557;
  			milliliterpersecond=(edtValue)*28.413064262;
  			gallonUSperday=(edtValue)*648.51299998;
  			gallonUSperhour=(edtValue)*27.021374999;
  			gallonUSperminute=(edtValue)*0.45035625;
  			gallonUSpersecond=(edtValue)*0.0075059375;
  			gallonUKperday=(edtValue)*540.00003348;
  			gallonUKperhour=(edtValue)*22.500001395;
  			gallonUKperminute=(edtValue)*0.3750000233;
  			gallonUKpersecond=(edtValue)*0.0062500004;
  			kilobarrelUSperday=(edtValue)*0.0154407857;
  			barrelUSperday=(edtValue)*15.440785714;
  			barrelUSperhour=(edtValue)*0.6433660714;
  			barrelUSperminute=(edtValue)*0.0107227679;
  			barrelUSpersecond=(edtValue)*0.0001787128;
  			acrefootperyear=(edtValue)*0.726424;
  			acrefootperday=(edtValue)*0.0019902027;
  			acrefootperhour=(edtValue)*0.0000829251;
  			hundredcubicfootperday=(edtValue)*0.8669357812;
  			
  			hundredcubicfootperhour=(edtValue)*0.0361223242;
  			hundredcubicfootperminute=(edtValue)*0.0006020387 ;
  			ounceperhour=(edtValue)*3458.7359999;
  			ounceperminute=(edtValue)*57.645599998;
  			ouncepersecond=(edtValue)*0.96076;
  			ounceUKperhour=(edtValue)*3600;
  			ounceUKperminute=(edtValue)*60;
  			ounceUKpersecond=(edtValue)*1;
  			
  			cubicyardperhour=(edtValue)*0.133786386;
  			cubicyardperminute=(edtValue)*0.0022297731;
  			cubicyardpersecond=(edtValue)*0.0000371629;
  			cubicfootperhour=(edtValue)*3.6122324218;
  			cubicfootperminute=(edtValue)*0.0602038737;
  			cubicfootpersecond=(edtValue)*0.0010033979;
  			
  			cubicinchperhour=(edtValue)*6241.9376245;
  			cubicinchperminute=(edtValue)*104.03229375;
  			cubicinchpersecond=(edtValue)*1.7338715625;
  			poundpersecond=(edtValue)*0.0463116344;
  			poundperminute=(edtValue)*2.7786980625;
  			poundperhour=(edtValue)*166.72188369;
  			poundperday=(edtValue)*4001.32521;
  			kilogrampersecond=(edtValue)*0.021006604;
  			kilogramperminute=(edtValue)*1.2603962397;
  			kilogramperhour=(edtValue)*75.623774373;
  			kilogramperday=(edtValue)*1814.9705851;
  			
  			break;
  			
  			
          case "Cubic yard/hour -yd^3/h":
  			
  			cubicmeterpersecond=(edtValue)*0.0002123763;
  			cubicmeterperday=(edtValue)*18.349316593 ;
  			cubicmeterperhour=(edtValue)*0.764554858;
  			cubicmeterperminute=(edtValue)*0.012742581;
  			cubiccentimeterperday=(edtValue)*18349316.593;
  			cubiccentimeterperhour=(edtValue)*764554.85802;
  			cubiccentimeterperminute=(edtValue)*12742.580967;
  			cubiccentimeterpersecond=(edtValue)*212.37634945;
  			literperday=(edtValue)*18349.316593;
  			literperhour=(edtValue)*764.55485802;
  			literperminute=(edtValue)*12.742580967;
  			literpersecond=(edtValue)*0.2123763495;
  			milliliterperday=(edtValue)*18349316.593;
  			milliliterperhour=(edtValue)*764554.85802;
  			milliliterperminute=(edtValue)*12742.580967;
  			milliliterpersecond=(edtValue)*212.37634945;
  			gallonUSperday=(edtValue)*4847.3766236;
  			gallonUSperhour=(edtValue)*201.97402598;
  			gallonUSperminute=(edtValue)*3.3662337664;
  			gallonUSpersecond=(edtValue)*0.0561038961;
  			gallonUKperday=(edtValue)*4036.2853777;
  			gallonUKperhour=(edtValue)*168.1785574;
  			gallonUKperminute=(edtValue)*2.8029759567;
  			gallonUKpersecond=(edtValue)*0.0467162659;
  			kilobarrelUSperday=(edtValue)*0.1154137291;
  			barrelUSperday=(edtValue)*115.41372913;
  			barrelUSperhour=(edtValue)*4.8089053806;
  			barrelUSperminute=(edtValue)*0.080148423;
  			barrelUSpersecond=(edtValue)*0.0013358071;
  			acrefootperyear=(edtValue)*5.4297303474;
  			acrefootperday=(edtValue)*0.0148759736;
  			acrefootperhour=(edtValue)*0.0006198322;
  			hundredcubicfootperday=(edtValue)*6.4800000003;
  			
  			hundredcubicfootperhour=(edtValue)*0.27;
  			hundredcubicfootperminute=(edtValue)* 0.0045;
  			ounceperhour=(edtValue)*25852.675326;
  			ounceperminute=(edtValue)*430.8779221;
  			ouncepersecond=(edtValue)*7.1812987017;
  			ounceUKperhour=(edtValue)*26908.567516;
  			ounceUKperminute=(edtValue)*448.47612527;
  			ounceUKpersecond=(edtValue)*7.4746020878;
  			
  			cubicyardperhour=(edtValue)*1;
  			cubicyardperminute=(edtValue)*0.0166666667;
  			cubicyardpersecond=(edtValue)*0.0002777778;
  			cubicfootperhour=(edtValue)*27.000000001;
  			cubicfootperminute=(edtValue)*0.45;
  			cubicfootpersecond=(edtValue)*0.0075;
  			
  			cubicinchperhour=(edtValue)*46656;
  			cubicinchperminute=(edtValue)*777.60000004;
  			cubicinchpersecond=(edtValue)*12.960000001;
  			poundpersecond=(edtValue)*0.346161039;
  			poundperminute=(edtValue)*20.769662339;
  			poundperhour=(edtValue)*1246.1797399;
  			poundperday=(edtValue)*29908.313768;
  			kilogrampersecond=(edtValue)*0.157016006;
  			kilogramperminute=(edtValue)*9.4209603645;
  			kilogramperhour=(edtValue)*565.25762181;
  			kilogramperday=(edtValue)*13566.182924;
  			
  			break;
  			
  			
          case "Cubic yard/minute -yd^3/min":
  			
  			cubicmeterpersecond=(edtValue)*0.012742581;
  			cubicmeterperday=(edtValue)*1100.9589956 ;
  			cubicmeterperhour=(edtValue)*45.873291481;
  			cubicmeterperminute=(edtValue)*0.764554858;
  			cubiccentimeterperday=(edtValue)*1100958995.6;
  			cubiccentimeterperhour=(edtValue)*45873291.481;
  			cubiccentimeterperminute=(edtValue)*764554.85802;
  			cubiccentimeterpersecond=(edtValue)*12742.580967;
  			literperday=(edtValue)*1100958.9956;
  			literperhour=(edtValue)*45873.291481;
  			literperminute=(edtValue)*764.55485802;
  			literpersecond=(edtValue)*12.742580967;
  			milliliterperday=(edtValue)*1100958995.6;
  			milliliterperhour=(edtValue)*45873291.481;
  			milliliterperminute=(edtValue)*764554.85802;
  			milliliterpersecond=(edtValue)*12742.580967;
  			gallonUSperday=(edtValue)*290842.59742;
  			gallonUSperhour=(edtValue)*12118.441559;
  			gallonUSperminute=(edtValue)*201.97402598;
  			gallonUSpersecond=(edtValue)*3.3662337664;
  			gallonUKperday=(edtValue)*242177.12266;
  			gallonUKperhour=(edtValue)*10090.713444;
  			gallonUKperminute=(edtValue)*168.1785574;
  			gallonUKpersecond=(edtValue)*2.8029759567;
  			kilobarrelUSperday=(edtValue)*6.924823748;
  			barrelUSperday=(edtValue)*6924.823748;
  			barrelUSperhour=(edtValue)*288.53432283;
  			barrelUSperminute=(edtValue)*4.8089053806;
  			barrelUSpersecond=(edtValue)*0.080148423;
  			acrefootperyear=(edtValue)*325.78382084;
  			acrefootperday=(edtValue)*0.8925584133;
  			acrefootperhour=(edtValue)*0.0371899339;
  			hundredcubicfootperday=(edtValue)*388.80000002;
  			
  			hundredcubicfootperhour=(edtValue)*16.200000001;
  			hundredcubicfootperminute=(edtValue)*0.27 ;
  			ounceperhour=(edtValue)*1551160.5196;
  			ounceperminute=(edtValue)*25852.675326;
  			ouncepersecond=(edtValue)*430.8779221;
  			ounceUKperhour=(edtValue)*1614514.051;
  			ounceUKperminute=(edtValue)*26908.567516;
  			ounceUKpersecond=(edtValue)*448.47612527;
  			
  			cubicyardperhour=(edtValue)*60;
  			cubicyardperminute=(edtValue)*1;
  			cubicyardpersecond=(edtValue)*0.0166666667;
  			cubicfootperhour=(edtValue)*1620.0000001;
  			cubicfootperminute=(edtValue)*27;
  			cubicfootpersecond=(edtValue)*0.45;
  			
  			cubicinchperhour=(edtValue)*2799360;
  			cubicinchperminute=(edtValue)*46656.000002;
  			cubicinchpersecond=(edtValue)*777.60000004;
  			poundpersecond=(edtValue)*20.76966234;
  			poundperminute=(edtValue)*1246.1797403;
  			poundperhour=(edtValue)*74770.784395;
  			poundperday=(edtValue)*1794498.8261;
  			kilogrampersecond=(edtValue)*9.4209603629;
  			kilogramperminute=(edtValue)*565.25762187;
  			kilogramperhour=(edtValue)*33915.457309;
  			kilogramperday=(edtValue)*813970.97546;
  			
  			break;
  			
  			
          case "Cubic yard/second -yd^3/s":
  			
  			cubicmeterpersecond=(edtValue)*48838258.528;
  			cubicmeterperday=(edtValue)* 66057.539733;
  			cubicmeterperhour=(edtValue)*2752.3974889;
  			cubicmeterperminute=(edtValue)*45.873291481;
  			cubiccentimeterperday=(edtValue)*66057539733.0;
  			cubiccentimeterperhour=(edtValue)*2752397488.9;
  			cubiccentimeterperminute=(edtValue)*45873291.481;
  			cubiccentimeterpersecond=(edtValue)*764554.85802;
  			literperday=(edtValue)*66057539.733;
  			literperhour=(edtValue)*2752397.4889;
  			literperminute=(edtValue)*45873.291481;
  			literpersecond=(edtValue)*764.55485802;
  			milliliterperday=(edtValue)*66057539733.0;
  			milliliterperhour=(edtValue)*2752397488.9;
  			milliliterperminute=(edtValue)*45873291.481;
  			milliliterpersecond=(edtValue)*764554.85802;
  			gallonUSperday=(edtValue)*17450555.845;
  			gallonUSperhour=(edtValue)*727106.49354;
  			gallonUSperminute=(edtValue)*12118.441559;
  			gallonUSpersecond=(edtValue)*201.97402598;
  			gallonUKperday=(edtValue)*14530627.36;
  			gallonUKperhour=(edtValue)*605442.80665;
  			gallonUKperminute=(edtValue)*10090.713444;
  			gallonUKpersecond=(edtValue)*168.1785574;
  			kilobarrelUSperday=(edtValue)*415.48942488;
  			barrelUSperday=(edtValue)*415489.42488;
  			barrelUSperhour=(edtValue)*17312.05937;
  			barrelUSperminute=(edtValue)*288.53432283;
  			barrelUSpersecond=(edtValue)*4.8089053806;
  			acrefootperyear=(edtValue)*19547.029251;
  			acrefootperday=(edtValue)*53.553504796;
  			acrefootperhour=(edtValue)*2.2313960332;
  			hundredcubicfootperday=(edtValue)*23328.000001;
  			
  			hundredcubicfootperhour=(edtValue)*972.00000004;
  			hundredcubicfootperminute=(edtValue)*16.200000001 ;
  			ounceperhour=(edtValue)*93069631.173;
  			ounceperminute=(edtValue)*1551160.5196;
  			ouncepersecond=(edtValue)*25852.675326;
  			ounceUKperhour=(edtValue)*96870843.057;
  			ounceUKperminute=(edtValue)*1614514.051;
  			ounceUKpersecond=(edtValue)*26908.567516;
  			
  			cubicyardperhour=(edtValue)*3600;
  			cubicyardperminute=(edtValue)*60;
  			cubicyardpersecond=(edtValue)*1;
  			cubicfootperhour=(edtValue)*97200.000005;
  			cubicfootperminute=(edtValue)*1620;
  			cubicfootpersecond=(edtValue)*27;
  			
  			cubicinchperhour=(edtValue)*167961600.0;
  			cubicinchperminute=(edtValue)*2799360.0001;
  			cubicinchpersecond=(edtValue)*46656.000002;
  			poundpersecond=(edtValue)*1246.1797404;
  			poundperminute=(edtValue)*74770.78442;
  			poundperhour=(edtValue)*4486247.0637;
  			poundperday=(edtValue)*107669929.57;
  			kilogrampersecond=(edtValue)*565.25762177;
  			kilogramperminute=(edtValue)*33915.457312;
  			kilogramperhour=(edtValue)*2034927.4385;
  			kilogramperday=(edtValue)*48838258.528;
  			
  			break;
  			
  			
          case "Cubic foot/hour -ft^3/h":
  			
  			cubicmeterpersecond=(edtValue)*0.0000078658;
  			cubicmeterperday=(edtValue)*0.6796043182 ;
  			cubicmeterperhour=(edtValue)*0.0283168466;
  			cubicmeterperminute=(edtValue)*0.0004719474;
  			cubiccentimeterperday=(edtValue)*679604.31821;
  			cubiccentimeterperhour=(edtValue)*28316.846592;
  			cubiccentimeterperminute=(edtValue)*471.9474432;
  			cubiccentimeterpersecond=(edtValue)*7.86579072;
  			literperday=(edtValue)*679.60431821;
  			literperhour=(edtValue)*28.316846592;
  			literperminute=(edtValue)*0.4719474432;
  			literpersecond=(edtValue)*0.0078657907;
  			milliliterperday=(edtValue)*679604.31821;
  			milliliterperhour=(edtValue)*28316.846592;
  			milliliterperminute=(edtValue)*471.9474432;
  			milliliterpersecond=(edtValue)*7.86579072;
  			gallonUSperday=(edtValue)*179.53246753;
  			gallonUSperhour=(edtValue)*7.4805194805;
  			gallonUSperminute=(edtValue)*0.1246753247;
  			gallonUSpersecond=(edtValue)*0.0020779221;
  			gallonUKperday=(edtValue)*149.49205102;
  			gallonUKperhour=(edtValue)*6.228835459;
  			gallonUKperminute=(edtValue)*0.1038139243;
  			gallonUKpersecond=(edtValue)*0.0017302321;
  			kilobarrelUSperday=(edtValue)*0.0042745826;
  			barrelUSperday=(edtValue)*4.2745825603;
  			barrelUSperhour=(edtValue)*0.1781076067;
  			barrelUSperminute=(edtValue)*0.0029684601;
  			barrelUSpersecond=(edtValue)*0.0000494743;
  			acrefootperyear=(edtValue)*0.201101124;
  			acrefootperday=(edtValue)*0.000550962;
  			acrefootperhour=(edtValue)*0.0000229567;
  			hundredcubicfootperday=(edtValue)*0.24;
  			
  			hundredcubicfootperhour=(edtValue)*0.01;
  			hundredcubicfootperminute=(edtValue)*0.0001666667 ;
  			ounceperhour=(edtValue)*957.50649351;
  			ounceperminute=(edtValue)*15.958441558;
  			ouncepersecond=(edtValue)*0.265974026;
  			ounceUKperhour=(edtValue)*996.61361165;
  			ounceUKperminute=(edtValue)*16.610226861;
  			ounceUKpersecond=(edtValue)*0.2768371143;
  			
  			cubicyardperhour=(edtValue)*0.037037037;
  			cubicyardperminute=(edtValue)*0.000617284;
  			cubicyardpersecond=(edtValue)*0.0000102881;
  			cubicfootperhour=(edtValue)*1;
  			cubicfootperminute=(edtValue)*0.0166666667;
  			cubicfootpersecond=(edtValue)*0.0002777778;
  			
  			cubicinchperhour=(edtValue)*1727.9999999;
  			cubicinchperminute=(edtValue)*28.8;
  			cubicinchpersecond=(edtValue)*0.48;
  			poundpersecond=(edtValue)*0.0128207792;
  			poundperminute=(edtValue)*0.7692467533;
  			poundperhour=(edtValue)*46.15480518;
  			poundperday=(edtValue)*1107.7153247;
  			kilogrampersecond=(edtValue)*0.0058154076;
  			kilogramperminute=(edtValue)*0.3489244579;
  			kilogramperhour=(edtValue)*20.935467473;
  			kilogramperday=(edtValue)*502.45121939;
  			
  			break;
  			
  			
          case "Cubic foot/minute -ft^3/min":
  			
  			cubicmeterpersecond=(edtValue)*0.0004719474;
  			cubicmeterperday=(edtValue)*40.776259094 ;
  			cubicmeterperhour=(edtValue)*1.6990107956;
  			cubicmeterperminute=(edtValue)*0.0283168466;
  			cubiccentimeterperday=(edtValue)*40776259.094;
  			cubiccentimeterperhour=(edtValue)*1699010.7956;
  			cubiccentimeterperminute=(edtValue)*28316.846593;
  			cubiccentimeterpersecond=(edtValue)*471.94744322;
  			literperday=(edtValue)*40776.259094;
  			literperhour=(edtValue)*1699.0107956;
  			literperminute=(edtValue)*28.316846593;
  			literpersecond=(edtValue)*0.4719474432;
  			milliliterperday=(edtValue)*40776259.094;
  			milliliterperhour=(edtValue)*1699010.7956;
  			milliliterperminute=(edtValue)*28316.846593;
  			milliliterpersecond=(edtValue)*471.94744322;
  			gallonUSperday=(edtValue)*10771.948052;
  			gallonUSperhour=(edtValue)*448.83116885;
  			gallonUSperminute=(edtValue)*7.4805194809;
  			gallonUSpersecond=(edtValue)*0.1246753247;
  			gallonUKperday=(edtValue)*8969.5230615;
  			gallonUKperhour=(edtValue)*373.73012756;
  			gallonUKperminute=(edtValue)*6.2288354593;
  			gallonUKpersecond=(edtValue)*0.1038139243;
  			kilobarrelUSperday=(edtValue)*0.2564749536;
  			barrelUSperday=(edtValue)*256.47495363;
  			barrelUSperhour=(edtValue)*10.686456401;
  			barrelUSperminute=(edtValue)*0.1781076067;
  			barrelUSpersecond=(edtValue)*0.0029684601;
  			acrefootperyear=(edtValue)*12.066067439;
  			acrefootperday=(edtValue)*0.033057719;
  			acrefootperhour=(edtValue)*0.001377405;
  			hundredcubicfootperday=(edtValue)*14.400000001;
  			
  			hundredcubicfootperhour=(edtValue)*0.6;
  			hundredcubicfootperminute=(edtValue)*0.01 ;
  			ounceperhour=(edtValue)*57450.389613;
  			ounceperminute=(edtValue)*957.50649355;
  			ouncepersecond=(edtValue)*15.958441559;
  			ounceUKperhour=(edtValue)*59796.816702;
  			ounceUKperminute=(edtValue)*996.6136117;
  			ounceUKpersecond=(edtValue)*16.610226862;
  			
  			cubicyardperhour=(edtValue)*2.2222222222;
  			cubicyardperminute=(edtValue)*0.037037037;
  			cubicyardpersecond=(edtValue)*0.000617284;
  			cubicfootperhour=(edtValue)*60.000000003;
  			cubicfootperminute=(edtValue)*1;
  			cubicfootpersecond=(edtValue)*0.0166666667;
  			
  			cubicinchperhour=(edtValue)*103680;
  			cubicinchperminute=(edtValue)*1728.0000001;
  			cubicinchpersecond=(edtValue)*28.800000001;
  			poundpersecond=(edtValue)*0.7692467534;
  			poundperminute=(edtValue)*46.154805198;
  			poundperhour=(edtValue)*2769.2883109;
  			poundperday=(edtValue)*66462.919485;
  			kilogrampersecond=(edtValue)*0.3489244579;
  			kilogramperminute=(edtValue)*20.935467477;
  			kilogramperhour=(edtValue)*1256.1280485;
  			kilogramperday=(edtValue)*30147.073165;
  			
  			break;
  			
  			
          case "Cubic foot/second -ft^3/s":
  			
  			cubicmeterpersecond=(edtValue)*0.0283168466;
  			cubicmeterperday=(edtValue)*2446.5755457 ;
  			cubicmeterperhour=(edtValue)*101.94064774;
  			cubicmeterperminute=(edtValue)*1.6990107956;
  			cubiccentimeterperday=(edtValue)*2446575545.7;
  			cubiccentimeterperhour=(edtValue)*101940647.74;
  			cubiccentimeterperminute=(edtValue)*1699010.7956;
  			cubiccentimeterpersecond=(edtValue)*28316.846593;
  			literperday=(edtValue)*2446575.5457;
  			literperhour=(edtValue)*101940.64774;
  			literperminute=(edtValue)*1699.0107956;
  			literpersecond=(edtValue)*28.316846593;
  			milliliterperday=(edtValue)*2446575545.7;
  			milliliterperhour=(edtValue)*101940647.74;
  			milliliterperminute=(edtValue)*1699010.7956;
  			milliliterpersecond=(edtValue)*28316.846593;
  			gallonUSperday=(edtValue)*646316.88315;
  			gallonUSperhour=(edtValue)*26929.870131;
  			gallonUSperminute=(edtValue)*448.83116885;
  			gallonUSpersecond=(edtValue)*7.4805194809;
  			gallonUKperday=(edtValue)*538171.38369;
  			gallonUKperhour=(edtValue)*22423.807654;
  			gallonUKperminute=(edtValue)*373.73012756;
  			gallonUKpersecond=(edtValue)*6.2288354593;
  			kilobarrelUSperday=(edtValue)*15.388497218;
  			barrelUSperday=(edtValue)*15388.497218;
  			barrelUSperhour=(edtValue)*641.18738408;
  			barrelUSperminute=(edtValue)*10.686456401;
  			barrelUSpersecond=(edtValue)*0.1781076067;
  			acrefootperyear=(edtValue)*723.96404632;
  			acrefootperday=(edtValue)*1.9834631406;
  			acrefootperhour=(edtValue)*0.0826442975;
  			hundredcubicfootperday=(edtValue)*864.00000004;
  			
  			hundredcubicfootperhour=(edtValue)*36.000000002;
  			hundredcubicfootperminute=(edtValue)*0.6;
  			ounceperhour=(edtValue)*3447023.3768;
  			ounceperminute=(edtValue)*57450.389613;
  			ouncepersecond=(edtValue)*957.50649355;
  			ounceUKperhour=(edtValue)*3587809.0021;
  			ounceUKperminute=(edtValue)*59796.816702;
  			ounceUKpersecond=(edtValue)*996.6136117;
  			
  			cubicyardperhour=(edtValue)*133.33333333;
  			cubicyardperminute=(edtValue)*2.2222222222;
  			cubicyardpersecond=(edtValue)*0.037037037;
  			cubicfootperhour=(edtValue)*3600.0000002;
  			cubicfootperminute=(edtValue)*60;
  			cubicfootpersecond=(edtValue)*1;
  			
  			cubicinchperhour=(edtValue)*6220800;
  			cubicinchperminute=(edtValue)*103680.00001;
  			cubicinchpersecond=(edtValue)*1728.0000001;
  			poundpersecond=(edtValue)*46.154805201;
  			poundperminute=(edtValue)*2769.2883119;
  			poundperhour=(edtValue)*166157.29865;
  			poundperday=(edtValue)*3987775.1691;
  			kilogrampersecond=(edtValue)*20.935467473;
  			kilogramperminute=(edtValue)*1256.1280486;
  			kilogramperhour=(edtValue)*75367.682908;
  			kilogramperday=(edtValue)*1808824.3899;
  			
  			break;
  			
  			
          case "Cubic inch/hour -in^3/h":
  			
  			cubicmeterpersecond=(edtValue)*4.551962222E-9;
  			cubicmeterperday=(edtValue)*0.0003932895 ;
  			cubicmeterperhour=(edtValue)*0.0000163871;
  			cubicmeterperminute=(edtValue)*2.731177333E-7;
  			cubiccentimeterperday=(edtValue)*393.28953602;
  			cubiccentimeterperhour=(edtValue)*393.28953602;
  			cubiccentimeterperminute=(edtValue)*0.2731177333;
  			cubiccentimeterpersecond=(edtValue)*0.0045519622;
  			literperday=(edtValue)*0.393289536;
  			literperhour=(edtValue)*0.393289536;
  			literperminute=(edtValue)*0.0002731177;
  			literpersecond=(edtValue)*0.000004552;
  			milliliterperday=(edtValue)*393.28953602;
  			milliliterperhour=(edtValue)*16.387064001;
  			milliliterperminute=(edtValue)*0.2731177333;
  			milliliterpersecond=(edtValue)*0.0045519622;
  			gallonUSperday=(edtValue)*0.1038961039;
  			gallonUSperhour=(edtValue)*0.0043290043;
  			gallonUSperminute=(edtValue)*0.0000721501;
  			gallonUSpersecond=(edtValue)*0.0000012025;
  			gallonUKperday=(edtValue)*0.0865116036;
  			gallonUKperhour=(edtValue)*0.0036046502;
  			gallonUKperminute=(edtValue)*0.0000600775;
  			gallonUKpersecond=(edtValue)*0.0000010013;
  			kilobarrelUSperday=(edtValue)*0.0000024737;
  			barrelUSperday=(edtValue)*0.0024737168;
  			barrelUSperhour=(edtValue)*0.0001030715;
  			barrelUSperminute=(edtValue)*0.0000017179;
  			barrelUSpersecond=(edtValue)*2.863098101E-8;
  			acrefootperyear=(edtValue)*0.000116378;
  			acrefootperday=(edtValue)*3.188437404E-7;
  			acrefootperhour=(edtValue)*1.328515585E-8;
  			hundredcubicfootperday=(edtValue)*0.0001388889;
  			
  			hundredcubicfootperhour=(edtValue)*0.000005787;
  			hundredcubicfootperminute=(edtValue)*9.645061728E-8 ;
  			ounceperhour=(edtValue)*0.5541125541;
  			ounceperminute=(edtValue)*0.0092352092;
  			ouncepersecond=(edtValue)*0.0001539202;
  			ounceUKperhour=(edtValue)*0.5767439883;
  			ounceUKperminute=(edtValue)*0.0096123998;
  			ounceUKpersecond=(edtValue)*0.0001602067;
  			
  			cubicyardperhour=(edtValue)*0.0000214335;
  			cubicyardperminute=(edtValue)*3.572245084E-7;
  			cubicyardpersecond=(edtValue)*5.953741807E-9;
  			cubicfootperhour=(edtValue)*0.0005787037;
  			cubicfootperminute=(edtValue)*0.0000096451;
  			cubicfootpersecond=(edtValue)*1.607510288E-7;
  			
  			cubicinchperhour=(edtValue)*1;
  			cubicinchperminute=(edtValue)*0.0166666667;
  			cubicinchpersecond=(edtValue)*0.0002777778;
  			poundpersecond=(edtValue)*0.0000074194;
  			poundperminute=(edtValue)*0.0004451659;
  			poundperhour=(edtValue)*0.0267099567;
  			poundperday=(edtValue)*0.6410389611;
  			kilogrampersecond=(edtValue)*0.0000033654;
  			kilogramperminute=(edtValue)*0.0002019239;
  			kilogramperhour=(edtValue)*0.0121154326;
  			kilogramperday=(edtValue)*0.2907703816;
  			
  			break;
  			
  			
          case "Cubic inch/minute -in^3/min":
  			
  			cubicmeterpersecond=(edtValue)*2.731177333E-7;
  			cubicmeterperday=(edtValue)*0.0235973722 ;
  			cubicmeterperhour=(edtValue)*0.0009832238;
  			cubicmeterperminute=(edtValue)*0.0000163871;
  			cubiccentimeterperday=(edtValue)*23597.37216;
  			cubiccentimeterperhour=(edtValue)*983.22384;
  			cubiccentimeterperminute=(edtValue)*16.387064;
  			cubiccentimeterpersecond=(edtValue)*0.2731177333;
  			literperday=(edtValue)*23.59737216;
  			literperhour=(edtValue)*0.98322384;
  			literperminute=(edtValue)*0.016387064;
  			literpersecond=(edtValue)*0.0002731177;
  			milliliterperday=(edtValue)*23597.37216;
  			milliliterperhour=(edtValue)*983.22384;
  			milliliterperminute=(edtValue)*16.387064;
  			milliliterpersecond=(edtValue)*0.2731177333;
  			gallonUSperday=(edtValue)*6.2337662338;
  			gallonUSperhour=(edtValue)*0.2597402597;
  			gallonUSperminute=(edtValue)*0.0043290043;
  			gallonUSpersecond=(edtValue)*0.0000721501;
  			gallonUKperday=(edtValue)*5.1906962159;
  			gallonUKperhour=(edtValue)*0.216279009;
  			gallonUKperminute=(edtValue)*0.0036046501;
  			gallonUKpersecond=(edtValue)*0.0000600775;
  			kilobarrelUSperday=(edtValue)*0.000148423;
  			barrelUSperday=(edtValue)*0.1484230056;
  			barrelUSperhour=(edtValue)*0.0061842919;
  			barrelUSperminute=(edtValue)*0.0001030715;
  			barrelUSpersecond=(edtValue)*0.0000017179;
  			acrefootperyear=(edtValue)*0.0069826779;
  			acrefootperday=(edtValue)*0.0000191306;
  			acrefootperhour=(edtValue)*7.97109351E-7;
  			hundredcubicfootperday=(edtValue)*0.0083333333;
  			
  			hundredcubicfootperhour=(edtValue)*0.0003472222;
  			hundredcubicfootperminute=(edtValue)*0.000005787 ;
  			ounceperhour=(edtValue)*33.246753247;
  			ounceperminute=(edtValue)*0.5541125541;
  			ouncepersecond=(edtValue)*0.0092352092;
  			ounceUKperhour=(edtValue)*34.604639294;
  			ounceUKperminute=(edtValue)*0.5767439882;
  			ounceUKpersecond=(edtValue)*0.0096123998;
  			
  			cubicyardperhour=(edtValue)*0.0012860082;
  			cubicyardperminute=(edtValue)*0.0000214335;
  			cubicyardpersecond=(edtValue)*3.572245084E-7;
  			cubicfootperhour=(edtValue)*0.0347222222;
  			cubicfootperminute=(edtValue)*0.0005787037;
  			cubicfootpersecond=(edtValue)*0.0000096451;
  			
  			cubicinchperhour=(edtValue)*59.999999997;
  			cubicinchperminute=(edtValue)*1;
  			cubicinchpersecond=(edtValue)*0.0166666667;
  			poundpersecond=(edtValue)*0.0004451659;
  			poundperminute=(edtValue)*0.0267099567;
  			poundperhour=(edtValue)*1.6025974021;
  			poundperday=(edtValue)*38.462337663;
  			kilogrampersecond=(edtValue)*0.0002019239;
  			kilogramperminute=(edtValue)*0.0121154326;
  			kilogramperhour=(edtValue)*0.7269259539;
  			kilogramperday=(edtValue)*17.446222896;
  			
  			break;
  			
  			
          case "Cubic inch/second -in^3/s":
  			
  			cubicmeterpersecond=(edtValue)*0.0000163871;
  			cubicmeterperday=(edtValue)*1.4158423296 ;
  			cubicmeterperhour=(edtValue)*0.0589934304;
  			cubicmeterperminute=(edtValue)*0.0009832238;
  			cubiccentimeterperday=(edtValue)*1415842.3296;
  			cubiccentimeterperhour=(edtValue)*58993.4304;
  			cubiccentimeterperminute=(edtValue)*983.22384;
  			cubiccentimeterpersecond=(edtValue)*16.387064;
  			literperday=(edtValue)*1415.8423296;
  			literperhour=(edtValue)*58.9934304;
  			literperminute=(edtValue)*0.98322384;
  			literpersecond=(edtValue)*0.016387064;
  			milliliterperday=(edtValue)*1415842.3296;
  			milliliterperhour=(edtValue)*58993.4304;
  			milliliterperminute=(edtValue)*983.22384;
  			milliliterpersecond=(edtValue)*16.387064;
  			gallonUSperday=(edtValue)*374.02597403;
  			gallonUSperhour=(edtValue)*15.584415584;
  			gallonUSperminute=(edtValue)*0.2597402597;
  			gallonUSpersecond=(edtValue)*0.0043290043;
  			gallonUKperday=(edtValue)*311.44177295;
  			gallonUKperhour=(edtValue)*12.97674054;
  			gallonUKperminute=(edtValue)*0.216279009;
  			gallonUKpersecond=(edtValue)*0.0036046501;
  			kilobarrelUSperday=(edtValue)*0.0089053803;
  			barrelUSperday=(edtValue)*8.905380334;
  			barrelUSperhour=(edtValue)*0.3710575139;
  			barrelUSperminute=(edtValue)*0.0061842919;
  			barrelUSpersecond=(edtValue)*0.0001030715;
  			acrefootperyear=(edtValue)*0.4189606749;
  			acrefootperday=(edtValue)*0.0011478375;
  			acrefootperhour=(edtValue)*0.0000478266;
  			hundredcubicfootperday=(edtValue)*0.5;
  			
  			hundredcubicfootperhour=(edtValue)*0.0208333333;
  			hundredcubicfootperminute=(edtValue)*0.0003472222 ;
  			ounceperhour=(edtValue)*1994.8051948;
  			ounceperminute=(edtValue)*1994.8051948;
  			ouncepersecond=(edtValue)*0.5541125541;
  			ounceUKperhour=(edtValue)*2076.2783576;
  			ounceUKperminute=(edtValue)*34.604639294;
  			ounceUKpersecond=(edtValue)*0.5767439882;
  			
  			cubicyardperhour=(edtValue)*0.0771604938;
  			cubicyardperminute=(edtValue)*0.0012860082;
  			cubicyardpersecond=(edtValue)*0.0000214335;
  			cubicfootperhour=(edtValue)*2.0833333333;
  			cubicfootperminute=(edtValue)*0.0347222222;
  			cubicfootpersecond=(edtValue)*0.0005787037;
  			
  			cubicinchperhour=(edtValue)*3599.9999998;
  			cubicinchperminute=(edtValue)*60;
  			cubicinchpersecond=(edtValue)*1;
  			poundpersecond=(edtValue)*0.0267099567;
  			poundperminute=(edtValue)*1.6025974026;
  			poundperhour=(edtValue)*96.155844124;
  			poundperday=(edtValue)*2307.7402598;
  			kilogrampersecond=(edtValue)*0.0121154326;
  			kilogramperminute=(edtValue)*0.726925954;
  			kilogramperhour=(edtValue)*43.615557236;
  			kilogramperday=(edtValue)*1046.7733737;
  			
  			break;
  			
  			
          case "Pound/second (Gasoline at 15.5%b0C) -lb/s":
  			
  			cubicmeterpersecond=(edtValue)*0.0006135189;
  			cubicmeterperday=(edtValue)* 53.00803535;
  			cubicmeterperhour=(edtValue)*2.2086681396;
  			cubicmeterperminute=(edtValue)*0.0368111357;
  			cubiccentimeterperday=(edtValue)*53008035.35;
  			cubiccentimeterperhour=(edtValue)*2208668.1396;
  			cubiccentimeterperminute=(edtValue)*36811.13566;
  			cubiccentimeterpersecond=(edtValue)*613.51892766;
  			literperday=(edtValue)*53008.03535;
  			literperhour=(edtValue)*2208.6681396;
  			literperminute=(edtValue)*36.81113566;
  			literpersecond=(edtValue)*0.6135189277;
  			milliliterperday=(edtValue)*53008035.35;
  			milliliterperhour=(edtValue)*2208668.1396;
  			milliliterperminute=(edtValue)*36811.13566;
  			milliliterpersecond=(edtValue)*613.51892766;
  			gallonUSperday=(edtValue)*14003.24149;
  			gallonUSperhour=(edtValue)*583.46839541;
  			gallonUSperminute=(edtValue)*9.7244732569;
  			gallonUSpersecond=(edtValue)*0.1620745543;
  			gallonUKperday=(edtValue)*11660.13769;
  			gallonUKperhour=(edtValue)*485.83907041;
  			gallonUKperminute=(edtValue)*8.0973178401;
  			gallonUKpersecond=(edtValue)*0.1349552973;
  			kilobarrelUSperday=(edtValue)*0.3334105117;
  			barrelUSperday=(edtValue)*333.41051166;
  			barrelUSperhour=(edtValue)*13.892104653;
  			barrelUSperminute=(edtValue)*0.2315350775;
  			barrelUSpersecond=(edtValue)*0.003858918;
  			acrefootperyear=(edtValue)*15.685561734;
  			acrefootperday=(edtValue)*0.0429741417;
  			acrefootperhour=(edtValue)*0.0017905892;
  			hundredcubicfootperday=(edtValue)*18.719611019;
  			
  			hundredcubicfootperhour=(edtValue)*0.7799837925;
  			hundredcubicfootperminute=(edtValue)*0.0129997299 ;
  			ounceperhour=(edtValue)*74683.954613;
  			ounceperminute=(edtValue)*1244.7325769;
  			ouncepersecond=(edtValue)*20.745542948;
  			ounceUKperhour=(edtValue)*77734.246445;
  			ounceUKperminute=(edtValue)*1295.5707741;
  			ounceUKpersecond=(edtValue)*21.592846235;
  			
  			cubicyardperhour=(edtValue)*2.8888288609;
  			cubicyardperminute=(edtValue)*0.0481471477;
  			cubicyardpersecond=(edtValue)*0.0008024525;
  			cubicfootperhour=(edtValue)*77.998379248;
  			cubicfootperminute=(edtValue)*1.2999729874;
  			cubicfootpersecond=(edtValue)*0.0216662165;
  			
  			cubicinchperhour=(edtValue)*134781.19933;
  			cubicinchperminute=(edtValue)*2246.3533223;
  			cubicinchpersecond=(edtValue)*37.439222039;
  			poundpersecond=(edtValue)*1;
  			poundperminute=(edtValue)*59.999999995;
  			poundperhour=(edtValue)*3599.9999985;
  			poundperday=(edtValue)*86399.999995;
  			kilogrampersecond=(edtValue)*0.4535923699;
  			kilogramperminute=(edtValue)*27.215542198;
  			kilogramperhour=(edtValue)*1632.9325317;
  			kilogramperday=(edtValue)*39190.380764;
  			
  			break;
  			
  			
          case "Pound/minute (Gasoline at 15.5%b0C) -lb/min":
  			
  			cubicmeterpersecond=(edtValue)*0.0000102253;
  			cubicmeterperday=(edtValue)* 0.8834672559;
  			cubicmeterperhour=(edtValue)*0.0368111357;
  			cubicmeterperminute=(edtValue)*0.0006135189;
  			cubiccentimeterperday=(edtValue)*883467.2559;
  			cubiccentimeterperhour=(edtValue)*36811.135663;
  			cubiccentimeterperminute=(edtValue)*613.51892771;
  			cubiccentimeterpersecond=(edtValue)*10.225315462;
  			literperday=(edtValue)*883.4672559;
  			literperhour=(edtValue)*36.811135663;
  			literperminute=(edtValue)*0.6135189277;
  			literpersecond=(edtValue)*0.0102253155;
  			milliliterperday=(edtValue)*883467.2559;
  			milliliterperhour=(edtValue)*36811.135663;
  			milliliterperminute=(edtValue)*613.51892771;
  			milliliterpersecond=(edtValue)*10.225315462;
  			gallonUSperday=(edtValue)*233.38735818;
  			gallonUSperhour=(edtValue)*9.7244732576;
  			gallonUSperminute=(edtValue)*0.1620745543;
  			gallonUSpersecond=(edtValue)*0.0027012426;
  			gallonUKperday=(edtValue)*194.33562818;
  			gallonUKperhour=(edtValue)*8.0973178407;
  			gallonUKperminute=(edtValue)*0.1349552973;
  			gallonUKpersecond=(edtValue)*0.002249255;
  			kilobarrelUSperday=(edtValue)*0.0055568419;
  			barrelUSperday=(edtValue)*5.5568418615;
  			barrelUSperhour=(edtValue)*0.2315350776;
  			barrelUSperminute=(edtValue)*0.003858918;
  			barrelUSpersecond=(edtValue)*0.0000643153;
  			acrefootperyear=(edtValue)*0.2614260289;
  			acrefootperday=(edtValue)*0.0007162357;
  			acrefootperhour=(edtValue)*0.0000298432;
  			hundredcubicfootperday=(edtValue)*0.311993517;
  			
  			hundredcubicfootperhour=(edtValue)*0.0129997299;
  			hundredcubicfootperminute=(edtValue)*0.0002166622 ;
  			ounceperhour=(edtValue)*1244.732577;
  			ounceperminute=(edtValue)*20.74554295;
  			ouncepersecond=(edtValue)*0.3457590492;
  			ounceUKperhour=(edtValue)*1295.5707742;
  			ounceUKperminute=(edtValue)*21.592846236;
  			ounceUKpersecond=(edtValue)*0.3598807706;
  			
  			cubicyardperhour=(edtValue)*0.0481471477;
  			cubicyardperminute=(edtValue)*0.0008024525;
  			cubicyardpersecond=(edtValue)*0.0000133742;
  			cubicfootperhour=(edtValue)*1.2999729876;
  			cubicfootperminute=(edtValue)*0.0216662165;
  			cubicfootpersecond=(edtValue)*0.0003611036;
  			
  			cubicinchperhour=(edtValue)*2246.3533224;
  			cubicinchperminute=(edtValue)*37.439222042;
  			cubicinchpersecond=(edtValue)*0.623987034;
  			poundpersecond=(edtValue)*0.0166666667;
  			poundperminute=(edtValue)*1;
  			poundperhour=(edtValue)*59.99999998;
  			poundperday=(edtValue)*1440;
  			kilogrampersecond=(edtValue)*0.0075598728;
  			kilogramperminute=(edtValue)*0.45359237;
  			kilogramperhour=(edtValue)*27.215542197;
  			kilogramperday=(edtValue)*653.17301278;
  			
  			break;
  			
  			
          case "Pound/hour (Gasoline at 15.5%b0C) -lb/h":
  			
  			cubicmeterpersecond=(edtValue)*1.704219244E-7;
  			cubicmeterperday=(edtValue)*0.0147244543 ;
  			cubicmeterperhour=(edtValue)*0.0006135189;
  			cubicmeterperminute=(edtValue)*0.0000102253;
  			cubiccentimeterperday=(edtValue)*14724.45427;
  			cubiccentimeterperhour=(edtValue)*613.51892792;
  			cubiccentimeterperminute=(edtValue)*10.225315465;
  			cubiccentimeterpersecond=(edtValue)*0.1704219244;
  			literperday=(edtValue)*14.72445427;
  			literperhour=(edtValue)*0.6135189279;
  			literperminute=(edtValue)*0.0102253155;
  			literpersecond=(edtValue)*0.0001704219;
  			milliliterperday=(edtValue)*14724.45427;
  			milliliterperhour=(edtValue)*613.51892792;
  			milliliterperminute=(edtValue)*10.225315465;
  			milliliterpersecond=(edtValue)*0.1704219244;
  			gallonUSperday=(edtValue)*3.8897893044;
  			gallonUSperhour=(edtValue)*0.1620745543;
  			gallonUSperminute=(edtValue)*0.0027012426;
  			gallonUSpersecond=(edtValue)*0.0000450207;
  			gallonUKperday=(edtValue)*3.2389271374;
  			gallonUKperhour=(edtValue)*0.1349552974;
  			gallonUKperminute=(edtValue)*0.002249255;
  			gallonUKpersecond=(edtValue)*0.0000374876;
  			kilobarrelUSperday=(edtValue)*0.000092614;
  			barrelUSperday=(edtValue)*0.0926140311;
  			barrelUSperhour=(edtValue)*0.003858918;
  			barrelUSperminute=(edtValue)*0.0000643153;
  			barrelUSpersecond=(edtValue)*0.0000010719;
  			acrefootperyear=(edtValue)*0.0043571005;
  			acrefootperday=(edtValue)*0.0000119373;
  			acrefootperhour=(edtValue)*4.973858999E-7;
  			hundredcubicfootperday=(edtValue)*0.005199892;
  			
  			hundredcubicfootperhour=(edtValue)*0.0002166622;
  			hundredcubicfootperminute=(edtValue)*0.000003611 ;
  			ounceperhour=(edtValue)*20.745542957;
  			ounceperminute=(edtValue)*0.3457590493;
  			ouncepersecond=(edtValue)*0.0057626508;
  			ounceUKperhour=(edtValue)*21.592846244;
  			ounceUKperminute=(edtValue)*0.3598807707;
  			ounceUKpersecond=(edtValue)*0.0059980128;
  			
  			cubicyardperhour=(edtValue)*0.0008024525;
  			cubicyardperminute=(edtValue)*0.0000133742;
  			cubicyardpersecond=(edtValue)*2.229034615E-7;
  			cubicfootperhour=(edtValue)*0.0216662165;
  			cubicfootperminute=(edtValue)*0.0003611036;
  			cubicfootpersecond=(edtValue)*0.0000060184;
  			
  			cubicinchperhour=(edtValue)*37.439222053;
  			cubicinchperminute=(edtValue)*0.6239870342;
  			cubicinchpersecond=(edtValue)*0.0103997839;
  			poundpersecond=(edtValue)*0.0002777778;
  			poundperminute=(edtValue)*0.0166666667;
  			poundperhour=(edtValue)*1;
  			poundperday=(edtValue)*24.000000008;
  			kilogrampersecond=(edtValue)*0.0001259979;
  			kilogramperminute=(edtValue)*0.0075598728;
  			kilogramperhour=(edtValue)*0.4535923701;
  			kilogramperday=(edtValue)*10.886216883;
  			
  			break;
  			
  			
          case "Pound/day (Gasoline at 15.5%b0C) -lb/d":
  			
  			cubicmeterpersecond=(edtValue)*7.100913515E-9;
  			cubicmeterperday=(edtValue)*0.0006135189 ;
  			cubicmeterperhour=(edtValue)*0.0000255633;
  			cubicmeterperminute=(edtValue)*4.260548109E-7;
  			cubiccentimeterperday=(edtValue)*613.5189277;
  			cubiccentimeterperhour=(edtValue)*25.563288654;
  			cubiccentimeterperminute=(edtValue)*0.4260548109;
  			cubiccentimeterpersecond=(edtValue)*0.0071009135;
  			literperday=(edtValue)*0.6135189277;
  			literperhour=(edtValue)*0.0255632887;
  			literperminute=(edtValue)*0.0004260548;
  			literpersecond=(edtValue)*0.0000071009;
  			milliliterperday=(edtValue)*613.5189277;
  			milliliterperhour=(edtValue)*25.563288654;
  			milliliterperminute=(edtValue)*0.4260548109;
  			milliliterpersecond=(edtValue)*0.0071009135;
  			gallonUSperday=(edtValue)*0.1620745543;
  			gallonUSperhour=(edtValue)*0.0067531064;
  			gallonUSperminute=(edtValue)*0.0001125518;
  			gallonUSpersecond=(edtValue)*0.0000018759;
  			gallonUKperday=(edtValue)*0.1349552973;
  			gallonUKperhour=(edtValue)*0.0056231374;
  			gallonUKperminute=(edtValue)*0.000093719;
  			gallonUKpersecond=(edtValue)*0.000001562;
  			kilobarrelUSperday=(edtValue)*0.0000038589;
  			barrelUSperday=(edtValue)*0.003858918;
  			barrelUSperhour=(edtValue)*0.0001607882;
  			barrelUSperminute=(edtValue)*0.0000026798;
  			barrelUSpersecond=(edtValue)*4.46634023E-8;
  			acrefootperyear=(edtValue)*0.0001815459;
  			acrefootperday=(edtValue)*4.973858997E-7;
  			acrefootperhour=(edtValue)*2.072441249E-8;
  			hundredcubicfootperday=(edtValue)*0.0002166622;
  			
  			hundredcubicfootperhour=(edtValue)*0.0000090276;
  			hundredcubicfootperminute=(edtValue)*1.504598365E-7 ;
  			ounceperhour=(edtValue)*0.8643976229;
  			ounceperminute=(edtValue)*0.014406627;
  			ouncepersecond=(edtValue)*0.0002401105;
  			ounceUKperhour=(edtValue)*0.8997019265;
  			ounceUKperminute=(edtValue)*0.0149950321;
  			ounceUKpersecond=(edtValue)*0.0002499172;
  			
  			cubicyardperhour=(edtValue)*0.0000334355;
  			cubicyardperminute=(edtValue)*5.572586537E-7;
  			cubicyardpersecond=(edtValue)*9.287644229E-9;
  			cubicfootperhour=(edtValue)*0.000902759;
  			cubicfootperminute=(edtValue)*0.000015046;
  			cubicfootpersecond=(edtValue)*2.507663941E-7;
  			
  			cubicinchperhour=(edtValue)*1.559967585;
  			cubicinchperminute=(edtValue)*0.0259994598;
  			cubicinchpersecond=(edtValue)*0.0004333243;
  			poundpersecond=(edtValue)*0.0000115741;
  			poundperminute=(edtValue)*0.0006944444;
  			poundperhour=(edtValue)*0.0416666667;
  			poundperday=(edtValue)*1;
  			kilogrampersecond=(edtValue)*0.0000052499;
  			kilogramperminute=(edtValue)*0.0003149947;
  			kilogramperhour=(edtValue)*0.0188996821;
  			kilogramperday=(edtValue)*0.45359237;
  			
  			break;
  			
  			
  			
          case "Kilogram/second (Gasoline at 15.5%b0C) -kg/s":
  			
  			cubicmeterpersecond=(edtValue)*0.0013525777;
  			cubicmeterperday=(edtValue)* 116.8627139;
  			cubicmeterperhour=(edtValue)*4.8692797458;
  			cubicmeterperminute=(edtValue)*0.0811546624;
  			cubiccentimeterperday=(edtValue)*116862713.9;
  			cubiccentimeterperhour=(edtValue)*4869279.7458;
  			cubiccentimeterperminute=(edtValue)*81154.662431;
  			cubiccentimeterpersecond=(edtValue)*1352.5777072;
  			literperday=(edtValue)*116862.7139;
  			literperhour=(edtValue)*4869.2797458;
  			literperminute=(edtValue)*81.154662431;
  			literpersecond=(edtValue)*1.3525777072;
  			milliliterperday=(edtValue)*116862713.9;
  			milliliterperhour=(edtValue)*4869279.7458;
  			milliliterperminute=(edtValue)*81154.662431;
  			milliliterpersecond=(edtValue)*1352.5777072;
  			gallonUSperday=(edtValue)*30871.862975;
  			gallonUSperhour=(edtValue)*1286.327624;
  			gallonUSperminute=(edtValue)*21.438793733;
  			gallonUSpersecond=(edtValue)*0.3573132289;
  			gallonUKperday=(edtValue)*25706.203331;
  			gallonUKperhour=(edtValue)*1071.0918054;
  			gallonUKperminute=(edtValue)*17.851530091;
  			gallonUKpersecond=(edtValue)*0.2975255015;
  			kilobarrelUSperday=(edtValue)*0.7350443566;
  			barrelUSperday=(edtValue)*735.04435655;
  			barrelUSperhour=(edtValue)*30.62684819;
  			barrelUSperminute=(edtValue)*0.5104474698;
  			barrelUSpersecond=(edtValue)*0.0085074578;
  			acrefootperyear=(edtValue)*34.580744244;
  			acrefootperday=(edtValue)*0.0947417651;
  			acrefootperhour=(edtValue)*0.0039475735;
  			hundredcubicfootperday=(edtValue)*41.269677935;
  			
  			hundredcubicfootperhour=(edtValue)*1.719569914;
  			hundredcubicfootperminute=(edtValue)*0.0286594986 ;
  			ounceperhour=(edtValue)*164649.93587;
  			ounceperminute=(edtValue)*2744.1655978;
  			ouncepersecond=(edtValue)*45.736093296;
  			ounceUKperhour=(edtValue)*171374.67825;
  			ounceUKperminute=(edtValue)*2856.2446374;
  			ounceUKpersecond=(edtValue)*47.604077291;
  			
  			cubicyardperhour=(edtValue)*6.3687774589;
  			cubicyardperminute=(edtValue)*0.106146291;
  			cubicyardpersecond=(edtValue)*0.0017691048;
  			cubicfootperhour=(edtValue)*171.9569914;
  			cubicfootperminute=(edtValue)*2.8659498565;
  			cubicfootpersecond=(edtValue)*0.0477658309;
  			
  			cubicinchperhour=(edtValue)*297141.68112;
  			cubicinchperminute=(edtValue)*4952.3613523;
  			cubicinchpersecond=(edtValue)*82.539355871;
  			poundpersecond=(edtValue)*2.2046226224;
  			poundperminute=(edtValue)*132.27735733;
  			poundperhour=(edtValue)*7936.6414372;
  			poundperday=(edtValue)*190479.39456;
  			kilogrampersecond=(edtValue)*1;
  			kilogramperminute=(edtValue)*60.00000001;
  			kilogramperhour=(edtValue)*3600.0000002;
  			kilogramperday=(edtValue)*86400.000011;
  			
  			break;
  			
  			
  			
          case "Kilogram/minute (Gasoline at 15.5%b0C) -kg/min":
  			
  			cubicmeterpersecond=(edtValue)*0.000022543;
  			cubicmeterperday=(edtValue)*1.947711898 ;
  			cubicmeterperhour=(edtValue)*0.0811546624;
  			cubicmeterperminute=(edtValue)*0.0013525777;
  			cubiccentimeterperday=(edtValue)*1947711.898;
  			cubiccentimeterperhour=(edtValue)*81154.662417;
  			cubiccentimeterperminute=(edtValue)*1352.5777069;
  			cubiccentimeterpersecond=(edtValue)*22.542961782;
  			literperday=(edtValue)*1947.711898;
  			literperhour=(edtValue)*81.154662417;
  			literperminute=(edtValue)*1.3525777069;
  			literpersecond=(edtValue)*0.0225429618;
  			milliliterperday=(edtValue)*1947711.898;
  			milliliterperhour=(edtValue)*81154.662417;
  			milliliterperminute=(edtValue)*1352.5777069;
  			milliliterpersecond=(edtValue)*22.542961782;
  			gallonUSperday=(edtValue)*514.5310495;
  			gallonUSperhour=(edtValue)*21.438793729;
  			gallonUSperminute=(edtValue)*0.3573132288;
  			gallonUSpersecond=(edtValue)*0.0059552205;
  			gallonUKperday=(edtValue)*428.43672211;
  			gallonUKperhour=(edtValue)*17.851530088;
  			gallonUKperminute=(edtValue)*0.2975255015;
  			gallonUKpersecond=(edtValue)*0.0049587584;
  			kilobarrelUSperday=(edtValue)*0.0122507393;
  			barrelUSperday=(edtValue)*12.250739274;
  			barrelUSperhour=(edtValue)*0.5104474697;
  			barrelUSperminute=(edtValue)*0.0085074578;
  			barrelUSpersecond=(edtValue)*0.000141791;
  			acrefootperyear=(edtValue)*0.5763457373;
  			acrefootperday=(edtValue)*0.0015790294;
  			acrefootperhour=(edtValue)*0.0000657929;
  			hundredcubicfootperday=(edtValue)*0.6878279655;
  			
  			hundredcubicfootperhour=(edtValue)*0.0286594986;
  			hundredcubicfootperminute=(edtValue)*0.0004776583 ;
  			ounceperhour=(edtValue)*2744.1655973;
  			ounceperminute=(edtValue)*45.736093289;
  			ouncepersecond=(edtValue)*0.7622682215;
  			ounceUKperhour=(edtValue)*2856.2446369;
  			ounceUKperminute=(edtValue)*47.604077282;
  			ounceUKpersecond=(edtValue)*0.793401288;
  			
  			cubicyardperhour=(edtValue)*0.106146291;
  			cubicyardperminute=(edtValue)*0.0017691048;
  			cubicyardpersecond=(edtValue)*0.0000294851;
  			cubicfootperhour=(edtValue)*2.8659498561;
  			cubicfootperminute=(edtValue)*0.0477658309;
  			cubicfootpersecond=(edtValue)*0.0007960972;
  			
  			cubicinchperhour=(edtValue)*4952.3613512;
  			cubicinchperminute=(edtValue)*82.539355857;
  			cubicinchpersecond=(edtValue)*1.3756559309;
  			poundpersecond=(edtValue)*0.0367437104;
  			poundperminute=(edtValue)*2.2046226218;
  			poundperhour=(edtValue)*132.27735726;
  			poundperday=(edtValue)*3174.6565755;
  			kilogrampersecond=(edtValue)*0.0166666667;
  			kilogramperminute=(edtValue)*1;
  			kilogramperhour=(edtValue)*59.999999994;
  			kilogramperday=(edtValue)*1439.9999999;
  			
  			break;
  			
  			
  			
          case "Kilogram/hour (Gasoline at 15.5%b0C) -kg/h":
  			
  			cubicmeterpersecond=(edtValue)*3.757160297E-7;
  			cubicmeterperday=(edtValue)*0.032461865 ;
  			cubicmeterperhour=(edtValue)*0.0013525777;
  			cubicmeterperminute=(edtValue)*0.000022543;
  			cubiccentimeterperday=(edtValue)*32461.86497;
  			cubiccentimeterperhour=(edtValue)*1352.5777071;
  			cubiccentimeterperminute=(edtValue)*22.542961785;
  			cubiccentimeterpersecond=(edtValue)*0.3757160297;
  			literperday=(edtValue)*32.46186497;
  			literperhour=(edtValue)*1.3525777071;
  			literperminute=(edtValue)*0.0225429618;
  			literpersecond=(edtValue)*0.000375716;
  			milliliterperday=(edtValue)*32461.86497;
  			milliliterperhour=(edtValue)*1352.5777071;
  			milliliterperminute=(edtValue)*22.542961785;
  			milliliterpersecond=(edtValue)*0.3757160297;
  			gallonUSperday=(edtValue)*8.5755174925;
  			gallonUSperhour=(edtValue)*0.3573132289;
  			gallonUSperminute=(edtValue)*0.0059552205;
  			gallonUSpersecond=(edtValue)*0.0000992537;
  			gallonUKperday=(edtValue)*7.1406120358;
  			gallonUKperhour=(edtValue)*0.2975255015;
  			gallonUKperminute=(edtValue)*0.0049587584;
  			gallonUKpersecond=(edtValue)*0.000082646;
  			kilobarrelUSperday=(edtValue)*0.000204179;
  			barrelUSperday=(edtValue)*0.2041789879;
  			barrelUSperhour=(edtValue)*0.0085074578;
  			barrelUSperminute=(edtValue)*0.000141791;
  			barrelUSpersecond=(edtValue)*0.0000023632;
  			acrefootperyear=(edtValue)*0.0096057623;
  			acrefootperday=(edtValue)*0.0000263172;
  			acrefootperhour=(edtValue)*0.0000010965;
  			hundredcubicfootperday=(edtValue)*0.0114637994;
  			
  			hundredcubicfootperhour=(edtValue)*0.0004776583;
  			hundredcubicfootperminute=(edtValue)*0.000007961 ;
  			ounceperhour=(edtValue)*45.736093293;
  			ounceperminute=(edtValue)*0.7622682216;
  			ouncepersecond=(edtValue)*0.0127044704;
  			ounceUKperhour=(edtValue)*47.604077287;
  			ounceUKperminute=(edtValue)*0.7934012881;
  			ounceUKpersecond=(edtValue)*0.0132233548;
  			
  			cubicyardperhour=(edtValue)*0.0017691048;
  			cubicyardperminute=(edtValue)*0.0000294851;
  			cubicyardpersecond=(edtValue)*4.914180137E-7;
  			cubicfootperhour=(edtValue)*0.0477658309;
  			cubicfootperminute=(edtValue)*0.0007960972;
  			cubicfootpersecond=(edtValue)*0.0000132683;
  			
  			cubicinchperhour=(edtValue)*82.539355861;
  			cubicinchperminute=(edtValue)*1.3756559311;
  			cubicinchpersecond=(edtValue)*0.0229275989;
  			poundpersecond=(edtValue)*0.0006123952;
  			poundperminute=(edtValue)*0.0367437104;
  			poundperhour=(edtValue)*2.2046226213;
  			poundperday=(edtValue)*52.91094293;
  			kilogrampersecond=(edtValue)*0.0002777778;
  			kilogramperminute=(edtValue)*0.0166666667;
  			kilogramperhour=(edtValue)*1;
  			kilogramperday=(edtValue)*24.000000001;
  			
  			break;
		
  			
          case "Kilogram/day (Gasoline at 15.5%b0C) -kg/d":
    			
    			cubicmeterpersecond=(edtValue)*1.565483457E-8;
    			cubicmeterperday=(edtValue)* 0.0013525777;
    			cubicmeterperhour=(edtValue)*0.0000563574;
    			cubicmeterperminute=(edtValue)*9.392900743E-7;
    			cubiccentimeterperday=(edtValue)*1352.577707;
    			cubiccentimeterperhour=(edtValue)*56.357404458;
    			cubiccentimeterperminute=(edtValue)*0.9392900743;
    			cubiccentimeterpersecond=(edtValue)*0.0156548346;
    			literperday=(edtValue)*1.352577707;
    			literperhour=(edtValue)*0.0563574045;
    			literperminute=(edtValue)*0.0009392901;
    			literpersecond=(edtValue)*0.0000156548;
    			milliliterperday=(edtValue)*1352.577707;
    			milliliterperhour=(edtValue)*56.357404458;
    			milliliterperminute=(edtValue)*0.9392900743;
    			milliliterpersecond=(edtValue)*0.0156548346;
    			gallonUSperday=(edtValue)*.3573132288;
    			gallonUSperhour=(edtValue)*0.0148880512;
    			gallonUSperminute=(edtValue)*0.0002481342;
    			gallonUSpersecond=(edtValue)*0.0000041356;
    			gallonUKperday=(edtValue)*0.2975255015;
    			gallonUKperhour=(edtValue)*0.0123968959;
    			gallonUKperminute=(edtValue)*0.0002066149;
    			gallonUKpersecond=(edtValue)*0.0000034436;
    			kilobarrelUSperday=(edtValue)*0.0000085075;
    			barrelUSperday=(edtValue)*0.0085074578;
    			barrelUSperhour=(edtValue)*0.0003544774;
    			barrelUSperminute=(edtValue)*0.000005908;
    			barrelUSpersecond=(edtValue)*9.846594709E-8;
    			acrefootperyear=(edtValue)*0.0004002401;
    			acrefootperday=(edtValue)*0.0000010965;
    			acrefootperhour=(edtValue)*4.56895086E-8;
    			hundredcubicfootperday=(edtValue)*0.0004776583;
    			
    			hundredcubicfootperhour=(edtValue)*0.0000199024;
    			hundredcubicfootperminute=(edtValue)*3.317071592E-7 ;
    			ounceperhour=(edtValue)*1.9056705538;
    			ounceperminute=(edtValue)*0.0317611759;
    			ouncepersecond=(edtValue)*0.0005293529;
    			ounceUKperhour=(edtValue)*1.9835032202;
    			ounceUKperminute=(edtValue)*0.033058387;
    			ounceUKpersecond=(edtValue)*0.0005509731;
    			
    			cubicyardperhour=(edtValue)*0.0000737127;
    			cubicyardperminute=(edtValue)*0.0000012285;
    			cubicyardpersecond=(edtValue)*2.047575057E-8;
    			cubicfootperhour=(edtValue)*0.001990243;
    			cubicfootperminute=(edtValue)*0.0000331707;
    			cubicfootpersecond=(edtValue)*5.528452654E-7;
    			
    			cubicinchperhour=(edtValue)*3.4391398273;
    			cubicinchperminute=(edtValue)*0.0573189971;
    			cubicinchpersecond=(edtValue)*0.0009553166;
    			poundpersecond=(edtValue)*0.0000255165;
    			poundperminute=(edtValue)*0.0015309879;
    			poundperhour=(edtValue)*0.0918592759;
    			poundperday=(edtValue)*2.2046226219;
    			kilogrampersecond=(edtValue)*0.0000115741;
    			kilogramperminute=(edtValue)*0.0006944444;
    			kilogramperhour=(edtValue)*0.0006944444;
    			kilogramperday=(edtValue)*1;
			  break;

    			
		}
    			
    		
		  results.setCubicmeterpersecond(cubicmeterpersecond);
		  results.setCubicmeterperday(cubicmeterperday);
		  results.setCubicmeterperhour(cubicmeterperhour);
		  results.setCubicmeterperminute(cubicmeterperminute);
		 results.setCubiccentimeterperday(cubiccentimeterperday);
		  results.setCubiccentimeterpersecond(cubiccentimeterpersecond);
		  results. setCubiccentimeterperhour( cubiccentimeterperhour);
		 results. setCubiccentimeterperminute( cubiccentimeterperminute);
		 results. setLiterpersecond(literpersecond);
		 results. setLiterperday(literperday);
		 results. setLiterperhour(literperhour);
		 results. setLiterperminute( literperminute) ;
		 results. setMilliliterperday( milliliterperday) ;
		 results.setMilliliterperhour( milliliterperhour);
		 results. setMilliliterperminute( milliliterperminute);
		 results. setMilliliterpersecond( milliliterpersecond);
	     results. setGallonUSperday( gallonUSperday); 
	     results. setGallonUSperhour( gallonUSperhour); 
	     results. setGallonUSperminute( gallonUSperminute) ;
         results. setGallonUSpersecond( gallonUSpersecond) ;
         results. setGallonUKperday( gallonUKperday);
         results. setGallonUKperhour( gallonUKperhour) ;
         results. setGallonUKperminute( gallonUKperminute); 
         results. setGallonUKpersecond( gallonUKpersecond) ;
			results. setKilobarrelUSperday( kilobarrelUSperday) ;
            results. setBarrelUSperday( barrelUSperday); 

			results. setBarrelUSperhour( barrelUSperhour); 
			results. setBarrelUSperminute( barrelUSperminute) ;
			results. setBarrelUSpersecond( barrelUSpersecond) ;
			results. setAcrefootperyear( acrefootperyear) ;

			results. setAcrefootperday( acrefootperday) ;

			results. setAcrefootperhour( acrefootperhour) ;

			results. setHundredcubicfootperday( hundredcubicfootperday) ;

			results. setHundredcubicfootperhour( hundredcubicfootperhour) ;

			results. setHundredcubicfootperminute( hundredcubicfootperminute) ;

			results. setOunceperhour( ounceperhour); 

			results. setOunceperminute( ounceperminute);

			results. setOuncepersecond( ouncepersecond) ;

			results. setOunceUKperhour( ounceUKperhour); 

			results. setOunceUKperminute( ounceUKperminute); 

			results. setOunceUKpersecond( ounceUKpersecond) ;

			results. setCubicyardperhour( cubicyardperhour);

			results. setCubicyardperminute( cubicyardperminute); 

			results. setCubicyardpersecond( cubicyardpersecond); 

			results. setCubicfootperhour( cubicfootperhour);

			results. setCubicfootperminute( cubicfootperminute); 

			results. setCubicfootpersecond( cubicfootpersecond);

			results. setCubicinchperhour( cubicinchperhour); 

			results. setCubicinchperminute( cubicinchperminute) ;

			results. setCubicinchpersecond( cubicinchpersecond) ;
				

			results. setPoundperminute( poundperminute) ;
			results. setPoundpersecond( poundpersecond) ;
			results. setPoundperhour( poundperhour) ;

			results. setPoundperday( poundperday) ;
			results. setKilogrampersecond( kilogrampersecond) ;

			results.setKilogramperminute(kilogramperminute);

			results.setKilogramperhour(kilogramperhour);

			results.setKilogramperday(kilogramperday) ;
		  
			  converterArray.add(results);
			  return converterArray;
		
	
		
		
    }
		
		public class ConversionResults{
			private double cubicmeterpersecond,cubicmeterperday,cubicmeterperhour,cubicmeterperminute,cubiccentimeterperday ,cubiccentimeterperhour,cubiccentimeterperminute,cubiccentimeterpersecond , literperday ,literperhour , literperminute,literpersecond,milliliterperday,milliliterperhour, milliliterperminute,milliliterpersecond ,
			gallonUSperday,gallonUSperhour ,gallonUSperminute ,gallonUSpersecond,gallonUKperday,gallonUKperhour,gallonUKperminute, gallonUKpersecond, kilobarrelUSperday, barrelUSperday, barrelUSperhour,barrelUSperminute,barrelUSpersecond,acrefootperyear,acrefootperday, acrefootperhour, hundredcubicfootperday,hundredcubicfootperhour, hundredcubicfootperminute, ounceperhour
			,ounceperminute,ouncepersecond,ounceUKperhour,ounceUKperminute, ounceUKpersecond,cubicyardperhour,cubicyardperminute,cubicyardpersecond,cubicfootperhour,cubicfootperminute,cubicfootpersecond,cubicinchperhour,cubicinchperminute, cubicinchpersecond,poundpersecond,poundperminute,poundperhour,poundperday,kilogrampersecond,kilogramperminute, kilogramperhour,kilogramperday ;

			public double getCubicmeterpersecond() {
				return cubicmeterpersecond;
			}

			public void setCubicmeterpersecond(double cubicmeterpersecond) {
				this.cubicmeterpersecond = cubicmeterpersecond;
			}

			public double getCubicmeterperday() {
				return cubicmeterperday;
			}

			public void setCubicmeterperday(double cubicmeterperday) {
				this.cubicmeterperday = cubicmeterperday;
			}

			public double getCubicmeterperhour() {
				return cubicmeterperhour;
			}

			public void setCubicmeterperhour(double cubicmeterperhour) {
				this.cubicmeterperhour = cubicmeterperhour;
			}

			public double getCubicmeterperminute() {
				return cubicmeterperminute;
			}

			public void setCubicmeterperminute(double cubicmeterperminute) {
				this.cubicmeterperminute = cubicmeterperminute;
			}

			public double getCubiccentimeterperday() {
				return cubiccentimeterperday;
			}

			public void setCubiccentimeterperday(double cubiccentimeterperday) {
				this.cubiccentimeterperday = cubiccentimeterperday;
			}

			public double getCubiccentimeterperhour() {
				return cubiccentimeterperhour;
			}

			public void setCubiccentimeterperhour(double cubiccentimeterperhour) {
				this.cubiccentimeterperhour = cubiccentimeterperhour;
			}

			public double getCubiccentimeterperminute() {
				return cubiccentimeterperminute;
			}

			public void setCubiccentimeterperminute(double cubiccentimeterperminute) {
				this.cubiccentimeterperminute = cubiccentimeterperminute;
			}

			public double getCubiccentimeterpersecond() {
				return cubiccentimeterpersecond;
			}

			public void setCubiccentimeterpersecond(double cubiccentimeterpersecond) {
				this.cubiccentimeterpersecond = cubiccentimeterpersecond;
			}

			public double getLiterperday() {
				return literperday;
			}

			public void setLiterperday(double literperday) {
				this.literperday = literperday;
			}

			public double getLiterperhour() {
				return literperhour;
			}

			public void setLiterperhour(double literperhour) {
				this.literperhour = literperhour;
			}

			public double getLiterperminute() {
				return literperminute;
			}

			public void setLiterperminute(double literperminute) {
				this.literperminute = literperminute;
			}

			public double getLiterpersecond() {
				return literpersecond;
			}

			public void setLiterpersecond(double literpersecond) {
				this.literpersecond = literpersecond;
			}

			public double getMilliliterperday() {
				return milliliterperday;
			}

			public void setMilliliterperday(double milliliterperday) {
				this.milliliterperday = milliliterperday;
			}

			public double getMilliliterperhour() {
				return milliliterperhour;
			}

			public void setMilliliterperhour(double milliliterperhour) {
				this.milliliterperhour = milliliterperhour;
			}

			public double getMilliliterperminute() {
				return milliliterperminute;
			}

			public void setMilliliterperminute(double milliliterperminute) {
				this.milliliterperminute = milliliterperminute;
			}

			public double getMilliliterpersecond() {
				return milliliterpersecond;
			}

			public void setMilliliterpersecond(double milliliterpersecond) {
				this.milliliterpersecond = milliliterpersecond;
			}

			public double getGallonUSperday() {
				return gallonUSperday;
			}

			public void setGallonUSperday(double gallonUSperday) {
				this.gallonUSperday = gallonUSperday;
			}

			public double getGallonUSperhour() {
				return gallonUSperhour;
			}

			public void setGallonUSperhour(double gallonUSperhour) {
				this.gallonUSperhour = gallonUSperhour;
			}

			public double getGallonUSperminute() {
				return gallonUSperminute;
			}

			public void setGallonUSperminute(double gallonUSperminute) {
				this.gallonUSperminute = gallonUSperminute;
			}

			public double getGallonUSpersecond() {
				return gallonUSpersecond;
			}

			public void setGallonUSpersecond(double gallonUSpersecond) {
				this.gallonUSpersecond = gallonUSpersecond;
			}

			public double getGallonUKperday() {
				return gallonUKperday;
			}

			public void setGallonUKperday(double gallonUKperday) {
				this.gallonUKperday = gallonUKperday;
			}

			public double getGallonUKperhour() {
				return gallonUKperhour;
			}

			public void setGallonUKperhour(double gallonUKperhour) {
				this.gallonUKperhour = gallonUKperhour;
			}

			public double getGallonUKperminute() {
				return gallonUKperminute;
			}

			public void setGallonUKperminute(double gallonUKperminute) {
				this.gallonUKperminute = gallonUKperminute;
			}

			public double getGallonUKpersecond() {
				return gallonUKpersecond;
			}

			public void setGallonUKpersecond(double gallonUKpersecond) {
				this.gallonUKpersecond = gallonUKpersecond;
			}

			public double getKilobarrelUSperday() {
				return kilobarrelUSperday;
			}

			public void setKilobarrelUSperday(double kilobarrelUSperday) {
				this.kilobarrelUSperday = kilobarrelUSperday;
			}

			public double getBarrelUSperday() {
				return barrelUSperday;
			}

			public void setBarrelUSperday(double barrelUSperday) {
				this.barrelUSperday = barrelUSperday;
			}

			public double getBarrelUSperhour() {
				return barrelUSperhour;
			}

			public void setBarrelUSperhour(double barrelUSperhour) {
				this.barrelUSperhour = barrelUSperhour;
			}

			public double getBarrelUSperminute() {
				return barrelUSperminute;
			}

			public void setBarrelUSperminute(double barrelUSperminute) {
				this.barrelUSperminute = barrelUSperminute;
			}

			public double getBarrelUSpersecond() {
				return barrelUSpersecond;
			}

			public void setBarrelUSpersecond(double barrelUSpersecond) {
				this.barrelUSpersecond = barrelUSpersecond;
			}

			public double getAcrefootperyear() {
				return acrefootperyear;
			}

			public void setAcrefootperyear(double acrefootperyear) {
				this.acrefootperyear = acrefootperyear;
			}

			public double getAcrefootperday() {
				return acrefootperday;
			}

			public void setAcrefootperday(double acrefootperday) {
				this.acrefootperday = acrefootperday;
			}

			public double getAcrefootperhour() {
				return acrefootperhour;
			}

			public void setAcrefootperhour(double acrefootperhour) {
				this.acrefootperhour = acrefootperhour;
			}

			public double getHundredcubicfootperday() {
				return hundredcubicfootperday;
			}

			public void setHundredcubicfootperday(double hundredcubicfootperday) {
				this.hundredcubicfootperday = hundredcubicfootperday;
			}

			public double getHundredcubicfootperhour() {
				return hundredcubicfootperhour;
			}

			public void setHundredcubicfootperhour(double hundredcubicfootperhour) {
				this.hundredcubicfootperhour = hundredcubicfootperhour;
			}

			public double getHundredcubicfootperminute() {
				return hundredcubicfootperminute;
			}

			public void setHundredcubicfootperminute(double hundredcubicfootperminute) {
				this.hundredcubicfootperminute = hundredcubicfootperminute;
			}

			public double getOunceperhour() {
				return ounceperhour;
			}

			public void setOunceperhour(double ounceperhour) {
				this.ounceperhour = ounceperhour;
			}

			public double getOunceperminute() {
				return ounceperminute;
			}

			public void setOunceperminute(double ounceperminute) {
				this.ounceperminute = ounceperminute;
			}

			public double getOuncepersecond() {
				return ouncepersecond;
			}

			public void setOuncepersecond(double ouncepersecond) {
				this.ouncepersecond = ouncepersecond;
			}

			public double getOunceUKperhour() {
				return ounceUKperhour;
			}

			public void setOunceUKperhour(double ounceUKperhour) {
				this.ounceUKperhour = ounceUKperhour;
			}

			public double getOunceUKperminute() {
				return ounceUKperminute;
			}

			public void setOunceUKperminute(double ounceUKperminute) {
				this.ounceUKperminute = ounceUKperminute;
			}

			public double getOunceUKpersecond() {
				return ounceUKpersecond;
			}

			public void setOunceUKpersecond(double ounceUKpersecond) {
				this.ounceUKpersecond = ounceUKpersecond;
			}

			public double getCubicyardperhour() {
				return cubicyardperhour;
			}

			public void setCubicyardperhour(double cubicyardperhour) {
				this.cubicyardperhour = cubicyardperhour;
			}

			public double getCubicyardperminute() {
				return cubicyardperminute;
			}

			public void setCubicyardperminute(double cubicyardperminute) {
				this.cubicyardperminute = cubicyardperminute;
			}

			public double getCubicyardpersecond() {
				return cubicyardpersecond;
			}

			public void setCubicyardpersecond(double cubicyardpersecond) {
				this.cubicyardpersecond = cubicyardpersecond;
			}

			public double getCubicfootperhour() {
				return cubicfootperhour;
			}

			public void setCubicfootperhour(double cubicfootperhour) {
				this.cubicfootperhour = cubicfootperhour;
			}

			public double getCubicfootperminute() {
				return cubicfootperminute;
			}

			public void setCubicfootperminute(double cubicfootperminute) {
				this.cubicfootperminute = cubicfootperminute;
			}

			public double getCubicfootpersecond() {
				return cubicfootpersecond;
			}

			public void setCubicfootpersecond(double cubicfootpersecond) {
				this.cubicfootpersecond = cubicfootpersecond;
			}

			public double getCubicinchperhour() {
				return cubicinchperhour;
			}

			public void setCubicinchperhour(double cubicinchperhour) {
				this.cubicinchperhour = cubicinchperhour;
			}

			public double getCubicinchperminute() {
				return cubicinchperminute;
			}

			public void setCubicinchperminute(double cubicinchperminute) {
				this.cubicinchperminute = cubicinchperminute;
			}

			public double getCubicinchpersecond() {
				return cubicinchpersecond;
			}

			public void setCubicinchpersecond(double cubicinchpersecond) {
				this.cubicinchpersecond = cubicinchpersecond;
			}

			public double getPoundpersecond() {
				return poundpersecond;
			}

			public void setPoundpersecond(double poundpersecond) {
				this.poundpersecond = poundpersecond;
			}

			public double getPoundperminute() {
				return poundperminute;
			}

			public void setPoundperminute(double poundperminute) {
				this.poundperminute = poundperminute;
			}

			public double getPoundperhour() {
				return poundperhour;
			}

			public void setPoundperhour(double poundperhour) {
				this.poundperhour = poundperhour;
			}

			public double getPoundperday() {
				return poundperday;
			}

			public void setPoundperday(double poundperday) {
				this.poundperday = poundperday;
			}

			public double getKilogrampersecond() {
				return kilogrampersecond;
			}

			public void setKilogrampersecond(double kilogrampersecond) {
				this.kilogrampersecond = kilogrampersecond;
			}

			public double getKilogramperminute() {
				return kilogramperminute;
			}

			public void setKilogramperminute(double kilogramperminute) {
				this.kilogramperminute = kilogramperminute;
			}

			public double getKilogramperhour() {
				return kilogramperhour;
			}

			public void setKilogramperhour(double kilogramperhour) {
				this.kilogramperhour = kilogramperhour;
			}

			public double getKilogramperday() {
				return kilogramperday;
			}

			public void setKilogramperday(double kilogramperday) {
				this.kilogramperday = kilogramperday;
			}
			
		}
	
	
}
