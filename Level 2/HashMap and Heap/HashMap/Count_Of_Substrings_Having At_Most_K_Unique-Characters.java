import java.util.*;

public class Main {

	public static int solution(String str, int k) {
		// write your code here
		int count =0;
		int i=0;
		int j=-1;
		HashMap<Character,Integer> map = new HashMap<>();
		while(i<str.length()){
		    while(i<str.length()){
                char ch = str.charAt(i);
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
            if(i==str.length() && map.size()<=k)
                break;
            while(j<i-1){
                j++;
                char ch = str.charAt(j);
                
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
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
        String str = scn.next();
        int k = scn.nextInt();
		System.out.println(solution(str,k));
	}

}
