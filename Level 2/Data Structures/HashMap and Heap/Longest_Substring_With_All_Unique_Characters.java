import java.util.*;

public class Main {

	public static int solution(String str){
		// write your code here
        int mlen = 0;
        HashMap<Character,Integer> map = new HashMap<>();

        int i=-1;
        int j=-1;
        while(true){
            while(i<str.length()-1){
                i++;
                char chi = str.charAt(i);
                map.put(chi,map.getOrDefault(chi, 0)+1);

                if(map.get(chi)==2)
                    break;
                else{
                    int len = i-j;
                    if(len>mlen)
                        mlen = len;
                }
            }
            while(j<i){
                j++;
                char chj = str.charAt(j);
                map.put(chj,map.get(chj)-1);
                if(map.get(chj) == 1)
                    break;
            }
            if(i==str.length()-1)
                break;
        }
		return mlen;
	}
	
    public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(solution(str));
	}

}
