import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] arr = new int[n];
        for(int i=0;i<n;i++)
            arr[i] = scn.nextInt();
        
        System.out.println(MSNA(arr));
    }
    public static int MSNA(int[] arr){

        int inc = arr[0];
        int exc = 0;

        for(int i=1;i<arr.length;i++){

            int new_inc = exc + arr[i];
            int new_exc = Math.max(inc, exc);

            inc = new_inc;
            exc = new_exc;
        }

        return Math.max(inc,exc);
    }
}