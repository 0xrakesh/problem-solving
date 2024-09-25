import java.util.Scanner;

public class MissingPalindrome {
    public static int isPalindrome(String word, int n) {
        int left = 0;
        int right = word.length()-1;
        int count = 0;
        while(left<right) {
            if(word.charAt(left) != '?' && word.charAt(right) != '?' && word.charAt(left) != word.charAt(right)) return 0;
            else if(word.charAt(left) == '?' && word.charAt(right) == '?') count += 2;
            else if( word.charAt(left) == '?' || word.charAt(right) == '?'  ) count++;
            left++;
            right--;
        }
        double power = Math.pow(26,count);
        return (int) power%n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        int div = sc.nextInt();
        System.out.println(isPalindrome(word,div));
    }
}
