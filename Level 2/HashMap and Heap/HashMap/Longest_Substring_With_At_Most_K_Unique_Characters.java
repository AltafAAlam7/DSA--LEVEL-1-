import java.util.*;

public class Main {

	public static int solution(String str, int k) {
		// write your code here
		String ans = "";
		int i=0;
		int j=-1;
		HashMap<Character,Integer> map = new HashMap<>();
		while(i<str.length()){
		    while(i<str.length()){
		        char ch = str.charAt(i);
                map.put(ch,map.getOrDefault(ch, 0)+1);
                i++;
                if(map.size()>k){
                    break;
                }
                else{
                    String tans = str.substring(j+1, i);
                    if(tans.length()>ans.length())
                        ans = tans;
                }
                
		    }
		    while(j<i-1){
		        j++;
                char ch = str.charAt(j);
                if(map.get(ch)==1){
                    map.remove(ch);
                }
                else{
                    map.put(ch,map.get(ch)-1);
                }

                if(map.size()==k)
                    break;
		    }
		}
		
		return ans.length();
	}
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
        String str = scn.next();
        int k = scn.nextInt();
		System.out.println(solution(str,k));
	}

}
