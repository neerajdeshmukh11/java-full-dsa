import java.util.*;
public class Merge2Bst {
    static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static void GetInorder(Node root, ArrayList<Integer> arr){
        if(root == null){
            return;
        }
        GetInorder(root.left, arr);
        arr.add(root.data);
        GetInorder(root.right, arr);
    }
    public static Node CreateBSt(ArrayList<Integer> arr, int st, int end){
        if(st>end){
            return null;
        }
        int mid = (st+end)/2;
        Node root = new Node(arr.get(mid));
        root.left = CreateBSt(arr, st, mid-1);
        root.right = CreateBSt(arr, mid+1, end);
        return root;
    }
    public static Node mergeBST(Node root1,Node root2){

        // step 1 inorder seq banao bst 1
        ArrayList<Integer> arr1 = new ArrayList<>();
        GetInorder(root1,arr1);

        // step 2 inorder seq banao bst 2
        ArrayList<Integer> arr2 = new ArrayList<>();
        GetInorder(root2,arr2);

        // merge
        int i=0,j=0;
        ArrayList<Integer> arrFinal = new ArrayList<>();
        while(i<arr1.size() && j<arr2.size()){
            if(arr1.get(i)<=arr2.get(j)){
                arrFinal.add(arr1.get(i));
                i++;
            }else{
                arrFinal.add(arr2.get(j));
                j++;
            }
        }
        while(i<arr1.size()){
            arrFinal.add(arr1.get(i));
            i++;
        }
        while(j<arr2.size()){
            arrFinal.add(arr2.get(j));
            j++;
        }

        // sorted arrList --> ek balanced bst ko create karo
       return  CreateBSt(arrFinal, 0, arrFinal.size()-1);
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
        Node root1 = new Node(2);
        root1.left = new Node(1);
        root1.right = new Node(4);

        Node root2 = new Node(9);
        root2.left = new Node(3);
        root2.right = new Node(12);
        //
        Node root = mergeBST(root1, root2);
        Preorder(root);
    }
}
