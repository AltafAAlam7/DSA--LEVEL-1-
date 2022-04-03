import java.util.*;

public class Main {

    public static int solution(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int val:arr){
            map.put(val,map.getOrDefault(val,0)+1);
        }
        int min = 0;
        for(int key:map.keySet()){
            int gs = key+1;
            int nr = map.get(key);
            
            min += Math.ceil(nr*1.0/gs*1.0)*gs;
            
        }
        return min;
    }
    
    public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		for(int i = 0 ; i < n; i++){
			arr[i] = scn.nextInt();
		}
		System.out.println(solution(arr));
	}

}
