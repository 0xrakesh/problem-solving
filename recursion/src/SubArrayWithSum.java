import java.util.ArrayList;
import java.util.Scanner;

public class SubArrayWithSum {
    public static void sumOfArray(int index, int sum, int k, int[] numbers, ArrayList<Integer> ds, int n) {
        if(sum == k && ds.size()==2) {
            for(int num:ds) System.out.print(num+" ");
            System.out.println();
            return;
        }
        if(index>=n) return;
        ds.add(numbers[index]);
        sumOfArray(index+1, sum+numbers[index], k, numbers, ds, n);

        ds.removeLast();
        sumOfArray(index+1, sum, k, numbers, ds, n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] numbers = new int[n];
        for(int i=0;i<n;i++) numbers[i] = sc.nextInt();
        ArrayList<Integer> ds = new ArrayList<>();
        sumOfArray(0,0,5,numbers,ds,n);
    }
}
