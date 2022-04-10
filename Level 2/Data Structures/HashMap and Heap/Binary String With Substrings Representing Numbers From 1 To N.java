import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
        String str = scn.next();
        int n = scn.nextInt();
		System.out.println(solution(str,n));
        scn.close();
	}

	public static boolean solution(String str, int n) {
		//write your code here
		HashSet<Integer> set = new HashSet<>();

        for(int i=n;i >= n/2 + 1;i--){
            String bin = DeciToBin(i);
            // System.out.println(bin);
            if(SubstringPresent(str, bin)){
                set.add(i);
                int nw = i/2;
                while(!set.contains(nw) && nw >=0){
                    set.add(nw);
                    nw = nw/2;
                }
            }
            else
                return false;
        }
		return true;
    }
    public static boolean SubstringPresent(String s1,String s2){
        int j=0;

        for(int i=0;i<s1.length();i++){

            if(s1.charAt(i) == s2.charAt(j)){

                j++;
                if(j==s2.length())
                    return true;
                
            }
            else{
                j=0;
                if(s1.charAt(i)==s2.charAt(j))
                    i--;
            }

        }

        return false;
    }
    public static String DeciToBin(int n){
        
        int bin = 0;
        int k = 1;
        while(n>0){
            int r = n%2;
            n = n/2;

            bin = bin + r*k;
            k = k*10;
        }
        
        return "" + bin;
    }

}
