
public class BrataFitness extends DispozitivMobil {
	private String compatibileSistemOper,tipIncarcare;
	private float sensori;
	private int numarActivitati;
	private boolean activitateMonitorizanta;


	 public BrataFitness() {super();compatibileSistemOper=null;
	 tipIncarcare=null;sensori=0;
	 numarActivitati=0;activitateMonitorizanta=false;
	 		
	 		}
	 	
	 	public BrataFitness(String compatibileSistemOper,float sensori, int numarActivitati,String tipIncarcare,boolean activitateMonitorizanta,
	 						DispozitivMobil dm) 
	 	{
	 	super(dm);
	 	this.compatibileSistemOper=compatibileSistemOper;
	 	this.sensori=sensori;
	 	this.numarActivitati=numarActivitati;
	 	this.tipIncarcare=tipIncarcare;
	 	this.activitateMonitorizanta=activitateMonitorizanta;
	 		
	 	}
	 	
	 	public BrataFitness(BrataFitness bf)
	 	{
	 		super(bf);
	 		compatibileSistemOper=bf.compatibileSistemOper;
		 	sensori=bf.sensori;
		 	numarActivitati=bf.numarActivitati;
		 	tipIncarcare=bf.tipIncarcare;
		 	activitateMonitorizanta=bf.activitateMonitorizanta;
	 	}

		public String toString()
	 	{
	 		return super.toString()+"\n"+
	 		"compatibileSistemOper:"+compatibileSistemOper+"\n"+
	 		"sensori:"+sensori+"\n"+
	 		"tipIncarcare:"+tipIncarcare+"\n"+
	 		"activitateMonitorizanta:"+activitateMonitorizanta+"\n"+
	 		"numarActivitati:"+numarActivitati;
	 		
	 	}

	 	public void setcompatibileSistemOper(String compatibileSistemOper)
	 	{
	 		this.compatibileSistemOper=compatibileSistemOper;
	 	}

	 	public String getcompatibileSistemOper()
	 	{
	 		return compatibileSistemOper;
	 	}
	 	
	 	
	 	public void setTipIncarcare(String tipIncarcare)
	 	{
	 		this.tipIncarcare=tipIncarcare;
	 	}

	 	public String getTipIncarcare()
	 	{
	 		return tipIncarcare;
	 	}
	 	
	 	public void setSensori(float sensori)
	 	{
	 		this.sensori=sensori;
	 	}

	 	public float getSensori()
	 	{
	 		return sensori;
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
	 	
	 	
	 
	
}
