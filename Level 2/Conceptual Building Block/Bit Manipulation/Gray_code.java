import java.util.*;
 
 public class Main{
 
     public static List<Integer> grayCode(int n) {
 	 //Write your code here
        List<Integer> res = new ArrayList<>();

        if(n==0){
            res.add(0);
            return res;
        }
        else if(n==1){
            res.add(0);
            res.add(1);
            return res;
        }
        List<Integer> pres = grayCode(n-1);

        for(int i=0;i<pres.size();i++){
            int val = pres.get(i);
            res.add(val);
        }
        for(int i=pres.size()-1;i>=0;i--){
            int val = pres.get(i);
            int bm = (1<<(n-1));
            val = val + bm;
            res.add(val);
        }

        return res;
     }
 
     public static void main(String[] args) {
         Scanner scn = new Scanner(System.in);
         List<Integer> ans=grayCode(scn.nextInt());
         Collections.sort(ans);
         System.out.println(ans);
     }
 }