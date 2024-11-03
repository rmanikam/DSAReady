
class Node {
    int data;
    Node next;

}
class Solution {
    void deleteNode(Node node) {
        // Your code here
        
       if(node == null)
       {
           return;
       }
       
       if(node.next == null)
       {
           return;
       }
        
      
           node.data = node.next.data;
           node.next = node.next.next;
       
    }
}