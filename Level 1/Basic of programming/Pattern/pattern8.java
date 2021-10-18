import java.util.Scanner;

public class pattern8 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();

        int spaces=n/2;

        for(int i=1;i<=n;i++)
        {
            System.out.print("*\t");
            for(int j=1;j<=spaces;j++)
                System.out.print("\t");
            if(i!=n/2)
                System.out.print("*");
            System.out.println();
            spaces--;
        }
        scn.close();
    }
}
