import java.util.Stack;
public class problem682{
    public static void main(String[] args) {
        String operations[] = {"5","2","C","D","+"};
        Stack<Integer> s = new Stack<>();
        for(int i=0;i<operations.length;i++){
            s.push(i);
            if(operations[i] == "C"){
                s.pop();
            }else if(operations[i] == "D"){
                
                s.push(2*s.pop());
                s.pop();
            }else if(operations[i] == "+"){
                int First = s.peek();
                s.pop();
                int Second = s.peek();
                s.pop();
                s.push(First+Second);
            }
        }
    }
}