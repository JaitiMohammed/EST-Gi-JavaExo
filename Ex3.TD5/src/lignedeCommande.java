import java.util.ArrayList;
import java.util.Scanner;
import java.lang.Exception;

public class lignedeCommande {
 
	static Scanner clavier =new Scanner(System.in);
	public static void main(String args[]) {
		
		ArrayList<String> s = new ArrayList<>();
		double Sd=0;
		int Si=0;
		double b;
		int i = 0;
		//int j=0;
		String str;
		
		do {
			i++;
			System.out.println("Entrer une chaine de caractère");
			//str=clavier.next();
			try {
				//args[i]=str;
				int a=Integer.parseInt(args[i]);
				Si+=a;
			}catch(Exception e) {
				//System.out.println("Ce n'est pas un entier");
				 try {
					 b=Double.parseDouble(args[i]);
					 Sd+=b;
				 }catch(Exception m) {
					 s.add(args[i]);
				  }
				
			}
			
		}while(i < 4);
		System.out.println("la somme des entier est : " + Si);
		System.out.println("la somme des double est : " + Sd);
		System.out.println("Les arguments :");
		
		for(int j=0;j<i;j++) {
			System.out.println(args[j]+",");
		}
		System.out.println("ne sont ni entier ni réel");
  }
}
