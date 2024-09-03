import java.util.ArrayList;
import java.util.Scanner;

public class ExactThreePalindrome {

    public static boolean isPalindrome(String word, int start, int end) {
        while(start<end) {
            if(word.charAt(start++) != word.charAt(end--)) return false;
        }
        return true;
    }

    public static void slicing(String word) {
        ArrayList<String> palindromes = new ArrayList<>();
        int n = word.length();
        int start = 0;
        int end = 1;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        int length = word.length();
        int start = 1;
        int end = length-2;
        String middle = "Impossible";
        while(start<end) {
            if(isPalindrome(word,start,end)) {
                middle = word.substring(start,end+1);
                break;
            }
            start++;
            end--;
        }
        String first = isPalindrome(word,0,start-1) ? word.substring(0,start): "Impossible";
        String last = isPalindrome(word,end+1,length-1) ? word.substring(end+1,length) : "Impossible";

        if(first.equals("Impossible") || last.equals("Impossible") || middle.equals("Impossible")) {
            System.out.println("Impossible");
            return;
        }

        System.out.println(first);
        System.out.println(middle);
        System.out.println(last);

    }
}
