import java.util.Scanner;

public class LongestCommonSubsequence {
    public static int lcs(int n1, int n2, String s1, String s2) {
        if(n1<0 || n2<0) return 0;
        if(s1.charAt(n1) == s2.charAt(n2)) return 1 + lcs(n1-1,n2-1,s1,s2);
        else return Math.max(lcs(n1-1,n2,s1,s2), lcs(n1,n2-1,s1,s2));
    }

    public static int memoization(int n1, int n2, String s1, String s2, int[][] dp) {
        if(n1<0||n2<0) return 0;
        if(dp[n1][n2] != -1) return dp[n1][n2];
        if(s1.charAt(n1) == s2.charAt(n2)) return dp[n1][n2] = 1 + memoization(n1-1,n2-1,s1,s2,dp);
        else return dp[n1][n2] = Math.max(memoization(n1-1,n2,s1,s2,dp), memoization(n1,n2-1,s1,s2,dp));
    }

    public static void tabulation(int n1,int n2, String s1, String s2) {
        int[][] dp = new int[n1+2][n2+2];
        for(int i=0;i<=n1;i++) dp[0][i] = 0;
        for(int i=0;i<=n2;i++) dp[i][0] = 0;

        for(int i=1;i<=n1;i++) {
            for(int j=1;j<=n2;j++) {
                
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        int n1 = s1.length() - 1;
        int n2 = s2.length() - 1;
        int length = lcs(n1, n2, s1, s2);

        int[][] dp = new int[n1 + 1][n2 + 1];
        for (int i = 0; i <= n1; i++)
            for (int j = 0; j <= n2; j++)
                dp[i][j] = -1;

        System.out.println(length);

        length = memoization(n1, n2, s1, s2, dp);
        System.out.println(length);
    }
}
