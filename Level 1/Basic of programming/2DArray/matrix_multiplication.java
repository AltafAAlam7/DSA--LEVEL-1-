import java.util.Scanner;

public class matrix_multiplication {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n1= scn.nextInt();
        int m1 = scn.nextInt();

        int [][] arr1 = new int[n1][m1];
        for(int i=0 ;i<arr1.length;i++)
        {
            for(int j=0;j<arr1[0].length;j++)
                arr1[i][j] = scn.nextInt();
        }

        int n2= scn.nextInt();
        int m2 = scn.nextInt();

        int [][] arr2 = new int[n2][m2];
        for(int i=0 ;i<arr2.length;i++)
        {
            for(int j=0;j<arr2[0].length;j++)
                arr2[i][j] = scn.nextInt();
        }
        
        if(m1!=n2)
        {
            System.out.println("Can't Multiply Two Matrix");
            scn.close();
            return;
        }

     
        //Multiply matrix arr1 and arr2 and store result in arr3;
        int [][] result = matrix_multiply(arr1, arr2);

        // display
        display(result);

        scn.close();
        

    }
    public static void display(int [][] arr)
    {
        for(int i=0 ;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
                System.out.print(arr[i][j]+" ");
            System.out.println();
        }
    }
    public static int [][] matrix_multiply(int [][]arr1,int [][] arr2)
    {
        
        int n = arr1.length;
        int m = arr2[0].length;
        
        int [][] arr3 = new int [n][m];

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                int c =0;
                for(int k=0;k<arr1[0].length;k++) //arr1[0].length is common length
                    c+= arr1[i][k] * arr2[k][j];
                arr3[i][j]=c;
            }
        }
        return arr3;
    }
}
