package Ex3;
import java.util.Scanner;

public class Spectateur {
	int age,vararg;
	public Scanner s=new Scanner(System.in); 
 public Spectateur() {
	 System.out.print("Spectatuer:quel age ai-je ?");
	 age=s.nextInt();
	 System.out.print("Spectatuer:Combien d'argent ai-je en poche ");
     vararg=s.nextInt();
     while((vararg>=100)||(vararg<0)){
     System.out.print("Spectatuer:Combien d'argent ai-je en poche ");
     vararg=s.nextInt();
      }  
 }
public int getAge() {
	return age;
}
public int getsomarg() {
	return vararg;
}


}