public class SearchOnRotated {
    public static int search(int[] numbers, int k) {
        int index = -1;
        int n = numbers.length;
        int low = 0, high = n-1;
        while(low<=high) {
            int mid = (low+high)/2;
            if(numbers[mid] == k) return mid;
            else if( numbers[low] < numbers[mid] ) {
                if(numbers[low] <= k && k <= numbers[mid]) high = mid-1;
                else low = mid+1;
            }
            else {
                if(numbers[mid] <= k && k <= numbers[high]) low = mid+1;
                else high = mid-1;
            }
        }
        return index;
    }
    public static void main(String[] args) {
        int[] numbers = {4,5,6,7,8,1,2,3};
        int k = 3;
        System.out.println(search(numbers, k));
    }
}
