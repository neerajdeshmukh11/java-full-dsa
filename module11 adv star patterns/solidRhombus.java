public class solidRhombus {
    public static void main(String[] args) {
        int n=5;
        //outer
        for(int i=1;i<=n;i++){
            //inner spaces - n-i
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            //inner stars - j<=n
            for(int j=1;j<=n;j++){
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
