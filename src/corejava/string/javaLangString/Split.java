package corejava.string.javaLangString;

public class Split {
	public static void main(String[] args) {
		String s1="developer";
		System.out.println("I/P : "+s1);
		System.out.print("O/P : ");
		String [] arr=s1.split("e");
		for(int i=0; i<arr.length; i++) {
		System.out.print(arr[i]);
		}
	}
}
