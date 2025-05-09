public class decimalToBinary {

    public static void decToBin(int num) {

        int myNum = num;
        int power = 0;
        int binNum = 0;

        while (num > 0) {
            int remainder = num % 2;
            binNum = binNum + (remainder * (int) Math.pow(10, power));
            power++;
            num = num / 2;
        }
        System.out.println("the binary of " + myNum + " is " + binNum);
    }
    public static void main(String[] args) {
        decToBin(7);
        int a = 3/2;
        System.out.println(a);
    }
}
