public class strpractice1 {
    public static void main(String[] args) {
        String instr = "Education";
        String outStr = "";
        int n = instr.length();
        String lowerStr = instr.toLowerCase();
        String fHalf = lowerStr.substring(0,lowerStr.length()/2);
        int count = 0;

        if(n%2==0){
            for(int i=0;i<fHalf.length();i++){
                char c = fHalf.charAt(i);
                
                if(c == 'a' || c == 'e' || c == 'o' || c =='u' || c == 'i'){
                    count++;
                }
            }
            if(count == 2){
                outStr += fHalf;
            
            }else{
                outStr+=lowerStr.charAt(0);
                outStr+=lowerStr.charAt(1);
            }
            

        }
        else{
            outStr = "X";
        }
        System.out.println(fHalf);
        System.out.println(outStr);
    }
}
