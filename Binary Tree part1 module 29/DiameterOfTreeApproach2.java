public class DiameterOfTreeApproach2 {
    static class Node{
        int data;
        Node left,right;

        public Node(int data){
            this.data = data;
            this.right = null;
            this.left = null;
        }
        
    }
    static class Info{
        int diam;
        int ht;

        public Info(int diam,int ht){
            this.diam = diam;
            this.ht = ht;
        }   
    }
    public static Info diameter(Node root){ // O(n)
        if(root == null){
            return new Info(0, 0);
        }
        Info leftInfo = diameter(root.left);
        Info rightInfo = diameter(root.right);
        int diam = Math.max(Math.max(leftInfo.diam, rightInfo.diam), leftInfo.ht+rightInfo.ht+1);
        int ht = Math.max(leftInfo.ht, rightInfo.ht)+1;

        return new Info(diam, ht);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left =  new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);

        System.out.println(diameter(root).diam);
    }
}
