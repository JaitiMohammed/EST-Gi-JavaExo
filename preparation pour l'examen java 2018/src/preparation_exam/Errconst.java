package preparation_exam;

public class Errconst extends Exception {
  private int valeur;	
  public Errconst(int valeur) {
	  this.valeur=valeur;
	  }
  public int getValeur() {
	  return valeur;
  }
}
