public class function {

    public static void fun(){
        int temp=a;
        a=b;
        b=temp;
    }
    static int a=10;
    static int b=20;
    public static void main(String[] args) {
        fun();
        System.out.println(a+" "+b);
    }
}
