package elite;
import java.util.*;

public class MaxConsective {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int flip = sc.nextInt();
        int[] nums = new int[size];
        for(int i=0;i<size;i++) nums[i] = sc.nextInt();
        int count = 0;
        int max = Integer.MIN_VALUE;
        int flipCount = 0;
        int left=0;
        for(int right=0;right<size;right++) {
            if( nums[right] == 1 ) {
                max = Math.max(max, right-left+1);
            }
            else if(nums[right] == 0 && flipCount < flip) {
                flipCount++;
                max = Math.max(max, right-left+1);
            }
            else {
                while(flipCount >= flip) {
                    if( nums[left] == 0) {
                        flipCount--;
                    }
                    left++;
                }
                flipCount++;
                max = Math.max(max,right-left+1);
            }
        }
        System.out.println(max);
    }
}
