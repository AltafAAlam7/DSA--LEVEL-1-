import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i  < n; i++){
            arr[i] = scn.nextInt();
        }
	    System.out.println(solution(arr));
	}
	public static int solution(int[] arr){
	    HashSet<Integer> set = new HashSet<>();
	    
	    for(int ch : arr){
	        set.add(ch);
	    }
		int k = set.size();
		return atmostK(arr,k)-atmostK(arr,k-1);
	}
	public static int atmostK(int[] str, int k) {
		// write your code here
		int count =0;
		int i=0;
		int j=-1;
		HashMap<Integer,Integer> map = new HashMap<>();
		while(i<str.length){
		    while(i<str.length){
                int ch = str[i];
                map.put(ch, map.getOrDefault(ch,0)+1);
                if(map.size()>k){
                    i++;
                    break;
                }
                else{
                    count += i-j;
                }
                i++;
            }
            if(i==str.length && map.size()<=k)
                break;
            while(j<i-1){
                j++;
                int ch = str[j];
                
                if(map.get(ch)==1)
                    map.remove(ch);
                else{
                    map.put(ch,map.get(ch)-1);
                }

                if(map.size()==k){
                    count += i-j-1;
                    break;
                }
            }
		}
		return count;
	}

}
