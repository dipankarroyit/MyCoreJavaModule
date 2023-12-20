package corejava.multithreading.synchronizedBlock;
// class level synchronized block
public class PrintingEx1 {
	public static void display(int a, int b) {
		System.out.println("welcome to printing");
		System.out.println("this program is only printing numbers");
		System.out.println("you can see numbers in the output");
		System.out.println("be happy.. see the output");
		
		synchronized (PrintingEx1.class) {
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
