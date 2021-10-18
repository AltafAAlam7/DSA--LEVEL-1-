import java.util.Scanner;

public class BinarySearch2D {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int [][] arr = new int[n][n];
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
                arr[i][j]=scn.nextInt();
        }
        int x = scn.nextInt();

        // start from top right element;

        // int i=0;
        // int j=arr[0].length-1;
        // while(i<arr.length && j>=0)
        // {
        //     if(x>arr[i][j])
        //         i++;
        //     else if(x<arr[i][j])
        //         j--;
        //     else 
        //     {
        //         System.out.println(i);
        //         System.out.println(j);
        //         scn.close();
        //         return;
        //     }
        // }

        // My approch -
        //1. by applying Binary Search in last column find element if found
        // 2.return else find ceil value and its row no 
        // 3.search in the row no using binary search and if founcd return else element not found

        int i = BinarySearch2DCol(arr,0,arr.length,x,arr[0].length-1);
        if(i==-1)
        {
            System.out.println("Not Found");
            scn.close();
            return;
        }
        int j = BinarySearch2DRow(arr,0,arr[0].length, x, i);
        if(j==-1)
        {
            System.out.println("Not Found");
            scn.close();
            return;
        }
        System.out.println(i);
        System.out.println(j);
        scn.close();
    }
    public static int BinarySearch2DCol(int [][] arr,int low ,int high, int key,int col)
    {
        int ans_col=-1;
        while(low<=high)
        {
            int mid = (low +high)/2;
            if(arr[mid][col]<key)
                low=mid+1;
            
            else if(arr[mid][col]>key)
            {
                high=mid-1;
                ans_col=mid;
            }
            else
            {
                ans_col=mid;
                return ans_col;
            }
        }
        return ans_col;
    }
    public static int BinarySearch2DRow(int [][] arr,int low ,int high, int key,int row)
    {
        while(low<=high)
        {
            int mid = (low +high)/2;
            if(arr[row][mid]<key)
                low=mid+1;
            
            else if(arr[row][mid]>key)
            {
                high=mid-1;
            }
            else
            {
                return mid;
            }
        }
        return -1;
    }


}
