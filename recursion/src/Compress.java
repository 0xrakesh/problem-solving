import java.util.ArrayList;
import java.util.Scanner;

public class Compress {
    public static int add(char a, char b) {
        int i = (int) a - '0';
        int j = (int) b - '0';
        return i+j;
    }

    public static int compress(int n) {
        if(n<9) return n;

        // Convert the integer to string for add the next by index.
        String number = String.valueOf(n);
        int length = number.length();

        ArrayList<Integer> compressInt = new ArrayList<>();

        //
        for(int i=1;i<length;i++) {
            char first = number.charAt(i-1);
            char last = number.charAt(i);
            int sum = add(first, last);
            while(sum>9) {
                String doubleInt = String.valueOf(sum);
                first = doubleInt.charAt(0);
                last = doubleInt.charAt(1);
                sum = add(first, last);
            }
            compressInt.add(sum);
        }

        // Convert the array into integer.
        int digit = 1;
        n = 0;
        for(int i=compressInt.size()-1;i>=0;i--) {
            n = n + (compressInt.get(i) * digit);
            digit*=10;
        }
        return compress(n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(compress(n));
        compressOpt(n);
    }
}
