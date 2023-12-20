package corejava.oops.nonPrimitiveTypeCasting;
//TODO
class Car1 {
	void start() {
		System.out.println("Car1 is starting");
	}
	void accelerate() {
		System.out.println("Car1 is accelerating");
	}
	void stop() {
		System.out.println("Car1 is stopping");
	}
}
class Audi1 extends Car1{
	void start() {
		System.out.println("Audi1 is starting");
	}
	void accelerate() {
		System.out.println("Audi1 is accelerating");
	}
	void stop() {
		System.out.println("Audi1 is stopping");
	}
	void sunruff() {
		System.out.println("sunruff is opening");
	}
}
class Bmw1 extends Car1{
	void start() {
		System.out.println("Bmw1 is starting");
	}
	void accelerate() {
		System.out.println("Bmw1 is accelerating");
	}
	void stop() {
		System.out.println("Bmw1 is stopping");
	}
	
}
class Drive1 {
	void driver(Car1 c) {
		c.start();
		c.accelerate();
		c.stop();
	}
}
public class CarTest {
	public static void main(String[] args) {
		Car1 c1=new Bmw1();
		Drive1 d1=new Drive1();
		d1.driver(c1);
		
	}
}
