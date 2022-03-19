static int countSubarrWithEqualZeroAndOne(int arr[], int n)
    {
        // add your code here
        int ans = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        
        int sum =0;
        map.put(sum,1);
        
        for(int val:arr){
            sum+=(val==0?-1:1);
            
            if(map.containsKey(sum)){
                int count = map.get(sum);
                ans+=count;
                map.put(sum,count+1);
            }
            else{
                map.put(sum,1);
            }
        }
        
        return ans;
        
    }