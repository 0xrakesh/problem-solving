import java.util.Scanner;

public class FinancialFirm {
    public static boolean StockCheck(int[] stocks, int n) {
        boolean IsInc = stocks[0] < stocks[1];
        for(int i=1;i<n;i++) {
            if(stocks[i-1] < stocks[i] && !IsInc) return false;
            else if(stocks[i-1] > stocks[i] && IsInc) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] stocks = new int[n];
        for(int i=0;i<n;i++) stocks[i] = sc.nextInt();
        System.out.println(StockCheck(stocks,n));
    }
}
