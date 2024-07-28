package elite;

import java.io.*;
import java.util.*;

public class SwapVowel {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String words = sc.nextLine();
        char[] word = words.toCharArray();
        int left=0,right=words.length()-1;
        String vowel = "aeiouAEIOU";
        while(left < right) {
            if( (vowel.indexOf(word[left]) > -1) && (vowel.indexOf(word[right]) > -1) ) {
                Character tmp = word[left];
                word[left] = word[right];
                word[right] = tmp;
                left++;
                right--;
            }
            else if(vowel.indexOf(word[left]) > -1) {
                right--;
            }
            else if(vowel.indexOf(word[right]) > -1) {
                left++;
            }
            else {
                left++;
                right--;
            }
        }
        words = word.toString();
        System.out.println(word);
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}