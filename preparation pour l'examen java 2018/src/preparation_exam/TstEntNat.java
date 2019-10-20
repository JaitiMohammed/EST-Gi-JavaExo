package preparation_exam;

public class TstEntNat {

	public static void main(String[] args) {
		
		try {
			EntNat n1 =new EntNat(20);
			System.out.println("n1 =" + n1.getN());
			EntNat n2 =new EntNat(-12);
			System.out.println("n2 =" + n2.getN());
		}catch(Errconst e) {
			System.out.println("*** tentative construction naturel avec ***" + e.getValeur() +"***");
			System.exit(-1);
		}
	}

}
