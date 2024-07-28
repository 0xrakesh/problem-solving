package array;

import java.util.Scanner;

public class MatrixZero {

    public static void setZero(int[][] matrix,int size,int row,int col) {
        // Horizontal
        for(int i=0;i<size;i++) matrix[row][i] = -1;

        // Vertical
        for(int i=0;i<size;i++) matrix[i][col] = -1;
    }

    public static void checkZero(int[][] matrix, int size) {
        for(int i=0;i<size;i++)
            for(int j=0;j<size;j++)
                if(matrix[i][j] == 0)
                    setZero(matrix,size,i,j);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[][] matrix = new int[size][size];
        for(int i=0;i<size;i++)
            for(int j=0;j<size;j++)
                matrix[i][j] = sc.nextInt();


        checkZero(matrix,size);

        for(int i=0;i<size;i++) {
            for(int j=0;j<size;j++) {
                if(matrix[i][j] != -1) System.out.print(matrix[i][j]+" ");
                else System.out.print("0 ");
            }
            System.out.println();
        }

        sc.close();
    }
}
