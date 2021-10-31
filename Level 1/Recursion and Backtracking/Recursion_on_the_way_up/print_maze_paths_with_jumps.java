import java.util.Scanner;

// Print Maze Paths With Jumps
// Easy  Prev   Next
// 1. You are given a number n and a number m representing number of rows and columns in a maze.
// 2. You are standing in the top-left corner and have to reach the bottom-right corner. 
// 3. In a single move you are allowed to jump 1 or more steps horizontally (as h1, h2, .. ), or 1 or more steps vertically (as v1, v2, ..) or 1 or more steps diagonally (as d1, d2, ..). 
// 4. Complete the body of printMazePath function - without changing signature - to print the list of all paths that can be used to move from top-left to bottom-right.
// Use sample input and output to take idea about output.

// Note -> The online judge can't force you to write the function recursively but that is what the spirit of question is. Write recursive and not iterative logic. The purpose of the question is to aid learning recursion and not test you.
// Input Format
// A number n
// A number m
// Output Format
// Print paths (one path in each line) in order hinted by Sample output

public class print_maze_paths_with_jumps {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        String ans = "";
        printMazePaths(0, 0, n-1, m-1, ans);
        scn.close();
    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static void printMazePaths(int sr, int sc, int dr, int dc, String ans) {
        
        if(sr==dr && sc==dc)
        {
            System.out.println(ans);
            return;
        }
        if(sr>dr || sc>dc)
            return;

        for(int jump=1;jump<=dc-sc; jump++)
            printMazePaths(sr, sc+jump, dr, dc, ans+"h"+jump);
        
        for(int jump=1;jump<=dr-sr;jump++)
            printMazePaths(sr+jump, sc, dr, dc, ans+"v"+jump);
        
        for(int jump=1;jump<=Math.min(dr-sr, dc-sc);jump++)
            printMazePaths(sr+jump, sc+jump, dr, dc, ans+"d"+jump);
        
    }

}
