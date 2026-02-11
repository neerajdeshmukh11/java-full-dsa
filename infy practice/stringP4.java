
public class stringP4 {
    public static void main(String[] args) {
        String inNumber = "22222"  ;
        char firstDigit = inNumber.charAt(0);
        char nextDigit = inNumber.charAt(1);
        String outStr = "";

        if((int)firstDigit%2==0){
            if(firstDigit == nextDigit){
                outStr+=inNumber.length();
            }else{
                outStr += firstDigit+""+nextDigit;
            }
        }
        else{
            outStr+="NA";
        }
        System.out.println(firstDigit);
        System.out.println(nextDigit);
        System.out.println(outStr);
    }
}
