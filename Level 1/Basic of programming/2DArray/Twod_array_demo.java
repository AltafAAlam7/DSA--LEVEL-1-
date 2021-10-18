import java.util.Scanner;


public class Twod_array_demo {
    public static void main(String[] args) {
     
        Scanner scn = new Scanner(System.in);
        int n= scn.nextInt();
        int m= scn.nextInt();

        int [][] arr = new int[n][m];
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
                arr[i][j]=scn.nextInt();
        }

        //display

        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
                System.out.print(arr[i][j]+" ");

            System.out.println();
        }
        scn.close();
    }
}