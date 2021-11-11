import java.util.Scanner;

public class highest_frequency_char {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str= scn.nextLine();

        int[] farr = new int[26];

        for(int i=0;i<str.length();i++)
        {
            char ch = str.charAt(i);
            int index_ch = ch-'a';
            farr[index_ch]++;
        }

        int minidx=0;
        for(int i=1;i<farr.length;i++)
        {
            if(farr[i]>farr[minidx])
                minidx=i;
        }
        char ch = (char) (minidx+'a');
        System.out.println(ch);
        scn.close();
    }
}
