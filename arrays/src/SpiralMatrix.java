import java.util.Scanner;

public class SpiralMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] matrix = new int[n][n];
        int data = 1;
        int top=0,bottom = n-1;
        int left=0,right=n-1;
        while(top<=bottom) {
            // Top Layer
            for(int i=left;i<=right;i++) matrix[top][i] = data++;
            top++;

            // Right layer
            for(int i=top;i<=bottom;i++) matrix[i][right] = data++;
            right--;

            // Bottom Layer
            for(int i=right;i>=left;i--) matrix[bottom][i] = data++;
            bottom--;

            // Left
            for(int i=bottom;i>=top;i--) matrix[i][left] = data++;
            left++;
        }

        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) System.out.printf("%02d ", matrix[i][j]);
            System.out.println();
        }
    }
}
