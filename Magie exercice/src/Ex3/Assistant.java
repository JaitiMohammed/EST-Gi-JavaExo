
package Ex3;
public class Assistant {
	int c;
	public Assistant(Papier P) {
		System.out.print("Assistant:=== je lis le papier==== \n");
		System.out.print("Assistant:===== je fais le calcule secraitement ===\n");
		c=(((P.age)*2+5)*50+P.vararg)-365;
		System.out.print("Assistant:j annonce :"+c+"\n");
		
	}

}