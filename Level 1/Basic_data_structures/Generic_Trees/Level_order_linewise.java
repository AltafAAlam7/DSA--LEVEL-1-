import java.util.*;

public class Level_order_linewise {

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
    public static void levelOrderLinewise(Node root)
    {
        Queue<Node> queue = new ArrayDeque<>();
        Queue<Node> cqueue = new ArrayDeque<>();

        queue.add(root);
        while(queue.size()>0)
        {
            Node temp = queue.remove();
            System.out.print(temp.data+" ");
            for(Node child: temp.children)
                cqueue.add(child);

            if(queue.size()==0)
            {
                queue = cqueue;
                cqueue = new ArrayDeque<>();
                System.out.println();
            }
        }
    }
    public static void levelOrderLinewise2(Node root)
    {
        Queue<Node> queue = new ArrayDeque<>();
        queue.add(root);
        queue.add(new Node(-1));

        while(queue.size()>0)
        {
            Node temp = queue.remove();
            if(temp.data!=-1)
            {
                System.out.print(temp.data+" ");
                for(Node child: temp.children)
                    queue.add(child);
            }
            else
            {
                if(queue.size()>0){
                    queue.add(new Node(-1));
                    System.out.println();
                }
            }
        }
    }
    public static class Pair{
        Node node;
        int level;

        Pair(Node node ,int level)
        {
            this.node = node;
            this.level = level;
        }
    }
    public static void levelOrderLinewise3(Node root)
    {
        Queue<Node> queue = new ArrayDeque<>();
        queue.add(root);
        while(queue.size()>0)
        {
            int cicl = queue.size();
            for(int i=0;i<cicl ;i++)
            {
                Node temp = queue.remove();
                System.out.print(temp.data+" ");
                for(Node child: temp.children)
                    queue.add(child);
            }
            System.out.println();
        }
    }
    public static void levelOrderLinewise4(Node root)
    {
        Queue<Pair> queue = new ArrayDeque<>();
        queue.add(new Pair(root,1));
        int level =1;
        while(queue.size()>0)
        {
            Pair temp = queue.remove();

            if(temp.level>level)
            {
                level = temp.level;
                System.out.println();
            }
            System.out.print(temp.node.data+" ");
            for(Node child: temp.node.children)
            {
                Pair cp = new Pair(child, temp.level+1);
                queue.add(cp);
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

        levelOrderLinewise4(root);

    }
}

