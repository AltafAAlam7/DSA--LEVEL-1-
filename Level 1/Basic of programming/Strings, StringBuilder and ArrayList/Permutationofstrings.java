import java.util.Scanner;
public class Permutationofstrings {
    public static void solution(String str){
		// write your code here
        int n = fact(str.length());
        for(int i=0;i<n;i++)
        {
            int dec = i;
            StringBuilder s = new StringBuilder(str);
            for(int j=str.length();j>=1;j--)
            {
                int r = dec%j;
                dec = dec/j;

                System.out.print(s.charAt(r));
                s.deleteCharAt(r);
            }
            System.out.println();
        }

		
	}
    public static int fact(int n)
    {
        int fact =1;
        for(int i=n;i>=1;i--)
            fact=fact*i;
        return fact;
    }
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		solution(str);
        scn.close();
	}
}
