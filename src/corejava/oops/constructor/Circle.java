package corejava.oops.constructor;

class Circle {
	int redius;
	
	Circle(int redius) {
		this.redius=redius;
	}
	void setRedius(Circle c1, Circle c2) {
		redius=c1.redius+c2.redius;
	}
	void display() {
		System.out.println("redius ="+redius);
	}
}
class Test6 {
	public static void main(String[] args) {
		Circle obj1=new Circle(10);
		obj1.display();
		obj1.setRedius(new Circle(50),new Circle(60));
		obj1.display();
	}
}
