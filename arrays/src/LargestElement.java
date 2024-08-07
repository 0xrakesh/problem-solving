import java.util.Scanner;

public class LargestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] nums = new int[size];
        for(int i=0;i<size;i++) nums[i] = sc.nextInt();

        int largest = Integer.MIN_VALUE;
        for(int i=0;i<size;i++) largest = Math.max(largest,nums[i]);

        System.out.println(largest);
    }
}
