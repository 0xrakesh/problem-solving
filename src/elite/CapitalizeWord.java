package elite;

import java.util.Scanner;

public class CapitalizeWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        String[] words = sentence.split("\\s+");
        String finish = new String();
        for(int i=0;i<words.length;i++) {
            String word = words[i];
            if(word.length()>1)
                word = word.substring(0,1).toUpperCase()+word.substring(1,word.length()-1)+word.substring(word.length()-1).toUpperCase();
            else word = word.toUpperCase();
            finish += word + " ";
        }
        System.out.println(finish);
    }
}
