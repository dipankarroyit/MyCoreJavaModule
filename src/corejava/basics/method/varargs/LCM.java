package corejava.basics.method.varargs;

class LCM {
    //todo
    static int lcm(int...a){
        //identify bigger number
        int big=a[0];
        for (int i=1; i<a.length; i++){
            {
                if (a[i]>big) big=a[i];
            }
        }
        while (true){
            boolean flag=true;
            for (int i=0; i<a.length; i++){
                if (big%a[i]!=0)
                    flag=false;
                break;
            }
        }
        //if (false) return big;
     //   big++;
    }
    public static void main(String[] args) {
        int res=lcm(4,6,7,8);
        System.out.println(res);
    }
}
