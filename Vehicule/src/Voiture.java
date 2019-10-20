class Voiture extends Vehicule {
	
	private double cylindree;
	private int nbPortes;
	private double puissance;
	private double kilometrage;

	public Voiture(String marque, int date, double prix,
			double cylindree, int portes, double cv, double km) {
		super(marque, date, prix);
		this.cylindree = cylindree;
		nbPortes = portes;
		puissance = cv;
		kilometrage = km;
	}

	public void calculePrix(int anneActuelle) {
	  double decote = (anneActuelle - getDateAchat()) * .02;
		// On force le type en int de manière �  arrondir le résultat
		// On verra dans quelques semaines une manière plus élégante de faire
		// ce genre de choses...
		decote += 0.05 * (int)(kilometrage / 10000);
		if ((getMarque() == "Fiat") || (getMarque() == "Renault")) {
			decote += 0.1;
		} else if ((getMarque() == "Ferrari") || (getMarque() == "Porsche")) {
			decote -= 0.2;
		}

		setPrixCourant(Math.max(0.0, (1.0 - decote) * getPrixAchat()));
	}

	public void affiche() {
		System.out.println(" ---- Voiture ----");
		super.affiche();
		System.out.println(cylindree + " litres, "
				+ nbPortes + " portes, "
				+ puissance + " CV, "
				+ kilometrage + " km.");
	}
}
