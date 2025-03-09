
import java.util.ArrayList;

public class ConvertBstToBalancedBst {
    static class Node{
        int data;
        Node left,right;
        public Node(int data){
            this.data = data;
            this.left = this.right = null;
        }
    }
    // inorder mein lane ke liye
    public static void GetInorder(Node root,ArrayList<Integer> list){
        if(root == null){
            return;
        }
        GetInorder(root.left, list);
        list.add(root.data);
        GetInorder(root.right, list);

    }
    // Main function jiss convet hoga
    public static Node BalancedBST(Node root){

        // inorder seq
        ArrayList<Integer> list = new ArrayList<>();
        GetInorder(root, list);

        // sorted inorder to balanced Bst
        root = CreateBst(list, 0, list.size()-1);
        return root;
    }

    // preorder ko check karne ke liye
    public static void Preorder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data+" ");
        Preorder(root.left);
        Preorder(root.right);
    }
    // create karo bst ko
    public static Node CreateBst(ArrayList<Integer> list, int st,int end){
        if(st>end){
            return null;
        }
        int mid = (st+end)/2;
        Node root = new Node(list.get(mid));
        root.left = CreateBst(list,st,mid-1); 
        root.right = CreateBst(list,mid+1,end);
        
        return root;
    }
    public static void main(String[] args) {
        Node root = new Node(8);
        root.left = new Node(6);
        root.left.left = new Node(5);
        root.left.left.left = new Node(3);

        root.right = new Node(10);
        root.right.right = new Node(11);
        root.right.right.right = new Node(12);

       root =  BalancedBST(root);
        Preorder(root);
        
    }
}
