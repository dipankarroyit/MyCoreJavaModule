package corejava.string.javaLangString;

public class ReverseString1 {
	public static void main(String[] args) {
		System.out.println(revarse1("java is very easy"));
	}
	static String revarse1(String s) {
		char[] arr=s.toCharArray();
		int i=0, j=arr.length-1;
		while(i<j) {
			char temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++; j--;
		}
		return new String(arr);
	}
}
