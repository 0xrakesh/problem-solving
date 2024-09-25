import java.util.*;
class Solution {

    public static boolean isPrime(int n) {
        if(n<=1) return false;
        if(n==2||n==3) return true;
        if(n%2==0||n%3==0) return false;
        for(int i=5;i*i<=n;i+=6) {
            if(n%i==0 || n%(i+2) ==0) {
                return false;
            }
        }
        return true;
    }

    public static int PrimeSum(int[] input1, int input2) {
        int sum = 0;
        for(int i=0;i<input2;i++) {
            if(isPrime(i)) {
                sum+=input1[i];
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        
    }
}