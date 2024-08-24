import java.util.ArrayList;
import java.util.Scanner;

public class PermutationOfString {
    public static void findPermutation(char[] letter, boolean[] taken, ArrayList<String> subset, ArrayList<Character> ds) {
        if(ds.size() == letter.length) {
            StringBuilder word = new StringBuilder();
            for(char l:ds) word.append(l);
            subset.add(word.toString());
        }
        for(int i=0;i<letter.length;i++) {
            if(!taken[i]) {
                taken[i] = true;
                ds.add(letter[i]);
                findPermutation(letter, taken, subset, ds);
                ds.removeLast();
                taken[i] = false;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        char[] letter = word.toCharArray();
        ArrayList<String> subset = new ArrayList<>();
        boolean[] taken = new boolean[letter.length];
        findPermutation(letter, taken, subset, new ArrayList<>());
        for(String set:subset) System.out.println(set);
    }
}
