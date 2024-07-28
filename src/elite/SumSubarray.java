package elite;

import java.util.HashMap;
import java.util.Scanner;

public class SumSubarray {
    public static int optimal(int[] number) {
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;
        for(int num:number) {
            sum+=num;
            if(sum>maxSum) maxSum = sum;
            if(sum<0) sum = 0;
        }
        return maxSum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] numb = new int[n];
        for(int i=0;i<n;i++) numb[i] = sc.nextInt();
        System.out.println(optimal(numb));
    }
}
