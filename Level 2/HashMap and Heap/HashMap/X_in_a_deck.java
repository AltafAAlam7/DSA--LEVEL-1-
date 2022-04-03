import java.util.HashMap;

class Solution {
    public boolean hasGroupsSizeX(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int val:arr){
            map.put(val,map.getOrDefault(val, 0)+1);
        }

        int counter=0;
        int gcd =1;
        for(int key: map.keySet()){
            if(counter==0){
                gcd = map.get(key);
            }
            else{
                int num = map.get(key);
                gcd = GCD(num,gcd);
            }
        }
        return gcd>=2;
    }
    public int GCD(int n1,int n2){

        while(n1%n2!=0){
            int r = n1%n2;
            n1 = n2;
            n2 = r;
        }
        return n2;
    }
}