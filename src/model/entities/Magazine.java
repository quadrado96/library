package model.entities;

public class Magazine implements Product {
	
	private String name;
	private String author;
	private Double basePrice;
	
	public Magazine() {
		
	}
	
	public Magazine(String name, String author, Double basePrice) {
		this.name = name;
		this.author = author;
		this.basePrice = basePrice;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Double getBasePrice() {
		return basePrice;
	}

	public double getFinalPrice() {
		if (basePrice <= 0) {
			throw new ProductException("Invalid price. Price can't be equal or less than 0");
		}
		return basePrice + (basePrice * 0.05) - (basePrice * 0.02);
	}
	
	@Override
	public String toString() {
		return name + " - " + author + ", $" + String.format("%.2f",  getFinalPrice()); 
	}


}
