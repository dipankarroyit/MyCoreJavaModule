package corejava.multithreading.synchronization;

public class Account {
	private double balance;
	public Account(double balance) {
		this.balance=balance;
	}
	public void withdraw(double amt) {
		if(amt>balance) {
			throw new ArithmeticException("Insufficient balance !");
		}
		balance-=amt;
		System.out.println("withdrawal balance");
	}
	public void deposit(double amt){
		balance+=amt;
		System.out.println("deposited balance");
		try {
			Thread.sleep(300);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public void balanceCheck() {
		System.out.println("current balance is : "+balance);
	}
}
