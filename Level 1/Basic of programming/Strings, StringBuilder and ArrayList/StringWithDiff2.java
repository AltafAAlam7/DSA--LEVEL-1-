import java.util.Scanner;
public class StringWithDiff2 {
    public static String solution(String str){
		// write your code here
        StringBuilder sb = new StringBuilder();

        for(int i=0;i<str.length()-1;i++)
        {
            char first_char = str.charAt(i);
            char second_char = str.charAt(i+1);

            int diff = second_char-first_char;

            sb.append(first_char);
            sb.append(diff);
        }
        sb.append(str.charAt(str.length()-1));

		return sb.toString();
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(solution(str));
        scn.close();
	}
}
