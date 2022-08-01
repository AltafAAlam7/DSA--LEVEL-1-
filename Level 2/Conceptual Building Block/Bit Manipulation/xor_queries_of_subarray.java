class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int[] ans = new int[queries.length];
        int[] preXor = new int[arr.length];
        
        for(int i=0;i<arr.length;i++){
            if(i==0)
                preXor[i] = arr[i];
            else
                preXor[i] = arr[i]^preXor[i-1];
        }
        
        for(int i=0;i<queries.length;i++){
            int l = queries[i][0];
            int r = queries[i][1];
            
            if(l==0){
                ans[i]=preXor[r];
            }
            else{
                ans[i]=preXor[r]^preXor[l-1];
            }
        }
        return ans;
        
    }
    
}