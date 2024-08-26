import java.util.Scanner;

public class RotateString {
    public static boolean isRotate(String s, String goal) {

        if(s.length() != goal.length()) return false;
        String str = s+s;
        return str.contains(goal);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String goal = sc.nextLine();
        System.out.println(isRotate(s,goal));
    }
}
