import java.util.HashSet;
import java.util.Scanner;

public class RemoveDuplicate {

    // As the given is sorted, we can use the two pointer approach.
    public static void optimal(int[] numbs) {
        int i=0;
        for(int j=1;j<numbs.length;j++) {
            if(numbs[i] != numbs[j]) {
                i++;
                numbs[i] = numbs[j];
            }
        }
        for(int item=0;item<=i;item++) System.out.print(numbs[item]+" ");
    }

    // A bruteforce approach.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] numbs = new int[size];
        for(int i=0;i<size;i++) numbs[i] = sc.nextInt();
        HashSet<Integer> number  = new HashSet<>();
        for(int num:numbs) number.add(num);

        for(int num:number) System.out.print(num+" ");
        System.out.println();
        optimal(numbs);
    }
}
