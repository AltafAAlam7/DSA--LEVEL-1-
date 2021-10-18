import java.util.Scanner;

public class pascal {
    public static void main(String[] args) {
        
        Scanner scn= new Scanner(System.in);

        int n= scn.nextInt();

        int stars=1;
        
        for(int i=0;i<n;i++)
        {
            int val=1;
            for(int j=0;j<stars;j++)
            {
                System.out.print(val+"\t");
                val= val*(i-j)/(j+1);

            }
            System.out.println();
            stars++;
        }
        scn.close();
    }
}
