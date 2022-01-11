import java.util.*;

public class Level_order_zigzag {

    public static class Node{
        int data;
        ArrayList<Node> children = new ArrayList<>();

        Node (int data)
        {
            this.data = data;
        }
    }
    public static void levelOrderZZ(Node root)
    {
        Stack<Node> ms = new Stack<>();
        Stack<Node> cs = new Stack<>();
        ms.push(root);

        int level=1;
        while(ms.size()>0)
        {
            Node temp = ms.pop();
            System.out.print(temp.data+" ");

            if(level%2==1)
            {
                for(Node child: temp.children)
                    cs.push(child);
            }
            else
            {
                for(int i=temp.children.size()-1;i>=0;i--)
                {
                    Node child = temp.children.get(i);
                    cs.push(child);
                }
            }
            if(ms.size()==0)
            {
                ms = cs;
                cs = new Stack<>();
                level++;
                System.out.println();
            }
        }
    }
    public static void main(String[] args)
    {
        Node root = new Node(10);

        Node twenty = new Node(20);
        root.children.add(twenty);

        Node thirty = new Node(30);
        root.children.add(thirty);
        
        Node forty = new Node(40);
        root.children.add(forty);

        Node fifty = new Node(50);
        twenty.children.add(fifty);

        Node sixty = new Node(60);
        twenty.children.add(sixty);

        Node seventy = new Node(70);
        thirty.children.add(seventy);

        Node eighty = new Node(80);
        thirty.children.add(eighty);

        Node ninety = new Node(90);
        forty.children.add(ninety);

        levelOrderZZ(root);

    }
}
