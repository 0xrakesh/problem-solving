import java.util.ArrayList;
import java.util.Scanner;

public class PermutationOfArray {
    public static void findPermutation(int[] numbs, boolean[] taken, ArrayList<ArrayList<Integer>> ans, ArrayList<Integer> ds) {
        if(ds.size()==numbs.length) {
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i=0;i<numbs.length;i++) {
            if(!taken[i]) {
                taken[i] = true;
                ds.add(numbs[i]);
                findPermutation(numbs, taken, ans, ds);
                ds.removeLast();
                taken[i] = false;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] numbs = new int[n];
        for(int i=0;i<n;i++) numbs[i] = sc.nextInt();
        ArrayList<ArrayList<Integer>> subset = new ArrayList<>();
        boolean[] taken = new boolean[n];
        findPermutation(numbs,taken, subset, new ArrayList<>());
        System.out.println(subset);
    }
}
