import java.util.Scanner;

public class ShiftCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        String[] words = sentence.split(" ");
        StringBuilder shiftedSentence = new StringBuilder();
        for(String word:words) {
            int n = word.length();
            StringBuilder shiftWord = new StringBuilder();
            for(Character letter:word.toCharArray()) {
                if(Character.toLowerCase(letter) +n>'z') shiftWord.append(letter);
                else {
                    char let = (char) ((int) letter + n);
                    shiftWord.append(let);
                }
            }
            shiftedSentence.append(shiftWord);
            shiftedSentence.append(" ");
        }
        System.out.println(shiftedSentence);
    }
}
