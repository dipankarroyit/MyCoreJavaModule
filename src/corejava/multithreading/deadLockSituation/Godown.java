package corejava.multithreading.deadLockSituation;

public class Godown {
	int noOfItem;// 20

	public Godown(int noOfItem) {
		super();
		this.noOfItem = noOfItem;
	}
	public synchronized void purchase(int amt) { //60
		while(amt>noOfItem) { //60>20
			System.out.println("out of stock...please wait...");
			try {
				this.wait(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		noOfItem-=amt;
		System.out.println("purchase Completed");
	}
	public synchronized void storing(int amt) {
		noOfItem+=amt;
		System.out.println("Storing Completed");
	}
}
