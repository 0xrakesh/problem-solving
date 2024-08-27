import java.util.Scanner;

public class BinaryToString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String binary = sc.nextLine();
        int count = 0;
        StringBuilder word = new StringBuilder();
        for(char letter:binary.toCharArray()) {
            if(letter=='1') count++;
            else {
                char ascii = (char) (count + 64);
                word.append(ascii);
                count = 0;
            }
        }
        System.out.println(word);
    }
}
