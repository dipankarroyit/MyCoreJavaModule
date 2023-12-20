package corejava.string.Permutation;

public class Demo1 {
	public static void main(String[] args) {
		permutation("abc", 0);
	}
	static void permutation(String s, int start) {
		if(start==s.length()-1) {
			System.out.println(s);
			return;
		}
		for (int i=start; i<s.length(); i++) {
			String s1=swap(s,start,i);
			permutation(s1, start+1);
		}
	}
	static String swap(String s, int i, int j) {
		char[] a=s.toCharArray();
		char temp=a[i];
		a[i]=a[j];
		a[j]=temp;
		return new String(a);
	}
} 
