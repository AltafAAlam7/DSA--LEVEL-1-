/*
n=4

4444444
4*****4
4*222*4
4*2*2*4
4*222*4
4*****4
4444444

*/

import java.util.Scanner;

public class testQ4 {
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
                    if(val%2==0) 
                        System.out.print(val);
                    else 
                        System.out.print("*");
                    val--;
                }
            for(int j=1;j<=stars;j++)
               {
                    if(sp%2==0) 
                        System.out.print(sp);
                    else 
                      System.out.print("*");
               }
            for(int j=1;j<=spaces;j++)
               {
                   val++;
                   if(val%2==0)
                     System.out.print(val);
                   else
                     System.out.print("*");
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