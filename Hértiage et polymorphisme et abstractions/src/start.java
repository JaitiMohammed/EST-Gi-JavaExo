
public class start {
	public static void main(String args[])
	{
	Ville v1 = new Ville("Lyon", 1500000);
	Ville v2 = new Ville("Bobigny");
	Capitale c1 = new Capitale("Paris", "France", 10000000);
	Capitale c2 = new Capitale("Ouagadougou", "Burkina-Faso");
	System.out.println(v1.presenteToi( ));
	System.out.println(v2.presenteToi( ));
	System.out.println(c1.presenteToi( ));
	System.out.println(c2.presenteToi( ));
	}
}
