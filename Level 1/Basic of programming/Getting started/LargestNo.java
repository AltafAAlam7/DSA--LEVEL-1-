// You are given an array of N positive integers which represent digits of a number.
// You have to form the largest number possible after performing an operation exactly once. The operation is -  
// Select two indices a and b, and swap their values.
// Print the largest number formed.
// Input Format
// The first line contain an integer denoting number of test case T 
// For each testcase given an number N.
// Next line contains N space separated integers
// Output Format
// The output of each test case contains the largest number formed.

import java.util.Scanner;
public  class LargestNo {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        
        while(t>0)
        {
            int n = scn.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++)
                arr[i]=scn.nextInt();
            
            
            
            for(int i=0;i<n;i++)
            {
                if(arr[i]==9)
                    continue;
                else
                {
                    int a= i;
                    int idx_of_b=findmax(arr,i+1,arr.length-1);

                    if(idx_of_b!=-1 && arr[a]<arr[idx_of_b])
                    {
                        int temp=arr[a];
                        arr[a]=arr[idx_of_b];
                        arr[idx_of_b]=temp;
                    }
                    break;
                }
            }
            for(int i=0;i<arr.length;i++)
                System.out.print(arr[i]+" ");
            System.out.println();
            t--;
        }
        scn.close();
    }
    public static int findmax(int[] arr,int low,int high)
    {
        int index=-1;
        int max=-1;
        for(int i=low;i<=high;i++)
        {
            if(arr[i]>max)
            {
                index=i;
                max=arr[i];
            }
        }
        return index;
    }
}
