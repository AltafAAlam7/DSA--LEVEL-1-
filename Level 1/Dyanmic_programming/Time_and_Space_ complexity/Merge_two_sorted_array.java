import java.util.*;
public class Merge_two_sorted_array {
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++)
            a[i]=scn.nextInt();
        
        int m = scn.nextInt();
        int[] b = new int[m];
        for(int i=0;i<m;i++)
            b[i]=scn.nextInt();
        
        int[] ans = merge2sortedarray(a,b);
        for(int i=0;i<ans.length;i++)
            System.out.print(ans[i]+" ");

        scn.close();
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
