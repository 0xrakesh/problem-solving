import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrowPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // row
        int m = sc.nextInt(); // col
        int[][] matrix = new int[n][m];
        for(int i=0;i<n;i++)
            for(int j=0;j<m;j++)
                matrix[i][j] = sc.nextInt();

        ArrayList<List<Integer>> ds = new ArrayList<>();

        // Bottom
        for(int i=n-1;i>=0;i--) {
            int row= i, col = 0;
            List<Integer> rowds = new ArrayList<>();
            for(int j=i;j<n;j++) {
                if(row<n && col<m) rowds.add(matrix[row++][col++]);
            }
            ds.add(rowds);
        }
        // Upper part
        for(int i=1; i<m; i++) {
            int row = 0, col = i;
            List<Integer> rowds = new ArrayList<>();
            for(int j=i; j<m; j++) {
                if(row<n && col<m) rowds.add(matrix[row++][col++]);
            }
            ds.add(rowds);
        }

        for(List<Integer> num:ds) {
            for(int nu:num) System.out.print(nu+" ");
            System.out.println();
        }
    }
}
