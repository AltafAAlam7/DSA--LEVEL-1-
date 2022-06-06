import java.util.*;

public class All_repeating_except_one {

  public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    for(int i = 0 ; i < n; i++){
      arr[i] = scn.nextInt();
    }
    scn.close();
    //write your code here
    int res = 0;
    for(int val: arr){
        res = res^val;
    }

    System.out.println(res);
  }

}