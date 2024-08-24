import java.util.Scanner;
import java.util.Stack;

public class RemoveOuterParentheses {
    public static String isValid(String s) {
        char[] bracket = new char[s.length()];
        int pos = 0;
        int idx = 0;
        for(int i=0;i<s.length();i++) {
            if(s.charAt(i) == '(') {
                if(pos>0) bracket[idx++] = s.charAt(i);
                pos++;
            }
            else if(s.charAt(i) == ')') {
                pos--;
                if(pos>0) bracket[idx++] = s.charAt(i);
            }
        }
        char[] ans = new char[idx];
        System.arraycopy(bracket,0,ans,0,idx);
        return new String(ans);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String brackets = sc.nextLine();
        Stack<Character> stack = new Stack<>();
        StringBuilder valid = new StringBuilder();
        for(char bracket:brackets.toCharArray()) {
            if(bracket == '(' && !stack.isEmpty()) {
                valid.append(bracket);
                stack.push(bracket);
            }
            else if(bracket == ')') {
                stack.pop();
                if(!stack.isEmpty()) valid.append(bracket);
            }
            else if(stack.isEmpty()) stack.push(bracket);
        }
        System.out.println(valid);
        System.out.println(isValid(brackets));
    }
}
