package corejava.multithreading.synchronizedBlock;
//Object level block
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
		
		Runnable r1=new Test(10, 17, p1);
		Thread t1=new Thread(r1);
		Runnable r2=new Test(20, 28, p1);
		Thread t2=new Thread(r2);
		
		t1.start();
		t2.start();
	}
}
