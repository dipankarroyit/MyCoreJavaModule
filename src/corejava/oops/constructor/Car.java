package corejava.oops.constructor;

class Car {
	String car;
	String color;
	
	Car(String c){
		color=c;
	}
}
class Test3{
	static void m1(Car c) {
		c.color = "White";
		System.out.println("m1 executed");
	}
	public static void main(String[] args) {
		Car c1=new Car("Black");
		System.out.println(c1.color);
		m1(c1);
		System.out.println(c1.color);
	}
}
