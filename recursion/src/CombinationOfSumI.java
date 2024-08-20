import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CombinationOfSumI {
    public static void findCombination(int index, int target, ArrayList<Integer> ds, int[] element, List<List<Integer>> collection) {
        if(index==element.length) {
            if(target==0) collection.add(new ArrayList<>(ds));
            return;
        }
        if(element[index] <= target) {
            ds.add(element[index]);
            findCombination(index, target-element[index], ds, element, collection);
            ds.removeLast();
        }
        findCombination(index+1, target, ds, element, collection);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] element = new int[n];
        for(int i=0;i<n;i++) element[i] = sc.nextInt();
        int k = sc.nextInt();
        List<List<Integer>> collection = new ArrayList<>();
        findCombination(0,k, new ArrayList<>(), element, collection);
        System.out.println(collection);
    }
}
