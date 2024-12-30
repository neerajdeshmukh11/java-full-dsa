
import java.util.Scanner;

public class question1 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter 1st number: ");
        int input1 = sc1.nextInt();
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Enter 1st number: ");
        int input2 = sc2.nextInt();
        Scanner sc3 = new Scanner(System.in);
        System.out.println("Enter 1st number: ");
        int input3 = sc3.nextInt();
        
        float avg = (input1+input2+input3)/3;
        System.out.println("the average is: "+avg);
        
    }
}
