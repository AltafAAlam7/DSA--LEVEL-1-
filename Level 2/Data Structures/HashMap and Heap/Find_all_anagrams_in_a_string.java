import java.util.*;

public class Main {
	public static void findAnagrams(String s, String p) {
        // write your code here
        if(s.length()< p.length()){
            System.out.println("0");
            return;
        }
        int[] map2 = new int[26];
        
        for(int i=0;i<p.length();i++){
            char ch = p.charAt(i);
            map2[ch-'a']++;
        }
        
        int[] map1 = new int[26];
        
        for(int i=0;i<p.length();i++){
            char ch = s.charAt(i);
            map1[ch-'a']++;
        }
        
        ArrayList<Integer> res = new ArrayList<>();
        if(areAnagrams(map1,map2)){
            res.add(0);
        }
        
        int i=p.length();
        int j=0;
        
        while(i<s.length()){
            
            char chi = s.charAt(i);
            map1[chi-'a']++;
            
            char chj = s.charAt(j);
            map1[chj-'a']--;
            
            if(areAnagrams(map1,map2))
                res.add(j+1);
            
            i++;
            j++;
        }
        System.out.println(res.size());
        for(int k=0;k<res.size();k++){
            System.out.print(res.get(k)+" ");
        }
        return;
        
	}
	public static boolean areAnagrams(int[] map1, int[] map2){
	   
	   for(int i=0;i<26;i++){
	       if(map1[i]!=map2[i])
	            return false;
	   }
	   return true;
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String s = scn.next();
		String p = scn.next();
		findAnagrams(s, p);
	}

}
