package elite;

public class BracketRemove {
    public static void main(String[] args) {
        String expression = "(a+b)*(c+d)";
        for(char word:expression.toCharArray()) {
            if(word=='(' || word == ')') continue;
            System.out.print(word);
        }
    }

}
