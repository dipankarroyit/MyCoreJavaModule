package corejava.oops.looseCoupling;
import java.util.Scanner;

// Bridge between the service provider and service user
interface Car {
	void start();
	void movie();
	void stop();
}
// implementation logic
class Bmw implements Car {
	@Override
	public void start() {
		System.out.println("Bmw is starting");
	}
	@Override
	public void movie() {
		System.out.println("Bmw is moving");
	}
	@Override
	public void stop() {
		System.out.println("Bmw is stoping");	
	}
}
class Nano implements Car {
	@Override
	public void start() {
		System.out.println("Nano is starting");
	}
	@Override
	public void movie() {
		System.out.println("Nano is moving");
	}
	@Override
	public void stop() {
		System.out.println("Nano is stoping");	
	}
}
class Audi implements Car {
	@Override
	public void start() {
		System.out.println("Audi is starting");
	}
	@Override
	public void movie() {
		System.out.println("Audi is moving");
	}
	@Override
	public void stop() {
		System.out.println("Audi is stoping");	
	}
}
class Benz implements Car {
	@Override
	public void start() {
		System.out.println("Benz is starting");
	}
	@Override
	public void movie() {
		System.out.println("Benz is moving");
	}
	@Override
	public void stop() {
		System.out.println("Benz is stoping");	
	}
}
// factory design logic
class HelperClass {
	public static Car getCar(String na) {
		if (na.equalsIgnoreCase("Audi")) {
			Audi audi=new Audi();
			return audi;
		}else if (na.equalsIgnoreCase("banz")) { 
			Benz benz=new Benz();
			return benz;
		}else if (na.equalsIgnoreCase("Bmw")) { 
			Bmw bmw=new Bmw();
			return bmw;
		}else if (na.equalsIgnoreCase("nano")) { 
			Nano nano=new Nano();
			return nano;
		}else {
			return null;
		}
	}
}
// user logic
public class Driver {
	public static void main(String[] args) {
		Scanner scr=new Scanner(System.in);
		System.out.println("Enter a car");
		String st=scr.next();
		Car c=HelperClass.getCar(st);
		c.start();
		c.movie();
		c.stop();
	}
}
