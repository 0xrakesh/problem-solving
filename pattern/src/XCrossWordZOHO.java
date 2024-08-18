import java.util.Scanner;

public class XCrossWordZOHO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        int n = word.length();
        int low = 0;
        int right = n-1;
        while(low<n) {
            for(int i=0;i<n;i++) {
                if(i==low) System.out.print(word.charAt(low)+" ");
                else if(i==right) System.out.print(word.charAt(right)+" ");
                else System.out.print("   ");
            }
            System.out.println();
            low++;
            right--;
        }
    }
}
