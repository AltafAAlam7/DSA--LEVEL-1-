///import java.util.Scanner;

public class string {
    public static void main(String[] args) {
        /*
        String s="hello";
        System.out.println(s);
        
        
        // INPUT STRING
        Scanner scn= new Scanner(System.in);
        //String s1 = scn.next();
        //String s2 = scn.next();
        String s=scn.nextLine();
        //System.out.println(s1);
        System.out.println(s);
        
        
        //charAt()

        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();
        System.out.println(s);
        System.out.println(s.length());
        char ch = s.charAt(0);
        System.out.println(ch);
        for(int i=0;i<s.length();i++)
            System.out.println(s.charAt(i));
        scn.close();
        

        //SUBSTRING

        String s="abcd";
        System.out.println(s.substring(0,3));
        System.out.println(s.substring(0));

        for(int i=0;i<s.length();i++) {
            for(int j=i+1;j<=s.length();j++){
                System.out.println(s.substring(i, j));
            }
        }
        
        // ADD two strings
        String s1="hello";
        String s2="world";
        String s3=s1+" "+s2;
        System.out.println(s3);

        s1+=' ';
        s1+="hellow";
        s1+=10;
        System.out.println(s1);

        */

        //split

        String s="abc def ghi jkl mno";
        String[] parts = s.split(" ");
        for(int i=0 ;i<parts.length;i++)
            System.out.println(parts[i]);


    }
}
