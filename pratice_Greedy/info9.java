import java.util.Arrays;

public class info9 {
    public static char[] smallestString(int n, int k) {
        char[] arr = new char[n];
        Arrays.fill(arr, 'a');  // Initialize all to 'a'

        for (int i = n - 1; i >= 0; i--) {
            int remain = k - (i + 1);
            if (remain > 0) {
                if (remain >= 25) {
                    arr[i] = 'z';
                    k -= 26;
                } else {
                    arr[i] = (char)(97 + remain);
                    k -= remain + 1;
                }
            } else {
                break;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int n = 5, k = 42;
        char[] arr = smallestString(n, k);
        System.out.println(new String(arr)); 
    }
}
