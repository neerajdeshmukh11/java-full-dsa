import java.util.*;

public class MenuDrivenStack1 {
    static class Stack {
        static ArrayList<Integer> list = new ArrayList<>();

        public static boolean isEmpty() {
            return list.size() == 0;
        }

        public static void push(int data) {
            list.add(data);
            System.out.println("Pushed " + data + " to the stack.");
        }

        public static int pop() {
            if (isEmpty()) {
                System.out.println("Stack is empty. Nothing to pop.");
                return -1;
            }
            int top = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            System.out.println("Popped " + top + " from the stack.");
            return top;
        }

        public static int peek() {
            if (isEmpty()) {
                System.out.println("Stack is empty. No top element.");
                return -1;
            }
            return list.get(list.size() - 1);
        }

        public static void display() {
            if (isEmpty()) {
                System.out.println("Stack is empty.");
                return;
            }
            System.out.println("Stack elements: " + list);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack stack = new Stack();

        while (true) {
            System.out.println("\nStack Menu:");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Display");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter a number to push: ");
                    int num = scanner.nextInt();
                    stack.push(num);
                    break;
                case 2:
                    stack.pop();
                    break;
                case 3:
                    int top = stack.peek();
                    if (top != -1) {
                        System.out.println("Top element: " + top);
                    }
                    break;
                case 4:
                    stack.display();
                    break;
                case 5:
                    System.out.println("Exiting program...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice! Please enter a valid option.");
            }
        }
    }
}
