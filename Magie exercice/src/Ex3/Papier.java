package Ex3;

public class Papier {
	Papier p;
	int age,vararg;
	public Papier(Spectateur S) {
		System.out.print("====j ecris dans le papier l age et le nom===\n");
		age=S.age;
		vararg=S.vararg;
		
	}
}
