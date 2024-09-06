import java.util.Scanner;

public class AddEvenOrOdd {
    public static int sumIt(int a, int b, int c, int d) {
        int sum = 0;
        boolean flag = d%2==0;
        while(a!=0) {
            if(flag && (a%10)%2==0) sum += a%10;
            else if((a%10)%2!=0) sum += a%10;

            if(flag && (b%10)%2==0) sum += b%10;
            else if((b%10)%2!=0) sum += b%10;

            if(flag && (c%10)%2==0) sum += c%10;
            else if((c%10)%2!=0) sum += c%10;

            a/=10;
            b/=10;
            c/=10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input1 = sc.nextInt();
        int input2 = sc.nextInt();
        int input3 = sc.nextInt();
        int input4 = sc.nextInt();
        int sum = sumIt(input1, input2, input3, input4);
        System.out.println(sum);
    }
}
