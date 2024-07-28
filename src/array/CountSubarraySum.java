package array;

import java.util.HashMap;
import java.util.Scanner;

public class CountSubarraySum {

    public static int countSubArray(int[] numb,int N,int k) {
        int count = 0;
        HashMap<Integer,Integer> prefixSum = new HashMap<>();

        int sum = 0;
        for(int num:numb) {
            sum += num;
            prefixSum.put(num, sum);
            int remainder = k - sum;

        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] array = new int[size];
        for(int i=0;i<size;i++) array[i] = sc.nextInt();

        int k = sc.nextInt();
        int subArray = countSubArray(array,size,k);
        System.out.println(subArray);
    }
}
