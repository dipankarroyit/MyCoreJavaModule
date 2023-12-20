package corejava.array.forEach;

public class Test4 {
	public static void main(String[] args) {
		int[] a = {3,4,7,9};
		m1(a);
		for(int n:a) {
			System.out.print(n+" ");
		}
		System.out.println();
	}
	static void m1(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			arr[i]++;
		}
	}
}
