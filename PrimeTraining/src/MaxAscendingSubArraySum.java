import java.util.Scanner;

public class MaxAscendingSubArraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] numbs = new int[n];
        for(int i=0;i<n;i++) numbs[i] = sc.nextInt();
        int maxSum = numbs[0];
        int sum = numbs[0];
        for(int i=1;i<n;i++) {
            if(numbs[i-1]<numbs[i]) sum+=numbs[i];
            else sum = numbs[i];
            maxSum = Math.max(sum,maxSum);
        }
        System.out.println(maxSum);
    }
}
