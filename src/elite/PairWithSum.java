package elite;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PairWithSum {
    public static List<int[]> findPairsWithSum(int[] arr, int targetSum) {
        Set<Integer> complements = new HashSet<>();
        List<int[]> pairs = new ArrayList<>();

        for (int num : arr) {
            int complement = targetSum - num;
            if (complements.contains(complement)) {
                pairs.add(new int[]{complement, num});
            }
            complements.add(num);
        }

        return pairs;
    }

    public static void main(String[] args) {
        int[] arr = {1, 5, 7, -1, 5};
        int targetSum = 6;

        List<int[]> pairs = findPairsWithSum(arr, targetSum);
        System.out.print("Pairs with sum " + targetSum + ": ");
        for (int[] pair : pairs) {
            System.out.print("[" + pair[0] + ", " + pair[1] + "] ");
        }
    }
}
