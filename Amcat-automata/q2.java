public class q2 {
    public static void main(String[] args) {
         // Hardcoded binary messages
         String P = "1101";
         String Q = "1001";
 
         // Make sure both strings are of equal length
         if (P.length() != Q.length()) {
             System.out.println("Error: Messages are of unequal length.");
             return;
         }
 
         int flips = 0;
 
         // Count differing bits
         for (int i = 0; i < P.length(); i++) {
             if (P.charAt(i) != Q.charAt(i)) {
                 flips++;
             }
         }
 
         // Output the result
         System.out.println("Minimum bit flips required: " + flips);
    }
}
