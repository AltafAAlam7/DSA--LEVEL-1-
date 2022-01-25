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
  public static class BSTClass {
      int max = Integer.MIN_VALUE;
      int min = Integer.MAX_VALUE;
      boolean BST = true;
      int size = 0;
      Node root = null;
  }
  public static BSTClass Largest_subBST(Node node)
  {
      if(node==null)
        return new BSTClass();
     
      BSTClass lp = Largest_subBST(node.left);
      BSTClass rp = Largest_subBST(node.right);
      BSTClass mp = new BSTClass();

      mp.max = Math.max(node.data,Math.max(lp.max, rp.max));
      mp.min = Math.min(node.data,Math.min(lp.min, rp.min));

      boolean nodeisBst = node.data>lp.max && node.data<rp.min;
      mp.BST = nodeisBst && lp.BST && rp.BST;

      if(mp.BST == true)
      {
          mp.size = lp.size+rp.size+1;
          mp.root = node;
      }
      else if(lp.size>rp.size)
      {
          mp.size = lp.size;
          mp.root = lp.root;
      }
      else
      {
          mp.size = rp.size;
          mp.root = rp.root;
      }
      return mp;
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
    
    // write your code here
    BSTClass ans = Largest_subBST(root);
    System.out.println(ans.root.data+"@"+ans.size);
  }

}