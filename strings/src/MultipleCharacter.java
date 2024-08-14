import java.util.Scanner;

public class MultipleCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String words = sc.nextLine();
        for(int i=0;i<words.length();i+=2) {
            char character = words.charAt(i);
            int length = words.charAt(i+1) - '0';
            char next = i+2 < words.length() ? words.charAt(i+2) : ' ';
            if(next >= '0' && next <= '9') {
                length = (length*10) + (int) next-'0';
                i++;
            }
            for(int j=0;j<length;j++) System.out.print(character);
        }
    }
}
