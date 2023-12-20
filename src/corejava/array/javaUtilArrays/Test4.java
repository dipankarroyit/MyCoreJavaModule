package corejava.array.javaUtilArrays;
import java.util.Arrays;
//TODO
public class Test4 {
	public static void main(String[] args) {
		int[] a= {4,5,6,7,10,5,9,12};
		System.out.println(Arrays.toString(a));
		int i=0, j=a.length-1;
		while(i<=j) {
			while(a[i]%2==0) i++;
			while(a[j]%2!=0) j++;
		}
		if(i<=j) {
			int temp = a[j];
			a[i] = a[j];
			a[j] = temp;
			i++;
			j--;
		}
		System.out.println(Arrays.toString(a));
	}
}
