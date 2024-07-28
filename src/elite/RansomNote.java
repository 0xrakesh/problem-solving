package elite;

import java.util.HashMap;
import java.util.Scanner;

public class RansomNote {
    public static boolean isRandom(String ransom, String maze) {
        HashMap<Character,Integer> ransomNote = new HashMap<>();
        HashMap<Character,Integer> mazeNote = new HashMap<>();
        for(Character word: maze.toCharArray()) {
            ransomNote.put(word, ransomNote.getOrDefault(word,0)+1);
        }
        for(Character word: ransom.toCharArray()) {
            if(!ransomNote.containsKey(word)) return false;
            if( ransomNote.get(word) == 0 ) return false;
            ransomNote.put(word, ransomNote.get(word)-1);
        }

        return true;
    }

    public static boolean Optimize(String ransom, String maze) {
        int[] occurance = new int[52];
        for(Character word: maze.toCharArray()) occurance[word-65]++;
        for(Character word: ransom.toCharArray()) {
            if(occurance[word-65] == 0) return false;
            occurance[word-65]--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ransom = sc.nextLine();
        String maze = sc.nextLine();
        System.out.println(Optimize(ransom,maze));
    }
}
