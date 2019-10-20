package Ex3;
public class Magicien {
	int res,age,vararg;
	Assistant A;
	public Magicien(Assistant A) {
		res=A.c+115;
		age=res/100;
		vararg=res%100;
		System.out.print("Magicien:hum...je vois que vous etes age de "+age+" ans et que vous avez "+ vararg +" francs suisses en poche");
		
	}

}
