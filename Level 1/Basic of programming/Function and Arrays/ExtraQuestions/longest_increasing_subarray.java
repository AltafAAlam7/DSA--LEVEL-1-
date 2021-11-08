import java.util.Scanner;

// Given an array containing n numbers. The problem is to find the length of the longest contiguous subarray such that every element in the subarray is strictly greater than its previous element in the same subarray.

 

// Example 1:

// Input:
// n = 9
// a[] = {5, 6, 3, 5, 7, 8, 9, 1, 2}
// Output:
// 5
 

// Example 2:

// Input:
// n = 10
// a[] = {12, 13, 1, 5, 4, 7, 8, 10, 10, 11}
// Output:
// 4
 

// Your Task:  
// You don't need to read input or print anything. Your task is to complete the function lenOfLongIncSubArr() which takes the array a[] and its size n as inputs and returns the length of the longest increasing subarray.

 

// Expected Time Complexity: O(n)
// Expected Auxiliary Space: O(1)

 

// Constraints:
// 1<=n<=105
// 1<=a[i]<=105

public class longest_increasing_subarray{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] arr = new int[n];
        for(int i=0;i<n;i++)
            arr[i]=scn.nextInt();
        
        int ans = lenOfLongIncSubArr(arr, n);
        System.out.println(ans);
        scn.close();
    }
    public static int lenOfLongIncSubArr(int arr[], int n)
    {
        int max_length=1;
        int current_length=1;
        
        for(int i=1;i<n;i++)
        {
            if(arr[i-1]<arr[i])
                current_length++;
                
            if(arr[i-1]>=arr[i])
                current_length=1;
            
            if(max_length<current_length)
                max_length=current_length;
        }
        
        return max_length;
    }
}
