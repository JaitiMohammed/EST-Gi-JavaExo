
public class Capitale extends Ville {
	
	private String pays;
	
	//constructeurs
	public Capitale(String leNom,String lePays) {
		super(leNom);
		pays=lePays;
	}

	public Capitale(String leNom, String lePays,int leNbHab) {
		super(leNom, leNbHab);
		pays=lePays;
	}
	public String getPays( )
	{
	return pays;
	}
	public void setPays(String nomPays)
	{
	pays = nomPays;
	}
	//m�thode presente Toi redf�nie
	
	public String presenteToi() {
		String presente=super.presenteToi();
		presente=presente + " | Capital de : " + pays;
		return presente;
	}
}
