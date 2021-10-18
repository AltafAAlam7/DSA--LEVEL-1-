import java.util.Scanner;

public class SpiralDisplay {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        
        int [][] arr = new int[n][m];
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
                arr[i][j]=scn.nextInt();

        }
        //Spiral Display
        int total=n*m;
        int count=0;
        int rmin=0,cmin=0;
        int rmax=arr.length-1;
        int cmax=arr[0].length-1;
        while(count<total)
        {
            for(int i=rmin,j=cmin;i<=rmax && count<total;i++)
               {
                    System.out.println(arr[i][j]);
                    count++;
               } 
            cmin++;

            for(int i=rmax,j=cmin;j<=cmax && count<total;j++)
            {
                System.out.println(arr[i][j]);
                count++;
           } 
            rmax--;


            for(int i=rmax,j=cmax;i>=rmin && count<total;i--)
            {
                System.out.println(arr[i][j]);
                count++;
           } 
            cmax--;

            for(int i=rmin,j=cmax;j>=cmin && count<total;j--)
            {
                System.out.println(arr[i][j]);
                count++;
           } 
            
            rmin++;    
        }
        scn.close();
    }
}
