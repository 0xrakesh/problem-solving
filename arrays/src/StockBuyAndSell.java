import java.util.Scanner;

public class StockBuyAndSell {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] numbs = new int[size];
        for(int i=0;i<size;i++) numbs[i] = sc.nextInt();

        int minPrice = Integer.MAX_VALUE;
        int maxPrice = Integer.MIN_VALUE;
        for(int price:numbs) {
            minPrice = Math.min(minPrice, price);
            maxPrice = Math.max(maxPrice, price-minPrice);
        }
        System.out.println(maxPrice);
    }
}
// 7,1,5,3,6,4
