package corejava.array.javaUtilArrays;

public class SmallestNo {
	public static void main(String[] args) {
		int[] arr = {5,7,3,4,6,-9,1};
		int smallest = arr[0];
		for(int i=1; i<arr.length; i++) {
			if(arr[i]<smallest) smallest = arr[i];
		}
		System.out.println("Smallest No : "+smallest);
	}
}
