import java.util.Arrays;

public class Search {

    public static int search(int[] numbers, int target) {
        int low = 0;
        int high = numbers.length-1;
        while(low<=high) {
            int mid = (low+high)/2;
            if(numbers[mid] == target) return mid;
            else if(numbers[mid] > target) high = mid-1;
            else low = mid+1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] numbers = {3, 4, 6, 7, 9, 12, 16, 17};
        int target = 6;
        Arrays.sort(numbers);
        System.out.println(search(numbers, target));
    }
}
