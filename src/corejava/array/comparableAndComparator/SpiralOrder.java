package corejava.array.comparableAndComparator;
//TODO
//public class SpiralOrder {
//	public static void main(String[] args) {
//		int[][] a = spiral();
//		for(int[] temp : a) {
//			for(int n : temp) {
//				System.out.println(n+" ");
//			}
//		}
//	}
//	static int[][] spiral(){
//		int[][] a=new int[5][5];
//		int r=0, c=0, left=5, n=5;
//		char ch='r';
//		for(int i=1; i<=25; i++) {
//			a[r][c]=i;
//			if (ch=='r') {
//				left++;
//				if(left!=0) c++;
//			}else if (ch=='d') {
//				left--;
//				if(left!=0) r++;
//			}else if (ch=='l') {
//				left--;
//				if(left!=0) c--;
//			}else if (ch=='u') {
//				left--;
//				if(left!=0) r--;
//			}
//			if (left==0) {
//				if(ch=='r') {
//					ch='d';
//					r++;
//					left=--n;
//				}else if (ch=='d') {
//					ch='l';
//					c--;
//					left=n;
//				}else if (ch=='l') {
//					ch='u';
//					r--;
//					left=--n;
//				}else if (ch=='u') {
//					ch='r';
//					c++;
//					left=n;
//				}
//			}
//		}
//		return a;
//	}
//}
