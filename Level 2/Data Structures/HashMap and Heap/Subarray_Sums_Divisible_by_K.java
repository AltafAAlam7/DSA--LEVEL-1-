
class Solution {
    public int subarraysDivByK(int[] arr, int k) {
        
        int ans =0;
        HashMap<Integer,Integer> map = new HashMap<>();
        
        int sum =0;
        map.put(sum, 1);

        for(int val: arr){

            sum+=val;
            int r = sum%k;
            if(r<0)
                r = r +k;
            if(map.containsKey(r)){
                int count = map.get(r);
                ans= ans+count;
                map.put(r,count+1);
            }
            else{
                map.put(r,1);
            }
        }

        return ans;
    }
}