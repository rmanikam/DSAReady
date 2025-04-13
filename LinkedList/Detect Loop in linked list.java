
import java.util.HashMap;

class Solution {
    
 
    // Function to check if the linked list has a loop.
    public static boolean detectLoop(Node head) {
        // Add code here
 
        HashMap<Node, Integer> mpp = new HashMap<>();
         Node temp = head;
         
         while(temp != null)
         {
             if(mpp.containsKey(temp))
             {
                 return true;
             }
             else
             {
                 mpp.put(temp, 1);
             }
             temp = temp.next;
         }
         return false;
    }
}