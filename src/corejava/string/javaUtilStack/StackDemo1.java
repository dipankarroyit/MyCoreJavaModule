package corejava.string.javaUtilStack;
import java.util.Stack;

public class StackDemo1 {
	public static void main(String[] args) {
		Stack s=new Stack();
		s.push(1);
		s.push(2);
		s.push(3);
		System.out.println("Size = "+s.size());
		System.out.println(s.pop());
		s.push(4);
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.isEmpty());
		System.out.println(s.pop());
		System.out.println(s.isEmpty());
	}
}
