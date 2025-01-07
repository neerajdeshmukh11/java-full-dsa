public class array1Practice {

    public static void IsSame(int numbers[]) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    if (max < numbers[i]) {
                        max = numbers[i];
                    }
                } 
                
            }
        }
        System.out.println(max);
    }

    public static void main(String[] args) {
        int numbers[] = { 1, 2, 3, 3, 3, 4, 4, 2 };
        IsSame(numbers);
    }
}
