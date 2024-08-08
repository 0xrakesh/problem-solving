import java.util.Scanner;

public class KadaneAlgo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] numbs = new int[size];
        for(int i=0;i<size;i++) numbs[i] = sc.nextInt();

        int sum = 0;
        int count = 0;
        int max = Integer.MIN_VALUE;
        for(int num:numbs) {
            sum += num;
            if(sum < 0) count = sum = 0;
            else {
                count++;
                max = Math.max(count, max);
            }
        }
        System.out.println(max);
    }
}
// -2,1,-3,4,-1,2,1,-5,4