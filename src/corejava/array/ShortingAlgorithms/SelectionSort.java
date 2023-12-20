package corejava.array.ShortingAlgorithms;
import java.util.Arrays;

public class SelectionSort {
	public static void main(String[] args) {
		int[] arr = {9,4,1,3,7,6,8,10,2};
		System.out.println(Arrays.toString(arr));
		sort(arr);
		System.out.println(Arrays.toString(arr));
	}
	public static void sort(int[] a) {
		for(int i=0; i<a.length-1; i++) {
			int index=i;
			for(int j=i+1; j<a.length; j++) {
				if(a[j]<a[index]) index=j;
			}
			if(i!=index) {
				int temp=a[i];
				a[i]=a[index];
				a[index]=temp;
			}
		}
	}
}
