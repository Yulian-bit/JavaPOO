
public class AccesoriiBrataFitness extends DispozitivMobil {
	private String materialBrata,culoareBrata;
	private int lungimeBrata,greutate;
	
	
	
	AccesoriiBrataFitness(){
		materialBrata=null;
		culoareBrata=null;
		lungimeBrata=0;
		greutate=0;
	}
	
	
	public AccesoriiBrataFitness(String materialBrata,int lungimeBrata,String culoareBrata,int greutate)
	{   
		this.materialBrata=materialBrata;
		this.lungimeBrata=lungimeBrata;
		this.culoareBrata=culoareBrata;
		this.greutate=greutate;
	}
	
	
	public AccesoriiBrataFitness(AccesoriiBrataFitness abf)
	{
		materialBrata=abf.materialBrata;
		lungimeBrata=abf.lungimeBrata;
		culoareBrata=abf.culoareBrata;
		greutate=abf.greutate;
		
	}

	
	public String toString()
	{
		return "materialBrata:"+materialBrata+"\n"+
		"lungimeBrata:"+lungimeBrata+"\n"+
		"culoareBrata:"+culoareBrata+"\n"+
		"greutate:"+greutate+"\n";
		
	}
	
	
	
	public void setMaterialBrata(String materialBrata)
	{
		this.materialBrata=materialBrata;
	}
	
	public String getMaterialBrata()
	{
		return materialBrata;
	}

	public void setLungimeBrata(int lungimeBrata)
	{
		this.lungimeBrata=lungimeBrata;
	}
	
	public int getLungimeCurea()
	{
		return lungimeBrata;
	}
	
	public void setCuloareBrata(String culoareBrata)
	{
		this.culoareBrata=culoareBrata;
	}
	
	public String getCuloareBtrata()
	{
		return culoareBrata;
	}
	
	public void setGreutate(int greutate)
	{
		this.greutate=greutate;
	}
	
	public int getGreutate()
	{
		return greutate;
	}
	
	


}
