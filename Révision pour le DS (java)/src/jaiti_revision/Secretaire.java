package jaiti_revision;

class Secretaire extends Personne {
	private String numeroBureau;
	private static int nbSecretaires = 0; // nombre de Secretaire
	
	public Secretaire (String nom, String prenom, String rue, String ville,
	String numeroBureau) {
	// le constructeur de la super-classe
	super (nom, prenom, rue, ville); // appel du constructeur Personne
	this.numeroBureau = numeroBureau;
	nbSecretaires++;
	}
	public String toString () {
	// super.toString() : toString() de la super-classe
	return super.toString() + "\n N°bureau : " + numeroBureau;
	}
	@Override
	void ecrirePersonne () {
	System.out.println ("Secrétaire : " + toString());
	}
	static int nbSecretaires () { return nbSecretaires; }

  }
