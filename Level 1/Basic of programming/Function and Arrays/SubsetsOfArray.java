import java.util.Scanner;

public class SubsetsOfArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n= scn.nextInt();

        int[] arr = new int[n];
        for(int i=0;i<n;i++)
            arr[i]=scn.nextInt();

        
        int lim=(1<<n);

        for(int i=0;i<lim;i++)
        {
            int dec=i;
            String str="";
            for(int j=0;j<arr.length;j++)
            {
                int r=dec%2;
                dec=dec/2;

                if(r==0)
                    str="-\t"+str;
                else
                    str=arr[arr.length-1-j]+"\t"+str;
            }
            System.out.println(str);
        }
        scn.close();

    }
}
