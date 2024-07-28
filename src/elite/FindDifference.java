package elite;

import java.util.Scanner;

public class FindDifference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        int i=0,j=0;
        while(j<s2.length()) {
            if(i==s1.length()) break;
            if( s1.charAt(i) == s2.charAt(j) ) {
                i++;
                j++;
            }
            else {
                System.out.print(j);
                j++;
            }
        }
        for(i=j;i<s2.length();i++) {
            System.out.print(s2.charAt(i));
        }
    }
}
