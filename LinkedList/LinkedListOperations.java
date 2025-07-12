
class node {
    int data;
    node next;

    node(int d) {
        data = d;
        next = null;
    }
}

class ll {
    node head;

    void insertHead(int x) {
        node newNode = new node(x);
        newNode.next = head;
        head = newNode;
    }

    void insertTail(int x) {
        node newNode = new node(x);
        if (head == null) {
            head = newNode;
            return;
        }
        node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    node insertAtKthPosition(node head, int x, int k) {
        if (head == null) {
            if (k == 1) {
                node newNode = new node(x);
                return newNode;

            }
            // if k >1 and list is empty return null(invalid position)
            else {
                return null;
            }
        }
        if (k == 1) {
            node newNode = new node(x);
            newNode.next = head;
            head = newNode;
            return head;
        }
        node temp = head;
        int count = 0;
        while (temp != null) {
            count++;
            if (count == k - 1) {
                node newNode = new node(x);
                newNode.next = temp.next;
                temp.next = newNode;
                break;
            }
            temp = temp.next;
        }
        return head;
    }

    node insertBeforeX(node head, int x, int val) {
        if (head == null) {
            return head;
        }
        if (head.data == x) {
            node newNode = new node(val);
            newNode.next = head;
            head = newNode;
            return head;
        }
        node temp = head;
        while (temp.next != null) {
            if (temp.next.data == x) {
                node newNode = new node(val);
                newNode.next = temp.next;
                temp.next = newNode;
                break;
            }
            temp = temp.next;
        }
        return head;
    }

    node deleteHead(node head) {
        head = head.next;
        return head;
    }

    node deleteTail(node head) {
        if (head == null || head.next == null) {
            return null;
        }
        node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
        return head;

    }

    node deleteAtKthPosition(node head, int k) {
        if (head == null) {
            return null;
        }
        if (k == 1) {
            head = head.next;
            return head;
        }
        int count = 0;
        node temp = head;
        node prev = null;
        while (temp != null) {
            count++;
            if (count == k) {
                prev.next = prev.next.next;
                break;
            }
            prev = temp;
            temp = temp.next;
        }

        return head;

    }

    node deleteBeforeX(node head, int val) {
        if (head == null) {
            return null;
        }
        if (head.data == val) {
            head = head.next;
            return head;
        }
        node temp = head;
        node prev = null;
        while (temp != null) {
            if (temp.data == val) {
                prev.next = prev.next.next;
                break;
            }
            prev = temp;
            temp = temp.next;

        }
        return head;
    }

    void print() {
        node temp = head;
        while (temp != null) {
            if (temp.next == null) {
                System.out.print(temp.data);
                return;
            }
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
    }
}

public class LinkedListOperations {
    public static void main(String[] args) {
        ll obj = new ll();
        System.out.print("Insert at Tail: ");
        obj.insertTail(1);
        obj.insertTail(2);
        obj.insertTail(3);
        obj.print();
        System.out.println();
        System.out.print("Insert at Head: ");
        obj.insertHead(2);
        obj.print();
        System.out.println();
        System.out.print("Insert at KthPosition: ");
        obj.head = obj.insertAtKthPosition(obj.head, 9, 2);
        obj.print();
        System.out.println();
        System.out.print("Insert before X: ");
        obj.head = obj.insertBeforeX(obj.head, 3, 7);
        obj.print();
        System.out.println();
        System.out.print("Delete Head: ");
        obj.head = obj.deleteHead(obj.head);
        obj.print();
        System.out.println();
        System.out.print("Delete Tail: ");
        obj.head = obj.deleteTail(obj.head);
        obj.print();
        System.out.println();
        System.out.print("Delete at KthPosition: ");
        obj.head = obj.deleteAtKthPosition(obj.head, 4);
        obj.print();
        System.out.println();
        System.out.print("Delete before X: ");
        obj.head = obj.deleteBeforeX(obj.head, 2);
        obj.print();
        System.out.println();

    }
}
