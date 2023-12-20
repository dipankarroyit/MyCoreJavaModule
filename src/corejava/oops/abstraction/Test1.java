package corejava.oops.abstraction;
interface Drivable {
	void start();
	void accelarate();
	void breaks();
}
abstract class AbstractCar {
	int num;
	static int count;
	AbstractCar() {
		num=++count;
	}
	public void brakes() {
		System.out.println("brakes implemants in Abstract class");
	}
}
class Sedan extends AbstractCar implements Drivable {
	Sedan() {
		super();
	}
	public void start() {
		System.out.println("Sedan is starting");
	}
	public void accelarate() {
		System.out.println("Sedan is accelarating");
	}
	public void breaks() {
		
	}
}
class Suv extends AbstractCar implements Drivable {
	Suv() {
		super();
	}
	public void start() {
		System.out.println("Sedan is starting");
	}
	public void accelarate() {
		System.out.println("Sedan is accelarating");
	}
	public void breaks() {
		
	}
}
class Sports extends AbstractCar implements Drivable {
	Sports() {
		super();
	}
	public void start() {
		System.out.println("Sedan is starting");
	}
	public void accelarate() {
		System.out.println("Sedan is accelarating");
	}
	public void breaks() {
		
	}
}
public class Test1 {
	public static void main(String[] args) {
		Sedan s=new Sedan();
		System.out.println(s.num);
		Suv su=new Suv();
		System.out.println(su.num);
		Sports sp=new Sports();
		System.out.println(sp.num);
	}
}
