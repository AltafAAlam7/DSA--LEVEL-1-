import java.util.*;
public class Saddlepoint{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int [][] arr = new int[n][n];
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
                arr[i][j]=scn.nextInt();
        }

        // Saddle point Algorithm

        for(int i=0;i<arr.length;i++)
        {
            int min = arr[i][0];
            int pst = 0;
            for(int j=0;j<arr[0].length;j++)
            {
                if(arr[i][j]<min)
                {
                    min=arr[i][j];
                    pst=j;
                }
            }

            boolean IsSaddlePoint=true;
            for(int ii=0;ii<arr.length;ii++)
            {
                if(min<arr[ii][pst])
                {
                    IsSaddlePoint=false;
                    break;
                }
            }
            if(IsSaddlePoint)
            {   System.out.println(min);
                scn.close();
                return;
            }
        }
        System.out.println("Invalid input");

        scn.close();
    }
}