import java.util.Scanner;

public class MissingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] numbs = new int[n];
        for(int i=0;i<n;i++) numbs[i] = sc.nextInt();

        int sum = 0;
        for(int num:numbs) sum+=num;

        int total = n*(n+1) / 2;
        System.out.println(total-sum);
    }
}
