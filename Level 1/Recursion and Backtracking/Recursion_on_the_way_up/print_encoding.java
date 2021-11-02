// 1. You are given a string str of digits. (will never start with a 0)
// 2. You are required to encode the str as per following rules
//     1 -> a
//     2 -> b
//     3 -> c
//     ..
//     25 -> y
//     26 -> z
// 3. Complete the body of printEncodings function - without changing signature - to calculate and print all encodings of str.
// Use the input-output below to get more understanding on what is required
// 123 -> abc, aw, lc
// 993 -> iic
// 013 -> Invalid input. A string starting with 0 will not be passed.
// 103 -> jc
// 303 -> No output possible. But such a string maybe passed. In this case print nothing.

// Note -> The online judge can't force you to write the function recursively but that is what the spirit of question is. Write recursive and not iterative logic. The purpose of the question is to aid learning recursion and not test you.
// Input Format
// A string str
// Output Format
// Permutations of str in order hinted by Sample output

import java.util.Scanner;

public class print_encoding{
        public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
            String str = scn.nextLine();
            String ans = "";
            print_encodings(str, ans);
            scn.close();
        }

        public static void print_encodings(String str, String ans)
        {
            if(str.length()==0)
            {
                System.out.println(ans);
                return;
            }
            char ch1 =  str.charAt(0);
            int op1 = ch1-'0';
            String ros1 = str.substring(1);
            if(ch1=='0')
                return;
            print_encodings(ros1, ans+ (char)('a'+op1-1));

            if(str.length()>=2)
            {
            String ch2 = str.substring(0,2);
            String ros2 = str.substring(2);
        
            int op2= Integer.parseInt(ch2);
            if(op2<=26 && op2>=1)
                print_encodings(ros2, ans+(char)('a'+op2-1));
            }
        }
}