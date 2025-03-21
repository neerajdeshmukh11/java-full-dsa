public class PrintInRange {

    static class Node{
        int data; 
        Node left,right;

        public Node(int data){
            this.data = data;
            // this.left = null;
            // this.right = null;
        }
    }
    public static Node Insert(Node root,int val){
        if(root == null){
            root = new Node(val);
            return root;
        }
        if(root.data > val){
            // left subtree
            root.left = Insert(root.left, val);
        }else{
            // right subtree
            root.right = Insert(root.right, val);
        }
        return root;
    }
    public static void Inorder(Node root){
        if(root == null) return;
        Inorder(root.left);
        System.out.print(root.data+" ");
        Inorder(root.right);
    }
    public static void InRange(Node root,int k1,int k2){
        if(root == null){
            return;
        }
        if(root.data>=k1 && root.data<=k2){
            InRange(root.left, k1, k2);
            System.out.println(root.data+" ");
            InRange(root.right, k1, k2);
        }else if (root.data<k1) {
            InRange(root.left, k1, k2);
        }else{
            InRange(root.right, k1, k2);
        }
    }
    public static void main(String[] args) {
            int values[] = {8,5,3,1,4,6,10,11,14};
            Node root = null;
            for(int i=0;i<values.length;i++){
                root = Insert(root, values[i]);
            }
            Inorder(root);
            System.out.println();
            int k1 = 5,k2 =12;
            InRange(root, k1, k2);
    }
}
