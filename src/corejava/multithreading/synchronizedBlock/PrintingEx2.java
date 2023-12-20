package corejava.multithreading.synchronizedBlock;

public class PrintingEx2 {
	public void display(int a, int b) {
		for(int i=a; i<=b; i++) {
			System.out.println(i);
			try {
				Thread.sleep(700);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
 