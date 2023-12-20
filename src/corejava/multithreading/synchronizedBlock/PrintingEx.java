package corejava.multithreading.synchronizedBlock;
//Object level block test
public class PrintingEx{
	public void display(int a, int b) {
		System.out.println("welcome to printing");
		System.out.println("this program is only printing numbers");
		System.out.println("you can see numbers in the output");
		System.out.println("be happy.. see the output");
		
		synchronized (this) {
			for(int i=a; i<=b; i++) {
				System.out.println(i);
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
