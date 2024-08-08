import java.util.Scanner;

public class MaxSubArraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] numbs = new int[size];
        for(int i=0;i<size;i++) numbs[i] = sc.nextInt();

        int start = -1;
        int end = -1;
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<size;i++) {
            sum += numbs[i];
            if(sum<0) {
                sum = 0;
                start = i+1;
            }
            if(sum>max) {
                max = sum;
                end = i;
            }
        }
        System.out.print("[ ");
        for(int i=start;i<=end;i++) System.out.print(numbs[i]+" ");
        System.out.print("]");
    }
}
// -2,1,-3,4,-1,2,1,-5,4
