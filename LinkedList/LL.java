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

public class LL {

    Node head;

    public LL() {
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

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        LL list = new LL();

        list.insertLast(10);

        list.insertLast(15);

        list.insertLast(20);

        list.insertFirst(5);

        list.insert(18, 3);

        // Print the linked list
        list.printList();

    }

}