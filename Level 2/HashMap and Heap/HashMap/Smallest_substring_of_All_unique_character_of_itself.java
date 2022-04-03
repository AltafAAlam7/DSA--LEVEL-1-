import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        // System.out.println("1234");
        System.out.println(SmallestSubstring(str));
        scn.close();
    }
    public static String SmallestSubstring(String str){
        
        String ans = "";
        HashMap<Character,Integer> map1 = new HashMap<>();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            map1.put(ch,map1.getOrDefault(ch,0)+1);
        }
        int mmc = map1.size();
        int i=0;
        int j=-1;
        HashMap<Character,Integer> map2 = new HashMap<>();
        while(true){
            while(mmc>0 && i<str.length()){
                char ch = str.charAt(i);
                if(map2.containsKey(ch)==false)
                    mmc--;
                map2.put(ch,map2.getOrDefault(ch,0)+1);
                i++;
            }
            while(mmc==0 && j<i){
                String tans = str.substring(j+1, i);
                if(ans.length()==0)
                    ans = tans;
                else if(tans.length()<ans.length())
                    ans = tans;
                
                j++;
                char ch = str.charAt(j);
                if(map2.get(ch)==1)
                {
                    map2.remove(ch);
                    mmc++;
                }
                else
                    map2.put(ch,map2.get(ch)-1);
            }
            if(i==str.length())
                break;
        }
        return ans;
    }
}