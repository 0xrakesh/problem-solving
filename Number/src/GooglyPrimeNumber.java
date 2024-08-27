import java.util.Scanner;

public class GooglyPrimeNumber {
    public static boolean isPrime(int n) {
        if(n==1) return false;
        if(n<=3) return true;
        if(n%2==0 || n%3==0) return false;
        for(int i=5;i*i<=n;i+=6) {
            if(n%i==0 || n%(i+2)==0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int number = 0;
        while(n!=0) {
            number += n%10;
            n/=10;
        }
        System.out.println(isPrime(number));
    }
}
