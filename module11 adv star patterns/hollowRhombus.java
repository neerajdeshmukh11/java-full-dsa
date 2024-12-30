public class hollowRhombus {
    public static void HollowRhom(int n){
        // outer
        for(int i=1;i<=n;i++){
            //spaces - n-i
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            // boundary stars as of rectangle
            for(int j=1;j<=n;j++){
                if(i==1||i==n||j==1||j==n){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        HollowRhom(5);
    }
}
