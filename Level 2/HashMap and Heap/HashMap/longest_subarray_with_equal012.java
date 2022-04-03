import java.util.*;

public class Main {

    public static int solution(int[] arr) {
        // write your code here
        int mlen = 0;
        
        HashMap<String,Integer> map = new HashMap<>();
        int c1 =0;
        int c2 =0;
        int c0 =0;
        
        String key = Integer.toString(c1-c0) + '#' + Integer.toString(c2-c1);
        
        map.put(key,-1);
        for(int i=0;i<arr.length;i++){
            
            if(arr[i]==0)
                c0++;
            else if(arr[i]==1)
                c1++;
            else
                c2++;
            
            key = Integer.toString(c1-c0) + '#' + Integer.toString(c2-c1);
            int tlen=0;
            if(map.containsKey(key)){
                int idx = map.get(key);
                tlen = i-idx;
            }
            else{
                map.put(key,i);
            }
            mlen = Math.max(mlen,tlen);
        }
        return mlen;

    }
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        System.out.println(solution(arr));
    }

}
