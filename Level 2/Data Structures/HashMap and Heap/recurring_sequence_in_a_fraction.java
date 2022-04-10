import java.util.*;

public class Main {

    public static String solution(int num, int den) {
        // write your code here
        StringBuilder str = new StringBuilder();
        double q = num /den;
        int rem = num % den;

        HashMap<Integer,Integer> map  = new HashMap<>();
        
        str.append(""+(int)q);
        if(rem==0){
            return str.toString();
        }
        str.append('.');
        map.put(rem,map.getOrDefault(rem,str.length()));
        while(rem!=0){
            int tnum = rem * 10;
            while(tnum<den){
                tnum *= 10;
                str.append("0");
            }
             
            rem = tnum % den;
            int tq = tnum / den;
            str.append(""+tq);
            if(map.containsKey(rem)){
                int idx = map.get(rem);
                str.insert(idx, "(");
                str.append(")");
                return str.toString();
            }else{
            map.put(rem,map.getOrDefault(rem,0)+str.length());
            }
        }

        return str.toString();

        
    }
    
    public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		int den = scn.nextInt();
		System.out.println(solution(num , den));
	}

}
