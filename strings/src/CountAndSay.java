import java.util.Scanner;

public class CountAndSay {
    public static String countAndSay(int n) {
        String word = "1";
        if(n==1) return word;
        for(int i=1;i<n;i++) {
            StringBuilder current = new StringBuilder();
            int sum = 1;
            for(int idx=0;idx<word.length();idx++) {
                if(idx+1< word.length() && word.charAt(idx) == word.charAt(idx+1)) sum++;
                else {
                    current.append(sum).append(word.charAt(idx));
                    sum = 1;
                }
            }
            word = current.toString();
        }
        return word;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(countAndSay(n));
    }
}
