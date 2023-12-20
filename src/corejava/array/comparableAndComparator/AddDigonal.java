package corejava.array.comparableAndComparator;

public class AddDigonal {
	public static void main(String[] args) {
		int[][] a = {
				{1,2,3,4},	
				{4,5,6,3},
				{7,3,9,2},
				{7,8,9,2}
		};
		int sum=add(a);
		System.out.println("Digonal Add : "+sum);
	}
	static int add(int[][] a) {
		int sum=0;
		int j=a.length-1;
		for(int i=0; i<a.length; i++) {
			sum+=a[i][i];
			if(i!=j)
				sum+=a[i][j];
			j--;
		}
		return sum;
	}
}
