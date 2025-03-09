public class SortedArrayToBalancedBST{
    static class Node{
        int data;
        Node left,right;
        public Node(int data){
            this.data = data;
            this.left = this.right = null;
        }
    }
    public static void Preorder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data+" ");
        Preorder(root.left);
        Preorder(root.right);
    }
    public static Node CreateBst(int arr[], int st,int end){
        if(st>end){
            return null;
        }
        int mid = (st+end)/2;
        Node root = new Node(arr[mid]);
        root.left = CreateBst(arr,st,mid-1); 
        root.right = CreateBst(arr,mid+1,end);
        
        return root;
    }
    public static void main(String[] args) {
        int arr[] = {3,5,6,8,10,11,12};
        Node root = CreateBst(arr, 0, arr.length-1);
        Preorder(root);
    }
}