
public class linearSearch {

    public static int LinearSearch(int numbers[], int key) {
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,10,12,14,16};
        int key = 10;

        int index = LinearSearch(numbers, key);

        if(index==-1){
            System.out.println("number not Found!");
        }else{
            System.out.println("the number is at "+index+" index");
        }
    }
}
