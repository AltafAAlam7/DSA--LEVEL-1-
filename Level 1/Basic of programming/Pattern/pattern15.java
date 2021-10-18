import java.util.Scanner;

public class pattern15 {
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        int spaces=n/2;
        int stars=1;
        int val=1;
        
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=spaces;j++)
                System.out.print("\t");
            
            int sp=val;
            for(int j=1;j<=stars;j++)
            {
                System.out.print(sp+"\t");
                if(j<=n/2)
                    sp++;
                else
                    sp--;
            }
            System.out.println();
            if(i<=n/2)
            {
                stars+=2;
                spaces--;
                val++;
            }
            else
            {
                stars-=2;
                spaces++;
                val--;
                
            }

        }
        scn.close();
    }
}
