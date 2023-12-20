package corejava.oops.encapsulation;

class EncaptulationDemo {
	
	protected int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
class Test {
	public static void main(String[] args) {
		EncaptulationDemo a1=new EncaptulationDemo();
		a1.setId(20);
		System.out.println(a1.getId());
	}
}
