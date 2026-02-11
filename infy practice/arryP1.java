public class arryP1 {
    public static void main(String[] args) {
        String[] inArray = {"1", "2", "3", "4"} ;
        int count = 0;
        for(String str : inArray){
            if(hasDigits(str)){
                count++;
            }
        }
        if(count>0){
            System.out.println(count);
        }else{
            System.out.println(-1);
        }
    }
    public static boolean hasDigits(String s){
        for(char c : s.toCharArray()){
            if(Character.isDigit(c)){
                return true;
            }
        }
        return false;
    }
}
