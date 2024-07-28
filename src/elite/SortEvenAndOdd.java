package elite;

import java.util.*;

public class SortEvenAndOdd {
    public static void sort(int[] numb,int length) {
        LinkedList<Integer> even = new LinkedList<>();
        LinkedList<Integer> odd = new LinkedList<>();
        int i=0,j=0;
        for(int num:numb) {
            if(num%2==0) even.add(num);
            else odd.add(num);
        }



        // Descending - Even
        for(i=1;i<even.size();i++) {
            if( even.get(i) > even.get(i-1) ) {
                int temp = even.get(i);
                even.set(i,even.get(i-1));
                even.set(i-1,temp);
            }
        }

        Collections.sort(odd);


        System.out.println(odd);

        for(int num:even) {
            System.out.print(num+" ");
        }
        for(int k=odd.size()-1;k>=0;k--) {
            System.out.print(odd.get(k)+" ");
        }
    }

    public static void reverse(int[] num, int start,int end) {
        while(start<=end) {
            int tmp = num[start];
            num[start++] = num[end];
            num[end--] = tmp;
        }
    }

    public static void optimal(int[] numb,int length) {
        int left=0, right = length-1;

        while(left<=right) {
            if( numb[left] % 2 == 0 ) left++;
            else if( numb[right] % 2 == 1 ) right--;
            else {
                int tmp = numb[left];
                numb[left++] = numb[right];
                numb[right--] = tmp;
            }
        }

        Arrays.sort(numb,0,left);
        Arrays.sort(numb,left,length);
        reverse(numb,0,left-1);
        reverse(numb,left,length-1);
        for (int num:numb) System.out.print(num+" ");

    }

    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] numb = new int[size];
        for(int i=0;i<size;i++) numb[i] = sc.nextInt();
//        sort(numb,size);
        optimal(numb,size);
    }
}
