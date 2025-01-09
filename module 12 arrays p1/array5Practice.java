import java.util.HashSet;
import java.util.Set;

public class array5Practice {

    public static void ThreeSum(int numbers[]) {

        Set<String> set = new HashSet<>();
        
        int n = numbers.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (i != j && i != k && j != k && (numbers[i] + numbers[j] + numbers[k]) == 0) {
                        System.out.print("[[" + numbers[i] + "," + numbers[j] + "," + numbers[k] + "],]");

                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        int numbers[] = { -1, 0, 1, 2, -1, -4 };
        ThreeSum(numbers);
    }
}
