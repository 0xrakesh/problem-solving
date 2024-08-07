import java.util.Arrays;
import java.util.Scanner;

public class LeftRotateByOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] numbs = new int[n];
        for(int i=0;i<n;i++) numbs[i] = sc.nextInt();

        int temp = numbs[n-1];
        for(int i=n-1;i>0;i--) numbs[i] = numbs[i-1];
        numbs[0] = temp;

        System.out.println(Arrays.toString(numbs));
    }
}
