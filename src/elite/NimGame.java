package elite;

import java.util.Scanner;

public class NimGame {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int stones = sc.nextInt();
        System.out.println(stones%4!=0);
    }
}
