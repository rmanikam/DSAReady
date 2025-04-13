

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
// brute force
// class Solution {
//     public ListNode mergeKLists(ListNode[] lists) {

//         // arr.add(temp.val); is incorrect because arrays in Java do not have an add method. 
//         // If you use an ArrayList<Integer>, you can use add to append elements.
//          List<Integer> arr = new ArrayList<>();  // Use ArrayList for dynamic resizing
//         for(int i = 0; i < lists.length; i++)
//         {
//             // In many linked list problems, ListNode is the default name provided for the
//             // node structure. so instead of Node use ListNode
//            ListNode temp =  lists[i];
//            while(temp!= null)
//            {
//              arr.add(temp.val);
//              temp = temp.next;
//            }
//         }
//         Collections.sort(arr);
       
//        ListNode ans = new ListNode(0);
//        ListNode current = ans;
//        for(int val: arr)
//        {
//         current.next = new ListNode(val); //creates a new node with the value val and 
//         // links it to the end of the list.
//         current = current.next;
//        }
//        return ans.next;
//    // Why dummy.next: Since dummy is just a placeholder, we skip it and return dummy.next, 
//    // which is the actual head of our constructed linked list.
//    // Simplifies Edge Cases: Using dummy.next allows us to avoid special cases for an empty list, 
//    // as dummy.next will simply be null if no nodes were added.
//     }
// }

// t.c is O(N* K)  + M LogM + O(M)
// s.c is O(M)  + O(M)

class Solution {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        
        ListNode t1 = list1;
        ListNode t2 = list2;
        ListNode dummyNode = new ListNode(-1);
        ListNode temp = dummyNode;
        while(t1 != null  && t2 != null)
        {
            if(t1.val < t2.val)
            {
                temp.next = t1;
                temp = t1;
                t1= t1.next;
               
            }
            else
            {
                temp.next = t2;
                temp = t2;
                t2= t2.next;
            }
            
        }
        if(t1 != null) temp.next = t1;
        else if(t2 != null) temp.next = t2;
        return dummyNode.next;
    }
    public ListNode mergeKLists(ListNode[] lists) {

        ListNode head = lists[0];
        for(int i = 0; i < lists.length;i++)
        {
             head = mergeTwoLists(head, lists[i] );

        }
        return head;
    }

}

// t.c is O(n^3)
// s.c is O(1)
