import java.util.Scanner;

public class MaxConsecutiveElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] numbs = new int[n];
        for(int i=0;i<n;i++) numbs[i] = sc.nextInt();

        int count = 1;
        int max = 0;
        for(int i=1;i<n;i++) {
            if(numbs[i] == numbs[i-1]+1) count++;
            else count=1;
            max = Math.max(max,count);
        }
        System.out.println(max);
    }
}
