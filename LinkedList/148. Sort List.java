// import java.util.ArrayList;
// import java.util.Collections;

class ListNode {
    int val;
    ListNode next;

}

// class Solution {
//     public ListNode sortList(ListNode head) {

//         ArrayList<Integer> arr = new ArrayList<Integer>();
//         ListNode temp = head;

//         while(temp!= null)
//         {
//             arr.add(temp.val);
//             temp =temp.next;

//         }

//         Collections.sort(arr);

//         temp =head;
//         int i = 0;
//         while(temp!=null)
//         {
//            temp.val = arr.get(i);
//             temp = temp.next;
//             i++;
//         }
//         return head;
//     }
// }

// Time complexity is O((n) + O(n) + O(n logn)
// Space Complexity is O(n)


class Solution {

    public ListNode merge(ListNode a, ListNode b)
    {
        if(a == null)
        {
            return b;
        }
        if (b == null) {
            return a;
        }

        ListNode head = null;
        ListNode tail = null;
        if(a.val <= b.val)
        {
            head = tail = a;
            a = a.next;
        }
        else
        {
           head = tail = b;
            b = b.next; 
        }

        while(a != null && b != null)
        {
            if(a.val <= b.val)
            {
                tail.next = a;
                tail = a;
                a = a.next;
            }
            else
            {
                 tail.next = b;
                tail = b;
                b = b.next;
            }
        }
        if(a == null)
        {
            tail.next = b;
        }
        else
        {
             tail.next = a;
        }
        return head;
    }
    public ListNode findMid(ListNode head)
    {
        ListNode slow = head;
        ListNode fast = head.next;
        while(fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public ListNode sortList(ListNode head) {
        
        if(head == null || head.next == null)
        {
            return head;
        }

        ListNode mid = findMid(head);

        ListNode left = head;
        ListNode right = mid.next;
        mid.next = null;

        left = sortList(left);
        right = sortList(right);
        return merge(left, right);
    }
}

// TC is logN  *(N + N/2);
// SC is O(1);