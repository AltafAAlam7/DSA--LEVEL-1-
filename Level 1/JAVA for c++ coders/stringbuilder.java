public class stringbuilder {
    public static void main(String[] args) {
        StringBuilder sb= new StringBuilder("hello");

        //Print
        System.out.println(sb);

        //get a char
        char val = sb.charAt(0);
        System.out.println(val);

        // set a char
        sb.setCharAt(1, 'd');
        System.out.println(sb);

        //insert
        sb.insert(0,'d');
        System.out.println(sb);
         
        //delete
        sb.deleteCharAt(0);
        System.out.println(sb);

        //append
        sb.append('o');
        System.out.println(sb);

        StringBuilder s= new StringBuilder();
        for(int i=0;i<10;i++)
        {
            s.append(i);
        }
        System.out.println(s);
    }
    
}
