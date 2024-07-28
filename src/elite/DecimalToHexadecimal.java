package elite;

import java.util.Scanner;

public class DecimalToHexadecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int decimalNumber = scanner.nextInt();

        String hexadecimal = decimalToHex(decimalNumber);

        System.out.println("Hexadecimal representation: " + hexadecimal.toUpperCase());

    }

    public static String decimalToHex(int decimal) {
        if (decimal == 0) {
            return "0";
        }

        StringBuilder hexBuilder = new StringBuilder();
        char[] hexChars = "0123456789ABCDEF".toCharArray();

        while (decimal > 0) {
            int remainder = decimal % 16;
            hexBuilder.insert(0, hexChars[remainder]);
            decimal = decimal / 16;
        }

        return hexBuilder.toString();
    }
}
