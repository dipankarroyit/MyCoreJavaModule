package corejava.oops.association;

class Car {
	void start() {System.out.println("car started");}
	void accelerate() {System.out.println("car accelerate");}
	void bracks() {System.out.println("car stoped");}
}
class Driver {
	Car c;
	Driver(Car c) {this.c=c;}
	void drive() {
		c.start();
		c.accelerate();
		c.bracks();
	}
}
public class AggregationCarTest {
	public static void main(String[] args) {
		Driver d1=new Driver(new Car());
		d1.drive();
	}
}
