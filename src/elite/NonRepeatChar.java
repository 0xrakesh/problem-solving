package elite;

import java.util.Scanner;

public class NonRepeatChar {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String pattern = sc.nextLine();
        int found = -1;
        int[] frequency = new int[58];
        for(Character word:pattern.toCharArray()) frequency[word-65]++;
        for(int i=0;i<pattern.length();i++) {
            if(frequency[pattern.charAt(i)-65] == 1) {
                found = i;
                break;
            }
        }
        System.out.println(found);
    }
}