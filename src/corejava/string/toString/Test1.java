package corejava.string.toString;

class Emp {
	String name;
	int id;
	static int count;
	Emp(String n) {name=n; id=++count;}
	
	public String toString() {
		return "name = "+name+"\t id = "+id;
	}
}
public class Test1 {
	public static void main(String[] args) {
		Emp e1=new Emp("Samu");
		Emp e2=new Emp("Dipankar");
		System.out.println(e1);
		System.out.println(e2);
	}
}
