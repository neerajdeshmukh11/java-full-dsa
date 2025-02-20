public class DoublyLL {

    public static class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    // add to the first pos
    public void addFirst(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;

    }

    // print the dll
    public void print(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+"<->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public int RemoveFirst(){
        if(head == null){
            System.out.println("The Dll is empty");
            return Integer.MIN_VALUE;
        }
        if(size == 1){
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }
        int val = head.data;
        head = head.next;
        head.prev = null;
        size--;
        return val;
    }


    public static void main(String[] args) {
        DoublyLL DLL = new DoublyLL();
        DLL.addFirst(5);
        DLL.addFirst(4);
        DLL.addFirst(3);
        DLL.addFirst(2);
        DLL.addFirst(1);
        DLL.print();

        DLL.RemoveFirst();
        DLL.print();
    }
}
