import java.util.*;
public class creation {
    
    public static boolean search(int matrix[][], int key){
        int n=3, m=3;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j] == key){
                    System.out.println("found at index (" +i +", " +j+")");
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {

        int matrix[][] = new int[3][3];
        int n=3, m=3;
        Scanner sc = new Scanner(System.in);
        // i/p
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        // o/p
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(matrix[i][j] +" ");
            }
            System.out.println();
        }
        System.out.println(search(matrix, 4));
    }
}
