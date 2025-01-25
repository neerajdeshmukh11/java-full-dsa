public class ClearLastIBits {

    public static int ClearLastiBits(int n, int i) {
        int Bitmask = (-1) << i;
        return n & Bitmask;
    }

    public static void main(String[] args) {
        System.out.println(ClearLastiBits(15, 2));
    }
}
