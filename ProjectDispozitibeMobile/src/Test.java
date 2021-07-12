import java.util.Scanner;

import java.util.Scanner;

public class Test {
	DispozitivMobil dm1,dm2,dm3,dm4,dm5,dm6,dm7,dm8,dm9,dm10,dm11,dm12;
	
	Telefon tlf,tlf1,tlf2,tlf3,tlf4;
	Tableta tab,tab1,tab2,tab3,tab4,tab5;
	
	SmartWatch sw,sw1,sw2,sw3,sw4,sw5;
	AccesoriiSmartWatch asw,asw1,asw2,asw3,asw4,asw5;
	
	BrataFitness bf,bf1,bf2,bf3,bf4,bf5;
	AccesoriiBrataFitness abf,abf1,abf2,abf3,abf4,abf5;
	
	DispozitivMobil[] dsp=new DispozitivMobil[16];
	DispozitivMobil[] dm=new DispozitivMobil[4]; 

	Telefon[] tln=new Telefon[4];
 	Tableta[] tbl=new Tableta[4];
 	
	SmartWatch[] sh=new SmartWatch[4];
 	AccesoriiSmartWatch ash[]=new AccesoriiSmartWatch[4];

 	BrataFitness[] bs = new BrataFitness[4];
 	AccesoriiBrataFitness[] abs = new AccesoriiBrataFitness[4];
 	
