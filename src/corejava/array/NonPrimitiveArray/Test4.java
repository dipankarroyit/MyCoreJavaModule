package corejava.array.NonPrimitiveArray;

public class Test4 {
	public static void main(String[] args) {
		Object[] arr=new Object[5];
		arr[0]=10;
		arr[1]=4.4;
		arr[2]='a';
		arr[3]=true;
		arr[4]="abcd";
		
		for(Object o : arr) {
			System.out.println(o);
		}
	}
}
