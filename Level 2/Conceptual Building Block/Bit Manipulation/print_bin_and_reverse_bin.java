import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    
    //write your code here
    boolean flag = false;
    int j=0;
    int rev = 0;
    for(int i=31;i>=0;i--){
        int mask = (1<<i);

        if(flag){
            if((n & mask)!=0)
            {
                System.out.print("1");
                int smask = (1<<j);
                rev |= smask;

            }
            else
                System.out.print("0");
            j++;
        }
        else{
            if((n&mask)!=0){
                flag = true;
                System.out.print("1");
                int smask = (1<<j);
                rev |= smask; 
                j++;
            }
        }
    }
    System.out.println();
    System.out.println(rev);
  }

}