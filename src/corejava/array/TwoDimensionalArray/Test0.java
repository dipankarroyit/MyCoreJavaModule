package corejava.array.TwoDimensionalArray;

public class Test0 {
	public static void main(String[] args) {
		int[][] a={
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		
		for(int[] temp : a) {
			for(int num: temp) {
				System.out.print(num+" ");
			}
			System.out.println();
		}
	}
}
