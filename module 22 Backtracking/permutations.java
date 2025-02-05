public class permutations {

    public static void PrintPerm(String str, String ans) {
        if(str.length() == 0){ // base case
            System.out.println(ans);
            return;
        }
        // kaam 
        for(int i=0;i<str.length();i++){
            char curr = str.charAt(i); // pehle char ko curr mein store kiya
            // current ko str se remove karna padega 
            // newStr bana ke 
            String newStr = str.substring(0,i) + str.substring(i+1);
            PrintPerm(newStr, ans+curr);
        }
    }
    public static void main(String[] args) {
        String str = "abc";
        PrintPerm(str, "");
    }
}
