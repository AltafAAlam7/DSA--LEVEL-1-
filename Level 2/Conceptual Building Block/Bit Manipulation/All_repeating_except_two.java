import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    for(int i = 0 ; i < n; i++){
      arr[i] = scn.nextInt();
    }
    solution(arr);
  }

  public static void solution(int[] arr){
   //write your code here

    int twoXor = 0;
    for(int val:arr){
        twoXor ^= val;
    }

    int one_ans = 0;
    int second_ans = 0;

    int rsbm = (twoXor & -twoXor);

    for(int val:arr){
        
        if((val & rsbm) == 0){
            one_ans ^= val;
        }
        else{
            second_ans ^= val;
        }
    }

    if(one_ans>second_ans){
        System.out.println(second_ans);
        System.out.println(one_ans);
    }
    else{
        System.out.println(one_ans);
        System.out.println(second_ans);
    }
   
  }

}