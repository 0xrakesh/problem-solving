import java.util.Arrays;

public class InsertPosition {
    public static int search(int[] numbers, int k) {
        int n = numbers.length;
        int low = 0, high = n-1, ans = n-1;
        while(low<=high) {
            int mid = (low+high)/2;
            if(numbers[mid] > k) {
                ans = mid;
                high = mid-1;
            }
            else low = mid+1;
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] numbers = {3,5,8,15,19};
        int k = 9;
        Arrays.sort(numbers);
        System.out.println(search(numbers,k));
    }
}
