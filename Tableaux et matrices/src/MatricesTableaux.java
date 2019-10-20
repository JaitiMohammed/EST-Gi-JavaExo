import java.lang.String;
public class MatricesTableaux {

	public static void main(String[] args) {
		
		// Déclaration des tableaux
		int i;
		int [] tab1 ; //forme une
		int tab2[]; // forme deux
		// fixation du taille
		
		int [] tab=new int[20];
		for(i=0;i<5;i++)
		{
			tab[i]=i+2;
			System.out.println("tab["+ i +"]"+ "est : " + tab[i]);
		}
	}
}
