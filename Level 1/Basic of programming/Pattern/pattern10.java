import java.util.*;

public class pattern10{
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        int n=scn.nextInt();

        int ospaces=n/2;
        int ispaces=-1;

        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=ospaces;j++)
                System.out.print("\t");
            
            System.out.print("*\t");

            for(int j=1;j<=ispaces;j++)
                System.out.print("\t");
            
            if(i>1 && i< n)
                System.out.print("*\t");
            
            System.out.println();
            if(i<=n/2)
            {
                ospaces--;
                ispaces+=2;
            }
            else
            {
                ospaces++;
                ispaces-=2;
            }

        }
        scn.close();
    }
}