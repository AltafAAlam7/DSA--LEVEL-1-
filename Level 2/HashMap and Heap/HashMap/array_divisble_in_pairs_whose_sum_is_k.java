import java.util.*;

public class Main {
	
	public static boolean solution(int[] arr, int k){
		//write your code here
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int val:arr){
            int r = val%k;
            if(r<0)
                r+=k;
            map.put(r,map.getOrDefault(r, 0)+1);
        }

        int l = 0;
        int r = k-1;

        while(l<=r){
            if(l==0 || l==r){
                if(map.getOrDefault(l, 0)%2!=0)
                    return false;
                l++;
                continue;
            }
            else if(map.getOrDefault(l, 0) !=map.getOrDefault(r, 0)){
                return false;
            }
            l++;
            r--;
        }
        return true;


	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		for(int i = 0 ; i < n; i++){
			arr[i] = scn.nextInt();
		}
		int k = scn.nextInt();
		System.out.println(solution(arr,k));
	}

}
