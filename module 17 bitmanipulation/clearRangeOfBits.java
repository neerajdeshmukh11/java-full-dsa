public class clearRangeOfBits {

    public static int ClearRangeOfBits(int n, int i, int j){
        int a = (~(-1)<<(j+1));
        int b = (1<<i) - 1;
        int BitMask = a | b;
        return n & BitMask;
    }
    public static void main(String[] args) {
        System.out.println(ClearRangeOfBits(10, 2, 4));
    }
}
