import java.util.*;
public class Sort01 {
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
            arr[i]=scn.nextInt();

        sort01(arr);
        for(int val:arr)
            System.out.print(val+" ");
        scn.close();;
    }
    public static void sort01(int[] arr)
    {
        int i=0;
        int j=0;

        while(i<arr.length)
        {
            if(arr[i]==0)
            {
                swap(arr,i,j);
                i++;
                j++;
            }
            else
                i++;
        }
    }
    public static void swap(int[]arr,int a,int b)
    {
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}
