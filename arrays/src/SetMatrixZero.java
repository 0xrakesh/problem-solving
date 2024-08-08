import java.util.Scanner;

public class SetMatrixZero {
    public static void setZero(int[][] matrix, int row, int col) {
        // Row
        for(int i=0;i<matrix[0].length;i++) matrix[i][col] = 0;

        // Column
        for(int i=0;i<matrix.length;i++) matrix[row][i] = 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] matrix = new int[n][n];
        for(int i=0;i<n;i++)
            for(int j=0;j<n;j++)
                matrix[i][j] = sc.nextInt();

        int[][] zeroMatrix = matrix.clone();

        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                if(matrix[i][j] == 0) {
                    setZero(zeroMatrix,i, j);
                }
            }
        }

        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                System.out.print(zeroMatrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
