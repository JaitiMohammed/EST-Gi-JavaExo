package jaiti_revision;

public class Ppersonne {

	public static void main(String[] args) {
		
		CollectionPersonne m= new CollectionPersonne();
		Secretaire chantal = new Secretaire ("Dupond", "Chantal",
				"rue des mimosas", "Rennes", "A123");
		Enseignant michel = new Enseignant ("Martin", "Michel",
				"bd St-Antoine", "Rennes", "Maths");
		Etudiant e1 = new Etudiant ("Martin", "Guillaume",
				"bd St-Jacques", "Bordeaux", "licence info");
		Etudiant e2 = new Etudiant ("Dufour", "Stéphanie",
				"rue des saules", "Lyon", "DUT info");
		m.ajouterPersonne(chantal);
		m.ajouterPersonne(michel);
		m.ajouterPersonne(e1);
		m.ajouterPersonne(e2);
		m.AffichePersonneAvant();
		m.affichenombrePersonne();
		System.out.println ("\n\nAprès modification :");
		chantal.modifierPersonne ("rue des sorbiers", "Nantes");
		michel.modifierPersonne ("rue des lilas", "Rennes");
	}
}
