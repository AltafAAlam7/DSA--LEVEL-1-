/*
*     *
 *   *
  * *
   *
  * *
 *   *
*     * 
*/
import java.util.Scanner;
public class P3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner (System.in);
        int n = scn.nextInt();

        for(int i=1;i<=2*n-1;i++)
        {
            for(int j=1;j<=2*n-1;j++)
            {
                if(i==j||j+i==2*n)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
        System.out.println();
        }
        scn.close();
    }
}
