
public class Telefon extends DispozitivMobil {
	private String interactiuneUtilizator;
	private boolean slotSim;
	private String tipSim;
	private String sistemOperare;
	private int greutateTelefon;
	private float rezolutieCamera;
 
 Telefon(){
	 super();
	 interactiuneUtilizator=null;
	 slotSim=false;
	 tipSim=null;
	 sistemOperare=null;
	 greutateTelefon=0;
	 rezolutieCamera=0;
 }
 
  public Telefon(String interactiuneUtilizator,boolean slotSim,String tipSim,
		       String sistemOperare,int greutateTelefon,float rezolutieCamera,DispozitivMobil dm) {
	  super(dm);
	  this.interactiuneUtilizator=interactiuneUtilizator;
	  this.slotSim=slotSim;
	  this.tipSim=tipSim;
	  this.sistemOperare=sistemOperare;
	  this.greutateTelefon=greutateTelefon;
	 this.rezolutieCamera=rezolutieCamera;
  }
  
  public Telefon(Telefon tlf)
	{
	  super(tlf);
	  interactiuneUtilizator=tlf.interactiuneUtilizator;
	  slotSim=tlf.slotSim;
	  tipSim=tlf.tipSim;
	  sistemOperare=tlf.sistemOperare;
	  greutateTelefon=tlf.greutateTelefon;
	  rezolutieCamera=tlf.rezolutieCamera;
	}
  
  public String toString()
	{
		return super.toString()+"\n"+
		"interactiuneUtilizator:"+interactiuneUtilizator+"\n"+
		"slotSim:"+slotSim+"\n"+
		"tipSim:"+tipSim+"\n"+
		"sistemOperare:"+sistemOperare+"\n"+
		"greutateTelefon:"+greutateTelefon+"\n"+
		"rezolutieCamera:"+rezolutieCamera+"\n";
		
	}
  
  public void setInteractiuneUtilizator(String interactiuneUtilizator)
	{
	  this.interactiuneUtilizator=interactiuneUtilizator;
	}
	
	public String getInteractiuneUtilizator()
	{
		return interactiuneUtilizator;
	}
	public void setSlotSim(boolean slotSim)
	{
	  this.slotSim=slotSim;
	}
	
	public boolean getSlotSim()
	{
		return slotSim;
	}
	public void setTipSim(String tipSim)
	{
	  this.tipSim=tipSim;
	}
	
	public String getTipSim()
	{
		return tipSim;
	}
	public void setSistemOperare(String sistemOperare)
	{
	  this.sistemOperare=sistemOperare;
	}
	
	public String getSistemOperare()
	{
		return sistemOperare;
	}
	public void setGreutateTelefon(int greutateTelefon)
	{
	  this.greutateTelefon=greutateTelefon;
	}
	
	public int getGreutateTelefon()
	{
		return greutateTelefon;
	}
	public void setRezolutieCamera(float rezolutieCamera)
	{
	  this.rezolutieCamera=rezolutieCamera;
	}
	
	public float getRezolutieCamera()
	{
		return rezolutieCamera;
	}
	
}




