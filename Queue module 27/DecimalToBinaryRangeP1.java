import java.util.Scanner;
public class DecimalToBinaryRangeP1 {
    public static int DecToBin(int n) {
        int power = 0;
        int binNum = 0;

        while (n > 0) {
            int rem = n % 2;  // Get remainder (0 or 1)
            binNum = binNum + (rem * (int) Math.pow(10, power)); // Construct binary number
            power++;
            n = n / 2; // Update n
        }
        return binNum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number (N): ");
        int N = sc.nextInt();
        sc.close();

        for (int i = 1; i <= N; i++) {
            System.out.print(DecToBin(i)); // Print without a trailing space
            if (i < N) {
                System.out.print(" "); // Add space between numbers, but not after the last one
            }
        }
    }
}
