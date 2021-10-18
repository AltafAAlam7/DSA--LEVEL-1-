import java.util.ArrayDeque;
//import java.util.Stack;

public class stackandqueue {
    public static void main(String[] args) {
       /*
        Stack<Integer> st= new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        System.out.println(st);
        System.out.println(st.peek());
        System.out.println(st);
        System.out.println(st.pop());
        System.out.println(st);
        */
        
        //Queue

        ArrayDeque <Integer> q=new ArrayDeque<>();
        q.addLast(10);
        q.addLast(20);
        q.addLast(30);
        System.out.println(q);
        System.out.println(q.removeFirst());
        System.out.println(q);
        System.out.println(q.getFirst());
    }
}
