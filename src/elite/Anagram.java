package elite;

import java.util.Scanner;

public class Anagram {
    public static boolean isAnagram(String s1,String s2) {
        int[] o1 = new int[58];
        int[] o2 = new int[58];

        for(Character word:s1.toCharArray()) o1[word-65]++;
        for(Character word:s2.toCharArray()) o2[word-65]++;

        for(Character word:s1.toCharArray()) {
            if( o1[word-65] != o2[word-65]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        System.out.println(isAnagram(s1,s2));
    }
}
