import java.util.Scanner;

public class pattern12 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n= scn.nextInt();

        int t1=0;
        int t2=1;
        int s=0;
        int stars=1;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=stars;j++)
            {
                System.out.print(t1+"\t");
                s=t1+t2;
                t1=t2;
                t2=s;

            }
            System.out.println();
            stars++;
        }
        scn.close();
    }
}
