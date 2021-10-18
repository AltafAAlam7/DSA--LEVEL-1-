import java.util.Scanner;

public class BrokenEconomy {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();

        int [] arr = new int[n];
        for(int i=0;i<n;i++)
            arr[i]=scn.nextInt();
        
        int d=scn.nextInt();

        int index=binarysearch(arr,d);

        if(arr[index]!=d){
            if(index<arr.length)
                 System.out.println(arr[index]);
            if(index-1>=0)
                System.out.println(arr[index-1]);
        
        }
         else
             System.out.println(arr[index]);
         scn.close();
    }
    public static int binarysearch(int[] arr,int key)
    {
        int low=0;
        int high=arr.length-1;

        while(low<=high)
        {
            int mid=(low+high)/2;

            if(arr[mid]==key)
                return mid;
            else if(arr[mid]>key)
                high = mid -1;
            else 
                low = mid + 1;
        }
        return low;
    }
}
