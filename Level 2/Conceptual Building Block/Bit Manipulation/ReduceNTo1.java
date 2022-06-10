import java.io.*;
import java.util.*;

public class Main {

    public static int solution(int n) {
        //write your code here
        int steps = 0;
        while(n!=1){
            if((n&1)==0) n=n/2;
            else if(n==3)n--;
            else if((n&3)==1)n--;
            else if((n&3)==3)n++;
            steps++;
        }
        return steps;
    }
    
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
        System.out.println(solution(n));
    }
	
	
}