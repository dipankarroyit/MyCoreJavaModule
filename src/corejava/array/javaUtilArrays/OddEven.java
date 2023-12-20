package corejava.array.javaUtilArrays;
import java.util.Arrays;

public class OddEven {
	public static void  main(String[] args) {
		int[] a= {2,1,3,9,8,6};
		System.out.println(Arrays.toString(a));
		int i=0;
		int j=a.length-1;
		while(i<=j) {
			while (a[i]%2==0) i++;
			while (a[j]%2!=0) j--;
			if(i<=j) {
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				i++; j--;
			}
		}
		System.out.println(Arrays.toString(a));
	}
}
