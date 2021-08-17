package com.techment.oops;
import java.util.Scanner;

class Book
{
private String title;
private String author;
private float price;
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getAuthor() {
	return author;
}
public void setAuthor(String author) {
	this.author = author;
}
public float getPrice() {
	return price;
}
public void setPrice(float price) {
	this.price = price;
}


}
class EngineeringBook extends Book
{
	private String category;

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
	
}

public class BookDetails {

	public static void main(String[] args) {
		Book book = new Book();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the title : ");
		String title = scanner.nextLine();
		System.out.println("Enter name of the Author : ");
		String author = scanner.nextLine();
		System.out.println("Enter the Price : ");
		float price = scanner.nextInt();
		
		EngineeringBook b = new EngineeringBook();
		b.setAuthor(author);
		b.setCategory("programming");
		b.setPrice(price);
		b.setTitle(title);
		System.out.println("Book Details are :");
		System.out.println("\n");
		
		System.out.println("Author Name :"+b.getAuthor());
		System.out.println("Book price :"+b.getPrice());
		System.out.println("Book Name :"+b.getTitle());
		System.out.println("Book Category :"+ b.getCategory());

	}

}