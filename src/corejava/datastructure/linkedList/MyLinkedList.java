package corejava.datastructure.linkedList;

class Node {
	Object ele;
	Node next;
	Node (Object e, Node n){
		ele = e;
		next = n;
	}
}
public class MyLinkedList {
	private Node first = null;
	private int count = 0;
	
	public void add(Object e) {
		if (first == null) {
			first = new Node(e, null);
			count++;
			return;
		}
		Node last = first;
		while (last.next != null) {
			last = last.next;
		}
		last.next = new Node(e, null);
		count++;
	}
	
	public int size() {
		return count;
	}
	
	public void traverse() {
		if (first==null) {
			System.out.println("no component");
		}
	}
}
