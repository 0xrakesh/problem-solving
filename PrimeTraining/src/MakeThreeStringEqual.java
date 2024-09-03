import java.util.Scanner;

public class MakeThreeStringEqual {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        String s3 = sc.nextLine();
        int min = Math.min(s1.length(), Math.min(s2.length(), s3.length()));
        int count = 0;
        for(int i=s1.length();i>min;i--) count++;
        for(int i=s2.length();i>min;i--) count++;
        for(int i=s3.length();i>min;i--) count++;
        s1 = s1.substring(0,min);
        s2 = s2.substring(0,min);
        s3 = s3.substring(0,min);
        if(s1.equals(s2) && s1.equals(s3)) System.out.println(count);
        else System.out.println("-1");
    }
}
