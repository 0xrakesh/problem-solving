import java.util.Scanner;
import java.util.regex.*;

public class StringMatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        Pattern pattern = Pattern.compile("^[0-9]$");
        Matcher match = pattern.matcher(word);
        System.out.println(match.matches());
    }
}
