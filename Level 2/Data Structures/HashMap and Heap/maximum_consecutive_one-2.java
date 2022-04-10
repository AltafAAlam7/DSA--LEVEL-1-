import java.util.*;

public class Main {

    public static int solution(int[] arr,int k){
        // write your code here
        int i=0;
        int j=-1;
        int len =0;
        int zc =0;

        while(i<arr.length){
            while(i<arr.length){
                if(arr[i]==0)
                    zc++;
                    
                if(zc<=k){
                    int tlen = i-j;
                    len = Math.max(tlen, len);
                }
                else{
                    i++;
                    break;
                }
                i++;
            }
            while(j<i-1){
                j++;
                
                if(arr[j]==0)
                    zc--;
                if(zc==k)
                    break;
            }
        }

        return len;
    }
    
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i  < n; i++){
            arr[i] = scn.nextInt();
        }
        int k = scn.nextInt();
        System.out.println(solution(arr,k));
	}

}
