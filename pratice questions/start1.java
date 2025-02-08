public class start1 {
    public static void main(String[] args) {
        int n = 5;
        for(int i=n;i>=1;i--){
            // spaces
            for(int j=0;j<n-i;j++){
                System.out.print(" ");
            }
            // numbers
            for(int j=i;j>=1;j--){
                System.out.print(j +"");
            }
            System.out.println();
        }
    }
}
