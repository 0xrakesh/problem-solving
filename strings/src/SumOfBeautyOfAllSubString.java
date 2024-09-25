import java.util.HashMap;
import java.util.Scanner;

public class SumOfBeautyOfAllSubString {
    public static int subString(String word, int diff, int index, HashMap<Character,Integer> table, int count) {
        if(index==word.length()) return count;
        table.put(word.charAt(index), table.getOrDefault(word.charAt(index),0)+1);
        return count;
    }

    public static int beautySum(String s) {
        int[] ascii = new int[26];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int sum = 0;
        for(char letter:s.toCharArray()) {
            ascii[letter-'a']++;
            max = Math.max(max,ascii[letter-'a']);
            min = Math.min(min,ascii[letter-'a']);
        }
        return max-min;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        System.out.println(beautySum(word));
    }
}
