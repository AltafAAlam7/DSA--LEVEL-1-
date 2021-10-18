import java.util.Scanner;

public class BaseToDecimal {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n=scn.nextInt();
        int b=scn.nextInt();

        int deci=BaseToDeci(n,b);
        System.out.println(deci);
        scn.close();
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

}
