/*
 * @author Mohammed jaiti
 */
import java.util.InputMismatchException;
import java.util.Scanner;
public class MatriceAdjacence {

    private final int Max_no_of_vertices;
    private int adjcence_matrice[][];

    public MatriceAdjacence(int nombre_vertices){

        Max_no_of_vertices=nombre_vertices;
        adjcence_matrice=new int [Max_no_of_vertices+1][Max_no_of_vertices+1];
    }

    public void setEdge(int from_vertex , int to_vertex,int edge){
        try
        {
            adjcence_matrice[from_vertex][to_vertex]=edge;

        }
        catch ( ArrayIndexOutOfBoundsException indexBounce)
        {
            System.out.println(" le vecteur entrer n'est pas présent ");
        }
    }

    public int getEdge(int from_vertex ,int to_vertex){
        try {
            return adjcence_matrice[from_vertex][to_vertex];
        }
        catch (ArrayIndexOutOfBoundsException indexBounce){
            System.out.println(" the vertex entrerd is not present ");
        }
        return -1;
    }
    public static void main(String[] args){
        int number_of_vertices , count =1 ;
        int source =0 , destination =0;
        Scanner scan=new Scanner(System.in);
        MatriceAdjacence adjacenceMatrice;
        try {
            System.out.println(" Entrer the number of vertices ");
            number_of_vertices=scan.nextInt();
            System.out.println("Entrer the number of  edges ");
            int number_of_edge=scan.nextInt();
            adjacenceMatrice =new MatriceAdjacence(number_of_vertices);

            System.out.println("Entrer the graph edge  : <source> <destination> ");

                while (count <=number_of_edge){
                    source=scan.nextInt();
                    destination=scan.nextInt();
                    adjacenceMatrice.setEdge(source,destination,1);
                    count++;
                }
             System.out.println(" the adjecency matrix for given graph  is ");
                for(int i=1 ;i<=number_of_vertices ;i++){
                    System.out.print(i);
                    System.out.println();
                }
                for(int i=1;i<=number_of_vertices ;i++){
                    System.out.print(i);
                    for(int j=1 ;j<=number_of_vertices;j++){
                        System.out.print(adjacenceMatrice.getEdge(i,j));
                    }
                    System.out.println();
                }
        }
        catch (InputMismatchException inputMisMatch){
            System.out.println("Error in  U=Input from.<source index > <destination index >");
        }

        scan.close();
    }
}
