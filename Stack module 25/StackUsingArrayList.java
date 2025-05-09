import java.util.*;
public class StackUsingArrayList {

    static class Stack{
        static ArrayList<Integer> list = new ArrayList<>();

        public static boolean isEmpty(){
            return list.size() == 0;
        }

        public static void Push(int data){
            list.add(data);
        }
        public static int Pop(){
            if(isEmpty()){
                return -1;
            }
            int top = list.get(list.size() - 1);
            list.remove(list.size()-1);
            return top;
        }
        public static int Peak(){
            if(isEmpty()){
                return -1;
            }
            return list.get(list.size()-1);
        }
    }
    public static void main(String[] args) {
        Stack s = new Stack();
        s.Push(1);
        s.Push(2);
        s.Push(3);

        while(!s.isEmpty()){
            System.out.println(s.Peak());
            s.Pop();
        }
    }
}
