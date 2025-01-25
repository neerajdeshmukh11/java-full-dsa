public class evenOrOdd {

    public static void EvenOdd(int n){
        int BitMask = 1;
        if((n & BitMask)==0){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }
    }
    public static void main(String[] args) {
        int n = 010;
        EvenOdd(n);
    }
}
