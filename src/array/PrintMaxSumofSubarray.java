package array;

import java.util.Arrays;

public class PrintMaxSumofSubarray {
    public static int[] maxSum(int[] nums) {
        int[] index = new int[2];
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++) {
            sum+=nums[i];
            if(sum==0) index[0] = i;
            if(sum > maxSum) {
                maxSum = sum;
                index[1] = i;
            }
        }
        return index;
    }
    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        int[] index = maxSum(arr);
        System.out.println(Arrays.toString(index));
    }
}
