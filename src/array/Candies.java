package array;
import java.util.*;

public class Candies {

    public static int maxCandies(int a,int b,int c,int[] candies) {
        return Math.max(candies[a],Math.max(candies[b],candies[c]));
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] rating = new int[n];
        for(int i=0;i<n;i++) rating[i] = sc.nextInt();
        int[] candies = new int[n];
        for(int i=0;i<n;i++) candies[i]++;
        // First
        if(rating[0] > rating[1]) candies[0]++;
        // Last
        if(rating[n-1] > rating[n-2]) candies[n-1]++;
        // Middle
        for(int i=1;i<n-1;i++)
            if(rating[i-1] < rating[i] || rating[i] > rating[i+1]) candies[i] = maxCandies(i-1,i,i+1,candies)+1;
        int sum = 0;
        for(int candy: candies) sum+=candy;
        System.out.println(sum);
    }
}