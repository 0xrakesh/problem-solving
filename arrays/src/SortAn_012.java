import java.util.Arrays;
import java.util.Scanner;

public class SortAn_012 {

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] numbs = new int[size];
        for(int i=0;i<size;i++) numbs[i] = sc.nextInt();

        for(int num:numbs) {
            if(num>2) {
                System.out.println("Invalid numbers");
                return;
            }
        }

        int zero=0,one=0,two=size-1;
        while(one<=two) {
            if(numbs[one] == 0) {
                swap(numbs, zero, one);
                one++;
                zero++;
            }
            else if(numbs[one] == 2) {
                swap(numbs, one, two);
                one++;
                two--;
            }
            else one++;
        }
        System.out.println(Arrays.toString(numbs));
    }
}
