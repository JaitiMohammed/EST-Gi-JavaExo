
	/**
	 * 
	 */
	/**
	 * @author Mohammed Jait
	 * @version 0.1
	 * @sujet H�ritage et polymorphisme
	 *  
	 */
package jaiti_revision;
	import java.lang.String;
	abstract class Personne {
		//une personne
		protected String nom;
		protected String prenom;
		protected String rue;
		protected String ville;
		protected static int nbPersonne=0;
		//constructeur de Personne
		
		Personne(String nom , String prenom , String rue , String ville){
			this.nom=nom;
			this.prenom=prenom;
			this.rue=rue;
			this.ville=ville;
			nbPersonne++;
		}
		// fournir les carat�ristiques d'une Personne sous forme d'un objet de la classe String


		public String toString() {
			return  nom + "   " + prenom + "  " + rue + "   " + ville ;
		}
		
		abstract void ecrirePersonne(); // � redifir dans les classes suivantes
		
		static void nbPersonne() {
			System.out.println(
					"\nNombre d'employ�s : " + nbPersonne +
					"\nNombre de secr�taires : " + Secretaire.nbSecretaires() +
					"\nNombre d�enseignants : " + Enseignant.nbEnseignants() +
					"\nNombre d��tudiants : " + Etudiant.nbEtudiants()
					);
		}
		public String getRue() {
			return rue;
		}


		public void setRue(String rue) {
			this.rue = rue;
		}


		public String getVille() {
			return ville;
		}


		public void setVille(String ville) {
			this.ville = ville;
		}
		//abstract void modifierPersonne ();


		void modifierPersonne(String rue, String ville) {
			this.rue=rue;
			this.ville=ville;
			ecrirePersonne();
			
		}
}
