package entities;

public class Book {
//Atributos
	private String name;
	private String description;
	protected double price;
	private String isbn;
	private Author author;
	private boolean printed;
	
//Construtores
	public Book (Author author) {
		this();
		this.author = author;
		this.printed = true;
	}
	
	
	public Book () {
		
		this.isbn = "000-00-00000-00-0";
	}
	
	
// método que define um comportamento para a classe Livros
	public void showingDetails() {
		String menssage = "Showing details of book: ";
		System.out.println(menssage);
		System.out.println("Name: " + name);
		System.out.println("Description: " + description);
		System.out.println("Price: " + price);
		System.out.println("ISBN: " + isbn);

		if (this.hasAuthor()) {

			author.showDetails();

		}

		System.out.println("----");

	}
	
	
//método para filtrar se tem autor associado a um livro
	boolean hasAuthor() {
		return this.author != null;

	}
	
// método com regra de desconto sobre um livro
	public boolean applyDiscount (double percentage) {
		if (percentage > 0.3) {
			return false;
		}
		this.price -= this.price * percentage;
		return true;
	}

//Getters e Setters
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public String getIsbn() {
		return isbn;
	}


	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}


	public Author getAuthor() {
		return author;
	}


	public void setAuthor(Author author) {
		this.author = author;
	}
	
	
	
	
}
