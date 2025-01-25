public class updateIthBit {

    public static int clear(int n, int i) {
        int BitMask = ~(1 << i);
        return n & BitMask;
    }
    public static int SetIBit(int n, int i){
        int BitMask = 1<<i;
        return n|BitMask;
    }

    public static int UpdateBit(int n , int i, int newBit){

        // approach 1

        // if(newBit==0){
        //     return clear(n, i);
        // }else{
        //     return SetIBit(n, i);
        // }

        // approach 2

        clear(n, i);
        int BitMask = newBit<<i;
        return n | BitMask;
    }
    public static void main(String[] args) {
        System.out.println(UpdateBit(10,2,1));
    }
}
