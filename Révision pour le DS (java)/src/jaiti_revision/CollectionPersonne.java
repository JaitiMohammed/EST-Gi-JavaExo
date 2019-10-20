package jaiti_revision;
import java.util.ArrayList;
import java.util.List;

public class CollectionPersonne {

	ArrayList<Personne> persons = new ArrayList<>();
	public CollectionPersonne(){
	}
	
	void ajouterPersonne(Personne p) {
		persons.add(p);
	}
	void AffichePersonneAvant() {
		for(Personne p : persons)
			p.ecrirePersonne();
	}
	void affichenombrePersonne() {
		  Personne.nbPersonne();
	}
}
