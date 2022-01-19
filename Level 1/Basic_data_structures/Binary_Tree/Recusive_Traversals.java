import java.io.*;
import java.util.*;

public class Main {
  public static class Node {
    int data;
    Node left;
    Node right;

    Node(int data, Node left, Node right) {
      this.data = data;
      this.left = left;
      this.right = right;
    }
  }

  public static class Pair {
    Node node;
    int state;

    Pair(Node node, int state) {
      this.node = node;
      this.state = state;
    }
  }

  public static Node construct(Integer[] arr) {
    Node root = new Node(arr[0], null, null);
    Pair rtp = new Pair(root, 1);

    Stack<Pair> st = new Stack<>();
    st.push(rtp);

    int idx = 0;
    while (st.size() > 0) {
      Pair top = st.peek();
      if (top.state == 1) {
        idx++;
        if (arr[idx] != null) {
          top.node.left = new Node(arr[idx], null, null);
          Pair lp = new Pair(top.node.left, 1);
          st.push(lp);
        } else {
          top.node.left = null;
        }

        top.state++;
      } else if (top.state == 2) {
        idx++;
        if (arr[idx] != null) {
          top.node.right = new Node(arr[idx], null, null);
          Pair rp = new Pair(top.node.right, 1);
          st.push(rp);
        } else {
          top.node.right = null;
        }

        top.state++;
      } else {
        st.pop();
      }
    }

    return root;
  }

  public static void display(Node node) {
    if (node == null) {
      return;
    }

    String str = "";
    str += node.left == null ? "." : node.left.data + "";
    str += " <- " + node.data + " -> ";
    str += node.right == null ? "." : node.right.data + "";
    System.out.println(str);

    display(node.left);
    display(node.right);
  }
  public static void preorder(Node node){
    if(node == null)
        return ;
    
    System.out.print(node.data+" ");
    preorder(node.left);
    preorder(node.right);
  }
  public static void Inorder(Node node){
    if(node == null)
        return ;
    
    Inorder(node.left);
    System.out.print(node.data+" ");
    Inorder(node.right);
  }
  public static void postorder(Node node){
    if(node == null)
        return ;
    
    postorder(node.left);
    postorder(node.right);
    System.out.print(node.data+" ");
  }

  public static void iterativePrePostInTraversal(Node node) {
    // write your code here
    Pair root = new Pair(node,-1);
    Stack<Pair> st = new Stack<>();
    st.push(root);
    String preorder ="";
    String postorder= "";
    String Inorder="";
    while(st.size()>0)
    {
        Pair temp = st.peek();
        
        if(temp.state==-1)
        {
            preorder+=temp.node.data+" ";

            if(temp.node.left!=null)
            {
                Pair lp = new Pair(temp.node.left,-1);
                st.push(lp);
            }
        }
        else if(temp.state==0)
        {
            Inorder+=temp.node.data+" ";
            if(temp.node.right!=null)
            {
                Pair rp = new Pair(temp.node.right,-1);
                st.push(rp);
            }
        }
        else if(temp.state==1)
        {
            postorder+=temp.node.data+" ";
            st.pop();

        }
    temp.state++;
        
    }
    System.out.println(preorder);
    System.out.println(Inorder);
    System.out.println(postorder);
  }

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    Integer[] arr = new Integer[n];
    String[] values = br.readLine().split(" ");
    for (int i = 0; i < n; i++) {
      if (values[i].equals("n") == false) {
        arr[i] = Integer.parseInt(values[i]);
      } else {
        arr[i] = null;
      }
    }

    Node root = construct(arr);
    iterativePrePostInTraversal(root);
    // preorder(root);
    // Inorder(root);
    // postorder(root);

  }

}