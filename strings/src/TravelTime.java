import java.util.Scanner;

public class TravelTime {

    public static boolean IsExceeding(int n) {
        return n>24;
    }

    public static void math(int hours, int minutes) {
        int time = (hours * 60 ) + minutes;
        int remind = (24*60) - time;
        System.out.printf("%d:%d",remind/24,remind%24);
    }

    public static void timeLeft(int hours, int minutes) {
        int remindMin = 0;
        int remindHrs = 0;
        if(IsExceeding(hours)) {
            remindMin = minutes;
            remindHrs = 24 - hours;
        }
        else {
            remindMin = 60 - (minutes==0 ? 60 : minutes);
            remindHrs = ( 24 - hours) - (remindMin != 0 ? 1 : 0);
        }
        System.out.printf("%02d:%02d",remindHrs, remindMin);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hours = sc.nextInt();
        int minutes = sc.nextInt();
        timeLeft(hours,minutes);
    }
}
