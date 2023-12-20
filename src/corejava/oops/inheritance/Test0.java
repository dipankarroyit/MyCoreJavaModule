package corejava.oops.inheritance;
class G {
	static {
		System.out.println("static block in A type");
	}
	{
		System.out.println("non-static block in A type");
	}
}
class H extends G {
	static {
		System.out.println("static block of B type");
	}
	{
		System.out.println("non-static block in B type");
	}
}
public class Test0 {
	public static void main(String[] args) {
		new G();
		System.out.println("---------------------------");
		new H();
		System.out.println("---------------------------");
		new H();
	}
}
