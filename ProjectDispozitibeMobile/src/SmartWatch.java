
public class SmartWatch extends DispozitivMobil {
	private String sistemeOperareCompatibile,materialCarcasa,tipIncarcare,stilDisplay;
	private boolean activitateMonitorizanta;
	private int numarActivitati;
	private float dimensiuneCarcasa;
	
	public SmartWatch() {
		super();
		sistemeOperareCompatibile=null;
		materialCarcasa=null;
		tipIncarcare=null;
		stilDisplay=null;
		activitateMonitorizanta=false;
		numarActivitati=0;
		dimensiuneCarcasa=0;
		}
	
	public SmartWatch(String brand,float pret,String tipEcran,String tipBaterie,int capacitateBaterie,int autonomie,
			int memorieRam,int stocare,float frecventaProcesor,String culoare,boolean rezistentaApa,String conectivitate,
			String sistemeOperareCompatibile,String materialCarcasa,String tipIncarcare,String stilDisplay,
			boolean activitateMonitorizanta,int numarActivitati,float dimensiuneCarcasa) 
	{
	super( "Smartwatch", brand, pret, tipEcran, tipBaterie, capacitateBaterie, autonomie,
		 memorieRam, stocare, frecventaProcesor, culoare, rezistentaApa, conectivitate);
	this.sistemeOperareCompatibile=sistemeOperareCompatibile;
	this.materialCarcasa=materialCarcasa;
	this.tipIncarcare=tipIncarcare;
	this.stilDisplay=stilDisplay;
	this.activitateMonitorizanta=activitateMonitorizanta;
	this.numarActivitati=numarActivitati;
	this.dimensiuneCarcasa=dimensiuneCarcasa;
		
	}
	
	public SmartWatch(SmartWatch sw)
	{
		super(sw);
		sistemeOperareCompatibile=sw.sistemeOperareCompatibile;
		materialCarcasa=sw.materialCarcasa;
		tipIncarcare=sw.tipIncarcare;
		stilDisplay=sw.stilDisplay;
		activitateMonitorizanta=sw.activitateMonitorizanta;
		numarActivitati=sw.numarActivitati;
		dimensiuneCarcasa=sw.dimensiuneCarcasa;
	}

	public String toString()
	{
		
		return super.toString()+"\n"+
		"Sisteme Operare Compatibile:	"+sistemeOperareCompatibile+"\n"+
		"Material Carcasa:				"+materialCarcasa+"\n"+
		"Tip Incarcare:					"+tipIncarcare+"\n"+
		"Stil Display:					"+stilDisplay+"\n"+
		"Activitate Monitorizanta:		"+((activitateMonitorizanta)? "Da":"Nu")+"\n"+
		"Numar Activitati:				"+numarActivitati+"\n"+
		"Dimensiune Carcasa:			"+dimensiuneCarcasa+"\n"+
		"Accesoriile sunt incluse in pret"+"\n";
	}

	public void setSistemeOperareCompatibile(String sistemeOperareCompatibile)
	{
		this.sistemeOperareCompatibile=sistemeOperareCompatibile;
	}

	public String getSistemeOperareCompatibile()
	{
		return sistemeOperareCompatibile;
	}
	
	public void setMaterialCarcasa(String materialCarcasa)
	{
		this.materialCarcasa=materialCarcasa;
	}

	public String getMaterialCarcasa()
	{
		return materialCarcasa;
	}
	
	public void setTipIncarcare(String tipIncarcare)
	{
		this.tipIncarcare=tipIncarcare;
	}

	public String getTipIncarcare()
	{
		return tipIncarcare;
	}
	
	public void setStilDisplay(String stilDisplay)
	{
		this.stilDisplay=stilDisplay;
	}

	public String getStilDisplay()
	{
		return stilDisplay;
	}
	
	public void setActivitateMonitorizanta(Boolean activitateMonitorizanta)
	{
		this.activitateMonitorizanta=activitateMonitorizanta;
	}
	
	public Boolean getActivitateMonitorizanta()
	{
		return activitateMonitorizanta;
	}
	
	public void setNumarActivitati(int numarActivitati)
	{
		this.numarActivitati=numarActivitati;
	}
	
	public int getNumarActivitati()
	{
		return numarActivitati;
	}
	
	
	public void setDimensiuneCarcasa(float dimensiuneCarcasa)
	{
		this.dimensiuneCarcasa=dimensiuneCarcasa;
	}
	
	public float getDimensiuneCarcasa()
	{
		return dimensiuneCarcasa;
	}
	
	
}