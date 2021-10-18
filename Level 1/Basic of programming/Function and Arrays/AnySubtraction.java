import java.util.Scanner;

public class AnySubtraction {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int b=scn.nextInt();
        int n1=scn.nextInt();
        int n2=scn.nextInt();

        int diff = getDiff(n1,n2,b);
        System.out.println(diff);
        scn.close();
    }
    public static int getDiff(int n1,int n2,int b)
    {
        int diff =0;
        int k=1;
        int c=0;

        while(n2>0)
        {
            int d1=n1%10;
            n1=n1/10;

            int d2=n2%10;
            n2=n2/10;

            int d=d2-c-d1;
            if(d<0){
                c=1;
                d=d+8;
            }
            else
                c=0;

            diff= diff +d*k;
            k=k*10;
        }
        return diff;
    }
}
