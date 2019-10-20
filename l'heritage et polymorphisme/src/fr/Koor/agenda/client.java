package fr.Koor.agenda;

public class client extends Person{
	private int idClient;

	public client(){
			this.setIdClient(0);
		}

	public client(int idClient) {
		super();
		this.idClient = idClient;
	}
	public client (String firstName , String lastName , String email, int idClient) {
		super(firstName,lastName,email);
		this.setIdClient(idClient);
	}
	public int getIdClient() {
		return idClient;
	}

	public void setIdClient(int idClient) {
		if(idClient < 0) 
			throw new RuntimeException("client was be pos");
		this.idClient = idClient;
	}
	@Override
	public String toString() {
		return super.toString()+"client [idClient=" + idClient + "]";
	}
	
    
}
