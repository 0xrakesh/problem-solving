package elite;
import java.util.HashMap;
import java.util.Scanner;
public class JumpGame {
    public static boolean checkReach(int[] jumps) {

        int maxJump = 0;
        for(int jump:jumps) {
            if(maxJump<0) return false;
            if(jump>maxJump) maxJump = jump;
            maxJump--;
        }
        return true;
    }

    public static boolean canJump(int arr[],int n) {
        int f=n-1;
        for(int i=n-2;i>=0;i--) {
            if(arr[i]+i>=f) {
                f=i;
            }
        }
        return f==0;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] jumps = new int[size];
        for(int i=0;i<size;i++) jumps[i] = sc.nextInt();
        System.out.println(checkReach(jumps));
        System.out.println(canJump(jumps,jumps.length));
    }
}
