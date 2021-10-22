
import java.util.Scanner;


// 1. You are given a number n.
//       2. You've to write code to print the pattern given in output format below
// Input Format
// A number n
// Example n = 7
// Output Format
// *    *	*	*	*	*	*	
// 	    *	*	*	*	*	
// 		   *	*	*	
// 			    *	
// 		   *		*	
// 	    *				*	
// *	*	*	*	*	*	*	
public class patternInvertedHourglass {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n= scn.nextInt();

        int stars = n;
        int spaces = 0;

        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=spaces;j++)
                System.out.print("\t");
            
            for(int j=1;j<=stars;j++)
            {
                if(i>n/2 + 1)
                {
                    if(j==1 || j==stars|| i==n)
                        System.out.print("*\t");
                    
                    else
                        System.out.print("\t");
                }
                else
                    System.out.print("*\t");
            }
            
            System.out.println();

            if(i<n/2 +1)
            {
                stars-=2;
                spaces++;
            }
            else
            {
                stars+=2;
                spaces--;
            }
        }
        scn.close();
    }
   
}
