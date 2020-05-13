package entities;

public class DiscountRules {

	public static void main(String[] args) {

		Author author = new Author();
		author.setName("Stephen King");

		Book book = new Book();
		book.price = 59.90;

		if (!book.applyDiscount(0.3)) {
			System.out.println("The discount cannot exceed 30%");
		} else {
			System.out.println("Price with Discount: " + book.getPrice());
		}

		Ebook ebook = new Ebook();
		ebook.setPrice(29.90);

		if (!ebook.applyDiscount(0.15)) {
			System.out.println("Ebook discount cannot exceed 15%");
		} else {

			System.out.println("Ebook price with discount: " + ebook.getPrice());

		}

	}
}
