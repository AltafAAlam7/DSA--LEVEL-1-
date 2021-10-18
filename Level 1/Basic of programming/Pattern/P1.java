
import java.util.Scanner;

public class P1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n= scn.nextInt();
        int stars=2*n-1;
        int spaces=0;
        int val=n;
        int sp=val;
        for(int i=1;i<=2*n-1;i++)
        {
            for(int j=1;j<=spaces;j++) 
                {
                    System.out.print(val);
                    val--;
                }
            for(int j=1;j<=stars;j++)
               {
                    System.out.print(sp);
               }
            for(int j=1;j<=spaces;j++)
               {
                   val++;
                    System.out.print(val);
               }

            System.out.println();
            if(i<n)
            {
                stars-=2;
                spaces++;
                sp--;
            }
            else
            {
                stars+=2;
                spaces--;
                sp++;
            }
        }
        scn.close();
    }
}
