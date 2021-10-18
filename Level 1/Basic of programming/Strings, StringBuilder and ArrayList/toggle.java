import java.util.Scanner;

public class toggle {
    public static String toggleCase(String str){
		//write your code here
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<str.length();i++)
        {
            char ch = str.charAt(i);
            char SB_char;
            if(ch>='A' && ch<='Z')
                SB_char =  (char)(ch + 'a'-'A');
            else 
                SB_char= (char)(ch + 'A'-'a');

            sb.append(SB_char);
            
        }
        return sb.toString();
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(toggleCase(str));
        scn.close();
    }
}
