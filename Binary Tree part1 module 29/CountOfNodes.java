public class CountOfNodes {

    static class Node{
        int data;
        Node left,right;

        public Node(int data){
            this.data = data;
            this.right = null;
            this.left = null;
        }
        
    }
    public static int Count(Node root){
        if(root == null){
            return 0;
        }
        int lc = Count(root.left);
        int rc = Count(root.right);
        return (lc+rc+1);
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left =  new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        System.out.println(Count(root)); // 6
    }
}
