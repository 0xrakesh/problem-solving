import java.util.ArrayList;
import java.util.Scanner;

public class AmiSkillRack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] matrix = new int[n][m];
        for(int i=0;i<n;i++)
            for(int j=0;j<m;j++)
                matrix[i][j] = sc.nextInt();

        ArrayList<ArrayList<Integer>> pattern = new ArrayList<>();
        /*
        1 2 3
        4 5 6
        7 8 9

        O/P
        7
        4 8
        1 5 9
        2 6
        3
        */

        for(int col=m-1;col>=0;col--) {
            ArrayList<Integer> number = new ArrayList<>();
            int index=0;
            for(int i=col;i<m;i++) {
                if(index < n)  number.add(matrix[index++][i]);
            }
            pattern.add(number);
        }

        for(int row=1;row<n;row++) {
            int index=0;
            ArrayList<Integer> number = new ArrayList<>();
            for(int i=row;i<n;i++) {
                number.add(matrix[i][index++]);
            }
            pattern.add(number);
        }

        for(int i=pattern.size()-1;i>=0;i--) {
            for(int num:pattern.get(i)) System.out.print(num+" ");
            System.out.println();
        }
    }
}
