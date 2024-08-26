import java.util.HashMap;
import java.util.Scanner;

public class RomanToInteger {
    public static int romanInt(String s) {
        HashMap<Character, Integer> symbol = new HashMap<>();

        symbol.put('I',1);
        symbol.put('V',5);
        symbol.put('X',10);
        symbol.put('L',50);
        symbol.put('C',100);
        symbol.put('D',500);
        symbol.put('M',1000);

        int number = 0;

        for(int i=0;i<s.length();i++) {
            if(i != s.length()-1 && symbol.get( s.charAt(i) ) < symbol.get( s.charAt(i+1) ))  number-=symbol.get(s.charAt(i));
            else number+=symbol.get(s.charAt(i));
        }
        return number;
    }

    public static int optimal(String s) {
        int number = 0;
        for(char letter:s.toCharArray()) {
            int num = 0;
            switch (letter) {
                case 'I':
                    num = 1;
                    break;
                case 'V':
                    num = 5;
                    break;
                case 'X':
                    num = 10;
                    break;
                case 'L':
                    num = 50;
                    break;
                case 'C':
                    num = 100;
                    break;
                case 'D':
                    num = 500;
                    break;
                case 'M':
                    num = 1000;
                    break;
            }
            if (4 * num < number) number -= num;
            else number+=num;
        }
        return number;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String roman = sc.nextLine();
        System.out.println(romanInt(roman));
        System.out.println(optimal(roman));
    }
}
