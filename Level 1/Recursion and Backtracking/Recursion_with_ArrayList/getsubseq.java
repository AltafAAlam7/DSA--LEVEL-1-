import java.util.ArrayList;
import java.util.Scanner;

// 1. You are given a string str.
// 2. Complete the body of getSS function - without changing signature - to calculate all subsequences of str.
// Use sample input and output to take idea about subsequences.

// Note -> The online judge can't force you to write the function recursively but that is what the spirit of question is.
// Write recursive and not iterative logic. The purpose of the question is to aid learning recursion and not test you.
// Input Format
// A string str
// Output Format
// Contents of the arraylist containing subsequences as shown in sample output

public class getsubseq{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();

        ArrayList <String> ans =gss(str);
        
        System.out.println(ans);
        scn.close();

    }
   

    public static ArrayList<String> gss(String str)
    {
        ArrayList<String> ans = new ArrayList<>();
        if(str.length()==0)
        {
            ans.add("");
            return ans;
        }
        char ch = str.charAt(0);
        String ros = str.substring(1);
        ArrayList<String> small_seq = gss(ros);

        for(String rstr: small_seq)
            ans.add(rstr);
        
        for(String rstr:small_seq)
            ans.add(ch + rstr);

        return ans;
    }
}