package elite;

import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String binaryNumber = sc.nextLine();


        int decimalNumber = Integer.parseInt(binaryNumber, 2);

        System.out.println("Binary: " + binaryNumber);
        System.out.println("Decimal: " + decimalNumber);
    }
}
