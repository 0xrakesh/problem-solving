import java.util.Scanner;

public class SumOfN {
    public static void sum(int n,int sum) {
        if(n<1) {
            System.out.println(sum);
            return;
        }
        sum(n-1, sum+n);
    }

    public static int sum(int n) {
        if(n==0) return 0;
        return n + sum(n-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sum(n,0);
        System.out.println(sum(n));
    }
}