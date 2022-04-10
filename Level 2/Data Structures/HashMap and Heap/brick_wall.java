class Solution {
    public int leastBricks(List<List<Integer>> wall) {
        HashMap<Integer,Integer> map = new HashMap<>();
        
        int presum = 0;
        int maxSpace = 0;
        for(int i=0;i<wall.size();i++){
            for(int j=0;j<wall.get(i).size()-1;j++){
                presum += wall.get(i).get(j);
                map.put(presum,map.getOrDefault(presum,0)+1);
                if(map.get(presum) > maxSpace)
                    maxSpace = map.get(presum);
            }
            presum=0;
        }
        return wall.size() - maxSpace;
    }
}