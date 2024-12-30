public class diamond {
    public static void dia(int n){
        // 1st half 
        // outer loop
        for(int i=1;i<=n;i++){

            // inner loop for spaces

            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }

            // inner loop for stars

            for(int j=1;j<=((2*i)-1);j++){
                System.out.print("*");
            }
            System.out.println();
        }

        // 2nd half
        // outer loop
        for(int i=n;i>=1;i--){

            // inner loop for spaces

            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }

            // inner loop for stars

            for(int j=1;j<=((2*i)-1);j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        dia(8);
    }
}
