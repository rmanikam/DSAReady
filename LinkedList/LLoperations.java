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

public class LLoperations {

    Node head;

    public LLoperations() {
        head = null;
    }

    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;
    }

    public void insertLast(int val) {

        Node node = new Node(val);
        if (head == null) {
            head = node;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = node;
    }

    public void insert(int val, int index) {
        Node temp = head;
        int i = 1;
        Node node = new Node(val);

        while (temp != null && i < index - 1) {

            temp = temp.next;
            i++;
        }
        if (temp != null) {
            node.next = temp.next;
            temp.next = node;
        }

    }

    public void deleteFirst() {
        Node temp = head;
        if (temp != null) {
            temp = temp.next;
        }
        head = temp;
    }

    public void deleteLast() {
        if (head == null) // If list is empty
        {
            return;
        }
        if (head.next == null) // If there's only one node
        {
            head = null;
            return;
        }
        Node temp = head;
        while (temp.next.next != null) // Traverse till second last node
        {
            temp = temp.next;
        }
        temp.next = null; // Remove the last node

    }

    public void deleteMiddle(int index) {

        if (head == null || index < 1) {
            System.out.println("Invalid operation. The list is empty or the index is out of bounds.");
            return;
        }
        // If index is 1, delete the first node
        if (index == 1) {
            deleteFirst();
            return;
        }
        int i = 1;
        Node temp = head;
        while (temp != null && i < index - 1) {

            temp = temp.next;
            i++;
        }
        if (temp != null && temp.next != null) {
            temp.next = temp.next.next;
            temp = temp.next.next;
        }

    }


    public void search(int index, int value)
    {
       

        Node temp = head;
        while(temp !=null )
        {
            if(value == temp.data)
            {
                System.out.println("The Node is found at index " + index + " and has value " + temp.data);
            }
            temp = temp.next;
        }
        
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        LLoperations list = new LLoperations();

        list.insertLast(10);

        list.insertLast(15);

        list.insertLast(20);

        list.insertFirst(5);

        list.insert(18, 3);


        list.deleteFirst();

        list.deleteLast();

        list.insertLast(30);

        list.insertLast(40);

        list.deleteMiddle(3);

        // Print the linked list

        list.search(3, 30);
        list.printList();

    }

}