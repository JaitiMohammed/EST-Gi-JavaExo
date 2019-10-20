import java.lang.String;
public class TableauxJAVA {

	public static void main(String[] args) {
		
		// voila comment créer des tableaux en java { en seule dimension} 
		// TYPE Nom[]={Contenu}
		
		
		int tableauEntier[]= {4,1,2};
		double tableauDouble[]= {0.0,1.5,12.3};
		char tableauCaractere[]= {'a','j','l'};
		String tableauChaine[] = {"hamid","saad","anas"};
		
		
		for(int i=0 ;i<3 ;i++) {
			System.out.println("l'instance " + i);
			System.out.println(tableauEntier[i]+" / " + tableauDouble[i] +" /" + tableauCaractere[i] +" / " + tableauChaine[i]);
		}
		}
	}
