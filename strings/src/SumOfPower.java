import java.util.Scanner;

public class SumOfPower {
    public static int power(int input1) {
        int sum = 0;
        String n = String.valueOf(input1);
        for(int i=0;i<n.length();i++) {
            int num = Integer.parseInt(String.valueOf(n.charAt(i)));
            int pow = i+1 < n.length() ? Integer.parseInt(String.valueOf(n.charAt(i+1))) : 0;
            sum += (int) Math.pow(num, pow);
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(power(n));
    }
}
