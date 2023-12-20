package corejava.array.NonPrimitiveArray;

public class Test3 {
	public static void main(String[] args) {
		Object o=10;
		System.out.println(((Integer)o).intValue()*30);// not automatic
		System.out.println((Integer)o*30);// automatic
	}
}
