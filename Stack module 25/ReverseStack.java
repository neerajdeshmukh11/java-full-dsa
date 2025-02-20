import java.util.Stack;
public class ReverseStack{

    public static void PushAtBottom(Stack<Integer> s,int data){
        // base case
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        // recursion
        int top = s.pop();
        PushAtBottom(s, data);
        s.push(top);
    }

    public static void reverse(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }
        int top = s.pop();
        reverse(s);
        PushAtBottom(s,top);
    }

    public static void printStack(Stack<Integer> s) {
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        // 3
        // 2
        // 1
        reverse(s);
        printStack(s);
        // 1
        // 2
        // 3

    }
}
