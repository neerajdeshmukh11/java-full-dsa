public class pairsInArray {
    public static void PrintPairs(int numbers[]){
        int tp = 0;
        for(int i=0;i<numbers.length;i++){
            int currentNumber = numbers[i]; // 2,4,6,8,10
            for(int j=i+1;j<numbers.length;j++){
                System.out.print("(" + currentNumber + "," + numbers[j] + ") ");  
            }
            System.out.println();
            tp++;
        }
        System.out.print("total no. of pairs = "+tp);
    }
    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,10};
        PrintPairs(numbers);
    }
}
