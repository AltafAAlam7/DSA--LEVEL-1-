import java.util.Scanner;


public class RingRotate {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();

        int[][] twod_arr = new int[n][m];
        for (int i = 0; i < twod_arr.length; i++) {
            for (int j = 0; j < twod_arr[0].length; j++)
                twod_arr[i][j] = scn.nextInt();
        }
        int s = scn.nextInt();
        int r = scn.nextInt();

        shellrotate(twod_arr, s, r);
        display(twod_arr);
        scn.close();
    }

    public static void shellrotate(int[][] twod_arr, int s, int r) {
        int[] oned_arr = fillonedarrfromshell(twod_arr, s);
        rotate(oned_arr, r);
        filltwoarrfrom1darr(oned_arr, twod_arr, s);

    }

    public static void filltwoarrfrom1darr(int[] oned_arr,int[][] twod_arr,int s)
    {
        int rmin = s-1;
        int cmin = s-1;
        int rmax = twod_arr.length-s;
        int cmax = twod_arr[0].length-s;

        int idx=0;

        //left wall
        for(int i=rmin,j=cmin ; i<=rmax;i++)
        {
            twod_arr[i][j]=oned_arr[idx];
            idx++;
        }
        cmin++;

        //bottom wall
        for(int i = rmax, j=cmin ; j<=cmax;j++)
        {
            twod_arr[i][j]=oned_arr[idx];
            idx++;
        }
        rmax--;

        //right wall
        for(int i = rmax, j=cmax ; i>=rmin;i--)
        {
            twod_arr[i][j]=oned_arr[idx];
            idx++;
        }
        cmax--;

        //top wall
        for(int i = rmin, j=cmax ; j>=cmin;j--)
        {
            twod_arr[i][j]=oned_arr[idx];
            idx++;
        }
        rmin++;

    }

    public static int[] fillonedarrfromshell(int[][] twod_arr ,int s )
    {
        int rmin = s-1;
        int cmin = s-1;
        int rmax = twod_arr.length-s;
        int cmax = twod_arr[0].length-s;

        int sz = 2*(rmax-rmin + cmax - cmin);
        int[] oned_arr= new int[sz];

        int idx=0;

        //left wall
        for(int i=rmin,j=cmin ; i<=rmax;i++)
        {
            oned_arr[idx]=twod_arr[i][j];
            idx++;
        }
        cmin++;

        //bottom wall
        for(int i = rmax, j=cmin ; j<=cmax;j++)
        {
            oned_arr[idx]=twod_arr[i][j];
            idx++;
        }
        rmax--;

        //right wall
        for(int i = rmax, j=cmax ; i>=rmin;i--)
        {
            oned_arr[idx]=twod_arr[i][j];
            idx++;
        }
        cmax--;

        //top wall
        for(int i = rmin, j=cmax ; j>=cmin;j--)
        {
            oned_arr[idx]=twod_arr[i][j];
            idx++;
        }
        rmin++;

        return oned_arr;

    }

    public static void rotate(int[] arr, int k) {
        k = k % arr.length;

        if (k < 0)
            k = k + arr.length;

        reverse(arr, 0, arr.length - 1 - k);
        reverse(arr, arr.length - k, arr.length - 1);
        reverse(arr, 0, arr.length - 1);
    }

    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void display(int[][] arr)
    {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++)
                System.out.print(arr[i][j]+" ");
            System.out.println();
        }
    }
}
