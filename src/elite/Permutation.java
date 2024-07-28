package elite;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Permutation {
    public static void permuteString(String str, String prefix, List<String> results) {
        if (str.length() == 0) {
            results.add(prefix);
        } else {
            for (int i = 0; i < str.length(); i++) {
                permuteString(str.substring(0, i) + str.substring(i + 1), prefix + str.charAt(i), results);
            }
        }
    }

    public static List<String> permuteString(String str) {
        List<String> results = new ArrayList<>();
        permuteString(str, "", results);
        Collections.sort(results);
        return results;
    }

    public static void main(String[] args) {
        String str = "ABC";
        List<String> permutations = permuteString(str);

        System.out.println("Permutations in lexicographically sorted order: " + permutations);
    }
}
