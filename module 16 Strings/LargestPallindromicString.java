public class LargestPallindromicString {

    public static boolean IsPallindrome(String str){
        int n = str.length();
        for(int i = 0; i < str.length() / 2; i++){  // Fixed loop condition
            if(str.charAt(i) != str.charAt(n-1-i)){
                return false;
            }
        }
        return true;
    }

    public static String Output(String s){
        StringBuilder str = new StringBuilder("");
        for(int i = 0; i < s.length(); i++){
            for(int j = 1; j<s.length();j++)
            str.append(s.charAt(i));
                if(IsPallindrome(str.toString())){  // Fixed incorrect function call
               System.out.println(str);

            }
        }
        return str.toString();
    }

    public static void main(String[] args) {
        String s = "abbd";
        System.out.println(IsPallindrome(s));
        Output(s);  // Added missing function call
    }
}
