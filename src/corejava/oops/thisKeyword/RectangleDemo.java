package corejava.oops.thisKeyword;

class Rectangle {
	int length;
	int breadth;
	
	void initialize(int length,int breadth) {
		this.length=length;
		this.breadth=breadth;
	}
	void display() {
		System.out.println("dimantion = "+length+" "+breadth);
	}
	void area() {
		System.out.println("area = "+length*breadth);
	}
}
public class RectangleDemo {
	public static void main(String[] args) {
		Rectangle r1=new Rectangle();
		r1.initialize(20, 10);
		r1.display();
		r1.area();
	}
}
