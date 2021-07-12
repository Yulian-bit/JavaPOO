public class Test {

	public static void main(String[] args) {
		//Declarare instante
		DispozitivMobil dm1,dm2,dm3;
		Telefon tlf,tlf1,tlf2;
		Tableta tab,tab1,tab2;

		
		 
        
		 //Initilizarea celor 3 instante ale clasei dispozitiv
		 dm1=new DispozitivMobil("Telefon","Apple",2500.0f,"Led","Li-Po",3500,48,16,64,3.2f,"Negru",true,"Bluetooth");
		 dm2=new DispozitivMobil("Tableta","Lenovo",5000.0f,"Qled","Li-Po",6000,20,32,128,4f,"Negru",true,"Bluetooth Wi-fi");
		 dm3=new DispozitivMobil("Bratara Fitness","Huawei",299.99f,"Amoled",
					"Li-Po",2000,144,0,0,1.3f,"Negru",true,"Bluetooth");
		 
		 //Initializarea celor 3 instante ale fiecare clasa copil 
		 tlf=new Telefon();//Constructor fara argumente  
		 tlf1=new Telefon("Touchscreen",true,"micro","Ios",220,16.0f,dm1);//Constructor cu argumente  
		 tlf2=new Telefon(tlf1);//Constructor de copiere


			for(int i=0;i<=20;i++)
				System.out.print("-");
			   System.out.println();
			   
			// Produsele cu pretul mai mare de 1000
			DispozitivMobil[] dm=new DispozitivMobil[4]; //Declararea vectorului de instante
			dm[0]=tlf1;
			dm[1]=tab1;
			dm[2]=sw1;
			dm[3]=bf1;

			for(Telefon t: obj)
			{
				 t.verificare("958274-44-7888888873")

			
	}

}
