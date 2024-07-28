package elite;

import java.util.Scanner;

public class RemoveSingleVowel {
    public static String bruteforce(String word) {
        int i=0;
        StringBuilder nonVowel = new StringBuilder();
        while(i<word.length()) {
            if(word.charAt(i) != 'a' && word.charAt(i) != 'e' && word.charAt(i) != 'i' && word.charAt(i) != 'o' && word.charAt(i) != 'u') {
                nonVowel.append(word.charAt(i));
            }
            else if(word.charAt(i+1) == 'a' || word.charAt(i+1) == 'e' || word.charAt(i+1) == 'i' || word.charAt(i+1) == 'o' || word.charAt(i+1) == 'u' ) {
                int j = i;
                char cmp = word.charAt(i);
                while(true) {
                    if(word.charAt(j) != cmp) break;
                    if(word.charAt(j) == 'a' || word.charAt(j) == 'e' || word.charAt(j) == 'i' || word.charAt(j) == 'o' || word.charAt(j) == 'u') {
                        nonVowel.append(word.charAt(j));
                    }
                    j++;
                    i++;
                }
                nonVowel.append(word.charAt(j));
            }
            i++;
        }
        return nonVowel.toString();
    }

    public static void Optimize(String word) {
        String vowel = "aeiouAeiou";
        int i=0;
        while(i<word.length()) {
            if( vowel.indexOf(word.charAt(i)) < 0) System.out.print(word.charAt(i));
            else if ( (i < word.length()-1 && i > 0 ) && (word.charAt(i) == word.charAt(i+1) || word.charAt(i) == word.charAt(i-1))) {
                System.out.print(word.charAt(i));
            }
            else if(i == word.length()-1 && word.charAt(i) == word.charAt(i-1)) System.out.print(word.charAt(i));
            i++;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();

        System.out.println(bruteforce(word));
        Optimize(word);
    }
}
