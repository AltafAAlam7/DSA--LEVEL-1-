class Solution {
    public int findMaxLength(int[] arr) {
        
        int maxlen = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        int sum=0;
        map.put(sum,-1);
        
        for(int i=0;i<arr.length;i++){
            int tlen=0;
            sum+=(arr[i]==0?-1:1);
            if(map.containsKey(sum)){
                int idx = map.get(sum);
                tlen = i-idx;
            }
            else{
                map.put(sum,i);
            }
            maxlen =  Math.max(maxlen,tlen);
        }
        return maxlen;
    }
}