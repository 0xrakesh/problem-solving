package array;
import java.util.*;

public class BuyStock {
    public static void main(String[] args) {
        int minPrice = Integer.MAX_VALUE;
        int size;
        Scanner sc = new Scanner(System.in);
        size = sc.nextInt();
        int[] stock = new int[size];
        for(int i=0;i<size;i++) stock[i] = sc.nextInt();
        int maxProfit=0;
        for(int i=0;i<size;i++) {
            minPrice = Math.min(minPrice,stock[i]);
            maxProfit = Math.max(maxProfit, stock[i] - minPrice);
        }
        System.out.println(maxProfit);
    }
}
