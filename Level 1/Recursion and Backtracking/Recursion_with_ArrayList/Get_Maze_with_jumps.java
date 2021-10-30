import java.util.ArrayList;
import java.util.Scanner;



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

public class Get_Maze_with_jumps {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();

        ArrayList<String> ans = getMazePaths(1, 1, n, m);
        System.out.println(ans);
        scn.close();

    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
        
        ArrayList<String> ans = new ArrayList<>();
        ArrayList<String> myhpaths = new ArrayList<>();
        ArrayList<String> myvpaths = new ArrayList<>();
        ArrayList<String> mydpaths = new ArrayList<>();
        for(int h=1;h<=dc-sc;h++)
        {
            ArrayList<String> myhpath = getMazePaths(sr, sc+h, dr, dc);
            
            for(String mypath: myhpath)
                myhpaths.add(mypath);
        }
        for(int d=1;h<=dc-sc;h++)
        {
            ArrayList<String> myhpath = getMazePaths(sr, sc+h, dr, dc);
            
            for(String mypath: myhpath)
                myhpaths.add(mypath);
        }
        for(int v=1;v<=dr-sr;v++)
        {
            ArrayList<String> myvpath = getMazePaths(sr+v, sc, dr, dc);
            
            for(String mypath: myvpath)
                myhpaths.add(mypath);
        }
    }

}
