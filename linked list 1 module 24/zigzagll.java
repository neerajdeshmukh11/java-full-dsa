public class zigzagll {

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
    
        public void addLast(int data) {
            // step 1 create new node
            Node newNode = new Node(data);
            size++;
    
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

        public void zigZag(){
            // find mid
            Node slow = head;
            Node fast = head.next;
            while(fast!=null && fast.next!=null){
                slow = slow.next;
                fast = fast.next.next;
            }
            Node mid = slow;

            // reverse the 2nd half
            Node curr = mid.next;
            mid.next = null;
            Node prev = null;
            Node next;

            while(curr!=null){
                next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next; 
            }

            Node left = head;
            Node right = prev;
            Node nextL , nextR;

            // merge the zig zag
            while(left != null && right!=null){
                nextL = left.next;
                left.next = right;
                nextR = right.next;
                right.next = nextL;

                right = nextR;
                left = nextL;
            }

        }
    
    public static void main(String[] args) {
        zigzagll ll = new zigzagll();
        ll.addFirst(6);
        ll.addFirst(5);
        ll.addFirst(4);
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);
        ll.print();

        ll.zigZag();
        ll.print();
    }
}
