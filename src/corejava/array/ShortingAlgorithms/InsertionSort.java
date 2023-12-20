package corejava.array.ShortingAlgorithms;
import java.util.Arrays;

public class InsertionSort {
	public static void main(String[] args) {
		int[] arr = {9,4,5,2,3,7,1,8};
		System.out.println(Arrays.toString(arr));
		sort(arr);
		System.out.println(Arrays.toString(arr));
	}
	public static void sort(int[] a) {
		for(int i=1; i<a.length; i++) {
			int key = a[i];
			int j = i-1;
			while(j>-1 && a[j]>key) {
				a[j+1] =a[j];
				j--;
			}
			a[j+1]=key;
		}
	}
}
