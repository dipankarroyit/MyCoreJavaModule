package corejava.multithreading.synchronizedBlock;
//class level synchronized block test
class Test1 implements Runnable {
	int a;
	int b;
	public Test1(int a, int b) {
		this.a = a;
		this.b = b;
	}
	@Override
	public void run() {
		PrintingEx1.display(a, b);
	}
}
public class SyncEx1 {
	public static void main(String[] args) {
		Runnable r1=new Test1(10, 16);
		Thread t1=new Thread(r1);
		Runnable r2=new Test1(30, 35);
		Thread t2=new Thread(r2);
		
		t1.start();
		t2.start();
	}
}
