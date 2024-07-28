package array;

import java.util.Scanner;

public class Rotate90Deg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[][] matrix = new int[size][size];

        for(int i=0;i<size;i++) for(int j=0;j<size;j++) matrix[i][j] = sc.nextInt();

        for(int i=0;i<size;i++) {
            for (int j = size - 1; j >= 0; j--)
                System.out.print(matrix[j][i] + " ");
            System.out.println();
        }
        sc.close();
    }
}
