import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MinPrimeAndNonPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] number = new int[n];
        for(int i=0;i<n;i++) number[i] = sc.nextInt();
        Arrays.sort(number);

        ArrayList<Integer> prime = new ArrayList<>();
        ArrayList<Integer> nonPrime = new ArrayList<>();

        for(int num:number) {
            if(isPrime(num)) prime.add(num);
            else nonPrime.add(num);
        }
        int index, sum = 0;
        if(prime.size() == nonPrime.size()) sum = number[0];
        else
            if(prime.size() > nonPrime.size()) {
            index = prime.size() - nonPrime.size() - 1;
            for(int i=0;i<index;i++) sum+=prime.get(i);
        }
        else {
            index = nonPrime.size() - prime.size() - 1;
            for(int i=0;i<index;i++) sum+=nonPrime.get(i);
        }

        System.out.println(sum);
    }

    public static boolean isPrime(int n) {
        if(n<=1) return false;
        if(n==2 || n==3) return true;
        if(n%2==0 || n%3==0) return false;
        for(int i=5;i*i<=n;i+=6) {
            if( n%i==0 || n%(i+2)==0 ) return false;
        }
        return true;
    }
}
