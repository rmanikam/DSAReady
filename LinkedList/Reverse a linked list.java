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

    // Function to reverse a linked list.
    // iterative solution
    // Node reverseList(Node head) {
    //     // code here
        
        
    //     Node prev = null;
    //     Node temp = head;
    //     while(temp != null)
    //     {
    //         Node front = temp.next;
    //         temp.next = prev;
    //         prev = temp;
    //         temp = front;
    //     }
    //     return prev;
    // }

    // recursive solution


    class Solution {
        // Function to reverse a linked list.
        Node reverseList(Node head) {
            // code here
            if (head == null) {
                return null;
            }
            if (head.next == null) {
                return head;
            }
           Node newHead = reverseList(head.next);
           Node front = head.next;
           front.next = head;
           head.next = null;
           return newHead;
           
        }
    }
