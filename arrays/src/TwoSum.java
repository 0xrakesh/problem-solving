import java.util.Arrays;
import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] numbs = new int[size];
        for(int i=0;i<size;i++) numbs[i] = sc.nextInt();
        int k = sc.nextInt();

        Arrays.sort(numbs);
        int i=0,j=size-1;
        while(i<j) {
            int sum = numbs[i] + numbs[j];
            if(sum == k) System.out.println(numbs[i++]+","+numbs[j++]);
            else if(sum > k) j--;
            else i++;
        }
    }
}
