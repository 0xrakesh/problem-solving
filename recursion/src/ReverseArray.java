import java.util.Arrays;

public class ReverseArray {
    public static void swap(int[] num, int i, int j) {
        int tmp = num[i];
        num[i] = num[j];
        num[j] = tmp;
    }
    public static void pointer(int[] numbers, int i, int j) {
        if(i>=j) return;
        swap(numbers,i,j);
        pointer(numbers,i+1,j-1);
    }

    public static void onePointer(int[] numbers, int i) {
        if(i>=numbers.length/2) return;
        swap(numbers, i, numbers.length-i-1);
        onePointer(numbers,i+1);
    }

    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5};
        pointer(numbers,0,numbers.length-1);
        System.out.println(Arrays.toString(numbers));
        onePointer(numbers,0);
        System.out.println(Arrays.toString(numbers));
    }
}
