// Question 1
// Maximum Balanced String Partitions
// We have balanced string str of size N with an equal number of L and R, the task is to find a
// maximum number X, such that a given string can be partitioned into X balanced substring. A
// string is called to be balanced if the number of 'L's in the string equals the number of 'R's.
// Input : "LRRRRLLRLLRL"
// Output : 3
public class info7 {
    public static int balancedStringSplit(String s) {
        int total = 0, rc = 0, lc = 0;
        for(char curr : s.toCharArray()){
            if(curr == 'R'){
                rc++;
            }else if(curr == 'L'){
                lc++;
            }

            if(rc == lc){
                total++;
            }
        }
        return total;
    }
    public static void main(String[] args) {
        String s = "RLRRLLRLRL";
        System.out.println(balancedStringSplit(s));
    }
}
