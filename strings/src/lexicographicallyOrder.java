import java.util.Arrays;
import java.util.Scanner;

public class lexicographicallyOrder {
    public static int lexico(int n,int k) {
        String[] alphanumeric = new String[n];
        for (int i=1;i<=n;i++) {
            alphanumeric[i-1] = String.valueOf(i);
        }

        Arrays.sort(alphanumeric);


        return Integer.parseInt(alphanumeric[k-1]);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        System.out.println(lexico(n,k));
    }
}
