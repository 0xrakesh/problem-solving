import java.util.Arrays;
import java.util.Scanner;

public class FrogJump {
    public static int recursion(int[] jumps, int index) {
        if(index==0) return 0;
        int left = recursion(jumps, index-1) + Math.abs(jumps[index]-jumps[index-1]);
        int right = Integer.MAX_VALUE;
        if(index>1) right = recursion(jumps, index-2) + Math.abs(jumps[index]-jumps[index-2]);
        return Math.min(left,right);
    }

    public static int memoization(int[] jumps, int index, int[] dp) {
        if(index==0) return 0;
        if(dp[index] != -1) return dp[index];
        int left = recursion(jumps, index-1) + Math.abs(jumps[index]-jumps[index-1]);
        int right = Integer.MAX_VALUE;
        if(index>1) right = recursion(jumps, index-2) + Math.abs(jumps[index]-jumps[index-2]);
        return dp[index] = Math.min(left,right);
    }

    public static int tabulation(int[] jumps, int n) {
        int[] dp = new int[n+1];
        dp[0] = 0;
        for(int index=1;index<n;index++) {
            int left = dp[index-1] + Math.abs(jumps[index] - jumps[index-1]);
            int right = Integer.MAX_VALUE;
            if(index>1) right = dp[index-2] + Math.abs(jumps[index] - jumps[index-2]);
            dp[index] = Math.min(left,right);
        }
        return dp[n-1];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] jumps = new int[n];
        for(int i=0;i<n;i++) jumps[i] = sc.nextInt();
        int steps = recursion(jumps,n-1);
        System.out.println(steps);
        int[] dp = new int[n+1];
        dp[0] = 0;
        Arrays.fill(dp,-1);
        steps = memoization(jumps, n-1, dp);
        System.out.println(steps);
        steps = tabulation(jumps, n);
        System.out.println(steps);
    }
}
