import java.util.Arrays;
import java.util.Scanner;

public class ArrangeIncDecOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] numbs = new int[n];
        for(int i=0;i<n;i++) numbs[i] = sc.nextInt();
        Arrays.sort(numbs);
        int high = n-1;
        int low = 0;
        int temp = numbs[low];

        while(low<n) {
            numbs[low] = numbs[high];
            int tmp = numbs[low+1];
            numbs[low+1] = temp;
            temp = tmp;

            high--;
            low+=2;
        }

        System.out.println(Arrays.toString(numbs));
    }
}
