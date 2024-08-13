import java.util.Scanner;

public class SumWithRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] numbers = new int[n];
        for(int i=0;i<n;i++) numbers[i] = sc.nextInt();

        int start = -1;
        int sum = 0, range=0;
        for(int num:numbers) {
            if(num==6 || start != -1) {
                range+=num;
                if(num==6) start=0;
                if(num==7) start=-1;
            }
            else {
                sum+=num;
            }
        }
        sum = start==-1 ? sum : sum+range;
        System.out.println(sum);
    }
}
