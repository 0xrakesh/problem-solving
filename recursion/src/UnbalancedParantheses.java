import java.util.ArrayList;
import java.util.Scanner;

public class UnbalancedParantheses {
    public static ArrayList<Character> verifyBracket(int index, String words, ArrayList<Character> equation, int n) {
        if(index==n) return equation;
        
        while(index < n && words.charAt(index) != ')' && words.charAt(index) != '(') equation.add(words.charAt(index++));
        
        if(index < n && words.charAt(index) == ')' || words.charAt(index) == '(') {
            equation.add(words.charAt(index));
            verifyBracket(index + 1, words, equation, n);
        }
        equation.removeLast();
        return verifyBracket(index+1,words,equation,n);
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String words = sc.nextLine();
        ArrayList<Character> empty = new ArrayList<>();
        ArrayList<Character> equation = verifyBracket(0,words,empty , words.length());
        System.out.println(equation);
    }
}
