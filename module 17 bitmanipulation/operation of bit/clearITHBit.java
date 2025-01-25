public class clearITHBit {

    public static int clear(int n, int i) {
        int BitMask = ~(1 << i);
        return n & BitMask;
    }

    public static void main(String[] args) {
        System.out.println(clear(10, 1));
    }
}
