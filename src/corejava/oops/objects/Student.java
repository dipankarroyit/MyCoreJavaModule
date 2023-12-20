package corejava.oops.objects;

class Student {
    String name;
    int fees;
    void updateFees(int f){
        fees += f;
        System.out.println("fees update for = "+name);
    }
    void displayFeesPaid(){
        System.out.println(name+" total fees paid = "+fees);
    }
    public static void main(String[] args) {
        Student s1=new Student();
        s1.name="Dipanker";
        Student s2=new Student();
        s2.name="Samu";
        s1.updateFees(20000);
        s2.updateFees(30000);
        s1.displayFeesPaid();
        s2.displayFeesPaid();
    }
}
