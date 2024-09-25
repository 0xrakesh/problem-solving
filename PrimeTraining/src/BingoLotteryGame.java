import java.util.Arrays;
import java.util.Scanner;

public class BingoLotteryGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] cards = new int[N];
        for(int i=0;i<N;i++) cards[i] = sc.nextInt();
        Arrays.sort(cards);
        int first, second;
        if(cards[0]*cards[1] <= cards[N-1] * cards[N-2]) {
            first = cards[N-1];
            second = cards[N-2];
        }
        else {
            first = cards[0];
            second = cards[1];
        }

        System.out.println(first+second);
    }
}
