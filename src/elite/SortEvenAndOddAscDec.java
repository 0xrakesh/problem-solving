package elite;

import java.util.Arrays;
import java.util.Scanner;

public class SortEvenAndOddAscDec {

    public static void swap(int[] number,int i,int j) {
        int temp = number[i];
        number[i] = number[j];
        number[j] = temp;
    }

    public static void reverse(int[] number,int i,int j) {
        while(i<j) {
            int tmp = number[i];
            number[i++] = number[j];
            number[j--] = tmp;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] number = new int[size];
        for(int i=0;i<size;i++) number[i] = sc.nextInt();

        int index = 0;
        for(int i=0;i<size;i++) {
            if(number[i]%2==0) {
                swap(number,i,index);
                index++;
            }
        }
        int even = index;
        for(int i=0;i<size;i++) {
            if(number[i]%2!=0) {
                swap(number,i,index);
                index++;
            }
        }
        Arrays.sort(number,0,even);
        reverse(number,0,even-1);
        Arrays.sort(number,even,size);
        for(int n:number) System.out.print(n+" ");
    }
}
