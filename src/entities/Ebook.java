package entities;

public class Ebook extends Book {

private String waterMark;
	
	public Ebook() {}
	
	public Ebook (Author author) {
		super(author);
	}
	
	@Override
	public boolean applyDiscount(double percentage) {
		if (percentage > 0.15) {
			return false;
			
		}
		double discount = this.getPrice() * percentage;
		this.setPrice(this.getPrice()- discount);
		return true;
	}
	
// Getter and Setters
	
	public String getWaterMark() {
		return waterMark;
	}
	public void setWaterMark(String waterMark) {
		this.waterMark = waterMark;
	}
	
	
}
