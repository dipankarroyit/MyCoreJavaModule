package corejava.multithreading.daemonAndNonDaemon;
class Abc implements Runnable {
	public void run() {
		Thread p=Thread.currentThread();
		System.out.println(p.getName()+" is Daemon --> "+p.isDaemon());
	}
}
public class Test1 {
	public static void main(String[] args) {
		Runnable r=new Abc();
		Thread k=new Thread(r);
		k.setName("firest Thread");
		Thread g=new Thread(r);
		g.setName("Second Thread");
		
		k.start();
		g.start();
		
		Thread p=Thread.currentThread();
		System.out.println(p.getName()+" is a daemon : "+p.isDaemon());
	}
}
