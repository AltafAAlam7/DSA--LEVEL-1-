import java.util.*;

public class Main {
    static class Pair{
        int freq;
        int si;
        int li;
        Pair(int freq,int si,int li){
            this.freq = freq;
            this.si = si;
            this.li = li;
        }
    }

    public static void solution(int[] arr) {
        // write your code here
        HashMap<Integer,Pair> map = new HashMap<>();
        int mfi = arr[0];
        int mf = 1;
        int mlen = 1;
        int si =0;

        map.put(arr[0],new Pair(1, 0, 0));
        for(int i=1;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                Pair p = map.get(arr[i]);
                p.freq++;
                p.li = i;
                int len = p.li - p.si +1;
                if(p.freq > mf){
                    mfi = arr[i];
                    mf = p.freq;
                    mlen = len;
                    si = p.si;
                }
                else if(p.freq == mf && len < mlen){
                    mfi = arr[i];
                    // mf = p.freq;
                    mlen = len;
                    si = p.si;
                }
                else if(p.freq == mf && len == mlen && p.si < si){
                    mfi = arr[i];
                    // mf = p.freq;
                    // mlen = len;
                    si = p.si;
                }
                map.put(arr[i],p);
            }
            else{
                map.put(arr[i],new Pair(1, i, i));
            }
        }
        System.out.println(mfi);
        System.out.println(si);
        System.out.println(mlen + si -1);
        
        return ;
    }
    
    public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int  [] arr = new int[n];
		for(int i = 0 ; i < n; i++){
			arr[i] = scn.nextInt();
		}
                solution(arr);
	}

}
