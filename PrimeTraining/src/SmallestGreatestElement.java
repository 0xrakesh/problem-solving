import java.util.*;

public class SmallestGreatestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] numbs = new int[n];
        for(int i=0;i<n;i++) numbs[i] = sc.nextInt();
        int max = Integer.MIN_VALUE;
        for(int num:numbs) max = Math.max(max,num);
    }
}
