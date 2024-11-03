import java.util.Set;
import java.util.HashSet;

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
    public static Node findUnion(Node head1, Node head2) {
        // Add your code here.
        
        Set<Integer> set = new HashSet<>();
        Node temp1 = head1;
        while(temp1!= null)
        {
            set.add(temp1.data);
            temp1 = temp1.next;
        }
        Node temp2 = head2;
        while(temp2!= null)
        {
            set.add(temp2.data);
            temp2 = temp2.next;
        }
        
        Node curr = null;
        Node start = null;
        
        for(int x : set)
        {
          if(start == null)
          {
              start = new Node(x);
              curr = start;
          }
          else
          {
              curr.next = new Node(x);
              curr = curr.next;
          }
        } 
        return start;
        
    }
}