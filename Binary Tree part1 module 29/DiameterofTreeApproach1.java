public class DiameterofTreeApproach1 {
    static class Node{
        int data;
        Node left,right;

        public Node(int data){
            this.data = data;
            this.right = null;
            this.left = null;
        }
        
    }
    public static int height(Node root){
        if(root == null){
            return 0;
        }
        int lh = height(root.left);
        int rh = height(root.right);
        return Math.max(lh, rh)+1;
    }
    public static int Diameter(Node root){
        if(root == null){
            return 0;
        }
        int leftDiam = Diameter(root.left);
        int leftHeight = height(root.left);
        int rightDiam = Diameter(root.right);
        int rightHeight = height(root.right);
        int selfDiam = leftHeight+rightHeight+1;
        return Math.max(selfDiam, Math.max(rightDiam, leftDiam));
    } 
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left =  new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        System.out.println(Diameter(root));
    }
}
