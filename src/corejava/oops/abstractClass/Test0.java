package corejava.oops.abstractClass;

//Car is Mediator(or interface) class
// Car is abstract class also
abstract class Car {
	abstract void start();
	abstract void accelerate();
	abstract void stop();
}
class Audi extends Car {
	void start() {
		System.out.println("Audi is starting");
	}
	void accelerate() {
		System.out.println("Audi is accelerating");
	}
	void stop() {
		System.out.println("Audi is stopping");
	}
}
class Bmw extends Car {
	void start() {
		System.out.println("Bmw is starting");
	}
	void accelerate() {
		System.out.println("Bmw is accelerating");
	}
	void stop() {
		System.out.println("Bmw is stopping");
	}
}
class Driver {
	void drive(Car c) {
		c.start();
		c.accelerate();
		c.stop();
	}
}
public class Test0 {
	public static void main(String[] args) {
		Driver d1=new Driver();
		d1.drive(new Audi());
	}
}
