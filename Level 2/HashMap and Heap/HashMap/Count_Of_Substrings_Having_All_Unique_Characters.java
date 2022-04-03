import java.util.*;
import java.io.*;
public class Main {

	public static int solution(String str) {
		// write your code here
        int ans = 0;
        HashMap<Character,Integer> map = new HashMap<>();
        int i=-1;
        int j=-1;

        while(true){
            while(i<str.length()-1){
                i++;
                char ch = str.charAt(i);
                map.put(ch,map.getOrDefault(ch, 0)+1);

                if(map.get(ch)==2)
                    break;
                else{
                    int count = i-j;
                    ans+=count;
                }
            }
            while(j<i){
                j++;
                char ch = str.charAt(j);
                map.put(ch,map.getOrDefault(ch, 0)-1);
                if(map.get(ch)==1){
                    ans+=i-j;
                    break;
                }
            }
            if(i==str.length()-1)
                break;
        }
		
		return ans;
	}
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(solution(str));
	}

}
