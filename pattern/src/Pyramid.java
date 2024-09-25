import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pyramid {
    public static void pattern(int padding, ArrayList<List<Integer>> layer) {
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<List<Integer>> layer = new ArrayList<>();
        layer.add(List.of(1));
        layer.add(List.of(1,1));
        layer.add(List.of(1,2,1));
        if(n<=3 && n>0) {
            pattern(n,layer);
            return;
        }
        for(int i=4;i<=n;i++) {
            int start = layer.getLast().getFirst();
            int end = layer.getLast().getLast();
            List<Integer> cur = new ArrayList<>();
            cur.add(start);
            for(int idx=1;idx<layer.getLast().size();idx++) {
                int updated = layer.getLast().get(idx-1) + layer.getLast().get(idx);
                cur.add(updated);
            }
            cur.add(end);
            layer.add(cur);
        }
        pattern(n,layer);
    }
}