	 Test() {
	
	
		 
        
		 //Initilizarea celor 3 instante ale clasei dispozitiv
		 dm1=new DispozitivMobil("Telefon","Apple",2500.0f,"LED","Li-Po",3500,48,16,64,3.2f,"Negru",true,"Bluetooth");
		 dm2=new DispozitivMobil("Tableta","Lenovo",5000.0f,"OLED","Li-Po",6000,20,32,128,4f,"Negru",true,"Bluetooth/Wi-fi");
		 dm3=new DispozitivMobil("Bratara Fitness","Huawei",299.99f,"AMOLED",
					"Li-Po",2000,144,0,0,1.3f,"Negru",true,"Bluetooth");
		 
		 dm4=new DispozitivMobil("Telefon","Samsung",4800.0f,"AMOLED","Li-Po",4000,32,16,64,4.2f,"Alb",true,"Bluetooth/Wi-fi");
         dm5=new DispozitivMobil("Telefon","Xiaomi",1500.0f,"LED","Li-Po",5000,60,16,64,1.2f,"Albastru",true,"Bluetooth/Wi-fi");
         dm6=new DispozitivMobil("Telefon","LG",3000.0f,"OLED","Li-Po",4200,48,16,64,6.2f,"Mov",true,"Bluetooth/Wi-fi");
         
         dm7=new DispozitivMobil("Tableta","Apple",6500.0f,"OLED","Li-Po",4000,25,24,114,4f,"Argintiu",false,"Bluetooth/Wi-fi");
         dm8=new DispozitivMobil("Tableta","Huawei",4000.0f,"QLED","Li-Po",3200,15,18,128,9f,"Turcoaz",true,"Bluetooth/Wi-fi");
         dm9=new DispozitivMobil("Tableta","Samsung",5500.0f,"SUPER-AMOLED","Li-Po",5500,39,64,164,4f,"Smarald",true,"Bluetooth/Wi-fi");
		 
         dm10=new DispozitivMobil("Bratara Fitness","Samsung",115.56f,"OLED",
					"Li-Po",500,75,0,0,1f,"Alb",true,"Niciuna");
         dm11=new DispozitivMobil("Bratara Fitness","Oppo",885.87f,"LED",
					"Li-Po",1000,126,0,0,1.25f,"Argintiu",true,"Bluetooth");
         dm12=new DispozitivMobil("Bratara Fitness","Xiaomi",434.67f,"AMOLED",
					"Li-Po",1200,135,0,0,1.3f,"Negru",true,"Bluetooth");
		 
		 //Initializarea celor 3 instante ale fiecare clasa copil 
		 tlf=new Telefon();//Constructor fara argumente  
		 tlf1=new Telefon("Touchscreen",true,"micro","Ios",220,16.0f,dm1);//Constructor cu argumente  
		 tlf2=new Telefon(tlf1);//Constructor de copiere
		 tlf2=new Telefon("Touchscreen",true,"micro","Android",115,32.0f,dm4);
         tlf3=new Telefon("Touchscreen",true,"micro","Android",95,8.0f,dm5);
         tlf4=new Telefon("Touchscreen",true,"micro","Windows",165,26.0f,dm6);
         
		 tab=new Tableta();
		 tab1=new Tableta(true,"USB",4,"8K",true,dm2);
		 tab2=new Tableta(tab1);
		 tab2=new Tableta(false,"Lightning",4,"4k",true,dm7);
         tab3=new Tableta(true,"USB 3.0",4,"2160p",true,dm8);
         tab4=new Tableta(true,"USB-C",4,"8K",true,dm9);
		 
		 
		 sw=new SmartWatch();
		 sw1=new SmartWatch("Samsung",500.0f,"IPS","Li-Ion",890,120,
					2,16,2.7f,"Argintiu",false,"Bluetooth",
					"Android,Ios","Metal","Magnetic","Rotund",
					true,24,22.5f);
		 sw2=new SmartWatch(sw1);
		 sw3=new SmartWatch("Oppo",1350.0f,"AMOLED","Li-Po",510,45,
				 	2,8,1.2f,"Negru",true,"Bluetooth/Wi-Fi",
				 	"Android","Aluminiu","Wireless","Patrat",
				 	true,32,23.4f);
		 sw4=new SmartWatch("Apple",5590.72f,"OLED","Li-Ion",1560,240,
				 	1,32,1.3f,"Alb",true,"Bluetooth/Wi-Fi",
				 	"Ios","Aluminiu","Wireless","Oval",
				 	true,48,25.2f);
		 sw5=new SmartWatch("Smart Wear",202.30f,"IPS","Li-Po",400,70,
				 	0,0,1f,"Albastru",false,"Niciuna",
				 	"Android/Ios","Plastic","Magnetic","Rotund",
				 	true,9,14.1f);
		 
		 asw=new AccesoriiSmartWatch();
		 asw1=new AccesoriiSmartWatch("Piele",22,"Negru",240,1.1f,false,false,true);
		 asw2=new AccesoriiSmartWatch(asw1);
		 asw3=new AccesoriiSmartWatch("Silicon",21,"Maro",230,0.97f,true,false,true);
		 asw4=new AccesoriiSmartWatch("Piele",22,"Cafeniu",250,1.5f,true,true,true);
		 asw5=new AccesoriiSmartWatch("Silicon",21,"Violet",220,1.0f,false,false,false);
		 
		 bf=new BrataFitness();	   
	     bf1=new BrataFitness("Android",52.6f,14,"Magnetic",true,dm3);
		 bf2=new BrataFitness(bf1);
		 bf3 = new BrataFitness("Android/Ios",62.7f,15,"Wirless",true,dm9);
         bf4 = new BrataFitness("Android/Ios",100.7f,40,"Wireless/Magnetic",true,dm10);
         bf5 = new BrataFitness("Android/Ios",58.4f,19,"Magnetic",true,dm11);
	     
	     abf=new AccesoriiBrataFitness();
		 abf1=new AccesoriiBrataFitness("Piele",46,"Galben",100);
		 abf2=new AccesoriiBrataFitness(abf1);			
		 abf3 = new AccesoriiBrataFitness("Plastic",46,"Negru",100);
		 abf4 = new AccesoriiBrataFitness("Piele",48,"Negru",120);
		 abf5 = new AccesoriiBrataFitness("Sintetic",50,"Verde",95);
		 	dsp[0]=dm1;
		 	dsp[1]=dm2;
		 	dsp[2]=dm3;
		 	
		 	//Dispozitive Mobile - Telefoane
		 	dsp[3]=dm4;
		    dsp[4]=dm5;
		    dsp[5]=dm6;
		 	
		 	
		 	//Dispozitive Mobile - Tablete
		 	dsp[6]=dm7;
		 	dsp[7]=dm8;
		    dsp[8]=dm9;
		 	 
		 	
			//Dispozitive Mobile - SmartWatch
		 	dsp[9]=new DispozitivMobil(sw2);
		 	dsp[10]=new DispozitivMobil(sw3);
		 	dsp[11]=new DispozitivMobil(sw4);
		 	dsp[12]=new DispozitivMobil(sw5);
		 	
		 	
		 	//Dispozitive Mobile - Bratara Fitness
		 	dsp[13]=new DispozitivMobil(dm10);
		 	dsp[14]=new DispozitivMobil(dm11);
		 	dsp[15]=new DispozitivMobil(dm12);
		 	 
			
		 	//Telefon+Tableta Vectori
		 	tln[0]=tlf1;
		 	tln[1]=tlf2;
		 	tln[2]=tlf3;
		 	tln[3]=tlf4;
		 	
		 	tbl[0]=tab1;
		 	tbl[1]=tab2;
		 	tbl[2]=tab3;
		 	tbl[3]=tab4;
		 	
		 	//SmartWatch+Accesorii Vectori
		 	sh[0]=sw2;
		 	sh[1]=sw3;
		 	sh[2]=sw4;
		 	sh[3]=sw5;
		 	
		 	ash[0]=asw2;
		 	ash[1]=asw3;
		 	ash[2]=asw4;
		 	ash[3]=asw5;
		 	
		 	
		 	//VBrataFitness+Accesorii Vectori
		 	bs[0]=bf1;
		 	bs[1]=bf3;
		 	bs[2]=bf4;
		 	bs[3]=bf5;
		 	
		 	abs[0]=abf1;
		 	abs[1]=abf3;
		 	abs[2]=abf4;
		 	abs[3]=abf5;
		 	
		 	dm[0]=tlf1;
			dm[1]=tab1;
			dm[2]=sw1;
			dm[3]=bf1;
			
			
	
			
	}

}
