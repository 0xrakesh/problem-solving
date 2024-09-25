import java.util.ArrayList;

public class NumberCal {
    public static int Solution(String input1) {

        ArrayList<Character> operation = new ArrayList<>();
        ArrayList<Integer> numbers = new ArrayList<>();

        for(char word:input1.toCharArray()) {
            if(word>='0' && word<='9') numbers.add(word-'0');
            if(word=='+'||word=='-'||word=='/'||word=='*') operation.add(word);
        }

        int result = numbers.getFirst();
        for(int i=1;i<numbers.size();i++) {
            if(operation.get(i-1) == '+') result += numbers.get(i);
            else if(operation.get(i-1) == '-') result -= numbers.get(i);
            else if(operation.get(i-1) == '/') result /= numbers.get(i);
            else if(operation.get(i-1) == '*') result *= numbers.get(i);
        }

        return result;

    }
    public static void main(String[] args) {
        System.out.println(Solution("i*-5s-t8h1e4birds"));
    }
}
