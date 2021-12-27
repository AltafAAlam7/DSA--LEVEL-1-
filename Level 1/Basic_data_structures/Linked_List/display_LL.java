import java.io.*;

public class display_LL {
  public static class Node {
    int data;
    Node next;
  }

  public static class LinkedList {
    Node head;
    Node tail;
    int size;

    void addLast(int val) {
      Node temp = new Node();
      temp.data = val;
      temp.next = null;

      if (size == 0) {
        head = tail = temp;
      } else {
        tail.next = temp;
        tail = temp;
      }

      size++;
    }

    public int size(){
      // write code here
      Node temp = head;
      int length=0;
      if(head==null)
        return length;
      while(temp!=null)
      {
        temp=temp.next;
        length++;
      }

      return length+1;
    }

    public void display(){
      // write code here
      Node temp = head;
      if(head==null)
        return ;
      while(temp!=null)
      {
          System.out.print(temp.data+" ");
          temp=temp.next;
      }
      System.out.println();
    }
  }

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    LinkedList list = new LinkedList();

    String str = br.readLine();
    while(str.equals("quit") == false){
      if(str.startsWith("addLast")){
        int val = Integer.parseInt(str.split(" ")[1]);
        list.addLast(val);
      } else if(str.startsWith("size")){
        System.out.println(list.size());
      } else if(str.startsWith("display")){
        list.display();
      }
      str = br.readLine();
    }
  }
}