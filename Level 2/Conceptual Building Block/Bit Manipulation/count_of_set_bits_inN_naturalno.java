import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    System.out.println(solution(n));
  }

  public static int solution(int n){
    //write your code here
    if(n==0)
        return 0;
    int x = biggestPowerof2(n);
    int part1 = x*(1<<(x-1));
    int part2 = n-(1<<x)+1;
    int part3 = solution(n-(1<<x));
    return part1+part2+part3;
  }
  public static int biggestPowerof2(int n){
      int x = 0;
      while((1<<x) <= n)
        x++;
        
      return x-1;
  }

}