// print the sum of first n natural numbers

public class p4 {

    public static int Sum(int n){
        if(n==1){
            return 1;
        }
        int Snm1 = Sum(n-1);
        int SumOfN = n + Sum(n-1);
        return SumOfN;
    }
    public static void main(String[] args) {
        int n = 10;
        System.out.println(Sum(n));
    }
}
