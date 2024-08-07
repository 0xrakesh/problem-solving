import java.util.Scanner;

public class IsSorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] numbs = new int[size];
        for(int i=0;i<size;i++) numbs[i] = sc.nextInt();

        for(int i=1;i<size;i++) {
            if(numbs[i-1] > numbs[i]) {
                System.out.println("Not sorted");
                return;
            }
        }
        System.out.println("Sorted");
    }
}
