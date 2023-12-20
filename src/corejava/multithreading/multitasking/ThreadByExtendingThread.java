package corejava.multithreading.multitasking;

class Xyz extends Thread {
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
public class ThreadByExtendingThread {
	public static void main(String[] args) {
		Thread t=new Xyz();
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
