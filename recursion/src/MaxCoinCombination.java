import java.util.Scanner;

public class MaxCoinCombination {
    public static int CoinCombination(int N, int R, int loop, int amount, int NOC) {
        if(amount == N) NOC++;
        if(loop > N) return NOC;

        int taken = 0, notTaken = 0;
        for(int i=1;i<=R;i++) {
            taken = CoinCombination(N,R,loop+1, amount+i, NOC);
            notTaken = CoinCombination(N,R, loop+1, amount, NOC);
        }
        return taken+notTaken;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int R = sc.nextInt();
        int combination = CoinCombination(N,R,1, 0, 0);
        System.out.println(combination);
    }
}
