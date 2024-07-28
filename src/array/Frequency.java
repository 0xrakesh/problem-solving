package array;

public class Frequency {
    public static void main(String[] args) {
        int[] nums = {7,7,1,5,7,5,9};
        int[] freq = new int[nums.length];
        for(int i=0;i<nums.length;i++) {
        //  Restrict
            if(freq[i]==-1) continue;
            for(int j=i+1;j<nums.length;j++) {
                if(nums[i]==nums[j]) {
                    freq[i]++;
                    freq[j] = -1;
                }
            }
        }
        for(int i=0;i<nums.length;i++) {
            if(freq[i]!=-1) {
                System.out.println(nums[i]+":"+ ++freq[i]);
            }
        }
    }
}
