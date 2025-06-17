public class TriesQ2_Prefix_Problem {
    static class Node {
        Node[] children = new Node[26];
        boolean eow = false;
        int freq;

        public Node() {
            for (int i = 0; i < children.length; i++) {
                children[i] = null;
            }
            freq = 1;
        }
    }

    public static Node root = new Node();

    public static void insert(String word) {
        Node curr = root;
        for (int level = 0; level < word.length(); level++) {
            int idx = word.charAt(level) - 'a';
            if(curr.children[idx] == null){
                curr.children[idx] = new Node();
            }else{
                curr.children[idx].freq++;
            }
            curr = curr.children[idx];
        }
        curr.eow = true;
    }
    public static String searchPrefix(String word) {
        Node curr = root;
        StringBuilder prefix = new StringBuilder();

        for (int level = 0; level < word.length(); level++) {
            int idx = word.charAt(level) - 'a';
            prefix.append(word.charAt(level));
            curr = curr.children[idx];

            if (curr.freq == 1) {
                break; // Found unique prefix
            }
        }

        return prefix.toString();
    }

    public static void main(String[] args) {
        String arr[] = { "zebra", "dog", "dove", "duck" };

        for(int i=0;i<arr.length;i++){
            insert(arr[i]);
        }

        for(int i=0;i<arr.length;i++){
            System.out.print(searchPrefix(arr[i])+" ");
        }
    }
}
