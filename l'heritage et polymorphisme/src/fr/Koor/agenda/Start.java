package fr.Koor.agenda;
import java.util.ArrayList;
public class Start {

	public static void main(String[] args) {
		/*
		Person james=new Person("james","Bond","james7@im6.uk");
		System.out.println(james.toString());
		employee emp =new employee("jamesBold","Bond","james7@im6.uk",1600);
		System.out.println(emp.toString());
		client c1 =new client("hamza","tarik","thh@gov.fr",1);
		System.out.println(c1.toString());
		*/
		//-----statique--------------
		/*
		Person [] persons =new Person[3];
		persons[0]=new Person();
		persons[1]=new employee("jeason","fatih","js@12.fr",1526);
		persons[2]=new client("ostad","jaiti","os@gd.com",5);
		*/
		
		//taille dynamique
		ArrayList<Person> persons = new ArrayList<>();
		persons.add(new Person());
		persons.add(new employee("jeason","fatih","js@12.fr",1526));
		
		for(Person person :persons) {
			System.out.println(person);
		  }
		
		System.out.println("--------------------------------");
	     // je traite que les clients 
			
			for(Person person :persons) {
				if(person instanceof employee)
				System.err.println(person);
			}
			
		
	}

}
