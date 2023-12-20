package corejava.oops.callToThis;

class Book {
	String title;
	String author;
	
	Book(String t){
		title=t;
	}
	public Book(String t, String a) {
		this(t);
		author=a;
	}
	void display() {
		System.out.println("title = "+title+", author = "+author);
	}
}
public class Test2 {

	public static void main(String[] args) {
		Book b1=new Book("java","dipankar");
		b1.display();
		Book b2=new Book("html");
		b2.display();
	}
}
