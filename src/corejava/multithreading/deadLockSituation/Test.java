package corejava.multithreading.deadLockSituation;

class Customer implements Runnable {
	int amt;
	Godown ab;
	
	public Customer(int amt, Godown ab) {
		this.amt = amt;
		this.ab = ab;
	}
	@Override
	public void run() {
		ab.purchase(amt);
	}
}
class Manufacturer implements Runnable {
	int amt;
	Godown xy;
	
	public Manufacturer(int amt, Godown xy) {
		this.amt = amt;
		this.xy = xy;
	}
	@Override
	public void run() {
		xy.storing(amt);	
	}
}
public class Test {
	public static void main(String[] args) {
		Godown g = new Godown(100);
		
		Runnable r1=new Customer(80, g);
		Thread t1=new Thread(r1);
		
		t1.start();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		Runnable r2=new Customer(60, g);
		Thread t2=new Thread(r2);
		
		t2.start();
		
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		Runnable r3=new Manufacturer(200, g);
		Thread t3=new Thread(r3);
		
		t3.start();
	}
}
