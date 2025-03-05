public class SubtreeOfAnotherTree {
    static class Node{
        int data;
        Node left,right;

        public Node(int data){
            this.data = data;
            this.right = null;
            this.left = null;
        }
        
    }
    public static boolean isIdentical(Node node, Node subRoot){
        if(node == null && subRoot == null){
            return true;
        }else if(node == null || subRoot == null || node.data!=subRoot.data){
            return false;
        }
        if(!isIdentical(node.left, subRoot.left)){
            return false;
        }
        if(!isIdentical(node.right, subRoot.right)){
            return false;
        }
        return true;
    }

    public static boolean IsSubtree(Node root, Node subRoot){
        if(root == null){
            return false;
        }
        if(root.data == subRoot.data){
            if(isIdentical(root,subRoot)){
                return true;
            }
        }

        return IsSubtree(root.left, subRoot) || IsSubtree(root.right, subRoot);
    }
    public static void main(String[] args) {
        // tree
        Node root = new Node(1);
        root.left =  new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);

        // subtree
        Node subRoot = new Node(2);
        subRoot.left = new Node(4);
        subRoot.right = new Node(5);
        System.out.println(IsSubtree(root, subRoot));
    }
}
