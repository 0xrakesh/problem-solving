package array;

import java.util.Arrays;
import java.util.HashMap;

public class LongestSubarrayWithKSum {
    public static int twoPointer(int[] arr,int k) {
        int n = arr.length;
        int left=0,right=0;
        int sum=0;
        int maxLen = Integer.MIN_VALUE;
        while(right < n) {
            sum += arr[right];
            while(sum > k && left <= right) {
                sum -= arr[left];
                left++;
            }

            if(sum==k) maxLen = Math.max(maxLen,right-left+1);
            right++;
        }
        return maxLen;
    }

    public static int prefixSum(int[] arr,int k) {
        int n = arr.length;
        int maxLen = Integer.MIN_VALUE;
        HashMap<Integer,Integer> prefixSumMap = new HashMap<>();
        int sum=0;
        for(int i=0;i<n;i++) {
            sum += arr[i];

            if(sum==k) maxLen = Math.max(maxLen,i+1);

            int rem = sum - k;

            if(prefixSumMap.containsKey(rem)) {
                int len = i - prefixSumMap.get(rem);
                maxLen = Math.max(maxLen,len);
            }

            if(!prefixSumMap.containsKey(rem)) prefixSumMap.put(sum,i);
        }
        return maxLen;
    }

    public static int longestsubarray(int[] arr,int N,int k) {
        int length = 0;
        for(int i=0;i<N;i++) {
            int sum = 0;
            for(int j=i;j<N;j++) {
                sum += arr[j];
                if(sum==k) length = Math.max(j-i+1,length);
            }
        }
        return length;
    }
    public static void main(String[] args) {
        int[] arr = {1,-1,0};
        int N = 3;
        int k = 1;
        int length = longestsubarray(arr,N,k);
        System.out.println("Array: "+Arrays.toString(arr)+"\nSum:"+k);
        System.out.println("Naive Approach: "+length);
        length = prefixSum(arr,k);
        System.out.println("Prefix Sum Approach: "+length);
        length = twoPointer(arr,k);
        System.out.println("Two pointer: "+length);
    }
}
