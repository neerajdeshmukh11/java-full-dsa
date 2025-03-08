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

    public int RemoveFirst() {
        if (size == 0) {
            System.out.println("the linkedlist is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            head = head.next;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }
    public int RemoveLast(){
        if(size == 0){
            System.out.println("the linkedlist is empty");
            return Integer.MIN_VALUE;
        }else if(size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        // prev = i to size-2;
        Node prev = head;
        for(int i=0;i<size-2;i++){
            prev = prev.next;
        }
        int val = tail.data; // prev.next.data
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }
    public int itrSearch(int key){ // O(n)
        Node temp = head;
        int i = 0;
        while(temp!=null){
            if(temp.data == key){
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }
    public int recHelper(Node head, int key){
        if(head==null){
            return -1;
        }
        if(head.data == key){
            return 0;
        }
        int idx = recHelper(head.next, key);
        if(idx == -1){
            return -1;
        }
        return idx+1;
    }
    public int recursiveSearch(int key){
        return recHelper(head, key);
    }
    public void reverse(){
        Node prev = null;
        Node curr = tail = head;
        Node next;
        
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }
    public void deleteNthFromEnd(int n){
        // clac the size
        int sz = 0;
        Node temp = head;
        while(temp!=null){
            temp = temp.next;
            sz++;
        }
        // agr head ko hi delete karna hai toh
        if(n == sz){
            head = head.next; // RemoveFirst
            return;
        }
        int i =1;  // sz - n;
        int iToFind = sz-n;
        Node prev = head;
        while(i<iToFind){
            prev=prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return;
    }

    public static void main(String[] args) {
        MyLinkedList ll = new MyLinkedList();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.addLast(4);
        // ll.print();
        // ll.add(2, 9);
        // ll.print();
        System.out.println("The size of my linkedlist is: " + ll.size);
        // ll.RemoveFirst();
        // ll.print();
        // System.out.println("The size of my linkedlist is: " + ll.size);
        // ll.RemoveLast();
        // ll.print();
        // System.out.println("The size of my linkedlist is: " + ll.size);
        // System.out.println(ll.recursiveSearch(10));
        // ll.reverse();
        // ll.print();
        // ll.deleteNthFromEnd(3);
        ll.print();
    }
}
