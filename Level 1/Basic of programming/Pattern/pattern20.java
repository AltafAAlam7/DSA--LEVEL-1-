import java.util.Scanner;


public class pattern20 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int spaces=0;
        int stars=n;

        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=spaces;j++)
                System.out.print("\t");
            for(int j=1;j<=stars;j++)
            {
                if(i==1)
                     System.out.print("*\t");
                else if(i<=n/2 && (j>1 && j<stars))
                    System.out.print("\t");
                else 
                    System.out.print("*\t");
            }
            System.out.println();
            if(i<=n/2)
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
