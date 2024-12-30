

public class arrayAsArgument {

    public static void Array(int marks[]){

        for(int i=0;i<marks.length;i++){
            marks[i] = marks[i]+1;

        }
    }
    public static void main(String[] args) {
        int marks[] = {10,11,12};
        Array(marks);

        // output
        for(int i=0;i<marks.length;i++){
            System.out.print(marks[i]+" ");
        }
        System.out.println();
    }
}
