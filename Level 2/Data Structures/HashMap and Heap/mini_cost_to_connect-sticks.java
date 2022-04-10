import java.io.*;
import java.util.*;

public class Main {

  public static int connectSticks(int[] sticks) {

    //Code Here
    if(sticks.length==1)
        return sticks[0];
    PriorityQueue<Integer> pq = new PriorityQueue<>();
    
    for(int i=0;i<sticks.length;i++){
        pq.add(sticks[i]);
    }
    
    int cost = 0;
    while(pq.size()>1){
        int x1 = pq.remove();
        int x2 = pq.remove();
        
        int tcost = x1 + x2;
        cost+=tcost;
        
        pq.add(tcost);
    }
    
    return cost;

  }

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();

    int[] sticks = new int[n];
    for (int i = 0; i < sticks.length; i++) {
      sticks[i] = scn.nextInt();
    }

    System.out.println(connectSticks(sticks));
  }

}