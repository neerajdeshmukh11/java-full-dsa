public class prob392 {
    public static boolean isSubsequence(String s, String t) {
        int i = 0, j = 0;
        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                i++; // Move pointer on 's' if there is a match
            }
            j++; // Always move pointer on 't'
        }
        return i == s.length(); // If we traversed all characters in 's', it's a subsequence
    }

    public static void main(String[] args) {
        String s = "abc";
        String t = "ahbgdc";
        System.out.println(isSubsequence(s, t)); // Output: true
    }
}
