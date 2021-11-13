import java.util.*;

public class Target_sum_triplet {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = scn.nextInt();

        int tar = scn.nextInt();

        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 2; i++) {
            
            int ntar = tar - arr[i];

            int low = i+1;
            int high = arr.length - 1;

            while (low < high) {
                if (arr[low] + arr[high] == ntar) {
                    System.out.println(arr[i]+ ", "+arr[low] + ", " + arr[high]);
                    high--;
                    low++;
                } else if (arr[low] + arr[high] > ntar)
                    high--;
                else
                    low++;
            }
        }
        scn.close();
    }
}
