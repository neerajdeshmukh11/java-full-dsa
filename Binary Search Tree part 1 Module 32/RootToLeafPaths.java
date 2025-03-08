import java.util.ArrayList;
public class RootToLeafPaths {
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
    public static void PrintPath(ArrayList<Integer> path){
        for(int i = 0;i<path.size();i++){
            System.out.print(path.get(i)+" -> ");
        }
        System.out.println("null");
    }
    public static void Path(Node root,ArrayList<Integer> path){
        if(root == null){
            return;
        }
        path.add(root.data);
        if(root.left == null && root.right==null){
            PrintPath(path);
        }
        Path(root.left, path);
        Path(root.right, path);
        path.remove(path.size()-1);
    }
    public static void main(String[] args) {
        int values[] = {8,5,3,6,10,11,14};
            Node root = null;
            for(int i=0;i<values.length;i++){
                root = Insert(root, values[i]);
            }
            Inorder(root);
            System.out.println();
            Path(root, new ArrayList<>());
    }
}
