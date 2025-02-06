
public class MyLinkedList {
    // creating a node
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    public void addFirst(int data) {

        // step 1 create new node
        Node newNode = new Node(data);

        // jab ll khali hogi
        if (head == null) {
            head = tail = newNode;
            return;
        }

        // step 2 new node's next = head
        newNode.next = head; // link

        // step 3 head = new Node
        head = newNode;

    }

    public void addLast(int data) {
        // step 1 create new node
        Node newNode = new Node(data);

        // khali ho toh
        if (head == null) {
            head = tail = newNode;
            return;
        }

        // step2 tail ke next = newNode
        tail.next = newNode;

        // step 3 tail = newNode
        tail = newNode;
    }

    public void print() {
        if (head == null) {
            System.out.println("linkedlist is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        MyLinkedList ll = new MyLinkedList();
        ll.print();
        ll.addFirst(2);
        ll.print();
        ll.addFirst(1);
        ll.print();
        ll.addLast(3);
        ll.print();
        ll.addLast(4);
        ll.print();

    }
}
