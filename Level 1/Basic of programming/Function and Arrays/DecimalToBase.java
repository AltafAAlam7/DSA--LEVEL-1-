import java.util.Scanner;



public class DecimalToBase {
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        
        int n=scn.nextInt();
        int b=scn.nextInt();

        int ans=DeciToBase(n,b);
        System.out.println(ans);
        scn.close();
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
