import java.util.Stack;

public class pushAtBottom {

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
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        PushAtBottom(s, 8);
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }
}
