package corejava.multithreading.multitasking;

class Abc implements Runnable {
	@Override
	public void run() {
		for (char ch='a'; ch<='z'; ch++) {
			System.out.println(ch);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
public class ThreadByRunnableInterface {
	public static void main(String[] args) {
		Runnable rb=new Abc();
		Thread t=new Thread(rb);
		t.start();
		
		for(int i=1; i<=30; i++) {
			System.out.println(i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
