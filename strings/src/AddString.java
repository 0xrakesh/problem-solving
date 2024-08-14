import java.util.Scanner;

public class AddString {
    public static String add(String input1, String input2) {
        StringBuilder result = new StringBuilder();
        int l1 = input1.length()-1;
        int l2 = input2.length()-1;
        int carry = 0;
        while(l1>=0 || l2>=0 || carry != 0 ) {
            int n1 = (l1>=0) ? input1.charAt(l1) - '0' : 0;
            int n2 = (l2>=0) ? input2.charAt(l2) - '0' : 0;
            int total = n1 + n2 + carry;
            carry = total/10;
            result.append(total%10);
            l1--;
            l2--;
        }
        return result.reverse().toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input1 = sc.nextLine();
        String input2 = sc.nextLine();
        System.out.println(add(input1,input2));
    }
}
