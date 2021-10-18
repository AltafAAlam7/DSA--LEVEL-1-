/*

n=4

*
* 1 *
* 1 2 1 *
* 1 2 3 2 1 *
* 1 2 3 4 3 2 1 *
* 1 2 3 2 1 *
* 1 2 1 *
* 1 *
*

*/
import java.util.Scanner;


public  class P4 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        int stars=0;
        for(int i=0;i<=2*n;i++)
        {
            if(i==0 || i==2*n)
             System.out.print("* ");
            
            else if( i>0 && i<n+1)
            {
                System.out.print("* ");
                for(int j=1;j<=stars;j++)
                    System.out.print(j+" ");
                for(int j=stars-1;j>=1;j--)
                    System.out.print(j+" ");
                
                 System.out.print("* ");
            }
            else 
            {

                System.out.print("* ");
                for(int j=1;j<=stars;j++)
                    System.out.print(j+" ");
                for(int j=stars-1;j>=1;j--)
                    System.out.print(j+" ");
                
                 System.out.print("* ");          
            }
            System.out.println();
            if(i<n)
                stars++;
            else  
                stars--;
        }
        scn.close();
    }
}
