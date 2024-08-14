import java.util.ArrayList;
import java.util.Scanner;

public class FirstSubArrayOfSum {
    public static boolean sumOfArray(int index, ArrayList<Integer> ds, int s, int sum, int n, int[] numbers) {
        if(s==sum) {
            for(int num:ds) System.out.print(num+" ");
            return true;
        }
        if(index==n) return false;

        ds.add(numbers[index]);
        if(sumOfArray(index + 1, ds, s + numbers[index], sum, n, numbers)) return true;

        ds.removeLast();
        return sumOfArray(index + 1, ds, s, sum, n, numbers);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] numbers = new int[n];
        for(int i=0;i<n;i++) numbers[i] = sc.nextInt();
        ArrayList<Integer> ds = new ArrayList<>();
        sumOfArray(0,ds,0,2,n,numbers);
    }
}
