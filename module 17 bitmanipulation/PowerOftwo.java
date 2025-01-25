public class PowerOftwo {

    public static boolean Ispower2(int n) {
        return (n & (n - 1)) == 0;
    }

    public static void main(String[] args) {
        System.out.println(Ispower2(32));
    }
}
