public class SearchOnDuplicatedRotated {
    public static boolean search(int[] numbers, int k) {
        int n = numbers.length, low=0,high=n-1;
        while(low<=high) {
            int mid=(low+high)/2;
            if(numbers[mid] == k) return true;
            else if(numbers[low] < numbers[mid]) {
                if(numbers[low] <= k && k <= numbers[mid]) high=mid-1;
                else low = mid+1;
            }
            else {
                if(numbers[mid] <= k && k <= numbers[high]) low=mid+1;
                else high = mid-1;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] numbers = {6,7,7,0,1,1,2,3,3,4,4,5,5};
        int k = 14;
        System.out.println(search(numbers,k));
    }
}
