package corejava.oops.instanceOf;
import java.util.Scanner;

class Vagitable {
	
}
class Potato extends Vagitable {
	void preparingFries() {
		System.out.println("Fries ready");
	}
}
class Capcicum extends Vagitable {
	void preparingBujji() {
		System.out.println("Bajji ready");
	}
}
// factory class
class Shop {
	Vagitable getVagitable(String e) {
		if(e.equals("potato"))
			return new Potato();
		if(e.equals("capcicum"))
			return new Capcicum();	
		else 
			System.out.println(e+" vagitable is not avalable");
			return null;
	}
}
public class GoodEx {
	public static void main(String[] args) {
		Shop shop=new Shop();
		
		Scanner scr=new Scanner(System.in);
		System.out.println("enter a vagitable name");		
		String vagName=scr.next();
		
		Vagitable v=shop.getVagitable(vagName);
		
		if (v instanceof Potato)
			((Potato)v).preparingFries();
		if (v instanceof Capcicum)
			((Capcicum)v).preparingBujji();
	}
}
