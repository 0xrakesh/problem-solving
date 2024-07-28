package elite;

import java.util.Scanner;

public class BackspaceCompare {
    private static String correctWord(String s) {
        StringBuffer correct = new StringBuffer();
        for (char word : s.toCharArray()) {
            if (word == '#') {
                if (correct.length() > 0) {
                    correct.deleteCharAt(correct.length() - 1);
                }
            } else {
                correct.append(word);
            }
        }
        return correct.toString();
    }

    public static boolean isEqual(String s1,String s2) {
        s1 = correctWord(s1);
        s2 = correctWord(s2);
        return s1.equals(s2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        System.out.println(isEqual(s1,s2));
    }
}
