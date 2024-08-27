package model.entities;

public class Ebook implements Product {

	private String name;
	private String author;
	private Double basePrice;
	
	public Ebook() {
		
	}
	
	public Ebook(String name, String author, Double basePrice) {
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
		return 0;
	}

}
