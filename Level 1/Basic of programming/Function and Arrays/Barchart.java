import java.util.*;

public class Barchart{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();

        int[] arr = new int[n];
        for(int i=0;i<n;i++)
            arr[i]=scn.nextInt();

        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max)
                max=arr[i];
        }
        int temp=max;
        for(int i=0;i<max;i++){
            for(int j=0;j<n;j++)
            {
                if(arr[j]>=temp)
                    System.out.print("*\t");
                else
                    System.out.print("\t");
            }
            System.out.println();
            temp--;
        }
        scn.close();
    }
}