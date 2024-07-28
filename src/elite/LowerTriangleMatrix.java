package elite;

import java.util.Scanner;

public class LowerTriangleMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) for (int j = 0; j < n; j++) matrix[i][j] = sc.nextInt();

        boolean found = true;
        for(int i=0;i<n-1;i++) {
            for(int j=i+1;j<n;j++) {
                if(matrix[i][j] != 0) found = false;
            }
        }
        System.out.println(found);
    }
}