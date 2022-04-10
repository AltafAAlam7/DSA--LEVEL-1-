import java.util.*;
import java.io.*;

public class Main {

  public static int lengthOfLongestSubstringTwoDistinct(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        int len=0;
        int i=0;
        int j=-1;
        
        while(i<s.length() && j<i){

            while(i<s.length()){
              char ch = s.charAt(i);
              map.put(ch,map.getOrDefault(ch, 0)+1);
              
              i++;
              if(map.size()<=2){
                int tlen = i-j-1;
                len = Math.max(len,tlen);
              }
              else{
                break;
              }
          }
          
          while(j<i && i<s.length()){
              j++;
              char ch = s.charAt(j);

              if(map.get(ch)==1)
                map.remove(ch);
              else
                map.put(ch,map.get(ch)-1);

              if(map.size()<=k)
                break;
          }
        }

        return len;
  }

  public static void main(String[] args) throws java.lang.Exception {

    Scanner scn = new Scanner(System.in);

    int ans = lengthOfLongestSubstringTwoDistinct(scn.nextLine());
    System.out.println(ans);
  }
}
