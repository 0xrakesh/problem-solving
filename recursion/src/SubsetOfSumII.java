import java.util.ArrayList;
import java.util.Scanner;

public class SubsetOfSumII {
    public static void findSubset(int index,int[] numbs, ArrayList<ArrayList<Integer>> subset, ArrayList<Integer> set) {
        subset.add(new ArrayList<>(set));
        for(int i=index;i<numbs.length;i++) {
            if(i != index && numbs[i] == numbs[i-1]) continue;
            set.add(numbs[i]);
            findSubset(i+1, numbs, subset, set);
            set.removeLast();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] numbs = new int[n];
        for(int i=0;i<n;i++) numbs[i] = sc.nextInt();
        ArrayList<ArrayList<Integer>> subset = new ArrayList<>();
        findSubset(0,numbs, subset, new ArrayList<>());
        System.out.println(subset);
    }
}
