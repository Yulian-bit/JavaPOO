
public class DispozitivMobil {
	private String dispozitiv,brand,tipEcran,tipBaterie,culoare,conectivitate;
	private int capacitateBaterie,autonomie,memorieRam,stocare;
	private float pret,frecventaProcesor;
	private boolean rezistentaApa;
	
	public DispozitivMobil(){
		dispozitiv=null;
		brand=null;
		tipEcran=null;
		tipBaterie=null;
		culoare=null;
		conectivitate=null;
		capacitateBaterie=0;
		autonomie=0;
		memorieRam=0;
		stocare=0;
		pret=0;
		frecventaProcesor=0;
		rezistentaApa=false;
	};
	
	public DispozitivMobil(String dispozitiv,String brand,float pret,String tipEcran,String tipBaterie,int capacitateBaterie,int autonomie,
						int memorieRam,int stocare,float frecventaProcesor,String culoare,boolean rezistentaApa,String conectivitate)
	{
		this.dispozitiv=dispozitiv;
		this.brand=brand;
		this.pret=pret;
		this.tipEcran=tipEcran;
		this.tipBaterie=tipBaterie;
		this.capacitateBaterie=capacitateBaterie;
		this.autonomie=autonomie;
		this.memorieRam=memorieRam;
		this.stocare=stocare;
		this.frecventaProcesor=frecventaProcesor;
		this.culoare=culoare;
		this.rezistentaApa=rezistentaApa;
		this.conectivitate=conectivitate;
		
	}

	public DispozitivMobil(DispozitivMobil dm)
{
	dispozitiv=dm.dispozitiv;
	brand=dm.brand;
	pret=dm.pret;
	tipEcran=dm.tipEcran;
	tipBaterie=dm.tipBaterie;
	capacitateBaterie=dm.capacitateBaterie;
	autonomie=dm.autonomie;
	memorieRam=dm.memorieRam;
	stocare=dm.stocare;
	frecventaProcesor=dm.frecventaProcesor;
	culoare=dm.culoare;
	rezistentaApa=dm.rezistentaApa;
	conectivitate=dm.conectivitate;
}

public String toString()
{
	return 
			"Dispozitiv:"+dispozitiv+"\n"+
	"Brand:"+brand+"\n"+
	"Pret:"+pret+"\n"+
	"Tip Ecran:"+tipEcran+"\n"+
	"Tip Baterie:"+tipBaterie+"\n"+
	"Capacitate Baterie:"+capacitateBaterie+"\n"+
	"Autonomie:"+autonomie+"\n"+
	"Memorie Ram:"+memorieRam+"\n"+
	"Stocare:"+stocare+"\n"+
	"Frecventa Procesor:"+frecventaProcesor+"\n"+
	"Culoare:"+culoare+"\n"+
	"Rezistenta Apa:"+((rezistentaApa)? "Da":"Nu")+"\n"+
	"Conectivitate:"+conectivitate;
	
}

public void setDispozitiv(String dispozitiv)
{
	this.dispozitiv=dispozitiv;
}

public String getDispozitiv()
{
	return dispozitiv;
}


public void setBrand(String brand)
{
	this.brand=brand;
}

public String getBrand()
{
	return brand;
}

public void setPret(float pret)
{
	this.pret=pret;
}

public float getPret()
{
	return pret;
}

public void setTipEcran(String tipEcran)
{
	this.tipEcran=tipEcran;
}

public String getTipEcran()
{
	return tipEcran;
}

public void setTipBaterie(String tipBaterie)
{
	this.tipBaterie=tipBaterie;
}

public String getTipBaterie()
{
	return tipBaterie;
}

public void setCapacitateBaterie(int capacitateBaterie)
{
	this.capacitateBaterie=capacitateBaterie;
}

public int getCapacitateBaterie()
{
	return capacitateBaterie;
}

public void setAutonomie(int autonomie)
{
	this.autonomie=autonomie;
}

public int getAutonomie()
{
	return autonomie;
}

public void setMemorieRam(int memorieRam)
{
	this.memorieRam=memorieRam;
}

public int getMemorieRam()
{
	return memorieRam;
}

public void setStocare(int stocare)
{
	this.stocare=stocare;
}

public int getstocare()
{
	return stocare;
}

public void setFrecventaProcesor(float frecventaProcesor)
{
	this.frecventaProcesor=frecventaProcesor;
}

public float getFrecventaProcesor()
{
	return frecventaProcesor;
}

public void setCuloare(String culoare)
{
	this.culoare=culoare;
}

public String getCuloare()
{
	return culoare;
}

public void setRezistentaApa(boolean rezistentaApa)
{
	this.rezistentaApa=rezistentaApa;
}

public boolean getRezistentaApa()
{
	return rezistentaApa;
}

public void setConectivitate(String conectivitate)
{
	this.conectivitate=conectivitate;
}

public String getConectivitate()
{
	return conectivitate;
}




}
