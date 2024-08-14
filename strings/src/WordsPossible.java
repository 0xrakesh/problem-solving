import java.util.ArrayList;

public class WordsPossible {
    public static String findPossible(String input1, String input2) {
        String[] words = input2.split(":");
        ArrayList<String> match = new ArrayList<>();
        StringBuilder ans = new StringBuilder();
        for(String word:words) {
            word = word.toLowerCase();
            input1 = input1.toLowerCase();
            if(input1.length()==word.length()) {
                int l1 = 0;
                int l2 = 0;
                boolean isIt = true;
                while(l1<input1.length()) {
                    if(input1.charAt(l1) != word.charAt(l2) && input1.charAt(l1) != '_') isIt = false;
                    l1++;
                    l2++;
                }
                if(isIt) match.add(word.toUpperCase());
            }
        }
        if(match.isEmpty()) ans.append("ERROR-009");
        for(int i=0;i<match.size();i++) {
            ans.append(match.get(i));
            if(i!=match.size()-1) ans.append(":");
        }
        return ans.toString();
    }
    public static void main(String[] args) {
        String check = "Fi_er";
        String sentence = "Fixer:Filter:Fiber:Filer:Flyer:Office";
        System.out.println(findPossible(check,sentence));
    }
}
