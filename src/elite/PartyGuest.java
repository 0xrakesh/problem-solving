package elite;

import java.util.Scanner;

public class PartyGuest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int time = sc.nextInt();
        int[] emp = new int[time];
        int[] leave = new int[time];
        for(int i=0;i<time;i++) emp[i] = sc.nextInt();
        for(int i=0;i<time;i++) leave[i] = sc.nextInt();

        int maxMember = Integer.MIN_VALUE;
        int present = 0;
        for(int i=0;i<time;i++) {
            present += emp[i] - leave[i];
            maxMember = Math.max(maxMember,present);
        }
        System.out.println(maxMember);
    }
}
