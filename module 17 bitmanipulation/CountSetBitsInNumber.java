
// no. of 1s in a binary number is known as set bit
public class CountSetBitsInNumber {

    public static int Count(int n) {
        int count = 0;
        while (n > 0) {
            if ((n & 1) != 0) {
                count++;
            }
            n = n >> 1;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(Count(15));
    }
}
