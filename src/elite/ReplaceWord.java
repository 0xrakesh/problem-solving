package elite;

import java.util.Scanner;

public class ReplaceWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        String exist = sc.nextLine();
        String repl = sc.nextLine();
        String[] words = sentence.split(" ");
        for(int i=0;i<words.length;i++) {
            if( words[i].equals(exist) ) words[i] = repl;
        }
        for(String word:words) System.out.print(word+" ");
    }
}
