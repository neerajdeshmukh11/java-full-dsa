
public class triangleZeroOnePattern {
    public static void main(String[] args) {
        int n = 5;

        //outer loop for lines
        for(int i=1;i<=n;i++){
            //inner of  0s and 1s
            for(int j=1;j<=i;j++){
                //now condition for odd and even as per logic
                if((i+j)%2==0){
                    System.out.print("1");
                }else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
}
