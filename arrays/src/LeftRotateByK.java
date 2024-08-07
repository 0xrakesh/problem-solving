import java.util.Arrays;
import java.util.Scanner;

public class LeftRotateByK {

    // Swap the number in array.
    public static void swap(int[] numbs,int i,int j) {
        int temp = numbs[i];
        numbs[i] = numbs[j];
        numbs[j] = temp;
    }

    // Reverse the array
    public static void reverse(int[] numbs, int start, int end) {
        while(start<=end) {
            swap(numbs,start,end);
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] numbs = new int[n];

        for(int i=0;i<n;i++) numbs[i] = sc.nextInt();
        int k = sc.nextInt();
        k%=n;

        reverse(numbs,n-k,n-1);
        reverse(numbs, 0,n-k-1);
        reverse(numbs,0,n-1);

        System.out.println(Arrays.toString(numbs));
    }
}
