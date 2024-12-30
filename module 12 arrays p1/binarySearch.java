
public class binarySearch {

    public static int BinaryS(int numbers[], int key){
        int start = 0,end = numbers.length-1;

        while(start<=end){
            // calc the mid
            int mid = (start + end)/2;

            // key is mid the return

            if(numbers[mid]==key){
                return mid;
            }

            // the left of 1st part

            if(numbers[mid]>key){
                end = end-1;
            }else{ // the right or 2nd part
                start = start+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,10,12,14};
        int key = 10;
        System.out.println("the index of the key is: "+BinaryS(numbers, key) );
    }
}
