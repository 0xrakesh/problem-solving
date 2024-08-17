import java.util.Scanner;

public class NumToStrZOHO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuffer ascii = new StringBuffer();
        int n = sc.nextInt();
        while(n!=0) {
            int rem = n%26;
            rem = rem == 0 ? 26 : rem;
            char letter = (char) (64+rem);
            ascii.append(letter);
            n/=26;
    }
        System.out.println(ascii.reverse());
    }
}
