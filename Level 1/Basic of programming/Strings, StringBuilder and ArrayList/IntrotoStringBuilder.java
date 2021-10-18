public class IntrotoStringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("hello"); //define and declare;

        //operation on StringBuilder
        
        //1. charAt
        char ch = sb.charAt(2);
        System.out.println(ch);

        //2. setcharAt
        sb.setCharAt(0, 'b');
        System.out.println(sb);

        //3. deletecharAt
        sb.deleteCharAt(4);
        System.out.println(sb);

        //4. insert
        sb.insert(0,'t');
        System.out.println(sb);

        
    }
}
