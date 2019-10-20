
class Courrier {
    // retourne le montant n'ecessaire pour affranchir le courrier
    // en mode d'exp'edition normal
    
    // on va faire une chose tre`s vilaine parcequ'on ne connait pas les
    // m'ethodes abstraites : on va lui donner un corps arbitrairement
    // d'efini (car on ne sait pas la d'efinir proprement
    // a` ce niveau de la hi'erarchie
    public double affranchirNormal(){return 0;};
    // la bonne solution consiste a` d'eclarer cette m'ethode comme suit:
    // abstract private double affranchirNormal();
    // lorsque vous aurez vu le cours 8, expliquez pourquoi...
    
    // les attributs (communs aux lettres et colis):
    private double poids;
    private boolean express;
    private String adresse;

    // un constructeur possible pour la classe
    public Courrier(double poids, boolean express, String adresse) {
        this.poids = poids;
        this.express = express;
        this.adresse = adresse;
    }

        // un getter pour le poids (car utile dans les sous-classe)
    public double getPoids() {
        return poids;
    }

    // retourne le montant n'ecessaire pour affranchir le courrier.
    // elle appelle affranchirNormal et retourne le double de ce montant
    // si le mode d'exp'edition est  express ('eviter la duplication du code
    // qui double le montant dans les m'ethodes affranchir-normal
    // des sous-classes)
    public double affranchir() {
        if (! valide())
        {
            return 0;
        }
        else
        {
            double total = affranchirNormal();
            if (express) {
                total *= 2;
            }
            return total;
        }
    }

    // un courrier est invalide si l'adresse de destination est vide
    // methode utilis'ee par Boite::affranchir et
    // Boite::courriersInvalides
    public boolean valide() {
        return adresse.length() > 0;
    }
    
    @Override
    public String toString() {
        String s = "";
        if (!valide())
        {
            s+= "(Courrier  invalide)\n";
        }
        s+= "   Poids : " + poids + " grammes\n";
        s+= "   Express : " + (express ? "oui" : "non") + "\n";
        s+= "   Destination : " + adresse + "\n";
        s+= "   Prix : " + affranchir() + " DH\n";
        return s;
    }

}