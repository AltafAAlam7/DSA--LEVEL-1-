import java.io.*;
import java.util.*;

public class Main {

  public static boolean isReflected(int[][] points) {
    //Code Here
    HashSet<String> set = new HashSet<>();
    int xmax = Integer.MIN_VALUE;
    int xmin = Integer.MAX_VALUE;
    
    for(int i=0;i<points.length;i++){
        
        int x = points[i][0];
        int y = points[i][1];
        
        xmax = Math.max(xmax,x);
        xmin = Math.min(xmin,x);
        
        set.add(x +"#" + y);
    }
    
    int twiceXmirr = xmin + xmax;
    
    for(int i=0;i<points.length;i++){
        
        int x = points[i][0];
        int y = points[i][1];
        
        int ximg = twiceXmirr - x;
        int yimg = y;
        
        if(!set.contains(ximg + "#" + yimg)){
            return false;
        }
    }
    
    return true;

  }

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();

    int[][] points = new int[n][2];
    for (int i = 0; i < points.length; i++) {
      for (int j = 0; j < points[0].length; j++) {
        points[i][j] = scn.nextInt();
      }
    }

    System.out.println(isReflected(points));
  }

}