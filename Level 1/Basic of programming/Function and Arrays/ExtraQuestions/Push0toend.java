import java.util.Scanner;

public class Push0toend {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n=scn.nextInt();

        int [] arr = new int[n];
        for(int i=0;i<n;i++)
            arr[i]=scn.nextInt();
        
        Sort(arr);

        for(int i=0;i<n;i++)
            System.out.print(arr[i]+ " ");
        System.out.println();
        
        scn.close();
    
    }
    public static void Sort(int [] arr)
    {
        int z=0,o=0;

        while(o<arr.length){
            
            if(arr[o]!=0)
            {
                swap(arr,o,z);
                o++;
                z++;
            }
            else
            
                o++;
        }
    }
    public static void swap(int [] arr,int o,int z)
    {
        int temp=arr[o];
        arr[o]=arr[z];
        arr[z]=temp;
    }
}
