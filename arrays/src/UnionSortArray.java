import java.util.ArrayList;
import java.util.Scanner;

public class UnionSortArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] num1 = new int[n];
        int[] num2 = new int[m];
        for(int i=0;i<n;i++) num1[i] = sc.nextInt();
        for(int i=0;i<m;i++) num2[i] = sc.nextInt();

        ArrayList<Integer> union = new ArrayList<>();
        int i=0,j=0;
        while(i<n && j<m) {
            if(num1[i] <= num2[j]) {
                if(union.isEmpty() || union.getLast() != num1[i]) union.add(num1[i]);
                i++;
            }
            else if(num1[i] > num2[j]) {
                if(union.isEmpty() || num2[j] != union.getLast()) union.add(num2[j]);
                j++;
            }
        }

        for(int start=i;start<n;start++) {
            if(union.getLast() == num1[start]) continue;
            union.add(num1[start]);
        }

        for(int start=j;start<m;start++) {
            if(union.getLast() == num2[start]) continue;
            union.add(num2[start]);
        }

        System.out.println(union);
    }
}
