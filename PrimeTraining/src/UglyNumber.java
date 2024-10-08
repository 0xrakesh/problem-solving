import java.util.Scanner;

public class UglyNumber {
        public static boolean isUgly(int n) {
            if(n<1) return false;
            if(n==1) return true;
            if(n%2==0)
                return isUgly(n/2);
            else if(n%3==0)
                return isUgly(n/3);
            else if(n%5==0)
                return isUgly(n/5);
            return false;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            System.out.println(isUgly(n));
        }
}

