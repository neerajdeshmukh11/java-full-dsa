import java.util.*;

public class TreeTraversals {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    static class BinaryTree{
        static int idx =-1; 
        public static Node BuildTree(int nodes[]){
            idx++;
            if(nodes[idx] == -1){
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.left = BuildTree(nodes);
            newNode.right = BuildTree(nodes);
            return newNode;
        }

        public static void Preorder(Node root){
            if(root == null){
                return;
            }
            System.out.print(root.data+" ");
            Preorder(root.left);
            Preorder(root.right);
        }
        public static void Inorder(Node root){
            if(root == null){
                return;
            }
            Inorder(root.left);
            System.out.print(root.data+" ");
            Inorder(root.right);
        }
        public static void PostOrder(Node root){
            if(root == null){
                return;
            }
            PostOrder(root.left);
            PostOrder(root.right);
            System.out.print(root.data+" ");
        }
        public static void LevelOrder(Node root){
            if(root == null){
                return;
            }
            Queue<Node> q =new LinkedList<>();
            q.add(root);
            q.add(null);
            while(!q.isEmpty()){
                Node currNode = q.remove();
                if(currNode == null){
                    System.out.println();
                    if(q.isEmpty()){
                        break;
                    }else{
                        q.add(null);
                    }
                }else{
                    System.out.print(currNode.data+" ");
                    if(currNode.left != null){
                        q.add(currNode.left);
                    }
                    if(currNode.right != null){
                        q.add(currNode.right);
                    }
                }
            }
        }

    }

    public static void main(String[] args) {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root =  tree.BuildTree(nodes);
        System.out.print("the preorder: ");
        tree.Preorder(root); // 1 2 4 5 3 6
        System.out.println();
        System.out.print("the Inorder: ");
        tree.Inorder(root);  // 4 2 5 1 3 6
        System.out.println();
        System.out.print("the PostOrder: ");
        tree.PostOrder(root); // 4 5 2 6 3 1
        System.out.println();
        System.out.println("the LevelOrder Traversal: ");
        tree.LevelOrder(root); // 1
                               // 2 3 
                               // 4 5 6
    }
}
