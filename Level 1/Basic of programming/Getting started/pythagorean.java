import java.util.Scanner;

public class pythagorean{
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);

        int a=scn.nextInt();
        int b=scn.nextInt();
        int c=scn.nextInt();

        int a2=a*a, b2=b*b, c2=c*c;
        boolean bol=false;

        if(a2+b2==c2 ||a2+c2==b2 || b2+c2==a2 )
            bol=true;
        
        System.out.println(bol);
        scn.close();
    }
    
}