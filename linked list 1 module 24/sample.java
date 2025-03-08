public class sample {
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
    public static int size;

    public void addFirst(int data) {

        // step 1 create new node
        Node newNode = new Node(data);
        size++;

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
        sample ll = new sample();
        ll.addFirst(2);
        ll.addFirst(1);
       ll.print();
    }
}
