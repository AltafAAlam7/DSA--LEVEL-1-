import java.util.Stack;

public class Leetcode {

    public class ListNode {
            int val;
            ListNode next;
            ListNode() {}
            ListNode(int val) { this.val = val; }
            ListNode(int val, ListNode next) { this.val = val; this.next = next; }
         }
    
    public ListNode mid_of_LL(ListNode head)
    {
        if(head==null || head.next==null)
            return head;
        
        ListNode slow = head;
        ListNode fast = head;

        while(fast!=null && fast.next!=null )
        {
            fast=fast.next.next;
            slow=slow.next;
        }

        return slow;
        
    }
    public ListNode mid(ListNode head)
    {
        if(head==null || head.next==null)
            return head;
        
        ListNode slow = head;
        ListNode fast = head;

        while(fast.next.next!=null && fast.next!=null )
        {
            fast=fast.next.next;
            slow=slow.next;
        }

        return slow;
        
    }

    public ListNode reverseList(ListNode head) {
        if(head==null || head.next==null)
            return head;
        
        ListNode prev=null;
        ListNode curr=head;

        while(curr!=null)
        {
            ListNode next = curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }

        return prev;
    }
    
    public void reorderList(ListNode head) {
        Stack <ListNode> st = new Stack<>();

        if(head==null || head.next==null)
            return;
        
        ListNode curr = head;
        while(curr!=null)
        {
            st.push(curr);
            curr=curr.next;
        }
        ListNode right = st.pop();
        ListNode left = head;

        while(left != right)
        {
            ListNode temp = left.next;
            left.next = right;
            right.next = temp;

            left = temp;
            right = st.pop();
        }
        right.next = null;

    }
    public ListNode mergeTwoSortedLists(ListNode one , ListNode two )
    {
        if(one==null)
            return two;
        else if(two==null)
            return one;

        ListNode c1=one,c2=two, dummy=new ListNode(-1),prev = dummy;

        while(c1!=null && c2!=null)
        {
            if(c1.val < c2.val)
            {
                prev.next=c1;
                c1=c1.next;
            }
            else
            {
                prev.next=c2;
                c2=c2.next;
            }
            prev=prev.next;
        }

        prev.next=(c1!=null)?c1:c2;
        ListNode head = dummy.next;
        dummy.next=null;
        return head;
    }
    public ListNode mergeKsortedLists(ListNode[] lists,int si ,int ei)
    {
        if(si==ei)
            return lists[si];
        
        int mid = (si+ei)/2;
        ListNode fsh = mergeKsortedLists(lists, si, mid);
        ListNode ssh = mergeKsortedLists(lists, mid+1, ei);
        return mergeTwoSortedLists(fsh, ssh);

    }
    
    public static void main(String[] agrs)
    {

    }
}
