import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        char[] s1 = s.toCharArray();
        char[] s2 = t.toCharArray();
        Arrays.sort(s1);
        Arrays.sort(s2);
        s = new String(s1);
        t = new String(s2);
        return s.equals(t);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String goal = sc.nextLine();
        System.out.println(isAnagram(s,goal));
    }
}
