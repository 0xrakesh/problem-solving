import java.util.Scanner;

public class ConsecutiveSumOfString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        int left = 0, right = 0;
        int sum = 0;
        int item = 0;
        while(right<word.length()) {
            if(word.charAt(left) == word.charAt(right)) {
                item++;
                if(right==word.length()-1) {
                    if(item%2==0) sum+=item;
                }
            }
            else {
                if(item%2==0) sum+=item;
                left = right;
                item = 1;
            }
            right++;
        }
        System.out.println(sum);
    }
}
