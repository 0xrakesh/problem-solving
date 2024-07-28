package elite;

import java.util.Scanner;

public class RemoveSpace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        for(Character word:sentence.toCharArray()) if(word!=' ') System.out.print(word);
    }
}
