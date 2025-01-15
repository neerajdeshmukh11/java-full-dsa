import java.util.*;
public class declaration {
    public static void main(String[] args) {
        String str = "abcd";
        String str1 = new String("abcd");
        // strings are immutable

        //taking user i/p
        Scanner sc = new Scanner(System.in);
        String name;
        name = sc.nextLine();
        System.out.println(name);
        // length and charat function
        String fullName = "Neeraj Deshmukh";
        System.out.println(fullName.length());
        System.out.println(fullName.charAt(0));
    }
}
