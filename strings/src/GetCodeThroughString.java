import java.util.Scanner;

public class GetCodeThroughString {
    public static int getCode(String input1) {
        String[] words = input1.split(" ");
        int n = 0;
        for(String word:words) n += word.length();
        while(n>9) {
            int newNumber = 0;
            while(n!=0) {
                newNumber += n%10;
                n/=10;
            }
            n = newNumber;
        }
        return n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        System.out.println(getCode(sentence));
    }
}
