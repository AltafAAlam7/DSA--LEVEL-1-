import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
       Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();

        int cii = 0;
        int cij = k;
        int total = cii + cij;
        for(int i=1;i<n;i++)
        {
            int ncii  = cij * 1;
            int ncij = total * (k-1);
            int ntotal = ncii + ncij;

            cii = ncii;
            cij = ncij;
            total = ntotal;
        }
        System.out.println(total);
    }
}