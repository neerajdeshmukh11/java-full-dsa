public class countAndSay {

    public static String CountSay(int n) {
        if (n <= 0) return "";
        
        String str1 = "1";  // Initial value for n=1
        for (int i = 1; i < n; i++) {
            StringBuilder str2 = new StringBuilder();
            int count = 1;

            // Traverse the current sequence
            for (int j = 0; j < str1.length(); j++) {
                if (j + 1 < str1.length() && str1.charAt(j) == str1.charAt(j + 1)) {
                    count++;  // Increase count for same digits
                } else {
                    str2.append(count); // Append count
                    str2.append(str1.charAt(j)); // Append digit
                    count = 1; // Reset count for the next digit
                }
            }
            str1 = str2.toString();  // Prepare for the next iteration
        }
        return str1;
    }

    public static void main(String[] args) {
        int n = 6;  // Example input
        System.out.println(CountSay(n));
    }
}
