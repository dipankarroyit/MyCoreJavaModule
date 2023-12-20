package corejava.multithreading.threadPriority;

class Mno extends Thread {
	public void run() {
		Thread p=Thread.currentThread();
		System.out.println(p.getName()+" is having Priority level of :  "+p.getPriority());
	}
}
public class PriorityEx {
	public static void main(String[] args) {
		Thread k=new Mno();
		k.setName("1st Thread");
		Thread g=new Mno();
		g.setName("2nd Thread");
		
		k.setPriority(10);
		g.setPriority(1);
		
		g.start();
		k.start();
	}
}
