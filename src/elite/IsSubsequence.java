package elite;

import java.util.Scanner;

public class IsSubsequence {
    public static boolean isSequence(String pattern, String word) {
        int l=0,r=0;
        if(pattern.length() > word.length()) return false;
        while(r<word.length() && l < pattern.length()) {
            if( pattern.charAt(l) != word.charAt(r) ) {
                r++;
            }
            else if(pattern.charAt(l) == word.charAt(r)) {
                r++;
                l++;
            }
        }
        return l==pattern.length();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pattern = sc.nextLine();
        String word = sc.nextLine();
        System.out.println(isSequence(pattern,word));
    }
}
