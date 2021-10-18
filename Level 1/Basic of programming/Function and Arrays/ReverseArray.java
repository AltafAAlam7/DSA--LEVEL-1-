import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();

        int [] a= new int[n];
        for(int i=0;i<n;i++)
            a[i]=scn.nextInt();

        reverse(a);

        for(int i=0;i<a.length;i++)
            System.out.print(a[i]+" ");
        System.out.println();

        scn.close();
    }
    public static void reverse(int[] a)
    {
        int i=0;
        int j=a.length-1;

        while(i<j)
        {
            int temp=a[i];
            a[i]=a[j];
            a[j]=temp;

            i++;
            j--;
        }
    }


}
