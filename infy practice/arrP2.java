
public class arrP2 {
    public static void main(String[] args) {
        String inArr[] ={"Ae", "12", "b6"} ;
        int count=0;

        for(String s : inArr){
            if(hasVovelDigit(s)){
                count++;
            }
        }
        if(count>0){
            System.out.println(count);
        }else{
            System.out.println(-1);
        }

    }
    public static boolean hasVovelDigit(String s){
        int countv = 0;
        int countn = 0;
        for(char c : s.toCharArray()){
            if(Character.isDigit(c)){
                countn++;
            }
            if(c == 'a' || c == 'e' || c == 'o' || c =='u' || c == 'i' || c == 'A' || c == 'E' || c == 'O' || c =='U' || c == 'I'){
                countv++;
            }
        }
        if(countn>0 && countv>0){
            return true;
        }
        return false;
    }
}
