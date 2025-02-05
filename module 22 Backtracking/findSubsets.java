public class findSubsets {
    public static void FindSubsets(String str, String ans, int i){
        // base case
        if(i == str.length()){
            if(ans.length() == 0){
                System.out.println("null");
            }else{
                System.out.println(ans);
            }
            return;
        }
        // recursion
        // yes choice/ char aana chahta hai
        FindSubsets(str, ans+str.charAt(i), i+1);
        // no choice / char nahi aana chahata 
        FindSubsets(str, ans, i+1);

    }
    public static void main(String[] args) {
        String str = "abc";
        FindSubsets(str, "", 0);
    }
}
