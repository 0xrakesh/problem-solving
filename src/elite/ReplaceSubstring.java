package elite;

import java.util.Arrays;
import java.util.Scanner;

public class ReplaceSubstring {
    public static void replacement(String sentence,String exist,String repl) {
        int i=0,j=0,k=0,l=0,match=-1;
        int[] index = new int[sentence.length()];
        int[] end = new int[sentence.length()];
        String replaced = "";
        for(int e=0;e<sentence.length();e++) index[e] = -1;
        for(int e=0;e<sentence.length();e++) end[e] = -1;

        while(i<sentence.length()) {
            if(j==exist.length()) {
                replaced += repl;
                j=0;
                match = -1;
            }
            if( sentence.charAt(i) == exist.charAt(j) ) {
                if(match == -1) match = i;
                j++;
            }
            else {
                if(match!=-1) {
                    replaced += sentence.substring(match,i);
                }
                replaced += sentence.charAt(i);
                match = -1;
                j=0;
            }
            i++;
        }
        System.out.println(replaced);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        String exist = sc.nextLine();
        String repl = sc.nextLine();
        replacement(sentence,exist,repl);
    }
}
