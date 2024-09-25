import java.util.Scanner;

public class ReverseCharOnly {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();

        StringBuilder reverse = new StringBuilder(word);

        int index = 0;
        int charIndex = word.length()-1;

        while( word.charAt(index) >= '0' && word.charAt(index) <= '9' ) index++;
        while( word.charAt(charIndex) >= '0' && word.charAt(charIndex) <= '9') charIndex--;


        while(index<charIndex) {
            reverse.setCharAt(index, word.charAt(charIndex));
            reverse.setCharAt(charIndex, word.charAt(index));
            index++;
            charIndex--;
            while( word.charAt(index) >= '0' && word.charAt(index) <= '9' ) index++;
            while( word.charAt(charIndex) >= '0' && word.charAt(charIndex) <= '9') charIndex--;
        }

        System.out.println(reverse.toString());
    }
}
