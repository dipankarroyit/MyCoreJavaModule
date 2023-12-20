package corejava.array.forEach;

public class Test1 {
	public static void main(String[] args) {
		int[] a=new int[5];// array syntax 1
		int[] b= {9,6,4,3};// array syntax 2
		//for-each loop
		for(int n : a) {
			System.out.print(n+" ");
		}
		System.out.println();
		for(int n : b) {
			System.out.print(n+" ");
		}
	}
}
