import java.util.*;
class ZigZag  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        int n = sc.nextInt();
        List<Character>[] rows = new ArrayList[n];

        // Initialize the row array
        for(int i=0;i<n;i++) rows[i] = new ArrayList<>();

        // String
        StringBuilder result = new StringBuilder();

        int index = 0, d = 1;
        for(char letter:word.toCharArray()) {
            rows[index].add(letter);
            if(index==0) d=1;
            else if(index==n-1) d=-1;
            index+=d;
        }
        for(List<Character> row:rows) {
            for(char c:row) result.append(c);
        }
        System.out.println(result.toString());
    }
}