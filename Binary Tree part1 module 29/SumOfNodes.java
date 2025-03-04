public class SumOfNodes {

    static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            this.right = null;
            this.left = null;
        }

    }

    public static int Sum(Node root) {
        if (root == null) {
            return 0;
        }
        int leftSum = Sum(root.left);
        int rightSum = Sum(root.right);
        return (leftSum + rightSum + root.data);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);

        System.out.println("The sum of all Nodes is: "+Sum(root)); // 21

    }
}
