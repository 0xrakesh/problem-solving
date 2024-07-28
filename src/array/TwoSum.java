package array;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        HashMap<Integer,Integer> sum = new HashMap<>();
        for(int i=0;i<nums.length;i++) {
            int rem = target - nums[i];

            if(sum.containsKey(rem)) {
                ans[1] = nums[i];
                ans[0] = nums[sum.get(rem)];
                return ans;
            }
            sum.put(nums[i],i);
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {2,7,11,15};
        int target = 9;
        int[] ans = twoSum(arr,target);
        System.out.println(Arrays.toString(ans));
    }
}
