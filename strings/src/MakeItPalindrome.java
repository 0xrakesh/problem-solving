import java.util.Scanner;

public class MakeItPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        int count = 0;
        int left = 0, right = word.length()-1;
        while(left<right) {
            if(word.charAt(left) == word.charAt(right)) {
                left++;
                right--;
            }
            else if(word.charAt(left+1) == word.charAt(right)) {
                count++;
                left++;
            }
            else if(word.charAt(left) == word.charAt(right-1)) {
                count++;
                right--;
            }
            else if(left+1 == right) {
                count++;
                left++;
                right--;
            }
            else {
                count+=2;
                left++;
                right--;
            }
        }
        System.out.println(count);
    }
}
