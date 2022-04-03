import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        int k = scn.nextInt();

        System.out.println(Longest_substring_k(str,k).length());
        scn.close();
    }
    public static String Longest_substring_k(String str,int k){
        String ans = "";
        HashMap<Character,Integer> map = new HashMap<>();
        int i=0;
        int j=-1;
        while(true){
            while(i<str.length()){
                char ch = str.charAt(i);
                map.put(ch,map.getOrDefault(ch, 0);
                if(map.size()>k){
                    i++;
                    break;
                }
                else if(map.size()==k){
                    String tans = str.substring(j+1, i);
                    if(ans.length()==0)
                        ans = tans;
                    else if(tans.length()>ans.length())
                        ans = tans;
                }
                i++;
   
            }
            while(j<i){
                j++;
                char ch = str.charAt(j);
                if(map.get(ch)==1)
                    map.remove(ch);
                else{
                    map.put(ch,map.get(ch)-1);
                }
                if(map.size()==k)
                    break;                
            }
            if(i==str.length())
                break;
        }
        return ans;

    }
}