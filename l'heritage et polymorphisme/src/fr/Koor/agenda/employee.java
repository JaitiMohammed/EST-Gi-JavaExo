package fr.Koor.agenda;

public class employee extends Person {
	private static final int SMIC=1500; // une valeur constante 
	private double salary;
   
	public employee() {
		/*super();*/ // l'appel a la classe parante
		this.setSalary(SMIC);
	}
	public employee (String firstName ,String lastName , String email,double salary) {
		super(firstName,lastName,email);
		this.setSalary(salary);
	}
	
	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		if(salary <= 0) {
			throw new RuntimeException("Salary must be greater than 0 $ ");
		}
			this.salary = salary;	
	}
	@Override
	public String toString() {
		return super.toString()+ "[  salary=" + salary + "]";
	}
	
	
	

}
