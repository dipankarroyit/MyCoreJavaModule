package corejava.string.javaLangString;

public class Split1 {
	public static void main(String[] args) {
		String s1="Hello world";
		String s2="Hi Bye";
		String[] a1=s1.split(" ");
		String[] a2=s2.split(" ");
		for(int i=0; i<a1.length; i++) {
			System.out.println(a1[i]+" "+a2[i]+"-->"+check(a1[i], a2[i]));
		}
	}
	static boolean check(String s1, String s2) {
		if(s1.length()>s2.length()) {
			String temp=s1;
			s1=s2;
			s2=temp;
		}
		for (int i=0; i<s1.length(); i++) {
			char c=s1.charAt(i);
			if(s2.indexOf(c)!=-1) return true;
		}
		return false;
	}
}
