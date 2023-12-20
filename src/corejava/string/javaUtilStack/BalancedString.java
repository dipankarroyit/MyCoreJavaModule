package corejava.string.javaUtilStack;
import java.util.Stack;

public class BalancedString {
	public static void main(String[] args) {
		System.out.println(isStringBalanced("[{2*5}*6]"));
		System.out.println(isStringBalanced("[{2*5}*6)"));
	}
	static boolean isStringBalanced(String s) {
		Stack<Character> stack=new Stack<Character>();
		for(int i=0; i<s.length(); i++) {
			char c=s.charAt(i);
		if(c=='[' || c=='{' || c=='(') stack.push(c);
		else if(c==']' || c=='}' || c==')') {
			if(stack.isEmpty()) return false;
			char c2=stack.pop();
			if(!pair(c2,c)) return false;
		}
		}
		if(stack.isEmpty()) return true;
		return false;
	}
	static boolean pair(char c1, char c2) {
		if(c1=='[' && c2==']') return true;
		if(c1=='{' && c2=='}') return true;
		if(c1=='(' && c2==')') return true;
		return false;
	}
}
