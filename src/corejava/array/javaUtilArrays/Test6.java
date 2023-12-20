package corejava.array.javaUtilArrays;

public class Test6 {
	public static void main(String[] args) {
		int[] arr= {4,6,7,8,9};
		int b=0;
		for(int i=0; i<arr.length; i++) {
			b+=arr[i];
		}
		System.out.println(b);
	}
}
