class ListNode {
    int val;
    ListNode next;

}

class Solution {

    public ListNode findLastNode(ListNode head, int k)
    {
        ListNode temp = head;
        int count = 1;
        while(temp != null)
        {
            if(count == k)
            {
                break;
            }
            temp= temp.next;
            count++;
        }
        return temp;
    }
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || k == 0)
        {
            return head;
        }
        int len = 1;
        ListNode tail = head;
        while(tail.next != null)
        {
            tail = tail.next;
            len++;
        }
        
        if(k % len == 0)
        {
            return head;
        }
        k = k % len;
        tail.next = head;
        ListNode temp = findLastNode(head, len - k);
        head = temp.next;
        temp.next = null;
        return head;
    


    }
}