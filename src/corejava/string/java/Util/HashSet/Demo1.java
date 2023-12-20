package corejava.string.java.Util.HashSet;
import java.util.HashSet;
//TODO
public class Demo1 {
	public static void main(String[] args) {
		HashSet set=new HashSet();
		String str="01101";
		for(int i=0; i<str.length(); i++) {
			for(int j=1; j<str.length(); j+=2) {
				String s=str.substring(i,j+1);
				if(check(s)) set.add(s);
			}
		}
		for(Object obj:set) {
			System.out.println(set.size());
		}
	}
	static boolean check(String s) {
		int i=0, j=s.length()-1;
		char[] a=s.toCharArray();
		if(a[i]=='0') {
			while(i<j) {
				if(a[i]=='0' && a[j]=='1') {
					i++;
					j--;
				}else {
					return false;
				}
			}
			return true;
		}else {
			while(i<j) {
				if(a[i]=='1'&& a[j]=='0') {
					i++;
					j--;
				}else {
					return false;
				}
			}
			return true;
		}
	}
}
