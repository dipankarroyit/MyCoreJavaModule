package corejava.array.javaUtilArrays;

public class Sum {
	public static void main(String[] args) {
		int[] a= {4,5,2,6,8,3,1};
		int sum=0;
		for(int n:a) {
			if(n%2!=0) sum+=n;	
		}
		System.out.print("odd no : "+sum);
	}
}
