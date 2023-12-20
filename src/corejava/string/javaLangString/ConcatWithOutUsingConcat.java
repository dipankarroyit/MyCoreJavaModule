package corejava.string.javaLangString;

public class ConcatWithOutUsingConcat {
	public static void main(String[] args) {
		String s1="abc";
		String s2="xyz";
		char[] a=s1.toCharArray();
		char[] b=s2.toCharArray();
		int size=a.length+b.length;
		char[] c=new char[size];
		int i;
		for(i=0; i<a.length; i++) {
			c[i]=a[i];
		}
		for(int j=0; j<b.length; j++) {
			c[i]=b[j];
			i++;
		}
		String s3=new String(c);
		System.out.println(s3);
	}
}
