import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class UniquePath {
    public static void checkPath(int i, int j, int n, int m, int[][] ways, HashSet<List<Integer>> paths) {
        if(i==n && j==m) {
            List<Integer> path = new ArrayList<>();
            for(int[] rows:ways) {
                for(int num:rows) path.add(num);
            }
            paths.add(path);
        }
        // Right
        if(i<=n && j<=m && ways[i][j] != 1) {
            ways[i][j] = 1;
            checkPath(i,j+1,n,m,ways,paths);
            ways[i][j] = 0;
        }

        if(j<=m && i<= n && ways[i][j] != 1) {
            ways[i][j] = 1;
            checkPath(i+1,j,n,m,ways,paths);
            ways[i][j] = 0;
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] ways = new int[n][m];
        HashSet<List<Integer>> paths = new HashSet<>();
        checkPath(0,0,n-1,m-1,ways,paths);
        System.out.println(paths.size());
    }
}
