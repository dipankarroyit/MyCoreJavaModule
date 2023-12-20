package corejava.multithreading.synchronizedLock;

class Test implements Runnable {
	int a;
	int b;
	Test(int a, int b) {
		this.a=a;
		this.b=b;
	}
	public void run() {
		PrintingEx.display(a, b);
	}
}
public class SyncLockEx {
	public static void main(String[] args) {	
		Runnable r1=new Test(1, 5);
		Thread t1=new Thread(r1);
		Runnable r2=new Test(12, 18);
		Thread t2=new Thread(r2);
	
		t1.start();
		t2.start();
	}
}
