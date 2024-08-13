import java.util.Scanner;

public class Palindrome {
    public static boolean isPalindrome(String word, int i) {
        if(i>=word.length()/2) return true;
        if(word.charAt(i) != word.charAt(word.length()-1-i)) return false;
        return isPalindrome(word,i+1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        System.out.println(isPalindrome(word,0));
    }
}
