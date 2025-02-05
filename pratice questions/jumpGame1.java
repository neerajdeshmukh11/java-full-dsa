public class jumpGame1 {

    public static boolean Game(int arr[]) {
        int longest = 0; // sabse bada index
        
        for (int i = 0; i < arr.length; i++) {
            if(i>longest){ // agar fas gaye toh false
                return false;
            }
            longest = Math.max(longest, i+arr[i]); // abhi update karo
            // System.out.println(longest);
           
        }
        return true;
    }

    public static void main(String[] args) {
        int arr[] = { 3, 2, 1, 0, 4 };
        System.out.println(Game(arr));
    }
}