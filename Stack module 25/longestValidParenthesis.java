import java.util.Stack;

public class longestValidParenthesis {

    public static int longest(String str){
        Stack<Character> s = new Stack<>();
        int count = 0;
        if(str.isEmpty()){
            return 0;
        }
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            // opening
            if(ch == '('){
                s.push(ch);
            }else{
                if(s.isEmpty()){
                    continue;
                }
                // closing
                if(s.peek() == '(' && ch == ')'){
                    s.pop();
                    count = count+2;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String str = ")()())";
        System.out.println(longest(str));
        
    }
}
