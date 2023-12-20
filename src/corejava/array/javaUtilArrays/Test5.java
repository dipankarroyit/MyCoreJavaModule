package corejava.array.javaUtilArrays;

public class Test5 {
	public static void main(String[] args) {
		int[] a= {4,5,2,6,8};
		int sum=0;
		for(int n:a) {
			if(n%2==0) sum+=n;	
		}
		System.out.print(sum);
	}
}
