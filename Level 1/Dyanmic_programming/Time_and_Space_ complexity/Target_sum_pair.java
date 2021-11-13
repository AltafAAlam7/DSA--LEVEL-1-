import java.util.Arrays;
import java.util.*;
public class Target_sum_pair {
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
            arr[i]=scn.nextInt();
        
        int tar= scn.nextInt();

        Arrays.sort(arr);
        int low = 0;
        int high = arr.length-1;

        while(low<high)
        {
            if(arr[low]+arr[high]==tar)
            {
                System.out.println(arr[low]+"-"+arr[high]);
                high--;
                low++;
            }
            else if(arr[low]+arr[high]>tar)
                high--;
            else 
                low++;
        }
        scn.close();
    }
}
