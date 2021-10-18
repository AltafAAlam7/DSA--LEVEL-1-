import java.util.Scanner;

public class SubarrayOfarray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();

        // String str =scn.nextLine();
        
        int []arr= new int[n];
        for(int i=0;i<n;i++)
            arr[i]=scn.nextInt();

        for(int start=0;start<arr.length;start++)
        {
            for(int end=start;end<arr.length;end++)
            {
                for(int i=start;i<=end;i++)
                    System.out.print(arr[i]);

                System.out.println();
            }
        }
        scn.close();
    }

}
