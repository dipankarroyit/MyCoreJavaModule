package corejava.oops.constructor;

class CarCopyConstructor {
	int regNum;
	static int i;
	
	CarCopyConstructor(){
		regNum=++i;
	}
	void start() {
		System.out.println("car num "+regNum+" start");
	}
	void accelarate() {
		System.out.println("car num "+regNum+" accelarate");
	}
	void breaks() {
		System.out.println("car num "+regNum+" breaks");
	}
}
class Driver{
	void drive(CarCopyConstructor c) {
		c.start();
		c.accelarate();
		c.breaks();
	}
}
class Test8{
	public static void main(String[] args) {
		CarCopyConstructor r1=new CarCopyConstructor();
		CarCopyConstructor r2=new CarCopyConstructor();
		CarCopyConstructor r3=new CarCopyConstructor();
		Driver d=new Driver();
		d.drive(r1);
		d.drive(r2);
		d.drive(r3);
	}
}
