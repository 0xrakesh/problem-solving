import java.util.Scanner;

// FindStringCode.
public class SumOfCharacterWithReverseOfIt {
    public static int findStringCode(String input1) {
        String[] words = input1.split(" ");
        StringBuilder result = new StringBuilder();
        for(String word:words) {
            int l = 0;
            int h = word.length()-1;
            int s = 0;
            while(l<h) {
                s += asciiAdd(word.charAt(l), word.charAt(h));
                l++;
                h--;
            }
            if(word.length()%2!=0) s += ((int) word.charAt(l) - 'a') + 1;
            result.append(s);
        }
        return Integer.parseInt(result.toString());
    }

    public static int asciiAdd(char a, char b) {
        int i = ((int) a - 'a')+1;
        int j = ((int) b - 'a')+1;
        return Math.abs(i-j);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        System.out.println(findStringCode(sentence));
    }
}
