public class MyNewLinkedList {
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

    // slow fast approach
    public Node findMid(Node head){ // helper func
        Node slow = head;
        Node fast = head;

        while(fast!=null && fast.next!=null){
            slow = slow.next; // +1
            fast = fast.next.next; // +2
        }
        return slow;
    }
    public boolean IsPalindrome(){
        if(head == null || head.next==null){
            return true;
        }
        // find the mid node
        Node midNode = findMid(head);

        // reverse 2nd half
        Node prev = null;
        Node curr = midNode;
        Node next;
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right = prev; // right half head
        Node left = head; // left half head

        // check for left & right
        while(right!=null){
            if(left.data!=right.data){
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }


    public static void main(String[] args) {
        MyNewLinkedList ll = new MyNewLinkedList();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.print();
        System.out.println(ll.IsPalindrome());
    }
}
