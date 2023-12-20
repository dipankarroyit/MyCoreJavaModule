package corejava.oops.constructor;
import java.util.Scanner;

class BookFactoryClass {
	String title;
	String author;
	double price;
	
	BookFactoryClass(String t, String a, double p){
		title=t;
		author=a;
		price=p;
	}
	void display() {
		System.out.println("Title = "+title);
		System.out.println("Author = "+author);
		System.out.println("Price = "+price+" /-");
		System.out.println("------------------");
	}
}
// factory class for Book type
class BookCreater{
	// factory method
	static BookFactoryClass getBook() {
		Scanner scr=new Scanner(System.in);
		System.out.print("Title: ");
		String t=scr.nextLine();
		System.out.print("Author: ");
		String a=scr.nextLine();
		System.out.print("Price: ");
		double d=scr.nextDouble();
		System.out.println("--------------");
		return new BookFactoryClass(t, a, d);
	}
}
class Test10{
	public static void main(String[] args) {
		BookFactoryClass b1=BookCreater.getBook();
		BookFactoryClass b2=BookCreater.getBook();
		b1.display();
		b2.display();
	}
}
