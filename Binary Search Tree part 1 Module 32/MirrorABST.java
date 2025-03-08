public class MirrorABST {
    static class Node{
        int data; 
        Node left,right;

        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static Node CreateMirror(Node root){ // O(N)
        if(root == null){
            return null;
        }
        // mirror image create hoke aayegi
        Node leftMirror = CreateMirror(root.left);
        Node rightMirror = CreateMirror(root.right);

        // swap karenge
        root.left = rightMirror;
        root.right = leftMirror;

        return root;
    }
    public static void Preorder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data+" ");
        Preorder(root.left);
        Preorder(root.right);
    }
    public static void main(String[] args) {
        Node root = new Node(8);
        root.left = new Node(5);
        root.right = new Node(10);
        root.left.left = new Node(3);
        root.left.right = new Node(6);
        root.right.right = new Node(11);

       root =  CreateMirror(root);
       Preorder(root);
    }
}
