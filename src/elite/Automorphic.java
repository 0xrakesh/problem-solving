package elite;

import java.util.Scanner;

public class Automorphic {

    public static void nonOptimal(int number,long square) {
        String no = Integer.toString(number);
        String sq = Long.toString(square);
        if(no.charAt(no.length()-1) == sq.charAt(sq.length()-1)) System.out.println("YES");
        else System.out.println("NO");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        long square = number * number;
        boolean flag = true;
        while(number>0) {
            if( (square%10) != (number%10) ) flag = false;
            number/=10;
            square/=10;
        }
        if(flag) System.out.println("YES");
        else System.out.println("NO");
    }
}
