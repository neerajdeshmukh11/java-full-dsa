
public class hollowRectangle {
    public static void hollow_rect(int totalRows,int totalColumns) {
        //outer loop
        for(int i=1;i<=totalRows;i++){
             // inner loop - columns
            for(int j=1;j<=totalColumns;j++){
                //cell (i,j)
                if(i==1||i==totalRows||j==1||j==totalColumns){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        hollow_rect(5, 4);
    }
}
