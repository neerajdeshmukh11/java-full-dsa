
public class arrP3 {
    public static void main(String[] args) {
        String inputarr[] = { "A1test", "B23", "hello",
                "Test2", "c1" };
        int count = 0;

        for (String s : inputarr) {
            if (check(s)) {
                count++;
            }
        }
        if (count > 0) {
            System.out.println(count);
        } else {
            System.out.println(-1);
        }
    }
    public static boolean check(String s){
        int countu = 0;
        int countn = 0;
        for(char c:s.toCharArray()){
            if(Character.isUpperCase(c)){
                countu++;
            } if(Character.isDigit(c)){
                countn++;
            }
        }
        if(countn>0 && countu>0){
            return true;
        }
        return false;
    }
}
