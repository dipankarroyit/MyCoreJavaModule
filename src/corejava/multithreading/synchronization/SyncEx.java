package corejava.multithreading.synchronization;

class Test implements Runnable {
	int a;
	int b;
	PrintingEx ab;
	Test(int a, int b, PrintingEx ab) {
		this.a=a;
		this.b=b;
		this.ab=ab;
	}
	public void run() {
		ab.display(a, b);
	}
}
public class SyncEx {
	public static void main(String[] args) {
		PrintingEx p1=new PrintingEx();
//		PrintingEx p2=new PrintingEx();
		
		Runnable r1=new Test(1, 5, p1);
		Thread t1=new Thread(r1);
		Runnable r2=new Test(8, 11, p1);
		Thread t2=new Thread(r2);
//		Runnable r3=new Test(14, 17, p2);
//		Thread t3=new Thread(r3);
		
		t1.start();
		t2.start();
//		t3.start();
	}
}
