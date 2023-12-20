package corejava.oops.inheritance;

class Phone {
	public void call() {
		System.out.println("calling is process");
	}
	public void sms() {
		System.out.println("sms is sending");
	}
}
class FetcherPhone extends Phone{
	public void camera() {
		System.out.println("image capturing");
	}
}
public class InheritanceEx {
	public static void main(String[] args) {
		FetcherPhone f1=new FetcherPhone();
		f1.camera();
		f1.sms();
		f1.call();
	}

}
