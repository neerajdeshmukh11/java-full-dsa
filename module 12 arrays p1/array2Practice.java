public class array2Practice {

    public static void ROTATE(int numbers[]) {
        int key = 4;
        
        for(int i=4;i<numbers.length;i++){
            System.out.print(numbers[i]);
        }
        for(int i=0;i<key;i++){
            System.out.print(numbers[i]);
        }
       
    }
    public static void main(String[] args) {
        int numbers[] = {1,2,3,4,5,6,7};
        ROTATE(numbers);
        
    }
}
