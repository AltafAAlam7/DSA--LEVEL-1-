import java.util.Scanner;

// 1. You are given a string str.
// 2. Complete the body of printPermutations function - without changing signature - to calculate and print all permutations of str.
// Use sample input and output to take idea about permutations.

// Note -> The online judge can't force you to write the function recursively but that is what the spirit of question is. Write recursive and not iterative logic. The purpose of the question is to aid learning recursion and not test you.
// Input Format
// A string str
// Output Format
// Permutations of str in order hinted by Sample output
public class print_permutations {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        String ans = "";
        printPermutations(str, ans);
        scn.close();

    }

    public static void printPermutations(String str, String ans) {
        
        if(str.length()==0)
        {
            System.out.println(ans);
            return;
        }
        for(int i=0;i<str.length();i++)
        {
            char ch = str.charAt(i);
            String pre = str.substring(0,i);
            String post = str.substring(i+1);
            String ros =pre +post;

            printPermutations(ros, ans+ch);
        }
    }

}
