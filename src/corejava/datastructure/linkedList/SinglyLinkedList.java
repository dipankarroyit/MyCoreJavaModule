package corejava.datastructure.linkedList;
class Node1 {
	Object ele;
	Node1 next;
	Node1(Object e, Node1 n){
		ele=e;
		next=n;
	}
	private Node1 first;
	private int count=0;
	public void add(Object e) {
		if(first==null) {
			first=new Node1(e,null);
			count++;
			return;
		}
		Node1 last=first;
		while(last.next!=null) {
			last=last.next;
		}
		last.next=new Node1(e,null);
		count++;
	}
}

public class SinglyLinkedList {
	public static void main(String[] args) {
			Node1 first=null;
			first=new Node1(10,null);
			first.next=new Node1(30,null);
			first.next.next=new Node1(30,null);
			first.next.next.next=new Node1(40,null);
			first.next.next.next.next=new Node1(50,null);
	}
}
