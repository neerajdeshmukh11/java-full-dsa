public class problem58 {

    public static int LenOfLastWord(String s){
                // Trim leading/trailing spaces
        s = s.trim();

        // Find the last index of space
        int lastSpaceIndex = s.lastIndexOf(' ');

        // Return the length from last space to end of string
        return s.length() - lastSpaceIndex - 1;
    }
    public static void main(String[] args) {
      String  s = "Hello World";
      System.out.println(LenOfLastWord(s));
    } 
}
