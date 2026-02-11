public class stringP5 {
    public static void main(String[] args) {
        String strNumber = "169023";
        int strLen = strNumber.length();
        String outStr = "";

        String digits = strNumber.substring(0, 2); 

        char lenAsChar = Character.forDigit(strLen, 10); 
        
        boolean foundMatch = false;
        for (char c : digits.toCharArray()) {
            if (c == lenAsChar) {
                foundMatch = true;
                break;
            }
        }

        if (foundMatch) {
            outStr = digits + strLen;
        } else if (strNumber.charAt(0) == '1') {
            outStr = strNumber;
        } else {
            outStr = "X";
        }

        System.out.println(outStr); 
    }
}