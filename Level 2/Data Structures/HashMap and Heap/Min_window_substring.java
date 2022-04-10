import java.util.*;

public class Min_window_substring {

	public static String solution(String s, String t){
		// write your code here
        String ans = "";
        int mmc = 0;
        HashMap<Character,Integer> tmap  = new HashMap<>();
        for(int i=0;i<t.length();i++){
            char ch = t.charAt(i);
            tmap.put(ch, tmap.getOrDefault(ch,0)+1);
            mmc++;
        }

        HashMap<Character,Integer> smap = new HashMap<>();

        int i=0;
        int j=-1;
        while(i<s.length()){
            while(i<s.length() && mmc>0){
                char ch = s.charAt(i);
                smap.put(ch, smap.getOrDefault(ch,0)+1);

                if(smap.get(ch) <= tmap.getOrDefault(ch,0))
                    mmc--;
                
                i++;
            }
            while(j<i && mmc==0){
                String pans = s.substring(j+1, i);
                if(ans.length()==0)
                    ans = pans;
                else if(ans.length() > pans.length())
                    ans = pans;
                
                j++;
                char ch = s.charAt(j);
                smap.put(ch,smap.getOrDefault(ch,0)-1);

                if(smap.getOrDefault(ch,0)<tmap.getOrDefault(ch, 0))
                    mmc++;
            }
        }
		return ans;
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String s1 = scn.next();
		String s2 = scn.next();
		System.out.println(solution(s1,s2));
        scn.close();
	}   

}
