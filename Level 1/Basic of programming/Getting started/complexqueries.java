/*
// You are given a sequence of whole numbers {0,1,2,3 ... , N-1} defined in an array A. where A[i] = i here 0 <= i < N.
// You need to perform some queries with it. If the query is of
// Type 0: You are given two integer L and R.(0 <= L <= R < N) You need to find the K such that
	
// 	K =  Math.floor(P) : Integer just less than P, where P is defined as
// 	P = f(A[L]) + f(A[L+1]) + f(A[L+2]) .. f(A[R])	:   sum of f(A[i]) where L<=i<=R, and
// 	f(x) = cos(2*x) / (cos(x) - sin(x)) , where cos(x) - sin(x) can't be equal to zero.

// Type 1: You are given 3 integer L, R and D. (0 <= L <= R < N) and (-1000 <= D <= 1000)

// 	You need to add D to the numbers A[L], A[L+1], A[L+2]...A[R]  :  A[i] = A[i] + D where L<=i<=R

// Input Format
//     The first line contains 2 positive integer N (length of sequence) and Q (number of queries)
//     For each query given an integer: type
//     If type == 0: Given 2 integers L and R.
//     type == 1: Given 3 integers L, R and D.
// 5 5
// 0 1 4
// 1 2 2 3
// 0 2 3
// 1 3 4 3
// 0 3 4
// Output Format
//     The output consists of value of K for all queries of type 0 in separate line.
*/
import java.util.Scanner;

public class complexqueries {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int q = scn.nextInt();

        int []arr = new int[n];
        for(int i =0;i<n;i++)
            arr[i]=i+1;
        for(int i=1;i<=q;i++)
        {
            int type = scn.nextInt();
            if(type==0)
            {
                int l = scn.nextInt();
                int r = scn.nextInt();
                type0(arr,l,r);
            }
               
            else
            {
                int l = scn.nextInt();
                int r = scn.nextInt();
                int d = scn.nextInt();
                type1(arr,l,r,d);
            }
        }
        scn.close();
    }

    public static void type0(int[] arr,int l,int r)
    {
        double p =0;

        for(int i=l ; i<=r;i++)
        {
            int x = arr[i];
            double f = 0;
            double deg = x;
            if(Math.cos(deg)!=Math.sin(deg))
                f = Math.cos(2*deg)/(Math.cos(deg)-Math.sin(deg));

            p = p+f;

        }
        System.out.println(p);
        int k=(int)Math.floor(p);
        System.out.println(k);
    }
    public static void type1(int[] arr,int l,int r ,int d)
    {
       
        for(int i=l;i<=r;i++)
            arr[i]=arr[i]+d;

    }
}
