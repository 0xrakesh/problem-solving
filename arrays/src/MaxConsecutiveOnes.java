import java.util.Scanner;

public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] binary = new int[n];
        for(int i=0;i<n;i++) binary[i] = sc.nextInt();

        int count = 0;
        int max = Integer.MIN_VALUE;
        for(int num:binary) {
            if(num == 0) count=0;
            else {
                count++;
                max = Math.max(max,count);
            }
        }
        System.out.println(max);
    }
}
