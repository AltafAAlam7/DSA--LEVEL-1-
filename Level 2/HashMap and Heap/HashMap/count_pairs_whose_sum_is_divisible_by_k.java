public static int countKdivPairs(int arr[], int n, int k)
    {
        //code here
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int val: arr){
            int r = val%k;
            if(r<0)
                r+=k;
            map.put(r,map.getOrDefault(r,0)+1);
        }
        
        int left = 1;
        int right = k-1;
        int ans=0;
        while(left<=right){
            if(map.containsKey(left) && map.containsKey(right)){
                int lc = map.get(left);
                int rc = map.get(right);
                
                if(left==right){
                    ans+=(lc*(lc-1))/2;
                }
                else{
                    ans+=rc*lc;
                }
            }
            left++;
            right--;
        }
        if(map.containsKey(0)){
            int ct = map.get(0);
            ans+=(ct*(ct-1))/2;
        }
        return ans;
    }