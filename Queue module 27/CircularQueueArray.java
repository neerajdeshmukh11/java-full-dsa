public class CircularQueueArray {
    // every func in O(1)

    static class Queue{
        static int arr[];
        static int size;
        static int rear;
        static int front;

        Queue(int n) {
            arr = new int[n];
            size = n;
            rear = -1;
            front = -1;
        }

        public static boolean isEmpty(){
            return rear == -1 && front == -1;
        }
        public static boolean isFull(){
            return (rear+1)%size == front;
        }

        public static void add(int data){
            if(isFull()){ //check karo kahi full toh n ahi
                System.out.println("Queue is full");
                return;
            }
            // add first element
            if(front == -1){
                front = 0;
            }
            rear = (rear+1)%size; // rear ko badhao 
            arr[rear] = data; // element ko badhi hui pos pe baithao
        }

        public static int remove(){
            if(isEmpty()){
                System.out.println("queue is empty");
                return -1;
            }
            int result = arr[front];
            // last el delete
            if(rear == front){
                rear = front = -1;
            }else{
                front = (front+1)%size;
            }
            return front; // return karo
        }
        public static int peek(){
            if(isEmpty()){
                System.out.println("queue is empty");
                return -1;
            }
            return arr[front];
        }
    } 
    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println(q.remove());
        q.add(4);
        System.out.println(q.remove());
        q.add(5);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
