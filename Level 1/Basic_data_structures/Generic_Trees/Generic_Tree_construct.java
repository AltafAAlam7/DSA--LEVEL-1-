import java.util.*;
public class Generic_Tree_construct {
    public static class Node{
        int data;
        ArrayList<Node> children = new ArrayList<>();

        Node()
        {}
        Node (int data)
        {
            this.data = data;
        }
    }
    public static void level_order(Node root)
        {
            Queue<Node> queue = new ArrayDeque<>();
            queue.add(root);

            while(queue.size()>0)
            {
                Node temp = queue.remove();
                System.out.print(temp.data + " ");
                for(Node child: temp.children)
                    queue.add(child);
            }
            System.out.println();
        }
    public static Node construct(int[] arr)
    {
        Node root=null;
        Stack<Node> st = new Stack<>();

        for(int val:arr)
        {
            if(val!=-1)
            {
                Node node = new Node(val);
                st.push(node);
            }
            else
            {
                Node node = st.pop();
                if(st.size()>0)
                {
                    Node parent = st.peek();
                    parent.children.add(node);
                }
                else
                {
                    root= node;
                }
            }
        }
        return root;
    }
    public static void main(String[] args) {
        int[] arr ={ 10,20,50,-1,60,-1,-1,30,70,-1,80,110,-1,120,-1,-1,90,-1,-1,40,100,-1,-1,-1};
        Node root = construct(arr);
        level_order(root);
    }
}
