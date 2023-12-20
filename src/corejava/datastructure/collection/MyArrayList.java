package corejava.datastructure.collection;
//TODO
public class MyArrayList {
	private Object[] a;
	private int p=0;
	public MyArrayList() {
		a=new Object[5];
	}
	public void add(Object e) {
		if(p>=a.length) increaseCapacity();
		p++;
		a[p] = e;
	}
	public void add(int index, Object e) {
		if(index>=size()) throw new IndexOutOfBoundsException(); 
		if(p>=a.length) increaseCapacity(); 
		for(int i=size()-1; i>=index; i--) {
			a[i+1]=a[i];
		}
		a[index]=e;
		p++;
	}
	private void increaseCapacity() {
		Object[] temp=new Object[a.length+5];
		for(int i=0; i<a.length; i++) {
			temp[i]=a[i];
		}
		a=temp;
	}
	public Object get(int index) {
		if(index>=size()) {
			throw new IndexOutOfBoundsException();
		}
		return a[index];
	}
	public void remove(int index) {
		if(index>=size())
			throw new IndexOutOfBoundsException();
		for(int i=index+1; i<size(); i++) {
			a[i-1]=a[i];
		}
		--p;
		a[p]=null;
	}
	public void clear() {
		a=new Object[5];
		p=0;
	}
	public int size() {
		return p;
	}
	public String toString() {
		if(size()==0) return "[]";
		String s="["+a[0];
		for(int i=1; i<size(); i++) {
			s+=","+a[i];
		}
		return s+"]";
	}
}
