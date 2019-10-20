import java.util.Scanner;

class NumberFormatException extends Exception{

    public NumberFormatException(String s) {
        super(s);
    }
    
    public NumberFormatException() {
        super("Fomrat n'est convenable !");
    }
}
public class CalcLigneCommande {
	
	 private int readInt(Scanner scanner) throws  NumberFormatException {
	        String strNumber = scanner.nextLine();
	        int number;
	        number = Integer.parseInt(strNumber);
	        if (number <= 0) {
	            throw new NumberFormatException();
	        }
	        return number;
	    }
	
	
	

	public static void main(String[] args) {
		

	}

}
