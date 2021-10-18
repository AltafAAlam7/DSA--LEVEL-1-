import java.util.Scanner;

public class AnyAddition {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int b=scn.nextInt();
        int n1=scn.nextInt();
        int n2=scn.nextInt();
        

        int ans=getSum(n1,n2,b);
        System.out.println(ans);
        scn.close();
    }
    public static int getSum(int n1,int n2,int b)
    {
        int dn=0;
        int k=1;
        int c=0;
        while(n1>0 || n2>0 || c>0){

            int d1=n1%10;
            n1=n1/10;

            int d2=n2%10;
            n2=n2/10;

            int d=d1+d2+c;
            c=d/b;
            int r=d%b;

            dn= dn +r*k;
            k=k*10;

            
        }
        return dn;
    }
}
