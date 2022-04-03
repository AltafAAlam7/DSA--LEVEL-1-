import java.util.*;

public class same_differences{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        
        while(t>0){
            int n = scn.nextInt();
            
            int[] arr = new int[n];
            for(int i=0;i<arr.length;i++)
                arr[i]=scn.nextInt();
            
            HashMap<Integer,Integer> map = new HashMap<>();
            
            for(int i=0;i<arr.length;i++){
                
                map.put(arr[i]-i,map.getOrDefault(arr[i]-i,0)+1);
            }
            long ans =0;
            for(int key: map.keySet()){
                long val = (long)map.get(key);
                ans+=(val*(val-1))/2;
            }
            System.out.println(ans);
            
         t--;   
        }
    }
}