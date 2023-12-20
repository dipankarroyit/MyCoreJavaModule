package corejava.multithreading.multitasking;

class Abcd implements Runnable {
	public void run(){
		Thread p=Thread.currentThread();
		for(char ch='A'; ch<='Z'; ch++) {
			System.out.println(p.getName()+" is printing "+ch);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
public class ThreadByExtendingThread1 {
	public static void main(String[] args) {
		Runnable rb=new Abcd();
		Thread p1=Thread.currentThread();
		Thread t=new Thread(rb);
		t.setName("Abcd Thread");
	    t.start();
	    t=new Thread(rb);
	    t.start();
		
		for(int i=1; i<=30; i++) {
			System.out.println(p1.getName()+" is printing "+i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
