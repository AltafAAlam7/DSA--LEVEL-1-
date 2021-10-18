/* 
n =5


1       2       3       4       5 
11      *       *       *       15
21      *       *       *       25
16      *       *       *       20
6       7       8       9       10

*/
import java.util.Scanner;

public class testQ3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n=scn.nextInt();

        int k=0;
        int sv =0;
        for(int i=1;i<=n;i++)
        {
            sv = n*k +1;
            for(int j=1 ;j<=n;j++)
            {
                if(i==1|| i==n)
                {
                    System.out.print(sv++ +"\t");
                }
                else
                {
                    if(j==1 || j==n)
                        System.out.print(sv++ +"\t");
                    else 
                        {System.out.print("*\t");
                        sv++;
                        }
                }
            }
            System.out.println();
            
            if(n%2==0)
            {
                if(i<n/2)
                    k=k+2;
                else if(i==n/2)
                    k=k+1;
                else 
                    k=k-2;
            }
            else{
                if(i<=n/2)
                    k=k+2;
                else if(i==n/2+1)
                    k=k-1;
                else 
                    k=k-2;
            }
            scn.close();
        }
    }
}
