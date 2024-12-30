import java.util.*;
public class arraysBasics {
    public static void main(String[] args) {
        // defining an array
        int marks[]=new int[10];
        // taking array as input
        Scanner sc = new Scanner(System.in);

        marks[0]=sc.nextInt();
        marks[1]=sc.nextInt();
        marks[2]=sc.nextInt();

        // output

        System.out.println("MAths = "+marks[0]);
        System.out.println("physics = "+marks[1]);
        System.out.println("chemistry = "+marks[2]);
        
        //updating an aaray
        marks[1] = marks[1]*2;
        System.out.println("physics = "+marks[1]);

        // length function
        System.out.println(marks.length);
    }
}
