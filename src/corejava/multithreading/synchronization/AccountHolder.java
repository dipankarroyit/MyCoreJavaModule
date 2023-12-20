package corejava.multithreading.synchronization;

class Raja extends Thread {
	Account r;
	Raja(Account r){
		this.r=r;
	}
	@Override
	public void run() {
		r.deposit(1000);
	}
}
class Rani extends Thread {
	Account g;
	Rani(Account g){
		this.g=g;
	}
	@Override
	public void run() {
		g.deposit(1000);
	}
}
public class AccountHolder {
	public static void main(String[] args) {
		Account ab=new Account(5000);

		new Raja(ab).start();
		new Rani(ab).start();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		ab.balanceCheck();
	}
}
