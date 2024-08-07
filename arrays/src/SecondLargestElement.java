import java.util.Scanner;

public class SecondLargestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] numbs = new int[size];
        for(int i=0;i<size;i++) numbs[i] = sc.nextInt();

        int largest = Integer.MIN_VALUE;
        int slargest = Integer.MIN_VALUE;

        for(int num:numbs) {
            if(largest<num) {
                slargest = largest;
                largest = num;
            }
            if(slargest < num && largest != num) {
                slargest = num;
            }
        }

        System.out.println(slargest);
    }
}
