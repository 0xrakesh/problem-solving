package array;

import java.util.Arrays;
import java.util.Scanner;

public class MinDifference {
    public static void main(String[] args) {
        int size;
        Scanner sc = new Scanner(System.in);
        size = sc.nextInt();
        int[] nums = new int[size];
        for(int i=0;i<size;i++) nums[i] = sc.nextInt();

        Arrays.sort(nums);
        int minDifference = nums[1] - nums[0];
        boolean flag = false;
        for(int i=1;i<size;i++) {
            if(nums[i] - nums[i-1] == minDifference) System.out.print(nums[i-1]+" "+nums[i]+" ");
        }


    }
}
