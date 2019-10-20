
package fr.Koor.agenda;
import java.lang.String;
public class Person extends Object{
	private String firstName;
	private String lastName;
	private String email;
	
	public Person() {
		this("john","doe","john.doe@unknown.fr");
	}
	public Person (String firstName ,String lastName , String email) {
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.setEmail(email);
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName.toUpperCase();
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName.toLowerCase();
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + "]";
	}
	
	
	
	
}