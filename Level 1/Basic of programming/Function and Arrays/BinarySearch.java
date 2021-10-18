import java.util.Scanner;


public class BinarySearch {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        
        int []arr= {10,20,30,40,50,60,70,80,90,100};

        int key=scn.nextInt();

        int index=binarysearch(arr,key);
        System.out.println(index);
        scn.close();
    }
    public static int binarysearch(int[] arr,int key)
    {
        int low=0;
        int high=arr.length-1;

        while(low<=high)
        {
            int mid=(low+high)/2;

            if(arr[mid]==key)
                return mid;
            else if(arr[mid]>key)
                high = mid -1;
            else 
                low = mid + 1;
        }
        return 1;
    }
}
