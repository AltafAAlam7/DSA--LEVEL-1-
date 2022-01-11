import java.util.*;

public  class Generic_Tree_Intro{

    public static class Node{
        int data;
        ArrayList<Node> children = new ArrayList<>();

        Node (int data)
        {
            this.data = data;
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

    }
}