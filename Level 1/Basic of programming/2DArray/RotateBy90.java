import java.util.*;
public class RotateBy90 {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int [][] arr = new int[n][n];
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
                arr[i][j]=scn.nextInt();
        }
        //transpose
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i;j<arr[0].length;j++)
            {
                int temp = arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
        // swap row wise
        for(int i=0;i<arr.length;i++)
        {
            int start =0;
            int end =arr[0].length-1;
            while(start<end)
            {
                int temp = arr[i][start];
                arr[i][start]=arr[i][end];
                arr[i][end]=temp;
                start++;
                end--;
            }
        }
        display(arr);
        scn.close();
    }

    public static void display(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

}