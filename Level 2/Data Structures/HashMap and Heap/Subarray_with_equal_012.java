import java.util.*;

public class Main {

    public static int solution(int[] arr) {
        // write your code here
        int ans = 0;
        HashMap<Integer,Integer> map= new HashMap<>();
        int sum =0;
        map.put(sum, 1);

        for(int val:arr){
            sum+=(val==0?-3:val);

            if(map.containsKey(sum)){
                int count = map.get(sum);
                ans+=count;
                map.put(sum, count+1);
            }
            else{
                map.put(sum, 1);
            }
        }
        return ans;
        
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
