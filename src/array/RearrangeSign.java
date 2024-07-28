package array;

import java.util.Arrays;

public class RearrangeSign {
    public static void main(String[] args) {
        int[] numb = {1,-1,2,-4,-5,3};
        int[] order = new int[numb.length];
        int pos = 0;
        int neg = 1;
        for(int num:numb) {
            if(num > 0) {
                order[pos] = num;
                pos+=2;
            }
            else {
                order[neg] = num;
                neg+=2;
            }
        }
        System.out.println(Arrays.toString(order));
    }

}
