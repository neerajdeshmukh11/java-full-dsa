
public class p14 {

    public static void printBinString(int n, int lastPLace, String str){
        if (n==0){ // base case
            System.out.println(str);
            return;
        }
        // kaam 
        printBinString(n-1, 0, str+"0");
        if(lastPLace == 0){
            printBinString(n-1, 1, str+"1");
        }

    }
    public static void main(String[] args) {
        printBinString(3, 0, "");
    }

}

