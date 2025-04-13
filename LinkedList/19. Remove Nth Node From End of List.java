class ListNode {
    int val;
    ListNode next;
   
}

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode dummy = new ListNode();
        dummy.next = head;
        if(dummy.next.next == null && n == 1)
        {
            return null;
        }
        ListNode fast = dummy;
        ListNode slow = dummy;

        

        for(int i = 1; i <= n; i++)
        {   
            fast = fast.next;
                    }
       
        while(fast.next != null)
        {
            fast = fast.next;
            slow = slow.next;
        }
          
        
          slow.next = slow.next.next;
        
       
        return dummy.next;

        
    }
}