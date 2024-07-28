package elite;

import java.util.Arrays;
import java.util.Scanner;

public class Rotation {
    public static void rotation(int[] nums, int rotote) {
        int[] temp = nums.clone();
        int len = nums.length;
        if(rotote==0) return;
        int index=0;
        for(int i=len-1;i<len;i++) nums[index++] = temp[i];
        for(int i=0;i<len-1;i++) nums[index++] = temp[i];
    }

    public  static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] numb = new int[size];
        for(int i=0;i<size;i++) numb[i] = sc.nextInt();
        int rotate = sc.nextInt();
        rotate = rotate % size;
        rotation(numb,rotate);
        for(int num:numb) System.out.print(num+" ");
    }
}
