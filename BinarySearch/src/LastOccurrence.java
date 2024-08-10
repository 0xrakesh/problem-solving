import java.util.Arrays;

public class LastOccurrence {
    public static int search(int[] numbers, int k) {
        int ans = -1;
        int n = numbers.length;
        int low = 0, high=n-1;
        while(low<=high) {
            int mid = (low+high)/2;
            if(numbers[mid] == k) ans = mid;
            if (numbers[mid] <= k) {
                low = mid+1;
            }
            else high = mid-1;
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] numbers = {3,4,13,13,13,15,15,20,40};
        Arrays.sort(numbers);
        System.out.println(search(numbers, 15));
    }
}
