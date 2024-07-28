package elite;
import java.io.*;
import java.util.*;

class PrintPattern {

    public static void printPattern(String word) {
        int length = word.length();
        int mid = length/2;
        String pattern = "";
        for(int i=0;i<length;i++) {
            int index = (i+mid)%length;
            pattern += word.charAt(index);
            System.out.print(pattern+"$ ");
        }
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        printPattern(word);
    }
}