import java.util.*;

public class Main {
	public static boolean areKAnagrams(String str1, String str2, int k) {
		// write your code here
		HashMap<Character,Integer> map = new HashMap<>();
		
		for(int i=0;i<str1.length();i++){
		    char ch = str1.charAt(i);
		    map.put(ch,map.getOrDefault(ch,0)+1);
		}
		
		int count =0;
		
		for(int i=0;i<str2.length();i++){
		    char ch = str2.charAt(i);
		    if(map.containsKey(ch)==false){
		        count++;
		    }
		    else{
		        if(map.get(ch)>1){
		            map.put(ch,map.get(ch)-1);
		        }
		        else{
		            map.remove(ch);
		        }
		    }
		}
		
		if(count<=k)
		    return true;
		else
		    return false;
	}

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		String str1 = s.next();
		String str2 = s.next();
		int k = s.nextInt();
		System.out.println(areKAnagrams(str1, str2, k));

	}

}
