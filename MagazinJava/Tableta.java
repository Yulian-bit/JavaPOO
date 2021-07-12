
public class Tableta extends DispozitivMobil {
	private boolean incarcareRapida;
	private String porturi;
	private int numarNuclee;
	private String redareVideo;
	private boolean cardSD;

Tableta(){
	super();
	incarcareRapida=false;
	porturi=null;
	numarNuclee=0;
	redareVideo=null;
	cardSD=false;
}
 public Tableta (boolean incarcareRapida,String porturi,int numarNuclee,
 String redareVideo,boolean cardSD,DispozitivMobil dm)
 {	  super(dm);
	  this.incarcareRapida=incarcareRapida;
	  this.porturi=porturi;
	  this.numarNuclee=numarNuclee;
	  this.redareVideo=redareVideo;
	  this.cardSD=cardSD;
			  
 }

public Tableta(Tableta tab) {
	  super(tab);
	  incarcareRapida=tab.incarcareRapida;
	  porturi=tab.porturi;
	  numarNuclee=tab.numarNuclee;
	  redareVideo=tab.redareVideo;
	  cardSD=tab.cardSD;
}

public String toString()
{
	return  super.toString()+"\n"+
	"incarcareRapida:"+incarcareRapida+"\n"+
	"porturi:"+porturi+"\n"+
	"numarNuclee:"+numarNuclee+"\n"+
	"redareVideo:"+redareVideo+"\n"+
	"cardSD:"+cardSD+"\n";
	
}

public void setIncarcareRapida(boolean incarcareRapida)
	{
	  this.incarcareRapida=incarcareRapida;
	}
	
	public boolean getIncarcareRapida()
	{
		return incarcareRapida;

}

	public void setPorturi(String porturi)
	{
	  this.porturi=porturi;
	}
	
	public String getPorturi()
	{
		return porturi;

}
	public void setNumarNuclee(int numarNuclee)
	{
	  this.numarNuclee=numarNuclee;
	}
	
	public int getNumarNuclee()
	{
		return numarNuclee;
	}
	public void setRedareVideo(String redareVideo)
	{
	  this.redareVideo=redareVideo;
	}
	
	public String getRedareVideo()
	{
		return redareVideo;

}
	public void setCardSD(boolean cardSD)
	{
	  this.cardSD=cardSD;
	}
	
	public boolean getCardSD()
	{
		return cardSD;

}

}
