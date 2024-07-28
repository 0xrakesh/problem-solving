package array;

import java.util.ArrayList;
import java.util.Arrays;

public class SortArray {
    public static void sortArray(ArrayList<Integer> arr,int k) {
        int low=0,mid=0,high=k-1,temp;
        while(mid<=high) {
            if(arr.get(mid) == 0) {
                temp = arr.get(low);
                arr.set(low,arr.get(mid));
                arr.set(mid,temp);
                low++;
                mid++;
            }
            else if(arr.get(mid) == 1) {
                mid++;
            }
            else {
                temp = arr.get(mid);
                arr.set(mid, arr.get(high));
                arr.set(high, temp);
                high--;
            }
        }
    }
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(new Integer[] {0, 2, 1, 2, 0, 0, 1}));
        sortArray(arr, arr.size());
        System.out.println("After sorting:");
        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i) + " ");
        }
        System.out.println();
    }
}
