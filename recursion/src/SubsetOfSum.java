import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SubsetOfSum {
    public static void subset(int index, int sum, int[] elements, ArrayList<Integer> sums) {
        if(index==elements.length) {
            sums.add(sum);
            return;
        }
        subset(index+1,sum+elements[index], elements, sums);
        subset(index+1, sum, elements, sums);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] elements = new int[n];
        for(int i=0;i<n;i++) elements[i] = sc.nextInt();
        ArrayList<Integer> sums = new ArrayList<>();
        subset(0,0,elements, sums);
        Collections.sort(sums);
        System.out.println(sums);
    }
}
