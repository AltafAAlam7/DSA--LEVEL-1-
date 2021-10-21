import java.util.Scanner;

// 1. You are given a number following certain constraints.
// 2. The key constraint is if the number is 5 digits long, it'll contain all the digits from 1 to 5 without missing any and without repeating any. e.g. 23415 is a 5 digit long number containing all digits from 1 to 5 without missing and repeating any digit from 1 to 5.Take a look at few other valid numbers - 624135, 81456273 etc.Here are a few invalid numbers - 139, 7421357 etc.
// 3. The inverse of a number is defined as the number created by interchanging the face value (from left to right) and index of digits of number.e.g. for 526134 (reading from left to right, 5 is in place 1, 2 is in place 2, 6 is in place 3, 1 is in place 4, 3 is in place 5 and 4 is in place 6), the inverse will be 425613 (reading from left to right, 4 is in place 1, 2 is in place 2, 5 is in place 3, 6 is in place 4, 1 is in place 5 and 3 is in place 6) More examples - inverse of 2134 is 2134 and inverse of 24153 is 31524.    
// 4. Take as input number "n", assume that the number will follow constraints.
// 5. Print it's inverse - left to right.
// Input Format
// "n" where n is any integer, following constraints defined above.
// Output Format
// "i", the inverted (left to right) number

public class InverseLtoR {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int dig=0;
        int temp=n;
        
        while(temp>0)
        {
            dig++;
            temp=temp/10;
        }
        int op=dig;
        int inv=0;
        while(n>0 && op>0)
        {
            int iv=op;
            int ip=n%10;

            inv=inv + iv*(int)Math.pow(10, dig-ip+1);

            n=n/10;
            op--;

        }
        inv =inv/10;
        System.out.println(inv);
        scn.close();
    }
}
