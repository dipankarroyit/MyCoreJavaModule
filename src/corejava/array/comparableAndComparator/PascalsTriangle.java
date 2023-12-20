package corejava.array.comparableAndComparator;

public class PascalsTriangle {
	public static void main(String[] args) {
		int[][] arr=createArray(5);
		for(int i=0; i<arr.length; i++) {
			for(int k=0; k<arr.length-i; k++) {
				System.out.print(" ");
			}
			for(int j=0; j<=i; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	static int[][] createArray(int size){
		int[][] a=new int[size][size];
		a[0][0] = 1;
		for(int i=1; i<a.length; i++) {
			for(int j=0; j<=i; j++) {
				if(j==0 || j==i) a[i][j]=1;
				else
					a[i][j] = a[i][j]=a[i-1][j-1]+a[i-1][j];
			}
		}
		return a;
	}
}
