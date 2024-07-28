package elite;
import java.util.*;
public class MaxAvgSubarray {
    public static double optimial(int size,int[] nums,int k) {
        double max = Integer.MIN_VALUE;
        int sum = 0, left = 0;
        for(int right = 0;right<size;right++) {
            sum += nums[right];
            if(right>=k) sum-= nums[left++];
            max = Math.max(max, (float)sum/(float) k);
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] nums = new int[size];
        for(int i=0;i<size;i++) nums[i] = sc.nextInt();
        int k = sc.nextInt();
        System.out.printf("%.5f", optimial(size,nums,k));
    }
}
