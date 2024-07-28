package elite;

import java.util.Arrays;
import java.util.Scanner;

public class SortArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] numb = new int[size];
        for(int i=0;i<size;i++) numb[i] = sc.nextInt();
        int zeros=0,ones=0,second=size-1;
        while(ones<=second) {
            if( numb[ones] == 0 ) {
                int temp = numb[ones];
                numb[ones++] = numb[zeros];
                numb[zeros++] = temp;
            }
            else if(numb[ones] == 2) {
                int temp = numb[ones];
                numb[ones] = numb[second];
                numb[second--] = temp;
            }
            else
                ones++;
        }
        System.out.println(Arrays.toString(numb));
    }
}
