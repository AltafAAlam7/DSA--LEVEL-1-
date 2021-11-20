import java.util.*;
public class sort_low_high {
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
            arr[i]=scn.nextInt();
        
        int a = scn.nextInt();
        int b = scn.nextInt();
        
        SortLowHigh(arr,a,b);
        for(int val:arr)
            System.out.print(val+" ");
        scn.close();
    }
    public static void SortLowHigh(int[] arr,int a,int b)
    {
        int i=0,j=0,k=arr.length-1;

        while(i<=k)
        {
            if(arr[i]<a)
            {
                swap(arr,i,j);
                i++;
                j++;
            }
            else if(arr[i]>=8 && arr[i]<=b)
            {
                i++;
            }
            else
            {
                swap(arr,i,k);
                k--;
            }
        }
    }
    public static void swap(int[] arr,int i,int j)
    {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

}
