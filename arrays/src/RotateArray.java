import java.util.Scanner;

public class RotateArray {

    // Swap the value on row of the array.
    public static void swap(int[][] matrix, int row, int exchange,int col) {
        int temp = matrix[row][col];
        matrix[row][col] = matrix[exchange][col];
        matrix[exchange][col] = temp;
    }

    public static void exchange(int[][] matrix, int row, int col) {
        int temp = matrix[row][col];
        matrix[row][col] = matrix[col][row];
        matrix[col][row] = temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] matrix = new int[n][n];
        for(int i=0;i<n;i++)
            for(int j=0;j<n;j++)
                matrix[i][j] = sc.nextInt();

        for(int i=0;i<n/2;i++) {
            for(int j=0;j<n;j++) {
                swap(matrix,i,n-1-i,j);
            }
        }

        for(int i=0;i<n/2;i++) {
            for(int j=i+1;j<n;j++) {
                exchange(matrix,i,j);
            }
        }

        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) System.out.printf("%02d ",matrix[i][j]);
            System.out.println();
        }
    }
}
