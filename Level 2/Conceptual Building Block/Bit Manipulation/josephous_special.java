import java.io.*;
import java.util.*;

public class Main {

  public static int solution(int n){
    //write your code here
    int l  = n - powerm1(n);
    
    return 2*l + 1;
    
  }
  public static int powerm1(int n){
      int p = 1;
      int count = 0;
      while(p*2<=n){
          p = p * 2;
      }
      
      return p;
  }
  public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    System.out.println(solution(n));
  }
  

}