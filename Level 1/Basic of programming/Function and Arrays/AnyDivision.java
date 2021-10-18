import java.util.Scanner;

public class AnyDivision {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n1=scn.nextInt();
        int n2=scn.nextInt();
        int b=scn.nextInt();

        int ans=Divison(n1,n2,b);

        System.out.println(ans);
        scn.close();
    }
    public static int Divison(int n1,int n2,int b)
    {
        int decin1=BaseTodecimal(n1,b);
        int decin2=BaseTodecimal(n2, b);

        int decians=decin1/decin2;

        return DecimaltoBase(decians, b);
    }
    public static int BaseTodecimal(int n,int b){
        int ans=0;
        int k=1;

        while(n>0)
        {
            int d=n%10;
            n=n/10;

            ans=ans+d*k;
            k=k*b;

        }
        return ans;
    }
    public static int DecimaltoBase(int n,int b)
    {
        int ans=0;
        int k=1;
        while(n>0)
        {
            int d=n%b;
            n=n/b;

            ans=ans+d*k;
            k=k*10;

        }
        return ans;
    }
}
