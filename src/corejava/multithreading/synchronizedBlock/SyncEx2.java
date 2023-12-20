package corejava.multithreading.synchronizedBlock;

class Test2 implements Runnable{
	int a;
	int b;
	PrintingEx2 ab;
	Test2(int a, int b, PrintingEx2 ab) {
		this.a=a;
		this.b=b;
		this.ab=ab;
	}
	public void run() {
		synchronized (ab) {
			ab.display(a, b);
		}
	}
}
public class SyncEx2 {
	public static void main(String[] args) {
		PrintingEx2 p=new PrintingEx2();
		
		Runnable r1=new Test2(10,15,p);
		Thread t1=new Thread(r1);
		Runnable r2=new Test2(30,35,p);
		Thread t2=new Thread(r2);
		
		t1.start();
		t2.start();
	}
}
