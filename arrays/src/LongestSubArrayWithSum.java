import java.util.HashMap;
import java.util.Scanner;

public class LongestSubArrayWithSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] numbs = new int[size];
        for(int i=0;i<size;i++) numbs[i] = sc.nextInt();
        int k = sc.nextInt();

        HashMap<Integer, Integer> prefixSum = new HashMap<>();
        int sum = 0;
        int maxLen = Integer.MIN_VALUE;
        for(int i=0;i<size;i++) {
            sum += numbs[i];
            if(sum==k) maxLen = Math.max(maxLen,i+1);
            int remainder = sum - k;
            if(prefixSum.containsKey(remainder)) {
                maxLen = Math.max(maxLen, i-prefixSum.get(remainder));
            }
            if(!prefixSum.containsKey(sum)) prefixSum.put(sum, i);
        }
        System.out.println(maxLen);
    }
}
