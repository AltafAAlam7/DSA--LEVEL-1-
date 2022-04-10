import java.util.HashMap;

class Solution {
    public int subarraySum(int[] arr, int k) {
        int ans = 0;
        HashMap<Integer,Integer> map = new HashMap<>();

        int sum =0;
        map.put(sum,1);
        for(int val:arr){
            sum+=val;

            if(map.containsKey(sum-k)){
                int count = map.get(sum-k);
                ans+=count;
            }
            if(map.containsKey(sum)){
                int count = map.get(sum);
                map.put(sum,count+1);
            }
            else{
                map.put(sum,1);
            }
        }
        return ans;
    }
}