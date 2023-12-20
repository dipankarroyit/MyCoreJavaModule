package corejava.array.forEach;

public class Test2 {
	public static void main(String[] args) {
		int[] a = {1,2,3};
		int[] b = a;
		System.out.println(a[1]);
		b[1] = 4;
		System.out.println(a[1]);
	}
}
