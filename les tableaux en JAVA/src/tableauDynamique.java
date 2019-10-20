
public class tableauDynamique {

	public static void main(String[] args) {
		// tableau statique
		

		
		int deuxdimensions[][] = {{0,2,4,5,6},{1,3,4,7,9}};
			 
			 System.out.println(deuxdimensions[0][1]); // premier tableau 
			 System.out.println(deuxdimensions[1][4]); // 9
			 
			 // affcihage du deuximème tableau
		int i=0,j=0;
		while(i<2) {
			j=0;
			while(j<5) {
				System.out.println(deuxdimensions[i][j]);
				j++;
			}
			System.out.println("");
			i++;
		}
		

	}

}
