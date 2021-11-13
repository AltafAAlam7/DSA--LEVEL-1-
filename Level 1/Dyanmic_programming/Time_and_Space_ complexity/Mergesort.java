import java.util.*;
public class Mergesort {
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
            arr[i]=scn.nextInt();
        
        int ans[] = merge_sort(arr,0,arr.length-1);
        for(int i=0;i<ans.length;i++)
            System.out.print(ans[i]+" ");
        
        scn.close();
    }
    public static int[] merge_sort(int[] arr,int low,int high)
    {
        if(low==high)
        {
            int[] ba = new int[1];
            ba[0]=arr[low];
            return ba;
        }
        int mid = (low+high)/2;
        int[] fsh = merge_sort(arr,low,mid);
        int[] ssh = merge_sort(arr, mid+1, high);
        int[] ans = merge2sortedarray(fsh,ssh);

        return ans;
    }
    public static int[] merge2sortedarray(int[] a, int[] b)
    {
        int[] ans = new int[a.length+ b.length];
        int i=0,j=0,k=0;

        while(i<a.length && j<b.length)
        {
            if(a[i]<=b[j])
                ans[k++]=a[i++];
            else
                ans[k++]=b[j++];
        }

        for(;i<a.length;i++)
            ans[k++]=a[i];
        for(;j<b.length;j++)
            ans[k++]=b[j];
        
        return ans;
    }
}
