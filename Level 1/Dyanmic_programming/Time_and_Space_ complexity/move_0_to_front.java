import java.util.Scanner;

// Ques Move 0 to front of array and move non-zero elements
//      to end side of array without changing relative order of non-zeros elements

public class move_0_to_front {
    public static void main(String [] args)
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
            arr[i]=scn.nextInt();
        
        Front(arr);
        for(int val : arr)
            System.out.print(val+" ");
        scn.close();
        
    }
    public static void Front(int[] arr)
    {
        int i=arr.length-1;
        int j=arr.length-1;

        while(i>=0)
        {
            if(arr[i]!=0)
            {
                swap(arr,i,j);
                i--;
                j--;
            }
            else
                i--;
        }
    }
    public static void swap(int[] arr,int i,int j)
    {
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
