package corejava.multithreading.daemonAndNonDaemon;

class Pqr implements Runnable {
	public void run() {
		Thread p=Thread.currentThread();
		while(true) {
			System.out.println(p.getName()+" is a Daemon : "+p.isDaemon());
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
public class DaemonEx {
	public static void main(String[] args) {
		Runnable b=new Pqr();
		Thread k=new Thread(b);
		k.setName("Child Thread");
		k.setDaemon(true);
		k.start();
		
		Thread ab=Thread.currentThread();
		for(int i =1; i<=10; i++) {
			System.out.println(ab.getName()+" is a Daemon : "+ab.isDaemon()+" "+i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
