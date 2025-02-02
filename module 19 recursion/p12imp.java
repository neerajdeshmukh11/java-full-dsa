public class p12imp {

    public static void RemoveDuplicates(String str,int idx, StringBuilder newStr, boolean map[]){
        if(idx == str.length()){
            System.out.println(newStr);
            return;
        }
        char CurrentChar = str.charAt(idx);

        if(map[CurrentChar-'a']==true){
            // duplicates
            RemoveDuplicates(str, idx+1, newStr, map);
        }else{
            map[CurrentChar-'a'] = true;
            RemoveDuplicates(str, idx+1, newStr.append(CurrentChar), map);
        }
    }
    public static void main(String[] args) {
        String Str = "neeraj";
        RemoveDuplicates(Str, 0, new StringBuilder(""), new boolean[26]); 
    }
}
