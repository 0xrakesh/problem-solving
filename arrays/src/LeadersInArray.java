import java.util.ArrayList;
import java.util.Scanner;

public class LeadersInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] elements = new int[n];
        for(int i=0;i<n;i++) elements[i] = sc.nextInt();

        int max = elements[n-1];
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(max);
        for(int i=n-2;i>=0;i--) {
            if(elements[i] > max) {
                ans.add(elements[i]);
                max = elements[i];
            }
        }
        System.out.println(ans.reversed());
    }
}
