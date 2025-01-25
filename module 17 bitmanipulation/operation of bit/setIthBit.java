public class setIthBit {

    public static int SetIBit(int n, int i){
        int BitMask = 1<<i;
        return n|BitMask;
    }
    public static void main(String[] args) {
        System.out.println(SetIBit(10, 2));
    }
}
