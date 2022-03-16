import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[][] arr =  new int[n][3];

        for(int i=0;i<n;i++)
        {
            arr[i][0] = scn.nextInt();
            arr[i][1] = scn.nextInt();
            arr[i][2] = scn.nextInt();
        }

        int red = arr[0][0];
        int blue = arr[0][1];
        int green = arr[0][2];

        for(int i=1;i<n;i++){

            int new_red = Math.min(blue, green) + arr[i][0];
            int new_blue = Math.min(red, green) + arr[i][1];
            int new_green = Math.min(blue, red) + arr[i][2];

            red = new_red;
            green = new_green;
            blue = new_blue;
        }

        System.out.println(Math.min(red, Math.min(green,blue)));
    }
}