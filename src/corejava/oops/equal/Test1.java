package corejava.oops.equal;

class Student {
	String name;
	long phoneNum;
	Student(String name, long phoneNum) {
		this.name=name;
		this.phoneNum=phoneNum;
	}
	public boolean equal(Object arg) {
		if (!(arg instanceof Student)) return false;
		Student s=(Student)arg;
		return name.equals(s.name) && phoneNum==s.phoneNum;
	}
}
public class Test1 {
	public static void main(String[] args) {
		Student s1=new Student("Dipankar",52374523);
		Student s2=new Student("Samu",63425454);
		Student s3=new Student("Samu",63425454);
		System.out.println(s1==s2);
		System.out.println(s1.equal(s2));
		System.out.println(s2.equal(s3));
	}
}
