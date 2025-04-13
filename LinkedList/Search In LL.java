class Solution {
    static Node constructLL(int arr[]) {
        // code here
        
        Node head = new Node(arr[0]);
        Node mover = head;
        for(int i = 1; i < arr.length;i++)
        {
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;// or mover = mover.next;
        }
        return head;
    }
    private static int checkIfPresent(Node head, int val)
    {
        Node temp = head;
        while(temp!= null)
        {
            if(temp.data == val)
            {
                return 1;
            }
            temp = temp.next;
         
        }
        return 0;
    }
    void main() {
        int[] arr = {12,5,8,7};
        Node head = constructLL(arr);
        System.out.print(checkIfPresent(head, 10));
        
        

    }

}
