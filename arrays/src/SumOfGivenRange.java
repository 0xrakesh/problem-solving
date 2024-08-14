import java.util.Scanner;

public class SumOfGivenRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int range = sc.nextInt();
        int[] numbers = new int[n];
        for(int i=0;i<n;i++) numbers[i] = sc.nextInt();
        for(int i=0;i<range;i++) {
            int start = sc.nextInt();
            int end = sc.nextInt();
            int sum = 0;
            for(int j=start-1;j<end;j++) sum+=numbers[j];
            System.out.println(sum==-1?0:1);
        }
    }
}
