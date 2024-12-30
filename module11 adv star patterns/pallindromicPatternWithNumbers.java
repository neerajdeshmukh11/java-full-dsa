public class pallindromicPatternWithNumbers {

    public static void pallindrome(int n) {
        for (int i = 1; i <=n; i++) {
            //spaces
            for (int j=1;j<=n-i;j++) {
                System.out.print(" ");
            }
            //decsending numbers
            for (int j=i;j>=1;j--) {
                System.out.print(j);
            }
            //acsending numbers
            for(int j=2;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        pallindrome(5);
    }
}