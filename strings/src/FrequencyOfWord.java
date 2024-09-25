import java.util.HashMap;
import java.util.Scanner;

public class FrequencyOfWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        HashMap<Character, Integer> frequency = new HashMap<>();

        for(char letter: word.toCharArray()) {
            int count = frequency.getOrDefault(letter, 0);
            frequency.put(letter, count + 1);
        }

        System.out.println(frequency);
    }
}
