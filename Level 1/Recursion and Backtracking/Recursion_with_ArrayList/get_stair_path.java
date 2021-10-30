import java.util.ArrayList;
import java.util.Scanner;

// 1. You are given a number n representing number of stairs in a staircase.
// 2. You are standing at the bottom of staircase. You are allowed to climb 1 step, 2 steps or 3 steps in one move.
// 3. Complete the body of getStairPaths function - without changing signature - to get the list of all paths that can be used to climb the staircase up.
// Use sample input and output to take idea about output.

// Note -> The online judge can't force you to write the function recursively but that is what the spirit of question is. Write recursive and not iterative logic. The purpose of the question is to aid learning recursion and not test you.
// Input Format
// A number n
// Output Format
// Contents of the arraylist containing paths as shown in sample output

public class get_stair_path {
    public static void main(String[] args) throws Exception {
        Scanner scn= new Scanner(System.in);
        int  n = scn.nextInt();
        
        ArrayList<String> ans = getStairPaths(n);
        System.out.println(ans);
        scn.close();

    }

    public static ArrayList<String> getStairPaths(int n) {
        ArrayList<String> ans = new ArrayList<>();
        if(n==0)
        {
            ans.add("");
            return ans;
        }
        else if(n<0)
            return ans;

        ArrayList<String> pathsnm1 = getStairPaths(n-1);
        ArrayList<String> pathsnm2 = getStairPaths(n-2);
        ArrayList<String> pathsnm3 = getStairPaths(n-3);

        for(String rstr: pathsnm1)
        {
            ans.add("1"+rstr);
        }
        for(String rstr: pathsnm2)
        {
            ans.add("2"+rstr);
        }
        for(String rstr: pathsnm3)
        {
            ans.add("3"+rstr);
        }

        return ans;
    }
}
