package preparation_exam;

public class EntNat {
	
	public EntNat( int n) throws Errconst {
		if (n < 0) throw new Errconst(n);
		this.n=n;
	}
	public int getN() {
		return n;
	}
	private int n;
}