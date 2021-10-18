
import java.util.*;

public class FirstAndLastIndex{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn = new Scanner(System.in);

        int n=scn.nextInt();
        int [] arr= new int[n];
        for(int i=0;i<n;i++)
            arr[i]=scn.nextInt();
        int key=scn.nextInt();

        int first=fbinarysearch(arr,key);
        int last=lbinarysearch(arr,key);
        
        System.out.println(first);
        System.out.println(last);
        scn.close();
    }
    public static int fbinarysearch(int[] arr,int key)
    {
        int low=0;
        int high=arr.length-1;
        int first_Index=-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
                
            if(arr[mid]==key)
                {
                    first_Index=mid;
                    high=mid-1;
                }
            else if(arr[mid]>key)
                high = mid -1;
            else 
                low = mid + 1;
        }
        return first_Index;
    }
     public static int lbinarysearch(int[] arr,int key)
    {
        int low=0;
        int high=arr.length-1;
        int last_Index=-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
                
            if(arr[mid]==key)
                {
                    last_Index=mid;
                    low=mid+1;
                }
            else if(arr[mid]>key)
                high = mid -1;
            else 
                low = mid + 1;
        }
        return last_Index;
    }
 

}