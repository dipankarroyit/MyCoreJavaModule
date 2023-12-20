package corejava.array.javaUtilArrays;
import java.util.Arrays;

public class Test3 {
	public static void main(String[] args) {
		int[] a = {4,5,6,7};
		System.out.println(Arrays.toString(a));
		int i=0, j=a.length-1;
		while(i<j) {
			int temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			i++;
			j--;
		}
		System.out.println(Arrays.toString(a));
	}
}
