package corejava.collection.ArrayList;

public class Test1 {
	public static void main(String[] args) {
		MyArrayList a1=new MyArrayList();
		System.out.println(a1);
		a1.add(10);
		a1.add(20);
		a1.add(30);
		a1.add(40);
		a1.add(50);
		a1.add(60);
		a1.add(2,70);
		a1.remove(1);
		System.out.println("size = "+a1.size());
		for(int i=0; i<a1.size(); i++){
			int n=(Integer) a1.get(i);
			System.out.println(n);
		}
		System.out.println(a1);
	}
}
