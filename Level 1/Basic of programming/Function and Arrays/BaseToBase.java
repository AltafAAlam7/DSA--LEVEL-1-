import java.util.Scanner;

public class BaseToBase {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n=scn.nextInt();
        int b1=scn.nextInt();
        int b2=scn.nextInt();

        int ans=BasetoBase(n,b1,b2);
        System.out.println(ans);
        scn.close();

    }
    public static int BasetoBase(int n,int b1,int b2)
    {
        int deci;
        int ans;

        deci=BaseToDeci(n, b1);
        ans=DeciToBase(deci, b2);

        return ans;

    }
    public static int BaseToDeci(int n,int b)
    {
        int dn=0;
        int k=1;
        while(n>0)
        {
            int r=n%10;
            n=n/10;

            dn= dn + r*k;
            k=k*b;
        }
        return dn;

    }
    public static int DeciToBase(int n,int b){

        int dn=0;
        int k=1;
        while(n>0)
        {
            int r=n%b;
            n=n/b;

            dn=dn+r*k;
            k=k*10;

        }
        return dn;
    }
}
