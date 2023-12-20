package corejava.array.NonPrimitiveArray;

public class Test0 {
	public static void main(String[] args) {
		String[] str=new String[3];
		str[0] = "java";
		str[1] = "python";
		str[2] = "c++";
		for(String arr : str) {
			System.out.println(arr+" ");
		}
	}
}
