package corejava.oops.nonPrimitiveTypeCasting;
import java.util.Scanner;

class Car {
	void start() {
		System.out.println("Car is Strarting");
	}
	void move() {
		System.out.println("Car is moving");
	}
	void stop() {
		System.out.println("Car is stopped");
	}
}
class Audi extends Car {
	void start() {
		System.out.println("Audi is Strarting");
	}
	void move() {
		System.out.println("Audi is moving");
	}
	void stop() {
		System.out.println("Audi is stopped");
	}
}
class Bmw extends Car {
	void start() {
		System.out.println("Bmw is Strarting");
	}
	void move() {
		System.out.println("Bmw is moving");
	}
	void stop() {
		System.out.println("Bmw is stopped");
	}
}
class Nano extends Car {
	void start() {
		System.out.println("Nano is Strarting");
	}
	void move() {
		System.out.println("Nano is moving");
	}
	void stop() {
		System.out.println("Nano is stopped");
	}
}
class DriveEx {
	public static void main(String[] args) {
		Scanner scr=new Scanner(System.in);
		Car c=null;
		System.out.println("Enter 1 for Audi");
		System.out.println("Enter 2 for Bmw");
		System.out.println("Enter 3 for Nano");
		int op=scr.nextInt();
		
		switch (op) {
			case 1:
				c=new Audi();
				break;
			case 2:
				c=new Bmw();
				break;
			case 3:
				c=new Nano();
				break;
			default:
				System.out.println("Wrong input");
		}
		c.start();
		c.move();
		c.stop();
	}
}
