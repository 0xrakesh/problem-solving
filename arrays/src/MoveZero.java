import java.util.Arrays;
import java.util.Scanner;

public class MoveZero {

    // Swap the number in the array.
    public static void swap(int[] numbs, int i, int j) {
        int temp = numbs[i];
        numbs[i] = numbs[j];
        numbs[j] = temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] numbers = new int[n];
        for(int i=0;i<n;i++) numbers[i] = sc.nextInt();

        int ZeroIndex = -1;
        for(int i=0;i<n;i++) {
            if(numbers[i] == 0) {
                ZeroIndex = i;
                break;
            }
        }

        for(int i=ZeroIndex+1;i<n;i++) {
            if(numbers[i] != 0) {
                swap(numbers,ZeroIndex,i);
                ZeroIndex++;
            }
        }
        System.out.println(Arrays.toString(numbers));
    }
}
