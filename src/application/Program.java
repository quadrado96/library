package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Book;
import model.entities.Ebook;
import model.entities.Magazine;
import model.entities.Product;
import model.entities.ProductException;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Product> productList = new ArrayList<>();
		
		try {
			char aswner = 'Y';
			System.out.println("Order - ");
			do {
				System.out.print("Product name: ");
				String name = sc.nextLine();
				System.out.print("Author name: ");
				String author = sc.nextLine();
				System.out.print("Product price: ");
				double price = sc.nextDouble();
				sc.nextLine();
				System.out.print("What type of product to order (Book/Magazine/Ebook)? ");
				String productType = sc.nextLine();
				
				if (productType.equalsIgnoreCase("Book")) {
					productList.add(new Book(name, author, price));
				}
				
				if (productType.equalsIgnoreCase("Magazine")) {
					productList.add(new Magazine(name, author, price));
				}
				
				if (productType.equalsIgnoreCase("Ebook")) {
					productList.add(new Ebook(name, author, price));
				}
				
				System.out.print("Anything else to order (Y/N)? ");
				aswner = sc.next().toUpperCase().charAt(0);
				sc.nextLine();
			} while (aswner == 'Y'); 
		} catch (ProductException e) {
			System.out.println(e.getMessage());
		}
		sc.close();
		System.out.println("\nOrder data:");
		
		for(Product product: productList) {
			System.out.println(product.toString());
		}
	}

}
