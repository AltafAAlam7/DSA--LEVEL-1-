import java.util.Scanner;

public class gcdlcm {
    public static void main(String[] args) {
        
        Scanner scn=new Scanner(System.in);
        int  n=scn.nextInt();
        int  m=scn.nextInt();
        int  a=n,b=m;
        while(n%m!=0)
        {
            int r=n%m;
            n=m;
            m=r;
        }
        int  lcm =(a*b)/m;
        
        System.out.println(m);
        System.out.println(lcm);
        scn.close();
    }
}
