import java.util.Scanner;

// 1. You are given a number n, representing the count of elements.
// 2. You are given n numbers.
// 3. You are required to find the maximum of input. 
// 4. For the purpose complete the body of maxOfArray function. Don't change the signature.

// Note -> The online judge can't force you to write the function recursively but that is what the spirit of question is. Write recursive and not iterative logic. The purpose of the question is to aid learning recursion and not test you.
// Input Format
// A number n
// n1
// n2
// .. n number of elements
// Output Format
// A number representing max
public class MaxinArray {
    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++)
            arr[i]=scn.nextInt();
        
        int max = maxOfArray(arr, 0);
        System.out.println(max);
        scn.close();
    }

    public static int maxOfArray(int[] arr, int idx){

        if(idx == arr.length-1)
            return arr[idx];
        
        int misa = maxOfArray(arr, idx+1);

        if(arr[idx]>misa)
            return arr[idx];
        else
            return misa;
    }
}
