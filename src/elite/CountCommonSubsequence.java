package elite;

import java.util.Scanner;

public class CountCommonSubsequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        int i=0,j=0,match=0;
        while(i<str1.length()) {
            if(j==str2.length()) {
                j=0;
                match += 1;
            }
            if( str1.charAt(i) == str2.charAt(j) ) j++;
            else j=0;
            i++;
        }
        if(j==str2.length()) match++;
        System.out.println(match);
    }
}
