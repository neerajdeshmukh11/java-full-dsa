
//.equals() and substring

public class compareTheSrings {


    public static String SubString(String str2, int si, int ei){
        String substr = "";
        for(int i=si;i<ei;i++){
            substr+=str2.charAt(i);
        }
        return substr;
    } 
    public static void main(String[] args) {
        String str = "neeraj";
        String str1 = new String("neeraj");
        String str2 = "HelloWorld";

        if(str.equals(str1)){
            System.out.println("they are equal");
        }
        else{
            System.out.println("not equal");
        }
        System.out.println(SubString(str2, 0, 5));
    }
}
