

public class SizeOfLargestBst {
    static class Node{
        int data;
        Node left,right;
        public Node(int data){
            this.data = data;
            this.left = this.right = null;
        }
    }
    static class Info{
        boolean IsBst;
        int size;
        int min;
        int max;

        public Info(boolean IsBst, int size, int min, int max){
            this.IsBst = IsBst;
            this.size = size;
            this.min = min;
            this.max = max;
        }
    }
    public static int BstSize = 0;
    public static Info largestBST(Node root){

        // base case
        if(root == null){
            return new Info(true, 0, Integer.MAX_VALUE, Integer.MIN_VALUE);
        }

        // left and right info nikalo
        Info leftInfo = largestBST(root.left);
        Info rightInfo = largestBST(root.right);

        // size nikal lenge
        int size = leftInfo.size + rightInfo.size +1;

        // min
        int min = Math.min(root.data, Math.min(leftInfo.min, rightInfo.min));

        // max
        int max = Math.max(root.data, Math.max(leftInfo.max, rightInfo.max));

        // IsBst
        if(root.data <= leftInfo.max || root.data>=rightInfo.min){
            return new Info(false, size, min, max);
        }
        if(leftInfo.IsBst && rightInfo.IsBst){
            BstSize = Math.max(BstSize, size);
            return new Info(true, size, min, max); 
        }
        return new Info(false, size, min, max);
    }
    public static void main(String[] args) {
        Node root = new Node(50);
        root.left = new Node(30);
        root.left.left = new Node(5);
        root.left.right = new Node(20);

        root.right = new Node(60);
        root.right.left = new Node(45);
        root.right.right = new Node(70);
        root.right.right.left = new Node(65);
        root.right.right.right = new Node(80);

        Info info = largestBST(root);
        System.out.println("Max Bst size: "+ BstSize);
    }
}
