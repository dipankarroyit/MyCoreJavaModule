package corejava.array.javaUtilArrays;

public class SecondSmallestNo {
	public static void main(String[] args) {
		int[] arr = {3,7,5,8,2,9};
		int smallest = arr[0];
		int secSmallest=Integer.MAX_VALUE;
		for(int i=1; i<arr.length; i++) {
			if(arr[i]<smallest) {
				secSmallest = smallest;
				smallest = arr[i];
			}else if(arr[i]<secSmallest) {
				secSmallest = arr[i];
			}
		}
		System.out.println("2nd smallest no is : " + secSmallest);
	}
}
