package array;

public class MaxSumOfSubarray {
    public static int optimal(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;
        for(int num:nums) {
            sum+=num;
            if(sum>maxSum) maxSum = sum;
            if(sum<0) sum = 0;
        }
        return maxSum;
    }

    public static int maxSum(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++) {
            int sum = 0;
            for(int j=i;j<nums.length;j++) {
                sum += nums[j];
                maxSum = Math.max(sum,maxSum);
            }
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        int sum = maxSum(arr);
        System.out.println(sum);
        sum = optimal(arr);
        System.out.println(sum);
    }
}
