public class p13imp {

    public static int  FriendsParing(int n){
        // base case

        if(n==0 || n==1 || n==2){
            return n;
        }
        int fnm1 = FriendsParing(n-1);
        int fnm2 = (n-1) * FriendsParing(n-2);
        int totWays = fnm1 + fnm2;
        return totWays;
    }
    public static void main(String[] args) {
        System.out.println(FriendsParing(5 ));
    }
}
