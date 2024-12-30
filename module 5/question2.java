import java.util.*;
public class question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the side of the square: ");
        int input = sc.nextInt();
        int area = input*input;
        System.out.println("The area of square is: " + area);
    }
}
