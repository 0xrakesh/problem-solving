import java.util.ArrayList;
import java.util.Scanner;

public class SumOfDigits {
    public static int addDigits(int input1) {
        int sum = 0;
        int n = input1;
        ArrayList<Integer> number = new ArrayList<>();
        while(n!=0) {
            int value = n%10;
            sum= sum+value;
            number.add(sum);
            n/=10;
        }
        sum = 0;
        for(int num:number) sum+=num;
        return sum;
    }

    public static int addNumber(int input1) {
        int sum = 0;
        String n = String.valueOf(input1);
        ArrayList<Integer> number = new ArrayList<>();
        int index = n.length()-1;
        while(index>=0) {
            int value = (int) n.charAt(index) - '0';
            sum= sum+value;
            number.add(sum);
            index--;
        }
        sum = 0;
        for(int num:number) sum+=num;
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(addNumber(n));
        System.out.println(addDigits(n));
    }
}
