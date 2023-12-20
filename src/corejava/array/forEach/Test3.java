package corejava.array.forEach;

public class Test3 {
	public static void main(String[] args) {
		int[] a = {1,2,3};
		int[] b = {4,5,6,7};
		m1(a);
		m1(b);
	}
	static void m1(int[] arr) {
		for(int n: arr) {
			System.out.print(n+" ");
		}
		System.out.println();
	}
}
