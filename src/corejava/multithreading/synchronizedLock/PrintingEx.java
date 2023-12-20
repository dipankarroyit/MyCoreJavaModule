package corejava.multithreading.synchronizedLock;

class PrintingEx {
	static public synchronized void display(int a, int b) {
		for (int i=a; i<=b; i++) {
			System.out.println(i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
