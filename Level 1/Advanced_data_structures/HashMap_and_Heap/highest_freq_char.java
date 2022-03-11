import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        
        HashMap<Character,Integer> map = new HashMap<>();

        for(int i=0;i<str.length();i++)
        {
            char ch = str.charAt(i);
            if(map.containsKey(ch))
                map.put(ch, 1);
            else
            {
                int of = map.get(ch);
                int nf = of+1;
                map.put(ch, nf);
            }
        }

        Set<Character> chars = map.keySet();

        char mfch = str.charAt(0);
        for(char ch:chars)
        {
            if(map.get(ch)>map.get(mfch))
                mfch = ch;
        }

        System.out.println(mfch);
    }

}