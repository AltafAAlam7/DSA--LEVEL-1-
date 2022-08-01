import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    String str = scn.nextLine();

    //write your code here
    int odd = 0;
    int even = 0;
    for(int i=0;i<str.length();i++){
        int bit = str.charAt(i) - '0';

        if(i%2 == 0)
            even+=bit;
        else
            odd+=bit;
    }
    int diff = even - odd;
    if(diff % 11==0)
        System.out.println("true");
    else
        System.out.println("false");
  }

}