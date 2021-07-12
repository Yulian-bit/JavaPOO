
public class AccesoriiSmartWatch extends DispozitivMobil {
	private String materialCurea,culoareCurea;
	private int lungimeCurea,incarcator;
	private float cabluIncarcare;
	private boolean folieProtectie,husaProtectie,ramaCadran;
	
	AccesoriiSmartWatch(){
		super();
		materialCurea=null;
		culoareCurea=null;
		lungimeCurea=0;
		incarcator=0;
		folieProtectie=false;
		husaProtectie=false;
		ramaCadran=false;}
	
	public AccesoriiSmartWatch(String materialCurea,int lungimeCurea,String culoareCurea,int incarcator,
			float cabluIncarcare,boolean folieProtectie,boolean husaProtectie,boolean ramaCadran)
	{
		this.materialCurea=materialCurea;
		this.lungimeCurea=lungimeCurea;
		this.culoareCurea=culoareCurea;
		this.incarcator=incarcator;
		this.cabluIncarcare=cabluIncarcare;
		this.folieProtectie=folieProtectie;
		this.husaProtectie=husaProtectie;
		this.ramaCadran=ramaCadran;
	}
	
	public AccesoriiSmartWatch(AccesoriiSmartWatch asw)
	{	super(asw);
		materialCurea=asw.materialCurea;
		lungimeCurea=asw.lungimeCurea;
		culoareCurea=asw.culoareCurea;
		incarcator=asw.incarcator;
		cabluIncarcare=asw.cabluIncarcare;
		folieProtectie=asw.folieProtectie;
		husaProtectie=asw.husaProtectie;
		ramaCadran=asw.ramaCadran;
	}
	
	public String toString()
	{
		return "Material Curea:"+materialCurea+"\n"+
		"Lungime Curea:"+lungimeCurea+"\n"+
		"Culoare Curea:"+culoareCurea+"\n"+
		"Incarcator:"+incarcator+"\n"+
		"Cablu Incarcare:"+cabluIncarcare+"\n"+
		"Folie Protectie:"+((folieProtectie)? "Da":"Nu")+"\n"+
		"Husa Protectie:"+((husaProtectie)? "Da":"Nu")+"\n"+
		"Rama Cadran:"+((ramaCadran)? "Da":"Nu")+"\n";
	}
	
	public void setMaterialCurea(String materialCurea)
	{
		this.materialCurea=materialCurea;
	}
	
	public String getMaterialCurea()
	{
		return materialCurea;
	}

	public void setLungimeCurea(int lungimeCurea)
	{
		this.lungimeCurea=lungimeCurea;
	}
	
	public int getLungimeCurea()
	{
		return lungimeCurea;
	}
	
	public void setCuloareCurea(String culoareCurea)
	{
		this.culoareCurea=culoareCurea;
	}
	
	public String getCuloareCurea()
	{
		return culoareCurea;
	}
	
	public void setIncarcator(int incarcator)
	{
		this.incarcator=incarcator;
	}
	
	public int getIncarcator()
	{
		return incarcator;
	}
	
	public void setCabluIncarcare(float cabluIncarcare)
	{
		this.cabluIncarcare=cabluIncarcare;
	}
	
	public float getCabluIncarcare()
	{
		return cabluIncarcare;
	}
	
	public void setFolieProtectie(boolean folieProtectie)
	{
		this.folieProtectie=folieProtectie;
	}
	
	public boolean getFolieProtectie()
	{
		return folieProtectie;
	}
	
	public void setHusaProtectie(boolean husaProtectie)
	{
		this.husaProtectie=husaProtectie;
	}
	
	public boolean getHusaProtectie()
	{
		return husaProtectie;
	}	
	
	public void setRamaCadran(boolean ramaCadran)
	{
		this.ramaCadran=ramaCadran;
	}
	
	public boolean getRamaCadran()
	{
		return ramaCadran;
	}	
	
	
	
}
