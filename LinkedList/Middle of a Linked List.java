class Node {
    // define elements inside Node like the data and the next Node that it points to
    int data;
    Node next;

    // define a constructor
    Node(int val) {
        data = val;
        next = null;
    }
}
class Solution {
    int getMiddle(Node head) {
        // Your code here.
        
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.data;
    }
}
