public class practice {
    public static void Pallindrome(int n){
        for(int i=1;i<=n;i++){
            // to print the spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            // for descending order
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            // for  acsending order
            for(int j=2;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Pallindrome(5);
    }
}
