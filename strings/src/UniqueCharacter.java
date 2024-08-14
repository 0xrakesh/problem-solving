import java.util.Scanner;

public class UniqueCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner str = new Scanner(System.in);
        int n = sc.nextInt();
        int range = sc.nextInt();
        String[] words = new String[n];
        for(int i=0;i<n;i++) words[i] = str.nextLine();

        int unique = 0;
        for(String word:words) {
            int nonRepeat = 0;
            int[] ascii = new int[62];
            for(Character letter:word.toCharArray()) {

                ascii[letter-'A']++;
            }

            for(int num:ascii) if(num==1) nonRepeat++;
            if(nonRepeat >= range) unique++;
        }
        System.out.println(unique);
    }
}
