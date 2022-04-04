import java.util.HashMap;

class LRUCache {
    static class Node{
        int key;
        int data;
        Node prev;
        Node next;
    }
    Node head;
    Node tail;
    int cap;
    int size;
    HashMap<Integer,Node> map = new HashMap<>();

    public void remove(Node node){
        if(head == null || node == null)
            return;
        else if(head == tail)
            head = tail = null;
        else if(node == head){
            head = head.next;
            head.prev = null;
        }
        else if(node ==tail){
            Node nm1 = tail.prev;
            nm1.next = null;
            tail = nm1;
        }
        else{
            Node nm1 = node.prev;
            Node np1 = node.next;

            nm1.next = np1;
            np1.prev = nm1;
        }
        size--;
    }
    public void addFront(int key,int value){
        Node node = new Node();
        node.key = key;
        node.data = value;

        if(size ==0){
            head = tail = node;
        }
        else{
            node.next = head;
            head.prev = node;
            head = node;
        }
        size++;
    }
    public LRUCache(int capacity) {
        this.cap = capacity;
        this.size=0;
    }
    
    public int get(int key) {
        if(map.containsKey(key)){
            Node node = map.get(key);
            remove(node);

            addFront(key,node.data);
            map.put(key,head);
            return node.data;
        }
        else
            return -1;
    }
    
    public void put(int key, int value) {
        if(map.containsKey(key)){
            Node node = map.get(key);
            remove(node);
        }
        else if(cap == size){
            map.remove(tail.key);
            remove(tail);
        }

        addFront(key,value);
        map.put(key,head);
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */