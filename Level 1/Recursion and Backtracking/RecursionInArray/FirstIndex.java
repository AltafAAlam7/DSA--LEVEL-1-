import java.util.Scanner;

// 1. You are given a number n, representing the count of elements.
// 2. You are given n numbers.
// 3. You are given a number x. 
// 4. You are required to find the first index at which x occurs in array a.
// 5. If x exists in array, print the first index where it is found otherwise print -1.

// Note -> The online judge can't force you to write the function recursively but that is what the spirit of question is. Write recursive and not iterative logic. The purpose of the question is to aid learning recursion and not test you.
// Input Format
// A number n
// n1
// n2
// .. n number of elements
// A number x
// Output Format
// A number representing first index of occurence of x in array a or -1 if not found at all.

public class FirstIndex {
    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++)
            arr[i]=scn.nextInt();
        int x = scn.nextInt();

        int First_index=firstIndex(arr, 0, x);
        System.out.println(First_index);
        scn.close();

    }

    public static int firstIndex(int[] arr, int idx, int x){
        
        if(idx == arr.length)
            return -1;
        
        if(arr[idx]==x)
            return idx;
        else
        {
            int small = firstIndex(arr, idx+1, x);
            return small;
        }
    }
}
