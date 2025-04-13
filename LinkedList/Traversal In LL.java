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


    void main() {
        int[] arr = {12,5,8,7};
        Node head = constructLL(arr);
        Node temp = head;
        while(temp!= null)
        {
            System.out.println(temp.data + " ");
            temp = temp.next;
        }
        

    }

}
