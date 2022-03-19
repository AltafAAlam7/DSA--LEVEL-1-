// 1. You are given a number n, representing the count of items.
// 2. You are given n numbers, representing the values of n items.
// 3. You are given n numbers, representing the weights of n items.
// 3. You are given a number "cap", which is the capacity of a bag you've.
// 4. You are required to calculate and print the maximum value that can be created in the bag without overflowing it's capacity.
// Note1 -> Items can be added to the bag even partially. But you are not allowed to put same items again and again to the bag.

import java.util.*;
import java.io.*;

public class Main{

    static class Item implements Comparable<Item>{
        int val;
        int wt;
        double r;

        public int compareTo(Item o){
            if(this.r < o.r)
                return -1;
            else if(this.r > o.r)
                return 1;
            else
                return 0;
        }
    }
    public static void main(String[] args) throws Exception{

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        Item[] items = new Item[n];

        for(int i=0;i<n;i++){
            items[i] = new Item();
            items[i].val = scn.nextInt();
        }
        for(int i=0;i<n;i++){
            items[i].wt = scn.nextInt();
            items[i].r = items[i].val * 1.0 /items[i].wt;
        }

        int cap = scn.nextInt();

        Arrays.sort(items);

        int rc = cap ;
        double val = 0;

        int i=n-1;
        while(rc>0){
            
            if(rc-items[i].wt>=0){
                val = val + items[i].val;
                rc = rc - items[i].wt;
            }
            else{
                val = val + (rc*items[i].val*1.0)/items[i].wt;
                rc =0;
            }
            i--;
        }

        System.out.println(val);
    }
}