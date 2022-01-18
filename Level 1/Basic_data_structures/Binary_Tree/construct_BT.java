import java.util.*;
import java.io.*;

public class construct_BT {
    public static class Node {
        int data;
        Node left;
        Node right;
    }

    public static class Pair {
        Node node;
        int state;
    }

    public static Node construct(Integer[] arr){
        Stack<Pair> stack = new Stack<>();

        Node root = new Node();
        root.data = arr[0];
        
        Pair rootp = new Pair();
        rootp.node = root;
        rootp.state = 1;

        stack.push(rootp);
        int idx = 1;

        while(stack.size() > 0){
            Pair peekp = stack.peek();

            if(peekp.state == 1){
                // left
                if(arr[idx] != null){
                    Node lc = new Node();
                    lc.data = arr[idx];
                    peekp.node.left = lc;
                    
                    Pair lp = new Pair();
                    lp.node = lc;
                    lp.state = 1;

                    stack.push(lp);
                }
                peekp.state++;
                idx++;
            } else if(peekp.state == 2){
                // right
                if(arr[idx] != null){
                    Node rc = new Node();
                    rc.data = arr[idx];
                    peekp.node.right = rc;
                    
                    Pair rp = new Pair();
                    rp.node = rc;
                    rp.state = 1;

                    stack.push(rp);
                }
                peekp.state++;
                idx++;
            } else if(peekp.state == 3){
                // pop
                stack.pop();
            } 
        }

        return root;
    }

    public static void display(Node node){
        if(node == null){
            return;
        }
        System.out.println(node.data);

        display(node.left); // will print the entire left tree
        display(node.right); // will print the entire right tree
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
        display(root);
    }
}