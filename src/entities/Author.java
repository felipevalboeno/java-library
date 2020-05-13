package entities;

// Declarando atributos do autor
public class Author {
	private String name;
	private String email;
	private String ssn;
	
	
//Classe para mostrar detalhes do autor.
	void showDetails() {
		System.out.println();
		System.out.println("Showing details of book author: ");
		System.out.println("Name: " + name);
		System.out.println("Email: " + email);
		System.out.println("SSN: " + ssn);

	}
	
//Getters e Setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

}
