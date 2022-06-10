import java.io.*;
import java.util.*;

public class Main {

	public static int solution(int[] arr){
		//write your code here
        int count  = 0 ;
        for(int i=0;i<arr.length;i++){
            int xor = arr[i];
            for(int k=i+1;k<arr.length;k++){
                xor^=arr[k];
                if(xor==0)
                    count+=k-i;
            }
        }

        return count;
		
    }
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < arr.length; i++){
            arr[i] = scn.nextInt();
        }
        System.out.println(solution(arr));
    }
	
	
}