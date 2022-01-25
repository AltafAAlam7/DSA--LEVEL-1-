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

  

  public static Node construct(int[] arr, int lo ,int hi) {
    if(lo>hi)
            return null;
        
        int mid = (lo+hi)/2;
        Node node = new Node(arr[mid], null, null);
        node.left = construct(arr, lo, mid-1);
        node.right = construct(arr, mid+1, hi);

    return node;
  }

  public static void display(Node node) {
    if (node == null) {
      return;
    }

    display(node.left);
    System.out.print(node.data+" ");
    display(node.right);
  }


  public static void main(String[] args) throws Exception {
        int[] arr= {12,25,30,37,40,50,60,62,70,75,87};
        Node root = construct(arr, 0, arr.length-1);
        display(root);
  }

}