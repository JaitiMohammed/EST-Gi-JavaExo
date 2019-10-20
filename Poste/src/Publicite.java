class Publicite extends Courrier {

    public Publicite(double poids, boolean express, String adresse){
        super(poids, express, adresse);
    }

    // redéfinit affranchirNormal()
    public double affranchirNormal() {
        return getPoids()/1000.0 * 5.0;
    }


    // inutile de red'efinir la méthode valide() pour les  publicités

    @Override
    public String toString() {
        String s = "Publicité\n";
        s += super.toString();
        return s;
    }
    
}

/* Une classe pour repr'esenter les colis
 */
class Colis extends Courrier {

    //attributs sp'ecifiques aux colis:
    private double volume;

    public Colis(double poids, boolean express, String adresse, double volume) {
        super(poids, express, adresse);
        this.volume = volume;
    }

    // redéfinit affranchirNormal();
    public double affranchirNormal() {
        // affranchit les colis selon une formule pr'ecise
        return 0.25 * volume + getPoids()/1000.0;
    }

    // ici il faut red'efinir  (sp'ecialiser) la re`gle de validit'e des colis
    // un colis est invalide s' il  a une mauvaise adresse
    //ou depasse un certain volume
    public boolean valide(){
        return (super.valide() && volume <= 50);
    }
    
    @Override
    public String toString() {
        String s = "Colis\n";
        s += super.toString();
        s += "  Volume : " + volume + " litres\n";
        return s;
    }


}