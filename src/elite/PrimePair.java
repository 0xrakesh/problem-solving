package elite;

import java.util.HashMap;
import java.util.Scanner;

public class PrimePair {
    public static boolean prime(int number) {
        for(int i=2;i<=number;i++) {
            for(int j=2;j<number;j++) {
                if(i*j==number) return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        HashMap<Integer,Integer> prime = new HashMap<>();
        for(int i=2;i<=number;i++) {
            for(int j=i+1;j<=number;j++) {
                if(prime(i) && prime(j) && prime(i+j)) {
                    System.out.println(i+" "+j);
                }
            }
        }
    }
}
