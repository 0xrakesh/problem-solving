import java.util.ArrayList;
import java.util.Scanner;

public class SumPairElement {
    public static int add(char a,char b) {
        int i = (int) a - '0';
        int j = (int) b - '0';
        return i+j;
    }
    public static int compress(int n) {
        if(n<=9) return n;
        String number = String.valueOf(n);
        ArrayList<Integer> compressed = new ArrayList<>();

        for(int i=0;i<number.length();i+=2) {
            int tmp = add(number.charAt(i), i+1 < number.length() ? number.charAt(i+1) : '0');
            while(tmp>9) {
                String numberTmp = String.valueOf(tmp);
                tmp =  add(numberTmp.charAt(0), numberTmp.charAt(1));
            }
            compressed.add(tmp);
        }
        n = 0;
        int digit = 1;
        System.out.println(compressed);
        for(int i=compressed.size()-1;i>=0;i--) {
            int rem = compressed.get(i);
            rem *= digit;
            n += rem;
            digit *= 10;
        };
        return compress(n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(compress(n));
    }
}
