package corejava.oops.constructor;

public class Rectangle {
	int length;
	int breadth;
	
	Rectangle(int length, int breadth){
		this.length=length;
		this.breadth=breadth;
	}
	void display() {
		System.out.println("dimension = "+length+", "+breadth);
	}
	void area() {
		System.out.println("area = "+length*breadth);
	}
	public static void main(String[] args) {
		Rectangle r1=new Rectangle(10,20);
		r1.display();
		r1.area();
	}

}
