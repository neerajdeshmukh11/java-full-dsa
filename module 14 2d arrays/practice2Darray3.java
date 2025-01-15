// Question 3 : Write a program to Find Transpose of a Matr'
// What is Transpose?
// Transpose of a matrix is the process Of swapping the row to columns. For a 2x3 matrix,
// Matrix
// all a12 a13
// a21 a22 a23

// Transposed Matrix
// all  a12
// a12  a22
// a13  a23


public class practice2Darray3 {

    public static void Transpose(int matrix[][]){

        int transpose[][] = new int[3][2];
        for (int i=0;i<2;i++){
            for(int j=0;j<3;j++){
               transpose[j][i] = matrix[i][j];

            }
        }
        PrintMatrix(transpose);
    }

    public static void PrintMatrix(int matrix[][]){
        for(int i = 0;i<matrix.length;i++){
            for(int j = 0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j]+"  ");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        int matrix[][] = {{1,2,3},{4,5,6}};
        Transpose(matrix);
    }
}
