package array;
import java.util.HashMap;

public class MajorityElement {
    public static int moreVoting(int[] nums) {
        int candidate=0;
        int count=0;
        for(int num:nums) {
            if(count==0) candidate=num;
            else if(candidate==num) count++;
            else count--;
        }
        return candidate;
    }

    public static int majorityElement(int[] nums) {
        int length = nums.length;
        HashMap<Integer,Integer> frequency = new HashMap();
        for(int i=0;i<length;i++) {
            frequency.put(nums[i], frequency.getOrDefault(nums[i],0)+1);
        }
        for(int freq: frequency.keySet()) {
            if(frequency.get(freq) > length/2) return freq;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,2,2,2,2};
        int majority = majorityElement(arr);
        System.out.println("HashMap Approach: "+majority);
        majority = moreVoting(arr);
        System.out.println("More voting approach: "+majority);
    }
}
