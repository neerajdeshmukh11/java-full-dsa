public class largestSmallestInArray {

    public static int getLargest(int numbers[]){
        int largeNo = Integer.MIN_VALUE; // -infinity
        int smallNo = Integer.MAX_VALUE; //+infinity

        for(int i=0;i<numbers.length;i++){

            if(largeNo<numbers[i]){

                largeNo=numbers[i];
            }
            if(smallNo>numbers[i]){

                smallNo=numbers[i];
            }
        }
        System.out.println("the smallest no. is "+smallNo);
        return largeNo;
        
    }
    public static void main(String[] args) {
        int numbers[] = {1,2,6,3,5};
        System.out.println("the largest no is "+getLargest(numbers));  
    }
}
