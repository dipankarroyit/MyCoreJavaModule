package corejava.oops.binding;
class Bike {
	
}
class Pulsar extends Bike {
	
}
class Ride {
	void ride(Bike b) {
		System.out.println("ride(bike)");
	}
	void ride(Pulsar p) {
		System.out.println("ride(pulsar)");
	}
}
public class RideDemo {
	public static void main(String[] args) {
		Ride r=new Ride();
		Bike b=new Pulsar();
		r.ride(b); // calling b reference variable type
		Pulsar p=new Pulsar();
		r.ride(p); // calling p reference variable type
	}
}
