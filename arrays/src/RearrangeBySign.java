import java.util.Scanner;

public class RearrangeBySign {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] numbers = new int[n];
        for(int i=0;i<n;i++) numbers[i] = sc.nextInt();


        int[] num = numbers.clone();
        int positive = 0;
        int negative = 1;

        for(int i=0;i<n;i++) {
            if(numbers[i] < 0) {
                num[negative] = numbers[i];
                negative+=2;
            }
            else {
                num[positive] = numbers[i];
                positive+=2;
            }
        }
        for(int i=0;i<n;i++) System.out.print(num[i]+" ");
    }
}
// 1,2,-4,-5
