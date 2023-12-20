package corejava.array.forEach;

public class Test6 {
	public static void main(String[] args) {
		String[] a=new String[3];
		a[0] = "java";
		a[1] = "python";
		a[2] = "c";
		for(String str : a) {
			System.out.println(str);
		}
	}
}
