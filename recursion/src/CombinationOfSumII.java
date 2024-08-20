import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CombinationOfSumII {
    public static void findCombination(int index, int target, List<List<Integer>> collection, int[] elements, ArrayList<Integer> ds) {
        if(index==elements.length) {
            if(target==0) collection.add(new ArrayList<>(ds));
            return;
        }
        if(elements[index] <= target) {
            ds.add(elements[index]);
            findCombination(index+1, target-elements[index], collection, elements, ds);
            ds.removeLast();
        }
        findCombination(index+1,target, collection, elements, ds);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] elements = new int[n];
        for(int i=0;i<n;i++) elements[i] = sc.nextInt();
        Arrays.sort(elements);
        int k = sc.nextInt();
        List<List<Integer>> collection = new ArrayList<>();
        findCombination(0,k, collection, elements, new ArrayList<>());
        System.out.println(collection);
    }
}
