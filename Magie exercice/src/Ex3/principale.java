package Ex3;

public class principale {

	public static void main(String[] args) {
		
		Spectateur S=new Spectateur();
		Papier P1=new Papier(S);
		Assistant A= new Assistant(P1);
		Magicien M=new Magicien(A);

	}

}
