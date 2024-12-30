
public class binaryToDecimal {

    public static void binaryToDec(int binaryNum) {
        int dec = 0;
        int power = 0;
       int myNum = binaryNum;

        while(binaryNum>0){
            /*1st claculate last digit */
            int lastDig = binaryNum % 10;
            /*apply logical formula */
            dec = dec + (lastDig * (int)Math.pow(2, power));
            /*remove the last digit and increment the power */
            power++;
            binaryNum = binaryNum/10;
        }
        System.out.println("the decimal of "+ myNum + " is : "+dec);
    }
    public static void main(String[] args) {
        binaryToDec(10001);
    }
}
