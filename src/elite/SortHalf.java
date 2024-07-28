package elite;

import java.util.Arrays;
import java.util.Scanner;

public class SortHalf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] nums = new int[size];
        for(int i=0;i<size;i++) nums[i] = sc.nextInt();

        int length = nums.length;
        // Ascending
        for(int i=0;i<length/2;i++) {
            for(int j=i;j<length/2;j++) {
                if(nums[i] > nums[j]) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }

        // Descending
        for(int i=length/2;i<length;i++) {
            for(int j=i;j<length;j++) {
                if(nums[i] < nums[j]) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
