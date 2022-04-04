import java.util.*;

public class Main {
	
	public static int solution(String s) {
		// write your code here
        int[] map =  new int[26];
        Arrays.fill(map, -1);

        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            int idx = ch-'a';

            if(map[idx]==-1){
                map[idx] = i;
            }
            else if(map[idx] >=0){
                map[idx] = -2;
            }
        }
        
        int si = s.length();
        for(int i=0;i<26;i++){
            if(map[i]>=0){
                si = Math.min(si,map[i]);
            }
        }
        if(si!=s.length())
            return si;
        else
            return -1;
	 }
	 
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		String s= scn.next();
		System.out.print(solution(s));
	}

}
