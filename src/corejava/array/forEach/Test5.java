package corejava.array.forEach;

public class Test5 {
	public static void main(String[] args) {
		int[] arr=m1();
		for(int num : arr) {
			System.out.print(num+" ");
		}
	}
	static int[] m1() {
		int[] a=new int[4];
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		return a;
	}
}
