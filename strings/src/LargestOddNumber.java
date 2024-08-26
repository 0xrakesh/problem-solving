import java.util.Scanner;

public class LargestOddNumber {
    public static String largestOddNumber(String num) {
        String charToString = String.valueOf(num.charAt(num.length() - 1));
        int stringToInt = Integer.parseInt(charToString);
        if (stringToInt % 2 != 0) {
            return num;
        }
        String ans = "";
        for (int i = num.length() - 1; i >= 0; i--) {
            String string_temp = String.valueOf(num.charAt(i));
            int int_temp = Integer.parseInt(string_temp);
            if (int_temp % 2 == 0) {
                ans = num.substring(0, i);
            } else {
                return ans;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();
        String longest = "";
        for(int i=0;i<num.length();i++) {
            int number = num.charAt(i) - '0';
            if(number%2!=0) longest = num.substring(0,i+1);
        }
        System.out.println(longest);
        System.out.println(largestOddNumber(num));
    }
}
