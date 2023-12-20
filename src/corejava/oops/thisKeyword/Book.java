package corejava.oops.thisKeyword;

public class Book {
	String title;
	
	void display() {
		Book b1=new Book();
		System.out.println("directly use obj1 value = "+title);
		System.out.println("used this keyword obj1 value = "+this.title);
		System.out.println("b1 object ref = "+b1.title);
	}
	public static void main(String[] args) {
		Book obj1=new Book();
		obj1.title="java";
		obj1.display();
	}
}
