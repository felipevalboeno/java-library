package application;

import entities.Author;
import entities.Book;

public class RegisterOfBooks {

	public static void main(String[] args) {
		
		
		Author author = new Author();
		author.setName("Stephen King");
		author.setEmail("king@gmail.com");
		author.setSsn("999.999.999.9");
		
		
		Book book = new Book(author);
		book.setName("The Dark Tower");
		book.setDescription("Os Pistoleiros de Eld");
		book.setPrice(59.90);
		
		book.showingDetails();
		
		
		
		
	}

}
