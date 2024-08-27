# Bookstore Management System

## Description

This project involves the creation of a simple bookstore management system in Java. The system handles different types of products: books, magazines, and eBooks. Each product has a base price, and the system calculates the final price based on specific rules for each product type.

## Requirements

1. **Interface `Product`**:
   - Define an interface `Product` with a method `double getFinalPrice()`.

2. **Classes `Book`, `Magazine`, and `Ebook`**:
   - Implement the `Product` interface in three classes: `Book`, `Magazine`, and `Ebook`.
   - Each class should have attributes like `String name`, `String author`, and `double basePrice`.
   - The `getFinalPrice()` method should be implemented differently for each product:
     - **Book**: Apply a 10% tax.
     - **Magazine**: Apply a 5% tax and a 2% discount.
     - **Ebook**: Apply a 15% discount (eBooks are not taxed).

3. **Custom Exception `InvalidPriceException`**:
   - Create a custom exception `InvalidPriceException` to be thrown when a product's base price is less than or equal to zero.
   - Handle this exception within the `getFinalPrice()` implementations.

4. **Class `Program`**:
   - Create a `Program` class with a `main` method to instantiate various products (books, magazines, and eBooks) and add them to a list.
   - Iterate through the list and display the details of each product using the `describeOrder()` method.
   - Print the final price of each product, capturing the `InvalidPriceException` if it occurs.

## Usage

This project demonstrates the use of object-oriented programming (OOP) principles in Java, including interfaces, default methods, polymorphism, and exception handling. The goal is to provide a real-world scenario where these concepts can be applied effectively.
