import java.util.Scanner;

public class AppearOnce {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] numbers = new int[n];
        for(int i=0;i<n;i++) numbers[i] = sc.nextInt();

        int xor = numbers[0];
        for(int i=1;i<n;i++) xor ^= numbers[i];
        System.out.println(xor);
    }
}
