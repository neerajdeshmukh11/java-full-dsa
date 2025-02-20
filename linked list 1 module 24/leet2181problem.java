public class leet2181problem {
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
    public void add(int idx, int data) {
        if (idx == 0) {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;
        // jab tak previous nahi milta
        while (i < (idx - 1)) {
            temp = temp.next;
            i++;
        }

        // i = idx-1 temp -> prev
        newNode.next = temp.next;
        temp.next = newNode;
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
        leet2181problem ll = new leet2181problem();
        ll.add(0,0);
        ll.add(1,3);
        ll.add(2,1);
        ll.add(3,0);
        ll.add(4,4);
        ll.add(5,5);
        ll.add(6,2);
        ll.add(7,0);
        ll.print();
    }
}
