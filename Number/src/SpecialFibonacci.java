import java.util.Scanner;

public class SpecialFibonacci {
    public static int fib(int n) {
        if(n==0) return 0;
        if(n==1) return 1;
        int p1 = 1;
        int p2 = 1;
        for(int i=2;i<=n;i++) {
            int cur = (p1*p1) + (p2*p2);
            p1 = p2;
            p2 = cur;
        }
        return p2%47;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fib(n));
    }
}
