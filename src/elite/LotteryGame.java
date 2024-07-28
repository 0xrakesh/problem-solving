package elite;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class LotteryGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();

        ArrayList<Integer> nums = new ArrayList<>();
        int range = sc.nextInt();
        if(m<range) nums.add(m);
        if(n<range) nums.add(n);
        int i = 10;
        int a = m*i+m;
        int b = m*i+n;
        int c = n*i+m;
        int d = n*i+n;
        if( a <= range ) nums.add(a);
        if( b <= range ) nums.add(b);
        if( c <= range ) nums.add(c);
        if( d <= range ) nums.add(d);
        int[] num = new int[nums.size()];
        for(i=0;i<nums.size();i++) num[i] = nums.get(i);
        Arrays.sort(num);
        for(int it:num)
            System.out.print(it+" ");
    }
}
