public class p1768 {

    public static String mergeAlternately(String word1, String word2){
        StringBuilder newStr = new StringBuilder();
        int i = 0, j = 0;
        while (i < word1.length() && j < word2.length()) {
            newStr.append(word1.charAt(i++));
            newStr.append(word2.charAt(j++));
        }
        while (i < word1.length()) {
            newStr.append(word1.charAt(i++));
        }
        while (j < word2.length()) {
            newStr.append(word2.charAt(j++));
        }
        return newStr.toString();
    }
    public static void main(String[] args) {
      String  word1 = "abcdef";
      String word2 = "pqr";
      System.out.println(mergeAlternately(word1, word2));
    }
}
