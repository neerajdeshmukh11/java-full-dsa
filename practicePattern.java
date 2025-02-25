public class practicePattern {
    public static void main(String[] args) {
        int start = 1;
        for(int i=1;i<=5;i++){
            int num = start;
            for(int j=1;j<=i;j++){
                System.out.print(num+ " ");
                num++;
            }
            if(i>1){
                start = num-1;
            }else{
                start = num;
            }
            System.out.println();
        }
    }
}
