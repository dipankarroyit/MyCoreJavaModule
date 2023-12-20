package corejava.oops.inheritance;
class Phone1 {
	public void call() {
		System.out.println("calling voie call");
	}
	public void sms() {
		System.out.println("sms is sanding");
	}
}
class FetcherPhone1 extends Phone1{
	public void camera() {
		System.out.println("image capturer");
	}
}
class SmartPhone extends FetcherPhone1{
	public void gps() {
		System.out.println("location traking");
	}
	public void videoCall() {
		System.out.println("calling video call");
	}
}
public class MultiLevelInheritance1 {

	public static void main(String[] args) {
		System.out.println("calling main()");
		SmartPhone sp=new SmartPhone();
		sp.call();
		sp.sms();
		sp.camera();
        sp.gps();
        sp.videoCall();
	}
}
