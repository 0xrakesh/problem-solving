import java.util.Scanner;

public class FactorialLastDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int factorial = 1;
        for(int i=1;i<=num;i++) factorial *= i;
        while(factorial%10==0) factorial/=10;
        System.out.println(factorial%10);
    }
}
