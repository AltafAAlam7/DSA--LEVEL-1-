
// Get Maze Path With Jumps
// Easy  Prev   Next
// 1. You are given a number n and a number m representing number of rows and columns in a maze.
// 2. You are standing in the top-left corner and have to reach the bottom-right corner. 
// 3. In a single move you are allowed to jump 1 or more steps horizontally (as h1, h2, .. ), or 1 or more steps vertically (as v1, v2, ..) or 1 or more steps diagonally (as d1, d2, ..). 
// 4. Complete the body of getMazePath function - without changing signature - to get the list of all paths that can be used to move from top-left to bottom-right.
// Use sample input and output to take idea about output.

// Note -> The online judge can't force you to write the function recursively but that is what the spirit of question is. Write recursive and not iterative logic. The purpose of the question is to aid learning recursion and not test you.
// Input Format
// A number n
// A number m
// Output Format
// Contents of the arraylist containing paths as shown in sample output

import java.util.ArrayList;
import java.util.Scanner;
public class Get_Maze_with_jumps {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();

        ArrayList<String> ans = getMazePaths(0, 0, n-1, m-1);
        System.out.println(ans);
        scn.close();

    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
        
        ArrayList<String> ans = new ArrayList<>();
        
        if(sr==dr && sc == dc)
        {
            ans.add("");
            return ans;
        }
        if(sr>dr || sc>dc)
            return ans;
        
        for(int Jumps=1;Jumps<=dc-sc;Jumps++)
        {
            ArrayList<String> hpaths = getMazePaths(sr, sc+Jumps, dr, dc);
            
            for(String path: hpaths)
                ans.add("h"+ Jumps+path);
        }

        for(int Jumps=1;Jumps<=dr-sr;Jumps++)
        {
            ArrayList<String> vpaths = getMazePaths(sr+Jumps, sc, dr, dc);
            
            for(String path: vpaths)
                ans.add("v"+ Jumps + path);
        }

        for(int Jumps=1;Jumps<=Math.min(dr-sr, dc-sc);Jumps++)
        {
            ArrayList<String> dpaths = getMazePaths(sr+Jumps, sc+Jumps, dr, dc);
            
            for(String path: dpaths)
                ans.add("d" + Jumps+path);
        }

        return ans;
    }

}
