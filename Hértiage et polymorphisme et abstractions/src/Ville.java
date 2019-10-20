
import java.lang.String; // util scanner  et lang pour scanner
class Ville {

	private String nom; // le nom ne sera accessible que par la classe ville et pas par la classe Capital
	protected int nbHab; // sera accessible par la classe capital
	
	public Ville(String leNom) {
		nom = leNom.toUpperCase();
		nbHab=-1; // -1 sinigie que le nombre d'ahibtant est inconnu
	}
	
	public Ville(String leNom , int leNbHab) {
		nom=leNom.toUpperCase();
		if(leNbHab < 0) {
			System.out.println("Un nombre d'ahibtant doit etre positif ");
			nbHab=-1;
		}else
			nbHab=leNbHab;
	}
	public String getNom() {
		return nom;
	}
	
	// illogique de changer le nom du viile
	
	public void setNbHab(int nvNbHab) {
		if(nvNbHab < 0)
			System.out.println("un nombre d'habitant doit etre positf , la modification n'a pas été pruse en compte");
		else
			nbHab=nvNbHab;
	}
	
	public String presenteToi() {
		String presente="Ville  | " + nom + "  | nombre d'habitants";
		if(nbHab==-1)
			presente=presente+" inconnu";
		else
			presente=presente+" = " + nbHab;
		return presente;
	}
	
}
