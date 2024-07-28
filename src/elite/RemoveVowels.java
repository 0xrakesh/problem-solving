package elite;

import java.util.Scanner;

public class RemoveVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        for(Character word:sentence.toCharArray()) {
            if(word != 'a' && word != 'e' && word != 'i' && word != 'o') System.out.print(word);
        }
    }
}
