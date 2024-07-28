package elite;

import java.util.Scanner;

public class WildCardZoho {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word1 = sc.nextLine();
        String word2 = sc.nextLine();

        int i=0;
        int j=0;
        boolean flag = true;
        while(i<word1.length() && j<word2.length()) {
            if(word2.charAt(j) == '?') {
                j++;
                i++;
            }
            else if(word2.charAt(j) == '*' && j!=word2.length()-1 && word2.charAt(j+1) == word1.charAt(i)){
                j+=2;
                i++;
            }
            else if(word2.charAt(j) == '*') {
                i++;
            }
            else if(word1.charAt(i) != word2.charAt(j)) {
                flag = false;
                break;
            }
            else if(word1.charAt(i) == word2.charAt(j)) {
                j++;
                i++;
            }
        }
        if(word1.length() != word2.length() && word1.charAt(word1.length()-1) != word2.charAt(word2.length()-1) && word2.charAt(word2.length()-1) !='*') flag = false;
        System.out.println(flag);
    }
}
