import java.util.ArrayList;

public class Subsequence {
    public static void subsequence(int index, int[] numbers, ArrayList<Integer> ds, int n) {
        if(index==n) {
            if(ds.isEmpty()) System.out.print("{}");
            else for(int i:ds) System.out.print(i+" ");
            System.out.println();
            return;
        }

        subsequence(index+1,numbers, ds, n);
        ds.add(numbers[index]);
        subsequence(index+1, numbers, ds, n);
        ds.removeLast();
    }
    public static void main(String[] args) {
        int[] numbers = {1,2,3};
        ArrayList<Integer> ds = new ArrayList<>();
        subsequence(0,numbers,ds,numbers.length);
    }
}
